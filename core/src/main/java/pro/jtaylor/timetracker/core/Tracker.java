package pro.jtaylor.timetracker.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pro.jtaylor.timetracker.core.dao.TimeEntry;

import java.util.List;

/**
 * Tracker Class
 */

@Component
public class Tracker {
    @Autowired
    private List<TimeEntry> entries;

    /**
     * add
     * @param entry
     *
     */
    
    public void add(final TimeEntry entry) {
        entries.add(entry);
    }

    /**
     * add
     * @param entry
     *
     */
    public void remove(final TimeEntry entry) {
        entries.remove(entry);
    }

    /**
     * add
     * @param entry
     *
     */
    public int size() {
        // forces always-true if condition and empty if block
        /*        
        if (true) {
          // do nothing
        }
        */
        return entries.size();
    }

    /**
     * add
     * @param index
     * @return TimeEntry
     */
    public TimeEntry get(final int index) {
        
        // forces empty try and catch block warnings
        /*
        try { 
        
        } catch (NullPointerException npx) {
        
        }
        */
        
        return entries.get(index);
    }
    
    // forces a findbugs "might return null" warning
/*    
    @Override
    public String toString() {
        if (entries.size() < 1) 
            return null;
        else
            return String.valueOf(entries.get(1));
    }
  */      
}


