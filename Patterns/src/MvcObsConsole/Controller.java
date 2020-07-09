package MvcObsConsole;

public class Controller implements Observer{

	int messageNr;
	
	Console con;
	Model mod;
	
	public Controller(Console con, Model mod) {
		this.con = con;
		this.mod = mod;
		con.addObserver(this);
	};
	
	public void sendMsg(String s) {
		mod.addMessage(s);
	};
	
	
	@Override
	public void update() {
		messageNr++;
		System.out.println(messageNr);
	}

}
