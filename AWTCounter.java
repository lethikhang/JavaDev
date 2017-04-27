/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awtcounter;
import java.awt.*;       
import java.awt.event.*; 
/**
 *
 * @author Khang
 */
public class AWTCounter extends Frame implements ActionListener {
   private Label lblCount;   
   private TextField tfCount;  
   private Button btnCount;   
   private int count = 0;     
 
   
   public AWTCounter () {
      setLayout(new FlowLayout());
         
      lblCount = new Label("Counter");  
      add(lblCount);                    
 
      tfCount = new TextField("0", 10); 
      tfCount.setEditable(false);      
      add(tfCount);                    
 
      btnCount = new Button("Count");   
      add(btnCount);                    
 
      btnCount.addActionListener(this);
        
      setTitle("AWT Counter"); 
      setSize(250, 100);      
 
      
 
      setVisible(true);        
 
      
   
}
 
    public static void main(String[] args) {
      
      AWTCounter app = new AWTCounter();
         
   }
 
   // ActionEvent handler - Called back upon button-click.
   @Override
   public void actionPerformed(ActionEvent evt) {
      ++count; // Increase the counter value
      // Display the counter value on the TextField tfCount
      tfCount.setText(count + ""); // Convert int to String
   }
}