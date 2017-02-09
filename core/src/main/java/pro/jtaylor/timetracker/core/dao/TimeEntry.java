package pro.jtaylor.timetracker.core.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by Jason on 6/19/2015.
 */
@Component
@Scope("prototype")
public class TimeEntry {
    private String description;
    private float rate;
    private int time;

    /**
      * A Method
      * @param value 
      */

    public String getDescription() {
        return description;
    }

        /**
      * A Method
      * @param value 
      */

    public void setDescription(final String value) {
        this.description = value;
    }

        /**
      * A Method
      * @param value 
      */

    public float getRate() {
        return rate;
    }
    /**
      * A Method
      * @param value 
      */

    public void setRate(final float value) {
        this.rate = value;
    }
    /**
      * A Method
      * @param value 
      */

    public int getTime() {
        return time;
    }
    /**
      * A Method
      * @param value 
      */

    public void setTime(final int value) {
        this.time = value;
    }
    /**
      * A Method
      * @param value 
      */

    @Override
    public String toString() {
        return "TimeEntry{" +
                "description='" + description + '\'' +
                ", rate=" + rate +
                ", time=" + time +
                '}';
    }
}
