package ls.LSJW;

import javax.swing.JFrame;

public class Window {
	
	public JFrame frame = new JFrame();
	
	public Window(WindowProps wprops) {
		frame.setSize(WindowProps.getWidth(wprops), WindowProps.getHeight(wprops));
		frame.setTitle(WindowProps.getTitle(wprops));
		frame.setDefaultCloseOperation(WindowProps.getCloseOperation(wprops));
		frame.setLocationRelativeTo(WindowProps.getWindowRelative(wprops));
		frame.setResizable(WindowProps.getResizable(wprops));
		frame.setVisible(WindowProps.getVisible(wprops));
	}
	
	public JFrame getFrame() {
		return frame;
	}
	
	public void resetWindowProps(WindowProps wprops) {
		frame.setSize(WindowProps.getWidth(wprops), WindowProps.getHeight(wprops));
		frame.setTitle(WindowProps.getTitle(wprops));
		frame.setDefaultCloseOperation(WindowProps.getCloseOperation(wprops));
		frame.setLocationRelativeTo(WindowProps.getWindowRelative(wprops));
		frame.setResizable(WindowProps.getResizable(wprops));
		frame.setVisible(WindowProps.getVisible(wprops));
	}
	
}