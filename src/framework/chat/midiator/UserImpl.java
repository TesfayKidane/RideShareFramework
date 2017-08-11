package framework.chat.midiator;

public class UserImpl  extends User{

	public UserImpl(String userName, Chat chat) {
		super(userName, chat);
		
	}

	@Override
	public void sendMessage(String message) {
		System.out.println("Messsage send by "+this.getUserName()+ " "+message);
		
		this.getChat().sendMessage(this, message);
		
	}

	@Override
	public void sendPrivateMessage(User user, String message) {
		System.out.println("Message send by "+this.getUserName()+ " "+message);
		this.getChat().sendPrivateMessage(user, message);
		
	}

	@Override
	public void receiveMessage(String message) {
		System.out.println("Message received by "+this.getUserName()+" "+ message);
		
		
	}

}
