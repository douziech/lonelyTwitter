package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
import java.util.List;


/**
 * Created by douziech on 9/18/18.
 */

public class Tweet {

    //Code provided by the LI...
   private Date date;
   private String message;
    private static final Integer MAX_CHARS = 140;
    private List<AbstractMood> listOfMoods;

    Tweet() {
        this.date = new Date();
        this.message = "Default message.";

    }

    Tweet(String newMessage){
        this.date = new Date();
        this.message = newMessage;

    }

    public Date getDate() {return this.date;}

    public String getMessage() {return this.message;}

    public void setMessage(String newMessage) throws TweetTooLongException {
        if (message.length() <= this.MAX_CHARS) {
            this.message = newMessage;
        } else {
            throw new TweetTooLongException();
        }
    }

}
