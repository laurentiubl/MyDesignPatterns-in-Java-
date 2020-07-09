package Observer;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable {

	List<Observer> observers = new ArrayList<>();
	
	String message;
	
	
	public void setMessage(String message) {
		this.message = message;
		notifyObservers();
	}

	public String getMessage() {
		return message;
	}

	
	public void registerObserver(Observer observer) {
		observers.add(observer);
		
		
	}
	
	
	
	public void notifyObservers() {
	for(Observer obs : observers) {
		obs.update();
	}
		
	}

	
	public void removerObserver() {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public  String getUpdate() {
		return this.message;	
	}

	
	
}
