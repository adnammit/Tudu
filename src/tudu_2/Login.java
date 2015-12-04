
package tudu_2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import javax.swing.DefaultListModel;

public class Login {
    
    // RETURNS:
    //  1: user verified
    //  0: user not found
    // -1: password and user do not match
    public static int authenticate(String name, String password){
        String file = "Users.txt";
        Path path = Paths.get(file);
        int authenticated = 0;
        if (Files.exists(path)){
            try{
                Scanner in = new Scanner(new File(file));
                in.useDelimiter(System.getProperty("line.separator"));
                String user = null;
                String pw = null;
            // Search the User file until we find a username match:
                while(in.hasNext() && authenticated==0){
                    if(in.hasNext()){
                        user = in.next();
                    }
                    if(in.hasNext()){
                        pw = in.next();
                    }
                // Once a match is found:
                    if (name.equals(user)){
                    // Return 1 if the user and password match
                        if (password.equals(pw)){
                            authenticated = 1;
                        }
                    // Return -1 if the password doesn't match the username
                        else
                            authenticated = -1;
                    }	
                }
                in.close();
            }catch (IOException e){
                e.printStackTrace();	
            }
        }
        return authenticated;
    }

    public static boolean userExists(String name){
        Boolean found = false;
    // "Users" and "" are invalid usernames:
        if (name.equals("Users") || name.equals(""))
            found = true;
        else {
            String file = "Users.txt";
            Path path = Paths.get(file);
            if (Files.exists(path)){
                try{
                    Scanner in = new Scanner(new File(file));
                    in.useDelimiter(System.getProperty("line.separator"));
                    String user = null;
                    String pw = null;
                    while(in.hasNext() && !found){
                        if(in.hasNext()){
                            user = in.next();
                        }
                        if(in.hasNext()){
                            pw = in.next();
                        }
                        if (name.equals(user)){
                            found = true;
                        }	
                    }
                    in.close();
                }catch (IOException e){
                    e.printStackTrace();	
                }
            }
        }
        return found;
    }
    
    public static void addUser(String user, String pw){
        File file = new File("Users.txt");
        PrintWriter o = null;
        try{
            o = new PrintWriter(new BufferedWriter(new FileWriter(file, true)));
            o.println(user);
            o.println(pw);
        }catch (IOException e) {
            System.err.println(e);
        }finally{
            if (o != null){
                o.close();
            }
        }
    }
}

