package rideshare.framework.dao.chat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import rideshare.framework.dao.commondomain.User;

public class UsersRepository {
	private static HashMap<Integer, List<ChatUser>> rideUsers = new HashMap<>();
	private static List<ChatUser> users1 ;
	private static List<ChatUser> users2 ;
	static{
		users1 = new ArrayList<>(Arrays.asList(new ChatUser(1l), new ChatUser(6l), new ChatUser(5l), new ChatUser(2l), new ChatUser(3l)));
		rideUsers.put(1, users1);
		users2 = new ArrayList<>(Arrays.asList(new ChatUser(3l), new ChatUser(2l), new ChatUser(4l), new ChatUser(6l), new ChatUser(9l)));
		rideUsers.put(2, users2);
	}
	
	public static List<ChatUser> getRideUsers(Integer rideId){
		if(rideUsers.containsKey(rideId))
			return rideUsers.get(rideId);
		return null;
	}
	
	public static ChatUser getCurrentLoggedInUser(){
		return users1.get(0);
	}
}
