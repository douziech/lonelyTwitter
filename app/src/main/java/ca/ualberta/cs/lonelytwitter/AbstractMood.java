package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by douziech on 9/21/18.
 */

public abstract class AbstractMood {

    private Date date;

   abstract String mood();

   Date setDate(){
       return this.date = new Date();
   }

   Date manuallySetDate(Date date){
       return this.date = date;
   }

   Date getDate() {return this.date;}

}
