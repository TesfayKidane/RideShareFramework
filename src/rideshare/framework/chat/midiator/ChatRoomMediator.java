package rideshare.framework.dao.chat;

public interface ChatRoomMediator {
	public void addUser(ChatUser user);
	public void removeUser(ChatUser user);
    public void sendMessage(ChatUser chatUser,String message);
    public void sendPrivateMessage(ChatUser user,String message);
}
