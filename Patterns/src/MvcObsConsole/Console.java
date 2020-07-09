package MvcObsConsole;

import java.util.ArrayList;
import java.util.List;

public class Console implements Observable, Observer {

	List<Observer> listObs = new ArrayList<Observer>();
	List<String> mesajeDeLaModel = new ArrayList<String>();
	Model mod;
	
	public Console(Model mod) {
		this.mod = mod;
		mod.addObserver(this);
	};
	
	
	
	public void message(String s) {
		notifyObserver();
		
		for (int i = 0; i < listObs.size(); i++) {
			Controller obs = (Controller) listObs.get(i);
			obs.sendMsg(s);
		}
	};
	
	@Override
	public void notifyObserver() {
		listObs.stream().forEach((obs) -> {obs.update();
		});
	}

	@Override
	public void addObserver(Observer obs) {
		listObs.add(obs);
	}

	
	@Override
	public void update() {
		mesajeDeLaModel = mod.getMessage();
		for(String s: mesajeDeLaModel) {
		System.out.println(s);
		}
	}

	@Override
	public void updateObserver() {
		// TODO Auto-generated method stub
		
	}

}
