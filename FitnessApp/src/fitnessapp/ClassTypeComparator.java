/*
 */
package fitnessapp;

import java.util.Comparator;

/**
 *
 * @author celine_yin
 */
public class ClassTypeComparator implements Comparator<TrainingSession> {

    /**
     * compare method for comparing training/class types
     * @param ts
     * @param ts1
     * @return -1 if the training/class type comes before ts1's training/class types
     */
    @Override
    public int compare(TrainingSession ts, TrainingSession ts1) {
        String type, type1;
        // check if both are of same class
        if (ts.getClass().equals(ts1.getClass())) {
            // if ts is personal training, ts1 is also personal training
            if (ts instanceof PersonalTraining) {
                // check which has an earlier date
                return ts.getDate().compareTo(ts1.getDate());
            }
            
            // if ts is group training, ts1 is also group training
            if (ts instanceof GroupTraining){
                GroupTraining gt = (GroupTraining) ts;
                GroupTraining gt1 = (GroupTraining) ts1;
                
                // if both are from same group class type
                if (gt.getClassType().compareTo(gt1.getClassType()) == 0) {
                    return ts.getDate().compareTo(ts1.getDate());
                } else if (gt.getClassType().compareTo(gt1.getClassType()) == 1) {
                    return ts.getDate().compareTo(ts1.getDate());
                } else {
                    return ts.getDate().compareTo(ts1.getDate());
                }

            }
        } else {
            // if ts and ts1 are different classes and
            // if ts is personal training
            if (ts instanceof PersonalTraining) {
                return -1;
            }
        }
        // if ts and ts1 are different classes and
        // if ts is group training
        return 1;
    }

}
