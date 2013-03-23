package example;

import java.awt.Dimension;
import java.awt.Point;

import com.utils.window.UWindow;

public class BasicWindowSample extends UWindow{

	public BasicWindowSample(){
		
		//super();
		//super("BasicWindowSample Application");
		//super("BasicWindowSample Application", true);
		//super("BasicWindowSample Application", new Dimension(500, 500));
		//super("BasicWindowSample Application", new Point(300, 300));
		super("BasicWindowSample Application", 300, 300, 400, 100, true);	//uncomment whatever line above to see how it works...
		super.setVisible(true);
		
	}
	public static void main(String[] args) {
		new BasicWindowSample();
	}
	
}
