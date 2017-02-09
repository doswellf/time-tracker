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
    
    public void add(TimeEntry entry) {
        entries.add(entry);
    }

    /**
     * add
     * @param entry
     *
     */
    public void remove(TimeEntry entry) {
        entries.remove(entry);
    }

    /**
     * add
     * @param entry
     *
     */
    public int size() {
        return entries.size();
    }

    /**
     * add
     * @param entry
     *
     */
    public TimeEntry get(int index) {
        return entries.get(index);
    }
}


