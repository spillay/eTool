/**
 * 
 */
package com.dsleng.etool.perspective.dialogs;

import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

/**
 * @author suresh
 *
 */
public class MainInput extends TitleAreaDialog {

	private Text txtProjectName;
	
	private String projectName;
	
	
	public String getProjectName() {
		return projectName;
	}

	

	public MainInput(Shell parentShell) {
		super(parentShell);
		// TODO Auto-generated constructor stub
	}
	@Override
	  public void create() {
	    super.create();
	    setTitle("eTool Project Creator");
	    setMessage("This is a TitleAreaDialog", IMessageProvider.INFORMATION);
	  }

	  @Override
	  protected Control createDialogArea(Composite parent) {
	    Composite area = (Composite) super.createDialogArea(parent);
	    Composite container = new Composite(area, SWT.NONE);
	    container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
	    GridLayout layout = new GridLayout(2, false);
	    container.setLayout(layout);

	    createProjectName(container);
	   
	    return area;
	  }

	  private void createProjectName(Composite container) {
		    Label lbName = new Label(container, SWT.NONE);
		    lbName.setText("Project Name");

		    GridData dataName = new GridData();
		    dataName.grabExcessHorizontalSpace = true;
		    dataName.horizontalAlignment = GridData.FILL;

		    txtProjectName = new Text(container, SWT.BORDER);
		    txtProjectName.setLayoutData(dataName);
	  }
	 
	  
	  
	  @Override
	  protected boolean isResizable() {
	    return true;
	  }

	  // save content of the Text fields because they get disposed
	  // as soon as the Dialog closes
	  private void saveInput() {
		projectName = txtProjectName.getText();
	  }

	  @Override
	  protected void okPressed() {
	    saveInput();
	    super.okPressed();
	  }

	 
}
