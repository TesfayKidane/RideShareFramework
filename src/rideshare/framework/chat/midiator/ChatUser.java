package rideshare.framework.dao.chat;

public class ChatUser extends AChatUser{

	
	private Long id = null;

	private String firstName;

	private String lastName;

	private String email;
	
	private String phone;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public ChatUser(ChatRoomMediator chatRoomMediator, long id) {
		super(chatRoomMediator, id);
	}
	
	public ChatUser(long id) {
		super(id);
	}

	public ChatUser() {
	}

	@Override
	public void send(String msg) {
		System.out.println("User"+this.id + " Sending Message : " + msg);
		chatRoomMediator.sendMessage(this, msg);
    }

    @Override
    public void receive(String msg) {
        System.out.println("User"+this.id + " Received Message : " + msg);
    }
}
