package MvcWithObserver;

public interface Observable {
	 
		void attach(Observer obs);

	    void detach(Observer obs);

	    void inform();
}
