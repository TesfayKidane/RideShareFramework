package framework.chat.midiator;

public class Client {
	
	public static void main(String[] args) {

		Chat chatMenbers = new ChatImpl();
		UserImpl lulu = new UserImpl("Lwam", chatMenbers);
		UserImpl fufu = new UserImpl("febu", chatMenbers);
		UserImpl mohammed = new UserImpl("Mohammed", chatMenbers);
		UserImpl tesfay = new UserImpl("Tesfay", chatMenbers);
		chatMenbers.addUser(mohammed);
		chatMenbers.addUser(lulu);
		chatMenbers.addUser(fufu);
		chatMenbers.addUser(tesfay);

		lulu.sendMessage("how are u guys ?");
		fufu.sendPrivateMessage(lulu, "gumama");
		chatMenbers.removeUser(tesfay);
		mohammed.sendMessage("let's start after 5 mint");

	}

}
