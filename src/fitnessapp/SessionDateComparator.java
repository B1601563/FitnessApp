package fitnessapp;

import java.util.Comparator;

/**
 * SessionDateComparator is a comparator to compare the dates of training sessions
 * @author B1601563
 */
public class SessionDateComparator implements Comparator<TrainingSession>{
    /**
     * compare method for comparing session dates
     * 
     * @param ts a TrainingSession to compare
     * @param ts1 another TrainingSession to be compared with
     * @return -1 if the date comes before ts' date
     */
    @Override
    public int compare(TrainingSession ts, TrainingSession ts1) {
        return ts.getDate().compareTo(ts1.getDate());
    }
    
}
