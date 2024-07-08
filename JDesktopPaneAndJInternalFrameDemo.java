package advanceJava;

import javax.swing.*;

public class JDesktopPaneAndJInternalFrameDemo {

	public static void main(String[] args) {
		JDesktopPane jd = new JDesktopPane();
		JInternalFrame jf = new JInternalFrame("Internal Frame", true, true, true, true);
		
		jf.setLayout(null);
		jf.setSize(200, 300);
		jf.setVisible(true);
		
		jd.add(jf);

	}

}
