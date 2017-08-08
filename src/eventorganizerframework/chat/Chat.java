package eventorganizerframework.chat;

public interface Chat {
	public void addUser(User user);
	public void removeUser(User user);
    public void sendMessage(User user,String message);
    public void sendPrivateMessage(User recieverUser,String message);
}
