package ls.LSJW;

import java.awt.Dimension;

public class DefaultWindow {
	
	public static WindowProps getEWindow() {
		WindowProps wprops = new WindowProps("Window");
		
		return wprops;
	}
	
	public static WindowProps getDWindow() {
		WindowProps wprops = new WindowProps("Window");
		
		wprops.setSize(new Dimension(1024, 512));
		wprops.setTitle("Display");
		wprops.setVisible(true);
		wprops.setResizable(false);
		wprops.setCloseOperation(wprops.EXIT_ON_CLOSE);
		wprops.setWindowRelative(wprops.CENTER);
		
		return wprops;
	}
	
}