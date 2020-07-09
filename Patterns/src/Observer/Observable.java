package Observer;

public interface Observable {

	
	public void registerObserver(Observer observer);
	
	public Object getUpdate();
	
	public void notifyObservers();
	
	public void removerObserver();
	
}
