
package tudu_2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task {
    SimpleDateFormat df = new SimpleDateFormat("H:mm a, MM/dd/yyyy");
    private Date created;
    private Date updated;
    private int type; // 0 = to do, 1 = in progress, 2 = completed
    private String title;
    private String description;
    
// Default constructor, never invoked. 
    Task(){
        this.title = this.description = null;
        type = 0;
    }
    
// Called when the user enters brand new data into the GUI
    Task(String title, String description){
        this.title = title;
        this.description = description;
        created = new Date();
        updated = new Date();
        type = 0; 
    }
    
// Called when an existing Task is modified (it is actually replaced by a new Task of this spec)
    Task(String title, String description, Date date, int type){
        this.title = title;
        this.description = description;
        this.created = date;
        this.updated = new Date();
        this.type = type; 
    }
    
// Called by FileIO when data is being read from an external file
    Task(Date created, Date updated, int type, String title, String description){
        this.created = created;
        this.updated = updated;
        this.title = title;
        this.description = description;
        this.type = type;
    }
    
    public void modifyTitle(String title){
        this.title = title;
        updated = new Date();
    }
    
    public void modifyDescription(String description){
        this.description = description;
        updated = new Date();
    }
    
    public void modifyType(int type){
        this.type = type;
    }
    
    public void displayAll(){
        System.out.println(title);
        System.out.println(description);
        System.out.println(created);
        System.out.println(updated);
    }
    
    public void display(){
        System.out.println("TITLE: " + title);
        System.out.println("DESCRIPTION: " + description);
        switch(this.type){
            case 0:
                System.out.println("TO DO");
                break;
            case 1:
                System.out.println("IN PROGRESS");
                break;
            case 2:
                System.out.println("COMPLETED");
                break;
        }
        System.out.println("CREATED: " + created);
        System.out.println("MODIFIED: " + updated);
    }
    
    public void displayTitle(){
        System.out.println(title);
    }
    
    public void displayDescription(){
        System.out.println(description);
    }
    
    public void displayCreated(){
        System.out.println(created);
    }
    
    public void displayUpdated(){
        System.out.println(updated);
    }
    
    @Override
    public String toString(){
        return this.description;
    }
    
    public String getTitle(){
        return this.title;
    }
    
    public String getDescription(){
        return this.description;
    }
    
    public String getCreated(){
        return df.format(this.created);
    }
    
    public String getUpdated(){
        return df.format(this.updated);
    }
    
    public Date getCreatedDate(){
        return this.created;
    }
    
    public Date getUpdatedDate(){
        return this.updated;
    }
    
    public int getType(){
        return this.type;
    }
    
    public String showCreated(){
        return "created ".concat(df.format(this.created));
    }
    
    public String showUpdated(){
        return "last updated ".concat(df.format(this.updated));
    }
}

//***************************************************************************************
//	END CODE
//***************************************************************************************
