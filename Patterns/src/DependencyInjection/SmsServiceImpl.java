package DependencyInjection;

public class SmsServiceImpl implements MessageService {

	@Override
	public void sendMessage(String msg, String rec) {
		
		System.out.println("Emeil sent to " + rec + "With message "+ msg);
		
	}

}
