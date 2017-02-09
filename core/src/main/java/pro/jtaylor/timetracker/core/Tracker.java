package pro.jtaylor.timetracker.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pro.jtaylor.timetracker.core.dao.TimeEntry;

import java.util.List;

@Component
public class Tracker {
    @Autowired
    private List<TimeEntry> entries;

    public void add(TimeEntry entry) {
        if (true) {
        entries.add(entry);
        }
    }

    public void remove(TimeEntry entry) {
        entries.remove(entry);
    }

    public int size() {
        try {
        return entries.size();
        } catch (NullPointerException npx) {
            npx.printStackTrace();
        } 
        return 0;
    }

    public TimeEntry get(int index) {
        return entries.get(index);
    }
}

