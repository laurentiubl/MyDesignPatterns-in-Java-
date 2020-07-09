package StatePattern;

public class RefuseState implements PackageState{

	@Override
	public void next(Package pkg) {
		 System.out.println("This package is refused...");
		
	}

	@Override
	public void prev(Package pkg) {
		pkg.setState(new ReceivedState());
	}

	@Override
	public void printStatus() {
		
		 System.out.println("This package is refused...");
	}

	
	public void goToBeginning(Package pkg) {
		pkg.setState(new OrderedState());
	}
}
