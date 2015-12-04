
package tudu_2;

import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class LoginDialog extends javax.swing.JDialog {
    private boolean authenticated;
    private Color background;
    private Color foreground;
    private Font font;
    private Font h1;
    private Font h2;
    private Border border;
    private Border padding;
    private String file;

    public LoginDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        authenticated = false;
        buildDialog();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgPanel = new javax.swing.JPanel();
        newPanel = new javax.swing.JPanel();
        newLabel = new javax.swing.JLabel();
        newUsernameLabel = new javax.swing.JLabel();
        newPasswordLabel1 = new javax.swing.JLabel();
        newPasswordLabel2 = new javax.swing.JLabel();
        newPasswordOne = new javax.swing.JPasswordField();
        newPasswordTwo = new javax.swing.JPasswordField();
        newUsernameText = new javax.swing.JTextField();
        newUserButton = new javax.swing.JButton();
        loginPanel = new javax.swing.JPanel();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        usernameText = new javax.swing.JTextField();
        passwordText = new javax.swing.JPasswordField();
        loginLabel = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        newLabel.setText("NEW? SIGN UP!");

        newUsernameLabel.setText("USERNAME:");

        newPasswordLabel1.setText("PASSWORD:");

        newPasswordLabel2.setText("RE-ENTER:");

        newPasswordOne.setText("password");
        newPasswordOne.setPreferredSize(new java.awt.Dimension(120, 30));
        newPasswordOne.setSize(new java.awt.Dimension(120, 30));

        newPasswordTwo.setText("password");
        newPasswordTwo.setPreferredSize(new java.awt.Dimension(120, 30));
        newPasswordTwo.setSize(new java.awt.Dimension(120, 30));

        newUsernameText.setPreferredSize(new java.awt.Dimension(120, 30));
        newUsernameText.setSize(new java.awt.Dimension(120, 30));

        newUserButton.setText("SIGN UP");

        javax.swing.GroupLayout newPanelLayout = new javax.swing.GroupLayout(newPanel);
        newPanel.setLayout(newPanelLayout);
        newPanelLayout.setHorizontalGroup(
            newPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newPanelLayout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addGroup(newPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, newPanelLayout.createSequentialGroup()
                        .addGroup(newPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(newLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(newPanelLayout.createSequentialGroup()
                                .addGroup(newPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(newPasswordLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                    .addComponent(newUsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(newPasswordLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(newPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(newPasswordTwo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(newPasswordOne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(newUsernameText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, newPanelLayout.createSequentialGroup()
                        .addComponent(newUserButton)
                        .addGap(110, 110, 110))))
        );
        newPanelLayout.setVerticalGroup(
            newPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(newLabel)
                .addGap(30, 30, 30)
                .addGroup(newPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newUsernameLabel)
                    .addComponent(newUsernameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(newPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newPasswordLabel1)
                    .addComponent(newPasswordOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(newPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(newPasswordTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newPasswordLabel2))
                .addGap(18, 18, 18)
                .addComponent(newUserButton)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        usernameLabel.setText("USERNAME:");

        passwordLabel.setText("PASSWORD:");
        passwordLabel.setToolTipText("");

        usernameText.setPreferredSize(new java.awt.Dimension(120, 30));
        usernameText.setSize(new java.awt.Dimension(120, 30));

        passwordText.setText("password");
        passwordText.setToolTipText("");
        passwordText.setPreferredSize(new java.awt.Dimension(120, 30));
        passwordText.setSize(new java.awt.Dimension(120, 30));

        loginLabel.setText("SIGN IN:");

        loginButton.setText("LOGIN");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(loginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(passwordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernameText, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(loginButton)
                .addGap(108, 108, 108))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(loginLabel)
                .addGap(29, 29, 29)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(usernameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameLabel))
                .addGap(20, 20, 20)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(loginButton)
                .addGap(35, 35, 35))
        );

        titleLabel.setText("TUDU TASK MANAGEMENT");

        javax.swing.GroupLayout bgPanelLayout = new javax.swing.GroupLayout(bgPanel);
        bgPanel.setLayout(bgPanelLayout);
        bgPanelLayout.setHorizontalGroup(
            bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(bgPanelLayout.createSequentialGroup()
                        .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(newPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        bgPanelLayout.setVerticalGroup(
            bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed

    }//GEN-LAST:event_loginButtonActionPerformed

    public void buildDialog(){
    // Configure the main JFrame:
        Point center = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
        int width = 725; //[727, 481]
        int height = 480;
        this.setBounds(center.x - width / 2, center.y - height / 2, width, height);
        
    // Set variables for visual style:
        background = Color.white;
        foreground = Color.gray;
        font = new Font("Arial", Font.PLAIN, 12);
        h1 = new Font("Georgia", Font.BOLD, 24);
        h2 = new Font("Georgia", Font.BOLD, 14);
        border = BorderFactory.createLineBorder(foreground, 1, true); // (color, width, rounded?)
        padding = BorderFactory.createCompoundBorder(border, new EmptyBorder(10,10,10,10)); 
        setStyle();
        
    // Add action listeners:
        loginButton.addActionListener(new LoginListener());
        newUserButton.addActionListener(new NewUserListener());
    }
    
    public boolean authenticate(){
        return authenticated;
    }
    
    public String getFile(){
        return file;
    }
    
    public String getUsername(){
        return usernameText.getText();
    }
    
    public String getPassword(){
        return new String(passwordText.getPassword());
    }
    
    public String getNewUsername(){
        return newUsernameText.getText();
    }
    
    public String getNewPasswordOne(){
        return new String(newPasswordOne.getPassword());
    }
    
    public String getNewPasswordTwo(){
        return new String(newPasswordTwo.getPassword());
    }
    
    public class LoginListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){            
            int authenticatedType = Login.authenticate(getUsername(), getPassword());
            switch (authenticatedType){
                case 0: //  0: user not found
                    authenticated = false;
                    JOptionPane.showMessageDialog(LoginDialog.this, "Username was not found.", "Login", JOptionPane.ERROR_MESSAGE);
                    break;
                case 1: //  1: user verified
                    authenticated = true;
                    file = getUsername().concat(".txt");
                    dispose();
                    break;
                case -1: // -1: password and user do not match
                    authenticated = false;
                    JOptionPane.showMessageDialog(LoginDialog.this, "Username and password do not match.", "Login", JOptionPane.ERROR_MESSAGE);
                    break; 
            }
        }
    }
    
    public class NewUserListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            if (!getNewPasswordOne().equals(getNewPasswordTwo())){
                JOptionPane.showMessageDialog(LoginDialog.this, "Passwords do not match", "Login", JOptionPane.ERROR_MESSAGE);
                authenticated = false;  
            }
            else if (Login.userExists(getNewUsername())){
                JOptionPane.showMessageDialog(LoginDialog.this, "Username already exists. Please choose a new name.", "Login", JOptionPane.ERROR_MESSAGE);
                authenticated = false;
            }
            else{
                file = getNewUsername().concat(".txt");
                Login.addUser(getNewUsername(),getNewPasswordOne());
                dispose();
                authenticated = true;
            }
        }
    }
    
    public void setStyle(){
        this.getContentPane().setBackground(background);
        this.getContentPane().setForeground(foreground);
        
        this.bgPanel.setBackground(background);
        this.bgPanel.setForeground(foreground);
        this.bgPanel.setBorder(null);  
        
        this.loginPanel.setBackground(background);
        this.loginPanel.setBorder(padding);
        
        this.newPanel.setBackground(background);
        this.newPanel.setBorder(padding);
        
        this.titleLabel.setBackground(background);
        this.titleLabel.setForeground(foreground);
        this.titleLabel.setBorder(padding);
        this.titleLabel.setFont(h1);
        this.titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        
    // NEW USER ELEMENTS:
        this.newLabel.setBackground(background);
        this.newLabel.setForeground(foreground);
        this.newLabel.setBorder(padding);
        this.newLabel.setFont(h2);
        this.newLabel.setHorizontalAlignment(SwingConstants.CENTER);
     
        this.newUsernameLabel.setBackground(background);
        this.newUsernameLabel.setForeground(foreground);
        this.newUsernameLabel.setBorder(null);
        this.newUsernameLabel.setFont(font);
        this.newUsernameLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        
        this.newUsernameText.setBackground(background);
        this.newUsernameText.setForeground(foreground);
        this.newUsernameText.setBorder(padding);
        this.newUsernameText.setFont(font);
        
        this.newPasswordLabel1.setBackground(background);
        this.newPasswordLabel1.setForeground(foreground);
        this.newPasswordLabel1.setBorder(null);
        this.newPasswordLabel1.setFont(font);
        this.newPasswordLabel1.setHorizontalAlignment(SwingConstants.RIGHT);
        
        this.newPasswordLabel2.setBackground(background);
        this.newPasswordLabel2.setForeground(foreground);
        this.newPasswordLabel2.setBorder(null);
        this.newPasswordLabel2.setFont(font);
        this.newPasswordLabel2.setHorizontalAlignment(SwingConstants.RIGHT);

        this.newPasswordOne.setBackground(background);
        this.newPasswordOne.setForeground(foreground);
        this.newPasswordOne.setBorder(padding);
        this.newPasswordOne.setFont(font);
        
        this.newPasswordTwo.setBackground(background);
        this.newPasswordTwo.setForeground(foreground);
        this.newPasswordTwo.setBorder(padding);
        this.newPasswordTwo.setFont(font);
        
        this.newUserButton.setBackground(background);
        this.newUserButton.setForeground(foreground);
        this.newUserButton.setBorder(padding);
        this.newUserButton.setFont(font);
        
    // LOGON ON ELEMENTS
        this.loginLabel.setBackground(background);
        this.loginLabel.setForeground(foreground);
        this.loginLabel.setBorder(padding);
        this.loginLabel.setFont(h2);
        this.loginLabel.setHorizontalAlignment(SwingConstants.CENTER);
        
        this.usernameLabel.setBackground(background);
        this.usernameLabel.setForeground(foreground);
        this.usernameLabel.setBorder(null);
        this.usernameLabel.setFont(font);
        this.usernameLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        
        this.usernameText.setBackground(background);
        this.usernameText.setForeground(foreground);
        this.usernameText.setBorder(padding);
        this.usernameText.setFont(font);
        
        this.passwordLabel.setBackground(background);
        this.passwordLabel.setForeground(foreground);
        this.passwordLabel.setBorder(null);
        this.passwordLabel.setFont(font);
        this.passwordLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        
        this.passwordText.setBackground(background);
        this.passwordText.setForeground(foreground);
        this.passwordText.setBorder(padding);
        this.passwordText.setFont(font);

        this.loginButton.setBackground(background);
        this.loginButton.setForeground(foreground);
        this.loginButton.setBorder(padding);
        this.loginButton.setFont(font);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgPanel;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JLabel loginLabel1;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPanel loginPanel1;
    private javax.swing.JLabel newLabel;
    private javax.swing.JPanel newPanel;
    private javax.swing.JLabel newPasswordLabel1;
    private javax.swing.JLabel newPasswordLabel2;
    private javax.swing.JPasswordField newPasswordOne;
    private javax.swing.JPasswordField newPasswordTwo;
    private javax.swing.JButton newUserButton;
    private javax.swing.JLabel newUsernameLabel;
    private javax.swing.JTextField newUsernameText;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel passwordLabel1;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JPasswordField passwordText1;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JLabel usernameLabel1;
    private javax.swing.JTextField usernameText;
    private javax.swing.JTextField usernameText1;
    // End of variables declaration//GEN-END:variables
}
