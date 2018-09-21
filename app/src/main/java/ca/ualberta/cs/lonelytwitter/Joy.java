package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by douziech on 9/21/18.
 */

public class Joy extends AbstractMood {

   private String definingMood = "I am in a state of joy.";

    public String mood(){
        return this.definingMood;
    }

}
