package test3;

import java.awt.event.ActionEvent;

public class Controller implements java.awt.event.ActionListener {

	
	Model model;
	View view;
	
	public Controller() {
		// TODO Auto-generated constructor stub
	
		System.out.println("Controller()");
	
	}

	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		System.out.println("Controller : adding model");
		model.incrementValue();

	}

	public void addModel(Model m){
		
		this.model=m;
		
	}

	public void addView(View v)
	{
		
		this.view=v;
		
	}
	public void initModel(int x,int y){

		model.setValueX(x);
		model.setValueY(y);
	}



}
