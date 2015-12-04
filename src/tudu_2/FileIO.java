
package tudu_2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

public class FileIO {
    private Scanner in;
    private BufferedWriter o;
    private File file;
    
    FileIO(){}
    
//***************************************************************************************
// 	READ INVENTORY
//		Reads in the balance and data on all items from the file.
	
    public void readFile(String file, DefaultListModel<Task> allTasksList, DefaultListModel<Task> todoList, 
            DefaultListModel<Task> inProgressList, DefaultListModel<Task> completedList){
        Path path = Paths.get(file);
        if (Files.exists(path)){
            try{
            // Create a new Scanner object, Task object, and strings to catch the data.
            //  readSuccess will skip adding this object to the list if there's any problem reading it.
                in = new Scanner(new File(file));
                in.useDelimiter(System.getProperty("line.separator"));
                Task task = null;
                String date;
                Date created = null;
                Date updated = null;
                int type = 0;
                String title = null;
                String description = null;
                Boolean readSuccess;
                DateFormat df = new SimpleDateFormat("H:mm a, MM/dd/yyyy");
           
                while(in.hasNext()){
                    readSuccess = true;
                // Read Date Created:
                    if(in.hasNext()){
                        date = in.next();
                        try {
                            created = df.parse(date);
                        } catch (ParseException ex) {
                            readSuccess = false;
                            Logger.getLogger(FileIO.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                // Read Date Updated:
                    if(in.hasNext()){
                        date = in.next();
                        try {
                            updated = df.parse(date);
                        } catch (ParseException ex) {
                            readSuccess = false;
                            Logger.getLogger(FileIO.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                // Read type: 
                    if(in.hasNext()){
                        type = in.nextInt();
                    } 
                    else
                        readSuccess = false;
                // Read Title: 
                    if(in.hasNext()){
                        title = in.next();
                    } 
                    else
                        readSuccess = false;
                // Read Description:
                    if(in.hasNext()){
                        description = in.next();
                    } 
                    else
                        readSuccess = false;               

                // Create the new task and add it to the all-task list:
                    if (readSuccess == true){
                        task = new Task(created, updated, type, title, description);
                        allTasksList.addElement(task);
                    // Also add the task to the appropriate focus list:
                        switch(type){
                            case 0:
                                todoList.addElement(task);
                                break;
                            case 1:
                                inProgressList.addElement(task);
                                break;
                            case 2: 
                                completedList.addElement(task);
                                break;
                        }
                    }	
                }
                in.close();
            }catch (IOException e){
                e.printStackTrace();	
            }
        }
    }
    
    public void writeFile(String file, DefaultListModel<Task> list){
        try {
            o = new BufferedWriter(new FileWriter(file));
            Task task;
            for (int i = 0; i < list.getSize(); i++){
                task = list.getElementAt(i);
                task.display();
                o.write(task.getCreated());
                o.newLine();
                o.write(task.getUpdated());
                o.newLine();
                o.write(Integer.toString(task.getType()));
                o.newLine();
                o.write(task.getTitle());
                o.newLine();
                o.write(task.getDescription());
                o.newLine();
            }
            o.close();
        } catch (IOException e) {
            System.out.println("Error writing to file.");
            e.printStackTrace();
	}
    }
    
    
}

//***************************************************************************************
//	END CODE
//***************************************************************************************
