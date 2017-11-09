/*
 */
package fitnessapp;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author celine_yin
 */
public class ZTesting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TrainingType type = TrainingType.DANCE;
        Trainer trainer = new Trainer("Tina", "pwd", "fullName", "email", "specialty");
        PersonalTraining pt = new PersonalTraining("Personal", LocalDate.now(), LocalTime.now(), 0, trainer);
        GroupTraining gt = new GroupTraining("Group", LocalDate.now(), LocalTime.now(), 12, type, 10, trainer);
        System.out.println(pt.getClass().equals(gt.getClass()));
        String sessionID= "S100";
        String sessionIDInt = sessionID.substring(1);
        System.out.println(Integer.parseInt(sessionIDInt));
    }
    
}
