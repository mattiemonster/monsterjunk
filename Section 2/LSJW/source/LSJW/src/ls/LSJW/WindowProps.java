package ls.LSJW;

import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JFrame;

public class WindowProps {
	
	public int WIDTH = 1024;
	public int HEIGHT = 512;
	
	public String TITLE = "Display";
	public String NAME = "Default Window Properties";
	
	public int closeOperation = JFrame.EXIT_ON_CLOSE;
	public int EXIT_ON_CLOSE = JFrame.EXIT_ON_CLOSE;
	public Component windowRelative = null;
	public Component CENTER = null;
	
	public boolean visible = true;
	public boolean resizable = false;
	
	public WindowProps(String NAME) {
		this.NAME = NAME;
		System.out.println("Created window properties " + NAME);
	}
	
	public void setSize(int WIDTH, int HEIGHT) {
		this.WIDTH = WIDTH;
		this.HEIGHT = HEIGHT;
	}
	
	public void setSize(Dimension DIMENSION) {
		this.WIDTH = DIMENSION.width;
		this.HEIGHT = DIMENSION.height;
	}
	
	public int getWidth() {
		return WIDTH;
	}
	
	public static int getWidth(WindowProps wprops) {
		return wprops.WIDTH;
	}
	
	public int getHeight() {
		return HEIGHT;
	}
	
	public static int getHeight(WindowProps wprops) {
		return wprops.HEIGHT;
	}
	
	public Dimension getSizeDim() {
		return new Dimension(WIDTH, HEIGHT);
	}
	
	public static Dimension getSizeDim(WindowProps wprops) {
		return new Dimension(wprops.WIDTH, wprops.HEIGHT);
	}
	
	public void setTitle(String TITLE) {
		this.TITLE = TITLE;
	}
	
	public String getTitle() {
		return TITLE;
	}
	
	public static String getTitle(WindowProps wprops) {
		return wprops.TITLE;
	}
	
	public void setCloseOperation(int closeOperation) {
		this.closeOperation = closeOperation;
	}
	
	public int getCloseOperation() {
		return closeOperation;
	}
	
	public static int getCloseOperation(WindowProps wprops) {
		return wprops.closeOperation;
	}
	
	public void setWindowRelative(Component windowRelative) {
		this.windowRelative = windowRelative;
	}
	
	public Component getWindowRelative() {
		return windowRelative;
	}
	
	public static Component getWindowRelative(WindowProps wprops) {
		return wprops.windowRelative;
	}
	
	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	
	public boolean getVisible() {
		return visible;
	}
	
	public static boolean getVisible(WindowProps wprops) {
		return wprops.visible;
	}
	
	public void setResizable(boolean resizable) {
		this.resizable = resizable;
	}
	
	public boolean getResizable() {
		return resizable;
	}
	
	public static boolean getResizable(WindowProps wprops) {
		return wprops.resizable;
	}
	
}