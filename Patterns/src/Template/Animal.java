package Template;

public abstract class Animal {

	   public abstract void makeSound();
	    public abstract void eatFood();
	    public abstract void sleep();

	    public void doEveryday(){
	        makeSound();
	        eatFood();
	        sleep();
	    }
	
}
