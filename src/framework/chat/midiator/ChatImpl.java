package framework.chat.midiator;

import java.util.ArrayList;
import java.util.List;

public class ChatImpl implements Chat {
       private List<User>users;
       
        public ChatImpl(){
        	this.users=new ArrayList<>();
        }

	@Override
	public void addUser(User user) {
		
		if (!users.contains(user)) {
			this.users.add(user);
			} 
		else {
			System.out.println("You are already a member");
		}

	}

	@Override
	public void removeUser(User user) {
		int index = 0;
		for (User u : this.users) {
			if (u.equals(user)) {
				index = users.indexOf(user);
			}

		}
		this.users.remove(index);

	}

	@Override
	public void sendMessage(User user, String message) {
		for (User u : this.users) {
			if (!u.equals(user)) {
				u.receiveMessage(message);
          }
			}
       }

	@Override
	public void sendPrivateMessage(User recieverUser, String message) {
		for (User u : this.users) {
			if (u.equals(recieverUser)) {
				u.receiveMessage(message);
			}

		}

	}

}
