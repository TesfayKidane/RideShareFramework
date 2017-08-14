package rideshare.framework.dao.chat;

public abstract class AChatUser {
	protected ChatRoomMediator chatRoomMediator;

	public ChatRoomMediator getChatRoomMediator() {
		return chatRoomMediator;
	}

	public void setChatRoomMediator(ChatRoomMediator chatRoomMediator) {
		this.chatRoomMediator = chatRoomMediator;
	}

	private long id;

	public AChatUser(ChatRoomMediator chatRoomMediator, long id) {
		this.chatRoomMediator = chatRoomMediator;
		this.id = id;
	}

	public AChatUser(long id) {
		this.id = id;
	}

	public AChatUser() {
		super();
	}

	public abstract void send(String msg);

	public abstract void receive(String msg);

}
