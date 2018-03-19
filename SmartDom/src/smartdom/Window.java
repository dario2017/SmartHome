package smartdom;

public class Window {
	private static int windowIdCounter;
	private int windowId;
	private boolean windowState;
	
	public Window() {
		windowIdCounter++;
		this.windowId = windowIdCounter;
		System.out.println("Window " + this.windowId + " has been created");
	}
	
	public void setWindowState(boolean bool) {
		this.windowState = bool;
		if (bool == false) {
			System.out.println("Window " + this.windowId + " has been closed");
		} else {
			System.out.println("Window " + this.windowId + " has been opened");
		}
	}
	
	public boolean getWindowState() {
		if (windowState) {
			System.out.println("Window " + this.windowId + " is opened");
		} else {
			System.out.println("Window " + this.windowId + " is closed");
		}
		return this.windowState;
	}
	
	public int getWindowId() {
		return this.windowId;
	}
}
