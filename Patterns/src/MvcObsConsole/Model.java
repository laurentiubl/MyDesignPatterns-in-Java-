package MvcObsConsole;

import java.util.ArrayList;
import java.util.List;

public class Model implements Observable{

	List<Observer> listObs = new ArrayList<Observer>();
	List<String> message = new ArrayList<String>();
	
	
	
	public List<String> getMessage() {
		return message;
	}


	public void setMessage(List<String> message) {
		this.message = message;
	}


	public void addMessage(String msg) {
		message.add(msg);
		notifyObserver();
	};
	
	
	@Override
	public void notifyObserver() {
		listObs.stream().forEach((obss -> {obss.update();
		}));
	}

	@Override
	public void addObserver(Observer obs) {
		listObs.add(obs);
	}

	@Override
	public void updateObserver() {
		// TODO Auto-generated method stub
		
	}

}
