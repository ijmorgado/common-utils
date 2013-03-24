package example;

import javax.swing.JLabel;

import com.utils.window.UWindowContainer;

public class WindowContainerSample extends UWindowContainer {	// Important: Be sure of extend your class of UWindowContainer to take properties.
	private JLabel label_test;
	
	public WindowContainerSample(){
		super("Hello world!!!");	
		this.label_test = new JLabel("Hello, I'm on container...");
		super.add(this.label_test, 100, 100, 200, 30);	// As you can see is really simple add whatever component in a single line.
		super.setVisible(true);	// We make the window visible when it's instantiated...
	}
	
	public static void main(String[] args) {
		new WindowContainerSample();

	}

}