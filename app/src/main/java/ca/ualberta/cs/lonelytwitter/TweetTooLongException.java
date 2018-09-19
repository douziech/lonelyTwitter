package ca.ualberta.cs.lonelytwitter;

/**
 * Created by douziech on 9/18/18.
 */

public class TweetTooLongException extends Exception {

    TweetTooLongException() {
        super("Tweets cannot exceed 140 characters in length.  Please try again.");
    }


}
