package hellowebbrowser;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class Perspective implements IPerspectiveFactory {

	public void createInitialLayout(IPageLayout layout) {
		layout.setEditorAreaVisible(false);
		layout.setFixed(true);
		/* this is cong comment 
		 * 
		 * */
		System.out.println("CONG TEST Crete InitialLayout!!!");
	}

}
