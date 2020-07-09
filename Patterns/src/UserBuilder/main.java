package UserBuilder;
import java.util.logging.Logger;

public class main {


		public static void main(String[] args) {
			
			User user = new User.BuilderClass(1566, "John")
					.phone("43244342")
					.adress("Stuparich")
					.Build();
			
			Logger lo = Logger.getLogger(User.class.getName());
			
			System.out.println(user.toString());
				
	}
}
