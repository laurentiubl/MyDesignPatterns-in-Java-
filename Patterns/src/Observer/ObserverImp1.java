package Observer;

public class ObserverImp1 implements Observer{

	String message;
	Observable observable;
	
	
	@Override
	public void update() {
		
		this.message = (String) observable.getUpdate();
		System.out.println(message);
		
	}

	
	public void setSubject(Observable obs) {
		this.observable = obs;
		
		
	}

}
