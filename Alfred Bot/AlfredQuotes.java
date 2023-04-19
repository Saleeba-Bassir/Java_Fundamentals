import java.util.Date;
public class AlfredQuotes {
    public String basicGreeting() {
        return "Hey,it's been a while. How you doing?";
    }
    
    public String guestGreeting(String name) {
        return String.format("Hello, %s.welcome to the party.", name);
    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        return String.format("The date is %s.", date);
    }
    
    public String respondBeforeAlexis(String conversation) {
        if (conversation.indexOf("Alexis") >= 0) {
            return "Right away, sir. She ain't built for that.";
        } else if (conversation.indexOf("Alfred") >= 0) {
            return "Your wish is my command";
        } else {
            return "Right. And with that I shall retire.";
        }
    }
}


