package StatePattern;

public class PreparatedState implements PackageState {

	@Override
	public void next(Package pkg) {
		pkg.setState(new DeliveredState());
		
	}

	@Override
	public void prev(Package pkg) {
		pkg.setState(new OrderedState());
		
	}

	@Override
	public void printStatus() {
		System.out.println("We are in Preparated State");
		
	}

}
