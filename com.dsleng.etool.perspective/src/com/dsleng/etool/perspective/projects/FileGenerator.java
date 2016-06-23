package com.dsleng.etool.perspective.projects;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.security.CodeSource;
import java.security.ProtectionDomain;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;

public class FileGenerator
{

    public static IFile createFile(final String filePath,
                                   final IContainer container,
                                   final String content,
                                   final IProgressMonitor progressMonitor) throws Exception
    {
        IFile file = null;
        if (container instanceof IProject)
        {
            file = ((IProject) container).getFile(filePath);
        } else if (container instanceof IFolder)
        {
            file = ((IFolder) container).getFile(filePath);
        } else
        {
            throw new Exception("Cannot find the file "
                                + filePath
                                + " under "
                                + container.getName());
        }

        final IContainer parent = file.getParent();
        if (parent instanceof IFolder)
        {
            mkdirs((IFolder) parent);
        }
        final InputStream stream = new ByteArrayInputStream(content.getBytes(file.getCharset()));
        if (file.exists())
        {
            file.setContents(stream, true, true, progressMonitor);
        } else
        {
            file.create(stream, true, progressMonitor);
        }
        stream.close();
        progressMonitor.worked(1);

        return file;
    }
    
    public static void mkdirs(final IFolder folder) throws CoreException
    {
        if (!folder.exists())
        {
            if (folder.getParent() instanceof IFolder)
            {
                mkdirs((IFolder) folder.getParent());
            }
            folder.create(true, true, null);
        }
    }
    
    public static String getContents(final String relativePath,
                                     final String resource,
                                     final Class clazz) throws IOException
    {
        final String resourcePath = relativePath + '/' + resource;
        final File sourcePrj = getSourceProject(clazz);

        InputStream resourceStream;
        JarFile jar = null;
        if (sourcePrj.isFile())
        {
            // reading from plugin jar file
            jar = new JarFile(sourcePrj);
            final JarEntry resEntry = jar.getJarEntry(resourcePath);
            resourceStream = jar.getInputStream(resEntry);
        } else
        {
            // reading from source project
            resourceStream = new FileInputStream(sourcePrj.getAbsolutePath()
                                                 + "/"
                                                 + resourcePath);
        }

        final byte[] buffer = new byte[4096];
        final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        while (true)
        {
            int read;
            read = resourceStream.read(buffer);

            if (read == -1)
            {
                break;
            }

            outputStream.write(buffer, 0, read);
        }

        outputStream.close();
        resourceStream.close();
        if (jar != null)
        {
            jar.close();
        }

        return outputStream.toString("iso-8859-1");
    }
    
    private static File getSourceProject(final Class clazz)
    {
        final ProtectionDomain protectionDomain = clazz.getProtectionDomain();
        final CodeSource codeSource = protectionDomain.getCodeSource();
        final URL location = codeSource.getLocation();
        final File sourcePrj = new File(location.getFile());
        return sourcePrj;
    }
    
    public static void appendContents(final IFile pagesFile, final String data) throws IOException
    {
        final File file = pagesFile.getLocation().toFile();

        if (!file.exists())
        {
            file.createNewFile();
        }

        final FileWriter fileWriter = new FileWriter(file, true);
        final BufferedWriter buffWriter = new BufferedWriter(fileWriter);
        final PrintWriter writer = new PrintWriter(buffWriter);
        writer.println(data);
        writer.close();
        buffWriter.close();
        fileWriter.close();

    }
    
    public static void replaceContents(final IFile file,
                                       final String template,
                                       final String newContent) throws CoreException,
                                                               IOException
    {
        final String content = getContents(file).replace(template, newContent);
        final InputStream stream = new ByteArrayInputStream(content.getBytes(file.getCharset()));
        if (file.exists())
        {
            file.setContents(stream, true, true, new NullProgressMonitor());
        }
        stream.close();
    }
    
    public static String getContents(final IFile iFile) throws IOException
    {
        final File file = iFile.getLocation().toFile();
        final FileInputStream stream = new FileInputStream(file);
        final StringBuffer contents = new StringBuffer();
        final BufferedReader br = new BufferedReader(new InputStreamReader(stream));
        String line;
        while ((line = br.readLine()) != null)
        {
            contents.append(line).append("\n");
        }
        br.close();
        stream.close();
        return contents.toString();
    }
}
