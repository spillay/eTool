/**
 * 
 */
package com.dsleng.etool.dsl.bobjs;

import java.util.LinkedHashSet;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.common.types.xtext.AbstractTypeScopeProvider;
import org.eclipse.xtext.common.types.xtext.ClasspathBasedTypeScopeProvider;
import org.eclipse.xtext.common.types.xtext.TypesAwareDefaultGlobalScopeProvider;
import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.ImportUriGlobalScopeProvider;

import com.dsleng.etool.models.bobjs.BOImport;
import com.dsleng.etool.models.bobjs.OrgUnit;
import com.google.common.base.Predicate;
import com.google.inject.Inject;

/**
 * @author suresh
 *
 */
public class BOImportURIGlobalScopeProvider extends ImportUriGlobalScopeProvider {
	public static final URI HEADER_URI = URI.createURI("platform:/plugin/my.dsl.library/headers/myHeader.ext");
	@Inject
	IContainer.Manager manager;

	public void listVisibleResources(Resource myResource, IResourceDescriptions index) {
		IResourceDescription descr = index.getResourceDescription(myResource.getURI());
		for (IContainer visibleContainer : manager.getVisibleContainers(descr, index)) {
			for (IResourceDescription visibleResourceDesc : visibleContainer.getResourceDescriptions()) {
				System.out.println(visibleResourceDesc.getURI());
			}
		}
	}

	@Override
	protected LinkedHashSet<URI> getImportedUris(Resource resource) {
		LinkedHashSet<URI> importedURIs = super.getImportedUris(resource);
		// Adding Dynamic imports
		if (resource.getContents().size() > 0) {
			EObject o = resource.getContents().get(0);
			if (o instanceof OrgUnit) {
				OrgUnit ou = (OrgUnit) o;
				for (BOImport ip : ou.getBoimport()) {
					String uri = ip.getImportURI();
					URI c = resource.getURI();
					URI path = c.trimSegments(1);
					String imp = path + "/" + uri;
					// importedURIs.add(URI.createURI(imp));
				}
			}
		}
		// importedURIs.add(HEADER_URI);
		return importedURIs;
	}

}
