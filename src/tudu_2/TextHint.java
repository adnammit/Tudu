//************************************************************************
//
// TUDU TASK MANAGEMENT SOFTWARE 2.0
//
//    Author: Amanda Ryman
//    amanda.ryman@gmail.com
//    June 4, 2015
//
//************************************************************************
package tudu_2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;



public class TextHint extends JLabel implements FocusListener, DocumentListener
{
    private JTextComponent component;
    private Document document;
    private Show show;
    private boolean showPromptOnce;
    private int focusLost;
    private Font font;
    private Color color;
    
    public enum Show{
        ALWAYS,
        FOCUS_GAINED,
        FOCUS_LOST;
    }

    public TextHint(String text, JTextComponent component, Font font, Color color){
        this(text, component, Show.ALWAYS, font, color);
    }

    public TextHint(String text, JTextComponent component, Show show, Font font, Color color)
    {
        this.component = component;
        this.font = font;
        this.color = color;
        setShow( show );
        document = component.getDocument();

        setText( text );
        setFont(font);
        setForeground(color);
        setBorder( new EmptyBorder(component.getInsets()) );
        setHorizontalAlignment(JLabel.LEADING);
        setVerticalAlignment(JLabel.TOP);

        component.addFocusListener( this );
        document.addDocumentListener( this );

        component.setLayout( new BorderLayout() );
        component.add( this );
        checkForPrompt();
    }
    
    public void refresh(Font font, Color color){
        setFont(font);
        setForeground(color);
    }

    public void changeAlpha(float alpha){
        changeAlpha( (int)(alpha * 255) );
    }

    public void changeAlpha(int alpha){
        super.setForeground(color);
    }

    public void changeStyle(int style){
        //setFont( getFont().deriveFont( style ) );
        setFont(font);
    }

    public Show getShow(){
        return show;
    }

    public void setShow(Show show){
        this.show = show;
    }

    public boolean getShowPromptOnce(){
        return showPromptOnce;
    }

    public void setShowPromptOnce(boolean showPromptOnce){
        this.showPromptOnce = showPromptOnce;
    }

    private void checkForPrompt(){
            //  Text has been entered, remove the prompt

            if (document.getLength() > 0)
            {
                    setVisible( false );
                    return;
            }

            //  Prompt has already been shown once, remove it

            if (showPromptOnce && focusLost > 0)
            {
                    setVisible(false);
                    return;
            }

            //  Check the Show property and component focus to determine if the
            //  prompt should be displayed.

    if (component.hasFocus())
    {
            if (show == Show.ALWAYS
            ||  show ==	Show.FOCUS_GAINED)
                    setVisible( true );
            else
                    setVisible( false );
    }
    else
    {
            if (show == Show.ALWAYS
            ||  show ==	Show.FOCUS_LOST)
                    setVisible( true );
            else
                    setVisible( false );
    }
    }

//  Implement FocusListener

    public void focusGained(FocusEvent e)
    {
            checkForPrompt();
    }

    public void focusLost(FocusEvent e)
    {
            focusLost++;
            checkForPrompt();
    }

//  Implement DocumentListener

    public void insertUpdate(DocumentEvent e)
    {
            checkForPrompt();
    }

    public void removeUpdate(DocumentEvent e)
    {
            checkForPrompt();
    }

    public void changedUpdate(DocumentEvent e) {}
}