package ls.LSJW.test;

import ls.LSJW.Window;
import ls.LSJW.WindowProps;

public class Main {
	
	public Main() {
		WindowProps wprops = new WindowProps("Window Properties");
		
		wprops.setResizable(false);
		wprops.setCloseOperation(wprops.EXIT_ON_CLOSE);
		wprops.setSize(1024, 512);
		wprops.setTitle("Window");
		wprops.setWindowRelative(null);
		wprops.setVisible(true);
		
		Window win = new Window(wprops);
		
		win.resetWindowProps(wprops);
	}
	
	public static void main(String args[]) {
		new Main();
	}
	
}