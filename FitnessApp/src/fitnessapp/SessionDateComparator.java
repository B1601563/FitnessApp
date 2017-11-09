/*
 */
package fitnessapp;

import java.util.Comparator;

/**
 *
 * @author celine_yin
 */
public class SessionDateComparator implements Comparator<TrainingSession>{
    /**
     * compare method for comparing session dates
     * 
     * @param ts
     * @param ts1
     * @return -1 if the date comes before ts' date
     */
    @Override
    public int compare(TrainingSession ts, TrainingSession ts1) {
        return ts.getDate().compareTo(ts1.getDate());
    }
    
}
