/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multtextweb;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.JScrollPane;

import javax.swing.border.EmptyBorder;



/**
 *
 * @author lu
 */
public class fileChooser_component extends JComponent implements PropertyChangeListener {
  private   JList list;
  private   File file =null;
private    JButton    removeItem;
private     DefaultListModel    model;
 
   public  fileChooser_component(JFileChooser chooser ) {
    
chooser.addPropertyChangeListener(this);

//per modifare la jlist 
        model = new DefaultListModel();
        list = new JList(model);
        JScrollPane pane = new JScrollPane(list);
        pane.setPreferredSize(new Dimension(200, 250));
        


         removeItem =   createRemoveItemButton();
removeItem.setPreferredSize(new Dimension(70, 50));
        setBorder(new EmptyBorder(10, 10, 10, 10));
        setLayout(new BorderLayout());
        add(pane);
        add(removeItem, BorderLayout.SOUTH);

  
  
        }
   
    protected DefaultListModel getModel() {
        return model;
    }
   
    private JButton createRemoveItemButton() {
        JButton button = new JButton("Delet");
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if (list.getSelectedIndex() != -1) {
            model.remove(list.getSelectedIndex());
            

                    
                }
            }
        });
        return button;
    }
    
    private void addFileToList() {
        model.addElement(file);
    }
    
    
    @Override
    public void propertyChange(PropertyChangeEvent e) {
        boolean update = false;
        String prop = e.getPropertyName();

        //If the directory changed, don't do anything
        if (JFileChooser.DIRECTORY_CHANGED_PROPERTY.equals(prop)) {
            file = null;
            update = true;
            //If a file became selected, find out which one.
        } else if (JFileChooser.SELECTED_FILE_CHANGED_PROPERTY.equals(prop)) {
            file = (File) e.getNewValue();
            update = true;
        }

        if (update && file != null) {
            addFileToList();
        }
    }
}
