package fitnessapp;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

/**
 * TrainingSession is offered by HELPFit
 * @author ngsm
 */
public abstract class TrainingSession implements Serializable, Comparable<TrainingSession> {
    private static int IDnum = 100;
    
    protected String sessionID;
    protected String title;
    protected LocalDate date;
    protected LocalTime time;
    protected double fee;
    protected SessionStatus status;
    protected Trainer trainer;
    
    private void setSessionID() {
        sessionID = "S" + IDnum++;
    }

    public static int getIDnum() {
        return IDnum;
    }

    public static void setIDnum(int next) {
        IDnum = next;
    }
    

    public String getSessionID() {
        return sessionID;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }

    public double getFee() {
        return fee;
    }

    public SessionStatus getStatus() {
        return status;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public void setStatus(SessionStatus status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.sessionID);
        return hash;
    }

    /**
     * Sessions are equal if they have the same session ID
     * @param obj the other object we want to compare
     * @return true if it is another session with the same session ID
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TrainingSession other = (TrainingSession) obj;
        if (!Objects.equals(this.sessionID, other.sessionID)) {
            return false;
        }
        return true;
    }
    
    /**
     * compareTo method to compare session IDs for sorting
     * @param ts the TrainingSession to be compared with
     * @return -1 if this sessionID comes before ts' sessionID
     */
    @Override
    public int compareTo(TrainingSession ts) {
        return this.getSessionID().compareTo(ts.getSessionID());
    }

    /**
     * Constructor to create a Training Session, sets the attributes
     * including who the trainer is.
     * @param title title of the session
     * @param date date of the session
     * @param time time of the session
     * @param fee fee of the session
     * @param trainer trainer of the session
     */
    public TrainingSession(String title, LocalDate date, LocalTime time, double fee, Trainer trainer) {
        setSessionID();
        
        if (!title.isEmpty())
            this.title = title;
        
        if (date.isAfter(LocalDate.now()))
            this.date = date;
        else
            this.date = LocalDate.now();
        
        this.time = time;
        
        if (fee >= 0)
            this.fee = fee;
        
        this.status = SessionStatus.AVAILABLE;
        this.trainer = trainer;
    }
    
    /**
     * Register a member for a training session
     * @param theMember the member who wants to register for a TrainingSession
     * @return true if successful
     */
    public abstract boolean register(Member theMember);
    
    @Override
    public abstract String toString();
}
