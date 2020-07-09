package MvcObsConsole;

public class main {
	public static void main(String[] args) {
		
		Model mod = new Model();
		
		Console con = new Console(mod);
		Console con2 = new Console(mod);
		Console con3 = new Console(mod);
		
		Controller cont = new Controller(con, mod);
		Controller cont2 = new Controller(con, mod);

		
		
		con.message("aaa");
		con.message("aaabbb");
		con.message("lalalala");
		
	}
}
