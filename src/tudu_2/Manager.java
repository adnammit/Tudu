
package tudu_2;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;


public class Manager {
    private DefaultListModel<Task> allTasksList;
    private DefaultListModel<Task> todoList;
    private DefaultListModel<Task> inProgressList;
    private DefaultListModel<Task> completedList;
    private String file;
    private FileIO fileHandler;

    
    Manager(){}
    
    public void run(){
        if (authenticate()){
            readFile();
            runGUI();   
        }
    }
  
    public void runGUI(){
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainFrame frame = new MainFrame();
                frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                frame.addWindowListener(new WindowAdapter() {
                @Override
                    public void windowClosing(WindowEvent event) {
                        goodbye();
                        System.exit(0);
                    }
                });
                frame.buildGUI(allTasksList, todoList, inProgressList, completedList);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
    
    public boolean authenticate(){
        LoginDialog dialog = new LoginDialog(new JFrame(), true);
        dialog.setVisible(true);
        if (dialog.authenticate()){
            file = dialog.getFile();
            return true;
        }
        return false;
    }
    
    public void readFile(){
    // Make a list model for each of our focuses:
        allTasksList = new DefaultListModel<>();
        todoList = new DefaultListModel<>();
        inProgressList = new DefaultListModel<>();
        completedList = new DefaultListModel<>();
 
    // Hand the lists to FileIO to read:
        fileHandler = new FileIO();
        //file = "file.txt";
        this.fileHandler.readFile(file, allTasksList, todoList, inProgressList, completedList);  
        
    // Test that all lists were correctly read in: 
        System.out.println("\nDISPLAYING ALL TASKS:");
        displayList(allTasksList);
        System.out.println("\nDISPLAYING TO DO:");
        displayList(todoList);
        System.out.println("\nDISPLAYING IN PROGRESS:");
        displayList(inProgressList);
        System.out.println("\nDISPLAYING COMPLETED:");
        displayList(completedList);
    }
    
    public void displayList(DefaultListModel<Task> list){
        int size = list.size();
        for (int i=0; i<size; i++){
            list.getElementAt(i).display();
            System.out.println();
        }   
    }
    
    public void goodbye(){
        this.fileHandler.writeFile(file, allTasksList);  
    }
}
