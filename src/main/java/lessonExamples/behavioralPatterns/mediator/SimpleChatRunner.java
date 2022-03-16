package lessonExamples.behavioralPatterns.mediator;

public class SimpleChatRunner {
    public static void main(String[] args) {
        SimpleTextChat chat = new SimpleTextChat();

        User admin = new Admin(chat, "Admin");
        User user1 = new Admin(chat, "User 1");
        User user2 = new Admin(chat, "User 2");

        chat.setAdmin(admin);
        chat.addUserToChat(user1);
        chat.addUserToChat(user2);
        user1.sendMessage("Hi, i'm user 1.");


        admin.sendMessage("I'm admin.");
    }
}
