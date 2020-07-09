package MvcObsConsole;

public interface Observable {

	public void notifyObserver();
	public void addObserver(Observer obs);
	public void updateObserver();
	}
