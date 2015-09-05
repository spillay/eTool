/**
 * 
 */
package com.dsleng.etool.perspective;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

/**
 * @author suresh
 *
 */
public class BasePerspectiveFactory implements IPerspectiveFactory {

	public static final String PERSPECTIVE_ID = "com.dsleng.perspective.etool.baseperspectiveID";
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.IPerspectiveFactory#createInitialLayout(org.eclipse.ui.
	 * IPageLayout)
	 */
	@Override
    public void createInitialLayout(IPageLayout layout) {
            // define layout of the perspective
            addViews(layout);
            addActionSets(layout);
            addNewWizardShortcuts(layout);
            addPerspectiveShortcuts(layout);
            addViewShortcuts(layout);
    }

    private void addViews(IPageLayout layout) {
            // create the left panel view area programmatically
            // its position is left with respect to editor area
            // left panel will occupy 25% of the horizontal space originally given to the editor area
            IFolderLayout left = layout.createFolder("left", IPageLayout.LEFT, 0.25f, layout.getEditorArea());
            
            // left panel contains the message timeline and properties view/sheet
            //left.addView(TwitterMessageTimelineView.ID);
            //left.addView(IPageLayout.ID_PROP_SHEET);
            left.addView(IPageLayout.ID_PROJECT_EXPLORER);
            
            // create the bottom panel view area
            // bottom panel will occupy 25% of the vertical space originally given to the editor area
            IFolderLayout bottom = layout.createFolder("bottom", IPageLayout.BOTTOM, 0.75f, layout.getEditorArea());
            bottom.addView(IPageLayout.ID_PROP_SHEET);
            bottom.addView(IPageLayout.ID_PROBLEM_VIEW);
            //bottom.addView("org.eclipse.pde.runtime.LogView");
            
            // create the right panel view area
            // right panel will occupy 25% of the horizontal space originally given to the editor area
            IFolderLayout right = layout.createFolder("right", IPageLayout.RIGHT, 0.75f, layout.getEditorArea());
            right.addView(IPageLayout.ID_OUTLINE);
    }

    private void addActionSets(IPageLayout layout) {
    }       

    private void addPerspectiveShortcuts(IPageLayout layout) {
            // add button that will turn of this perspective into the top right corner
            layout.addPerspectiveShortcut(PERSPECTIVE_ID);
    }

    // wizards like those in "File -> New"
    private void addNewWizardShortcuts(IPageLayout layout) {
            //layout.addNewWizardShortcut(LoginWizard.ID);
    }

    // shortcuts like those in "Window -> Show View"
    private void addViewShortcuts(IPageLayout layout) {
    	//layout.addShowViewShortcut(IPageLayout.ID_PROJECT_EXPLORER);
    }


	
}
