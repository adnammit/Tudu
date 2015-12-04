// TO DO: (ironically)
//      - show "hints" on program open and when a new item is created
//      - recode to support newlines in tasks
//      - add "enter" to window listeners
//      - make username case insensitive
//      - save on window close
//      - userfile saves color preference

package tudu_2;

import java.util.Date;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import javax.swing.ListCellRenderer;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class MainFrame extends JFrame {
    private JMenu menu;
    private JMenu colors;
    private JMenuBar menuBar;
    private JList<Task> jTaskList;
    private DefaultListModel<Task> allTasksList;
    private DefaultListModel<Task> todoList;
    private DefaultListModel<Task> inProgressList;
    private DefaultListModel<Task> completedList;
    private Color background;
    private Color foreground;
    private Font font;
    private Font button;
    private Font hush;
    private Font h1;
    private Font h2;
    private Border border;
    private Border padding;
    private TextHint titleHint;
    private TextHint detailsHint;
        

      
    
    public MainFrame() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgPanel = new javax.swing.JPanel();
        taskPane = new javax.swing.JScrollPane();
        titlePane = new javax.swing.JScrollPane();
        titleText = new javax.swing.JTextArea();
        detailPane = new javax.swing.JLayeredPane();
        updatedLabel = new javax.swing.JLabel();
        createdLabel = new javax.swing.JLabel();
        detailsScroll = new javax.swing.JScrollPane();
        descriptionText = new javax.swing.JTextArea();
        deleteButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        typePanel = new javax.swing.JPanel();
        typesCombo = new javax.swing.JComboBox();
        viewPanel = new javax.swing.JPanel();
        viewLabel = new javax.swing.JLabel();
        viewCombo = new javax.swing.JComboBox();
        addPanel = new javax.swing.JPanel();
        titleInput = new javax.swing.JTextField();
        detailInputScroll = new javax.swing.JScrollPane();
        detailsInput = new javax.swing.JTextArea();
        addButton = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.white);
        setUndecorated(true);

        bgPanel.setForeground(new java.awt.Color(255, 255, 255));

        taskPane.setForeground(new java.awt.Color(102, 102, 102));
        taskPane.setToolTipText("Select a task for details");
        taskPane.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        taskPane.setHorizontalScrollBar(null);
        taskPane.setPreferredSize(new java.awt.Dimension(278, 238));
        taskPane.setSize(new java.awt.Dimension(278, 238));

        titleText.setColumns(20);
        titleText.setRows(1);
        titlePane.setViewportView(titleText);

        descriptionText.setColumns(20);
        descriptionText.setLineWrap(true);
        descriptionText.setRows(5);
        descriptionText.setWrapStyleWord(true);
        detailsScroll.setViewportView(descriptionText);

        deleteButton.setText("DELETE");

        saveButton.setText("SAVE");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        typesCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        typesCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typesComboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout typePanelLayout = new javax.swing.GroupLayout(typePanel);
        typePanel.setLayout(typePanelLayout);
        typePanelLayout.setHorizontalGroup(
            typePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, typePanelLayout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(typesCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        typePanelLayout.setVerticalGroup(
            typePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(typePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(typesCombo)
                .addContainerGap())
        );

        javax.swing.GroupLayout detailPaneLayout = new javax.swing.GroupLayout(detailPane);
        detailPane.setLayout(detailPaneLayout);
        detailPaneLayout.setHorizontalGroup(
            detailPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(detailPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(detailsScroll)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, detailPaneLayout.createSequentialGroup()
                        .addComponent(createdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, detailPaneLayout.createSequentialGroup()
                        .addGroup(detailPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(updatedLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(typePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        detailPaneLayout.setVerticalGroup(
            detailPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(detailsScroll)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(detailPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(saveButton)
                    .addComponent(typePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(detailPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(detailPaneLayout.createSequentialGroup()
                        .addComponent(updatedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(createdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(deleteButton))
                .addGap(17, 17, 17))
        );
        detailPane.setLayer(updatedLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        detailPane.setLayer(createdLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        detailPane.setLayer(detailsScroll, javax.swing.JLayeredPane.DEFAULT_LAYER);
        detailPane.setLayer(deleteButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        detailPane.setLayer(saveButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        detailPane.setLayer(typePanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        viewPanel.setPreferredSize(new java.awt.Dimension(238, 39));

        viewLabel.setText("VIEW:");

        viewCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout viewPanelLayout = new javax.swing.GroupLayout(viewPanel);
        viewPanel.setLayout(viewPanelLayout);
        viewPanelLayout.setHorizontalGroup(
            viewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(viewLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        viewPanelLayout.setVerticalGroup(
            viewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(viewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewLabel))
                .addContainerGap())
        );

        titleInput.setBackground(new java.awt.Color(51, 51, 55));
        titleInput.setForeground(new java.awt.Color(102, 102, 102));
        titleInput.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        detailsInput.setColumns(20);
        detailsInput.setLineWrap(true);
        detailsInput.setRows(1);
        detailsInput.setWrapStyleWord(true);
        detailInputScroll.setViewportView(detailsInput);

        addButton.setText("ADD");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addPanelLayout = new javax.swing.GroupLayout(addPanel);
        addPanel.setLayout(addPanelLayout);
        addPanelLayout.setHorizontalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(detailInputScroll)
                    .addComponent(titleInput)
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(addButton)))
                .addContainerGap())
        );
        addPanelLayout.setVerticalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleInput, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(detailInputScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addButton)
                .addContainerGap())
        );

        titleLabel.setText("TUDU");

        javax.swing.GroupLayout bgPanelLayout = new javax.swing.GroupLayout(bgPanel);
        bgPanel.setLayout(bgPanelLayout);
        bgPanelLayout.setHorizontalGroup(
            bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgPanelLayout.createSequentialGroup()
                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgPanelLayout.createSequentialGroup()
                        .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(viewPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                            .addComponent(taskPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgPanelLayout.createSequentialGroup()
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(detailPane)
                    .addComponent(titlePane)
                    .addComponent(addPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bgPanelLayout.setVerticalGroup(
            bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(bgPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(viewPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(bgPanelLayout.createSequentialGroup()
                        .addComponent(titlePane, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(detailPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(taskPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bgPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed


    }//GEN-LAST:event_addButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
          
    }//GEN-LAST:event_saveButtonActionPerformed

    private void typesComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typesComboActionPerformed

    }//GEN-LAST:event_typesComboActionPerformed

    public void buildGUI(DefaultListModel<Task> allTaskList, DefaultListModel<Task> todoList, DefaultListModel<Task> inProgressList, 
            DefaultListModel<Task> completedList){
    
    // Initialize Menu and set visual style:
        buildMenu();
        setStyleVariables(0);

    // Configure the main JFrame:
        Point center = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
        int width = 680; //[679, 529]
        int height = 570;
        this.setBounds(center.x - width / 2, center.y - height / 2, width, height);
        this.setResizable(true);
        
    // Set up text Hints:
        titleHint = new TextHint("What do you need to do today?", titleInput, hush, foreground);
        detailsHint = new TextHint("Add some more notes!", detailsInput, hush, foreground);

    // Set up lists:
        this.allTasksList = allTaskList;
        this.todoList = todoList;
        this.inProgressList = inProgressList;
        this.completedList = completedList;
        
    // Set initial view to show all tasks:
        this.jTaskList = new JList(allTasksList);
        configureJList();
        this.taskPane.setViewportView(jTaskList);
        
        setListeners();
        setComboBoxes();
        refreshStyle();
    }
    
    public void configureJList(){
        jTaskList.setCellRenderer(new TaskCellRenderer());
        jTaskList.setVisibleRowCount(10);
        jTaskList.addListSelectionListener(new SelectionHandler());
    }
    
    public void setListeners(){
        this.addButton.addActionListener(new AddButtonListener());
        this.deleteButton.addActionListener(new DeleteButtonListener());
        this.saveButton.addActionListener(new SaveButtonListener());
    }
    
    public void setComboBoxes(){
        String[] types = {"TO DO", "IN PROGRESS", "COMPLETED"};
        typesCombo.setModel(new DefaultComboBoxModel(types));

        String[] views = {"TO DO", "IN PROGRESS", "COMPLETED", "ALL"};
        viewCombo.setModel(new DefaultComboBoxModel(views));
        viewCombo.setSelectedIndex(3); // set default view to "all"
        viewCombo.addActionListener(new ViewListener());
    }
    
    public void setStyleVariables(int color){
        // switch statement changes values of colors and font, then reset style:
        switch(color){
            case 1: // MeanStreak
                background = Color.black;
                foreground = Color.white;
                break;
            case 2: // Solarized
                background = new Color(0xC9F);
                foreground = new Color(0x99CCFF);
                break;
            case 3: // Starburst
                background = new Color(0xFF6666);
                foreground = new Color(0xFFFF99);
                break;
            case 4: // Crystal Lite
                background = new Color(0xFFFFCC);
                foreground = new Color(0x990066);
                break;
            case 5: // AngelDust
                background = new Color(0xFFFFCC);
                foreground = new Color(0x3399FF);
                break;
            default: // Default. includes '0'
                background = Color.white;
                foreground = Color.gray;
                break;
        }
      
        font = new Font("Arial", Font.PLAIN, 12);
        button = new Font("Arial", Font.BOLD, 14);
        hush = new Font("Georgia", Font.ITALIC, 10);
        h1 = new Font("Georgia", Font.BOLD, 24);
        h2 = new Font("Georgia", Font.BOLD, 14);
        border = BorderFactory.createLineBorder(foreground, 1, true); // (color, width, rounded?)
        padding = BorderFactory.createCompoundBorder(border, new EmptyBorder(10,10,10,10)); 
    }
    
    public void refreshStyle(){  
    // MAINFRAME:
        this.getContentPane().setBackground(background);
        this.getContentPane().setForeground(foreground);
        this.bgPanel.setBackground(background);
        this.bgPanel.setForeground(foreground);
        this.bgPanel.setBorder(null);  
        
    // NEW INPUT:
        this.addPanel.setBackground(background);
        this.addPanel.setForeground(foreground);
        this.addPanel.setBorder(border);
        this.addPanel.setFont(font);
        this.titleLabel.setBackground(background);
        this.titleLabel.setForeground(foreground);
        this.titleLabel.setFont(h1);
        this.titleLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        this.titleInput.setBackground(background);
        this.titleInput.setForeground(foreground);
        this.titleInput.setBorder(padding);
        this.titleInput.setFont(font);
        this.detailsInput.setBackground(background);
        this.detailsInput.setForeground(foreground);
        this.detailsInput.setBorder(null);
        this.detailsInput.setFont(font);
        this.detailInputScroll.setBorder(padding); 
        this.detailInputScroll.setBackground(background);
        this.detailInputScroll.setForeground(foreground);
        this.titleHint.refresh(hush, foreground);
        this.detailsHint.refresh(hush, foreground);
        
    // VIEW PANEL
        this.viewLabel.setBackground(background);
        this.viewLabel.setForeground(foreground);
        this.viewLabel.setBorder(null);
        this.viewLabel.setFont(font);
        this.viewPanel.setBackground(background);
        this.viewPanel.setForeground(foreground);
        this.viewPanel.setBorder(border);
        this.viewPanel.setFont(font);
        this.viewCombo.setBackground(background);
        this.viewCombo.setForeground(foreground);
        this.viewCombo.setBorder(null);
        this.viewCombo.setFont(font);
      
    // TASK LIST: 
        this.taskPane.setBackground(background);
        this.taskPane.setForeground(foreground);
        this.taskPane.setBorder(padding);
        refreshJList();
        
    // TASK DETAILS: 
        this.titleText.setBackground(background);
        this.titleText.setForeground(foreground);
        this.titleText.setBorder(null);
        this.titleText.setFont(font);
        this.descriptionText.setBackground(background);
        this.descriptionText.setForeground(foreground);
        this.descriptionText.setBorder(null);
        this.descriptionText.setFont(font);
        this.detailsScroll.setBackground(background);
        this.detailsScroll.setForeground(foreground);
        this.detailsScroll.setBorder(padding);
        this.detailsScroll.setFont(font);
        this.titlePane.setBackground(background); 
        this.titlePane.setForeground(foreground);
        this.titlePane.setBorder(padding);
        this.titlePane.setFont(font);
        this.detailPane.setBackground(background);
        this.detailPane.setForeground(foreground);
        this.detailPane.setBorder(padding);
        this.detailPane.setFont(font);
        
        this.typePanel.setBackground(background);
        this.typePanel.setForeground(foreground);
        this.typePanel.setBorder(border);
        this.typesCombo.setBackground(background);
        this.typesCombo.setForeground(foreground);
        this.typesCombo.setBorder(null);
        this.typesCombo.setFont(font);
        
        this.createdLabel.setBackground(background);
        this.createdLabel.setForeground(foreground);
        this.createdLabel.setBorder(padding);
        this.createdLabel.setFont(font);
        this.createdLabel.setHorizontalAlignment(SwingConstants.CENTER);
        
        this.updatedLabel.setBackground(background);
        this.updatedLabel.setForeground(foreground);
        this.updatedLabel.setBorder(padding);
        this.updatedLabel.setFont(font);
        this.updatedLabel.setHorizontalAlignment(SwingConstants.CENTER);

    // BUTTONS:
        this.addButton.setBackground(background);
        this.addButton.setForeground(foreground);
        this.addButton.setBorder(padding);
        this.addButton.setFont(button);
              
        this.deleteButton.setBackground(background);
        this.deleteButton.setForeground(foreground);
        this.deleteButton.setBorder(padding);
        this.deleteButton.setFont(button);
        
        this.saveButton.setBackground(background);
        this.saveButton.setForeground(foreground);
        this.saveButton.setBorder(padding);
        this.saveButton.setFont(button);
    }
    
    public void refreshJList(){
        this.jTaskList.setForeground(foreground);
        this.jTaskList.setBackground(background);
        this.jTaskList.setFont(font);
        taskPane.setViewportView(jTaskList);
        jTaskList.repaint();
        taskPane.repaint();
    }
    
    public void buildMenu(){
        menuBar = new JMenuBar();
        
        menu = new JMenu( "File" );
        
        ExitAction ea = new ExitAction();
        ea.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke("control Q")); 
        JMenuItem exit = new JMenuItem(ea);
        exit.setToolTipText("Giving up so soon?");
        
       
        colors = new JMenu("ColorSchemes");
        colors.setToolTipText("The colors, Duke! THE COLORS!");
        
        JMenuItem color0 = new JMenuItem("Default");
        JMenuItem color1 = new JMenuItem("MeanStreak");
        JMenuItem color2 = new JMenuItem("Solarized");
        JMenuItem color3 = new JMenuItem("Starburst");
        JMenuItem color4 = new JMenuItem("Crystal Lite");
        JMenuItem color5 = new JMenuItem("AngelDust");
        
        color0.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                setStyleVariables(0);
                refreshStyle();
            }
        });
        
        color1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                setStyleVariables(1);
                refreshStyle();
            }
        });
        
        color2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                setStyleVariables(2);
                refreshStyle();
            }
        });
        
        color3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                setStyleVariables(3);
                refreshStyle();
            }
        });
        
        color1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                setStyleVariables(1);
                refreshStyle();
            }
        });
        
        color4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                setStyleVariables(4);
                refreshStyle();
            }
        });
        
        color5.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                setStyleVariables(5);
                refreshStyle();
            }
        });
        
        colors.add(color0);
        colors.add(color1);
        colors.add(color2);
        colors.add(color3);
        colors.add(color4);
        colors.add(color5);

        menuBar.add(menu);
        menuBar.add(colors);
        menuBar.add(exit);
        this.setJMenuBar(menuBar);
    }
     
    public class SelectionHandler implements ListSelectionListener {
        @Override
        public void valueChanged(ListSelectionEvent e) {           
        // If we just deleted the selected item and the selected item is now null:
            if (!e.getValueIsAdjusting()){
                if (jTaskList.getSelectedValue() == null){
                    jTaskList.clearSelection();
                // If the list is empty, set display fields to blank. 
                    if (allTasksList.isEmpty() == true){
                        titleText.setText("");
                        descriptionText.setText("");
                        createdLabel.setText("");
                        updatedLabel.setText(""); 
                    }
                // Otherwise, display the first item:    
                    else {
                        jTaskList.setSelectedIndex(0);
                    }
                }
        // Otherwise, display the selected item:
                else{
                    titleText.setText(jTaskList.getSelectedValue().getTitle());
                    descriptionText.setText(jTaskList.getSelectedValue().getDescription());
                    createdLabel.setText(jTaskList.getSelectedValue().showCreated());
                    updatedLabel.setText(jTaskList.getSelectedValue().showUpdated());
                    typesCombo.setSelectedIndex(jTaskList.getSelectedValue().getType());
                }
            }
        } 
    }
 
    public class ViewListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e){
            int selected = viewCombo.getSelectedIndex();
            switch(selected){
                case 0:
                    // TO DO
                    jTaskList = new JList(todoList);
                    break;
                case 1:
                    // IN PROGRESS
                    jTaskList = new JList(inProgressList);
                    break;
                case 2: 
                    // COMPLETED
                    jTaskList = new JList(completedList);
                    break;
                default: // Includes 'case 3'
                    // ALL
                    jTaskList = new JList(allTasksList);
                    break;
            }
            configureJList();
            refreshJList();
        }
    }    
    
    public class AddButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e){
            String title = titleInput.getText();
            String description = detailsInput.getText();
            Task task = new Task(title, description);
            allTasksList.addElement(task);
            todoList.addElement(task);
            titleInput.setText("");
            detailsInput.setText("");
            jTaskList.requestFocus();
            jTaskList.repaint();
        }
    }

    public class SaveButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e){
            int selected = jTaskList.getSelectedIndex();
            if (selected != -1){
            // Get old task info so it can be removed:
                Task oldTask = jTaskList.getSelectedValue();
            // Create a new Task object:
                String title = titleText.getText();
                String description = descriptionText.getText();
                Date date = jTaskList.getSelectedValue().getCreatedDate();
                int type = typesCombo.getSelectedIndex();
                Task newTask = new Task(title, description, date, type);
            // Remove the old task and insert the updated one in all lists:
                allTasksList.removeElementAt(selected);
                allTasksList.insertElementAt(newTask, selected);
                if (todoList.contains(oldTask)){
                    int i = todoList.indexOf(oldTask);
                    todoList.removeElementAt(i);
                    if (type == oldTask.getType())
                        todoList.insertElementAt(newTask, i);
                    else{
                        if (type == 0) // Should not fire
                            todoList.addElement(newTask);
                        else if(type == 1)
                            inProgressList.addElement(newTask);
                        else if(type == 2)
                            completedList.addElement(newTask);
                        else
                            System.out.println("TASK TYPE " + type + " IS UNKNOWN");
                    }
                }
                else if (inProgressList.contains(oldTask)){
                    int i = inProgressList.indexOf(oldTask);
                    inProgressList.removeElementAt(i);
                    if (type == oldTask.getType())
                        inProgressList.insertElementAt(newTask, i);
                    else{
                        if (type == 0)
                            todoList.addElement(newTask);
                        else if(type == 1) // Should not fire
                            inProgressList.addElement(newTask);
                        else if(type == 2)
                            completedList.addElement(newTask);
                        else
                            System.out.println("TASK TYPE " + type + " IS UNKNOWN");
                    }
                }
                else if (completedList.contains(oldTask)){
                    int i = completedList.indexOf(oldTask);
                    completedList.removeElementAt(i);
                    if (type == oldTask.getType())
                        completedList.insertElementAt(newTask, i);
                    else{
                        if (type == 0)
                            todoList.addElement(newTask);
                        else if(type == 1)
                            inProgressList.addElement(newTask);
                        else if(type == 2) // Should not fire
                            completedList.addElement(newTask);
                        else
                            System.out.println("TASK TYPE " + type + " IS UNKNOWN");
                    }
                }
                jTaskList.repaint();
            }
        }
    }
    
    public class DeleteButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e){
            int selected = jTaskList.getSelectedIndex();
            if (selected != -1){
                Task task = jTaskList.getSelectedValue();
            // Remove the selected task from all lists:
                allTasksList.remove(selected);
                if (todoList.contains(task)){
                    todoList.removeElement(task);
                }
                if (inProgressList.contains(task)){
                    inProgressList.removeElement(task);
                }
                if (completedList.contains(task)){
                    completedList.removeElement(task);
                }
                jTaskList.repaint();
            // Reset the details fields to empty:
                titleText.setText("");
                descriptionText.setText("");
                createdLabel.setText("");
                updatedLabel.setText(""); 
            }
        }
    }
    
    class TaskCellRenderer extends JLabel implements ListCellRenderer{
        @Override
        public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus){
            setText(value.toString());
            if(value instanceof Task){
                Task task = (Task)value;
                setText(task.getTitle());
                setToolTipText("Select a task to modify");
                setFont(font);
                setForeground(foreground);
            }
            return this;
        }  
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JPanel addPanel;
    private javax.swing.JPanel bgPanel;
    private javax.swing.JLabel createdLabel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextArea descriptionText;
    private javax.swing.JScrollPane detailInputScroll;
    private javax.swing.JLayeredPane detailPane;
    private javax.swing.JTextArea detailsInput;
    private javax.swing.JScrollPane detailsScroll;
    private javax.swing.JButton saveButton;
    private javax.swing.JScrollPane taskPane;
    private javax.swing.JTextField titleInput;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JScrollPane titlePane;
    private javax.swing.JTextArea titleText;
    private javax.swing.JPanel typePanel;
    private javax.swing.JComboBox typesCombo;
    private javax.swing.JLabel updatedLabel;
    private javax.swing.JComboBox viewCombo;
    private javax.swing.JLabel viewLabel;
    private javax.swing.JPanel viewPanel;
    // End of variables declaration//GEN-END:variables
}

//***************************************************************************************
//	END CODE
//***************************************************************************************
