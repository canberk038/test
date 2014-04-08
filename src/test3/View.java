package test3;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Observable;

public class View implements java.util.Observer{

	private TextField myTextField;
	private TextField myTextField2;
	private Button button;
	
View(){
		
		System.out.println("View()");
		Frame frame = new Frame("MVC");
		frame.add("North", new Label("counter"));
		
		myTextField = new TextField();
		frame.add("Center", myTextField);
		
		myTextField2 = new TextField();
		frame.add("Center", myTextField2);
		
		Panel panel=new Panel();
		button = new Button("Press");
		panel.add(button);
		frame.add("South", panel);
		
		frame.addWindowListener(new CloseListener());	
		frame.setSize(500,500);
		frame.setLocation(100,100);
		frame.setVisible(true);
		
		
	}
	
	
	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
		myTextField.setText("" + ((Integer)arg1).intValue());
		System.out.println("arg1:"+arg1);
		
		myTextField2.setText("" + ((Integer)arg1).intValue());
		System.out.println("arg1:"+arg1);
	
	
	}
	
	public void setValue(int v){
		myTextField.setText("" + v);
}
   
	public void addController(ActionListener controller)
	{
		
		System.out.println("View      : adding controller");
		button.addActionListener(controller);
			
		
	}
	public static class CloseListener extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			e.getWindow().setVisible(false);
			System.exit(0);
		} 
	} 
	
	
}
