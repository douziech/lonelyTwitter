package ca.ualberta.cs.lonelytwitter;

import java.util.Date;



/**
 * Created by douziech on 9/18/18.
 */

public class Tweet {

   private Date date;
   private String message;
    private static final Integer MAX_CHARS = 140;

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
        if (message.length() <= this.MAX_CHARS){
            this.message = newMessage;
        }
        else {
            throw new TweetTooLongException();
    }

}
