package test3;

public class Model extends java.util.Observable {

	
	private int counter;
	private int counter2;

	public Model() {
		
		System.out.println("Model()");
	
	}
	
	public void setValueX(int value){
		
		this.counter=value;
		System.out.println("Model initial value"+counter);
		//System.out.println("Canberk");
		
		setChanged();
		notifyObservers(counter);
		
	}
public void setValueY(int value){
		
		this.counter2=value;
		System.out.println("Model initial value"+counter2);
		setChanged();
		notifyObservers(counter2);
	}
	
	public void incrementValue()
	{
		
		++counter;
		++counter2;
		System.out.println("Model counter : " + counter);
		System.out.println("Model counter : " + counter2);
		setChanged();
		notifyObservers(counter);
		notifyObservers(counter2);
	}
	
}
