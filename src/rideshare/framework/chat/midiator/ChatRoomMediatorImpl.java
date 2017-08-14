package rideshare.framework.dao.chat;

import java.util.ArrayList;
import java.util.List;

public class ChatRoomMediatorImpl implements ChatRoomMediator {
	private List<ChatUser> users;

	public ChatRoomMediatorImpl() {
		this.users = new ArrayList<>();
	}

	@Override
	public void addUser(ChatUser user) {
		if (!users.contains(user)) {
			this.users.add(user);
		} else {
			System.out.println("User is already a member of the chat room.");
		}
	}

	@Override
	public void removeUser(ChatUser user) {
		int index = users.indexOf(user);
		if (index > -1) {
			this.users.remove(index);
		}
	}

	@Override
	public void sendMessage(ChatUser user, String message) {
		for (ChatUser u : this.users) {
			if (!u.equals(user)) {
				u.receive(message);
			}
		}
	}

	@Override
	public void sendPrivateMessage(ChatUser recieverUser, String message) {
		for (ChatUser u : this.users) {
			if (u.equals(recieverUser)) {
				u.receive(message);
			}
		}

	}

}
