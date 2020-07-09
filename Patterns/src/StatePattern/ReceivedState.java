package StatePattern;

public class ReceivedState implements PackageState{

	@Override
	public void next(Package pkg) {
		 pkg.setState(new RefuseState());
		
	}

	@Override
	public void prev(Package pkg) {
		pkg.setState(new DeliveredState());
		
	}

	@Override
	public void printStatus() {
		
		 System.out.println("We are in package received.");
		
	}

}
