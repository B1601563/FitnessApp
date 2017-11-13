package fitnessapp;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 * TrainingHistTableModel is a table model which manages an array of session objects for training history
 * @author B1601563
 */
public class TrainingHistTableModel extends AbstractTableModel {
    // set up the column headers
    private static final String[] colHeader = {"Session ID", "Title", "Date", 
        "Time", "Type"};
    // the list of sessions to be displayed
    private ArrayList<TrainingSession> sessions;

    /**
     * Constructor for TrainingHistTableModel
     * @param sessions TrainingSession list
     */
    public TrainingHistTableModel(ArrayList<TrainingSession> sessions) {
        setSessions(sessions);
    }
    
    /**
     * Setter to set the training sessions data
     * @param sessions TrainingSession list
     */
    public void setSessions(ArrayList<TrainingSession> sessions) {
        this.sessions = sessions;
    }
    
    /**
     * A method to get the number of rows in the table 
     * Number of rows is the size of the array list (all sessions)
     * For member: all sessions registered by the member
     * For trainer: all sessions created by the trainer
     * @return an integer indicating how many rows there are
     */
    @Override
    public int getRowCount() {
        return sessions.size();
    }
    
    /**
     * A method to get the number of columns in the table
     * Number of columns follows the column header
     * @return an integer indicating how many columns there are
     */
    @Override
    public int getColumnCount() {
        return colHeader.length;
    }
    
    /**
     * A method to fill in the values in the table cells
     * @param rowIndex index of the table row
     * @param columnIndex index of the table column
     * @return a specific Object for that row and column
     */
    public Object getValueAt(int rowIndex, int columnIndex) {
        String type = "Personal";
        String rating = "none";
        TrainingSession theSession = (TrainingSession) sessions.get(rowIndex);
        if (theSession instanceof GroupTraining) {
            type = ((GroupTraining) theSession).getClassType().toString();
        }
        if (theSession.getTrainer().getAverageRating() > 0) {
            rating = theSession.getTrainer().getAverageRating() + "";
        }
        switch(columnIndex) {
            case 0: return theSession.getSessionID();
            case 1: return theSession.getTitle();
            case 2: return theSession.getDate();
            case 3: return theSession.getTime();
            case 4: return type;
            default: return "";
        }
    }
    
    /**
     * A method to get the name (header) of the column
     * @param column index of the table column
     * @return String column name
     */
    public String getColumnName(int column){
        return colHeader[column];
    }
    
    /**
     * A method to return the TrainingSession object at a specified row
     * @param index index of the table row
     * @return the TrainingSession at that row
     */
    public TrainingSession getSessionAt(int index){
        TrainingSession theSession = (TrainingSession) sessions.get(index);
        return theSession;
    }

}
