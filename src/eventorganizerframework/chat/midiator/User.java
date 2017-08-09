package eventorganizerframework.chat.midiator;

public abstract class User {
	private String userName;
	private Chat chat;

	public User(String userName, Chat chat) {

		this.userName = userName;
		this.chat = chat;
	}

	public abstract void sendMessage(String message);

	public abstract void sendPrivateMessage(User user, String message);

	public abstract void receiveMessage(String message);

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Chat getChat() {
		return chat;
	}

	public void setChat(Chat chat) {
		this.chat = chat;
	}
	

}
