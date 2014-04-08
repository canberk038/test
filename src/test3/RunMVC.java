package test3;

public class RunMVC {

	private int start_value=10;
	private int start_value2=20;
	
	public RunMVC()
	{
	 Model myModel = new Model();
	 View myView = new View();
	
	 myModel.addObserver(myView);
	
	 
	 Controller myController=new Controller();
	 myController.addModel(myModel);
	 myController.addView(myView);
	 myController.initModel(start_value,start_value2);
	
	 
	 myView.addController(myController);
	 
	}
	
	
}
