package fitnessapp;

import java.util.Comparator;

/**
 * ClassTypeComparator is a comparator to compare the class types of training sessions
 * @author B1601563
 */
public class ClassTypeComparator implements Comparator<TrainingSession> {

    /**
     * compare method which compares training/class types of two training sessions
     * @param ts a training session you want to compare
     * @param ts1 another training session you want to compare with
     * @return -1 if the training/class type comes before ts1's training/class types
     */
    @Override
    public int compare(TrainingSession ts, TrainingSession ts1) {
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
                    return 1;
                } else {
                    return -1;
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
