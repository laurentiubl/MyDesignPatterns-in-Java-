package DependencyInjection;

public class MyDIApplication implements Consumer {

	
	private MessageService service;
	
	public MyDIApplication(MessageService svc) {
		this.service = svc;
	}
	
	
	@Override
	public void processMessages(String msg, String rec) {
		// TODO Auto-generated method stub
		
	}

}
