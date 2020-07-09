package Observer;

public class Main {
	public static void main(String[] args) {
		
		ObservableImpl subiect = new ObservableImpl();
		
		ObserverImp1 obs1 = new ObserverImp1();
		
		ObserverImp1 obs2 = new ObserverImp1();
	
		subiect.registerObserver(obs1);
		subiect.registerObserver(obs2);
		
		obs1.setSubject(subiect);
		obs2.setSubject(subiect);
		
		subiect.setMessage("hi girls lalalalal");
		
	}
}
