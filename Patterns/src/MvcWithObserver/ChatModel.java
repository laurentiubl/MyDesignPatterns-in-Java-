package MvcWithObserver;
import java.util.*;
public class ChatModel implements Observable{

	private Vector messages;

    /**
     * @associates <{ChatObserver}>
     */
    private Vector forumObserversVector = new java.util.Vector();

    public ChatModel() {
        messages = new Vector();
    }

    public void addMessage(String msg) {
        messages.add(msg);
        inform();
    }

    public String getMessages() {
        int length = messages.size();
        String allMessages = "";
        for (int i = 0; i < length; ++i) {
            allMessages += (String)messages.elementAt(i)+"\n";
            System.out.println("Am adaugat");
        }
        return allMessages;
    }

    public void attach(Observer forumObserver){
            forumObserversVector.addElement(forumObserver);
        }

    public void detach(Observer forumObserver){
            forumObserversVector.removeElement(forumObserver);
        }

    public void inform(){
            java.util.Enumeration enumeration = forumObservers();
            while (enumeration.hasMoreElements()) {
                ((Observer)enumeration.nextElement()).update();
            }
        }

    public Enumeration forumObservers(){
            return ((java.util.Vector) forumObserversVector.clone()).elements();
        }

}
