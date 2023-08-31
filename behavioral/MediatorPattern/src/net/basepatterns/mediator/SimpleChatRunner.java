package net.basepatterns.mediator;

public class SimpleChatRunner {
    public static void main(String[] args) {
        SimpleTextChat chat = new SimpleTextChat();

        User admin = new Admin(chat, "Admin");
        User user1 = new SimpleUser(chat, "user 1");
        User user2 = new SimpleUser(chat, "user 2");

        chat.setAdmin(admin);
        chat.addUserToChat(user1);
        chat.addUserToChat(user2);

        user1.sendMessage("Hello, i am user 1");
        admin.sendMessage("Roger that. i am admin");
    }
}
