import javax.swing.*;
import java.awt.*;


public class UI extends JFrame {
	
	  	JPanel mainPanel, infoPanel, txtFldNames, txtFlds,bttn;
	    JTextField name, checkOutDate, checkInDate, email;
	    JButton add, delete; 
	    JLabel label1, label2, label3, label4;
	    JScrollPane scrollBar;
	
public UI() {
    
     txtFldNames = new JPanel(new GridLayout(1,4,5,5));
     label1 = new JLabel("Name", SwingConstants.CENTER);
     label2 = new JLabel("Check Out Date", SwingConstants.CENTER);
     label3  = new JLabel("Check In Date", SwingConstants.CENTER);
     label4  = new JLabel("Email", SwingConstants.CENTER);
     txtFldNames.add(label1);
     txtFldNames.add(label2);
     txtFldNames.add(label3);
     txtFldNames.add(label4);
     
      
     add = new JButton("Add");
     add.addActionListener(e ->{
    	 JPanel rowPanel = new JPanel(new GridLayout(1,4,5,5));
    	 for(int i = 0; i < 4; i++ ){
    		 
    		 rowPanel.add(new JTextField(8));
    	 }
    	 infoPanel.add(rowPanel);
    	 infoPanel.revalidate();
    	 infoPanel.repaint();
    	 
     });
     delete = new JButton("Delete");
     
     bttn = new JPanel(new FlowLayout(FlowLayout.CENTER));
     bttn.add(add);
     bttn.add(delete);
     
     name = new JTextField();
     checkOutDate = new JTextField();
     checkInDate = new JTextField();
     email = new JTextField();
      
     name.setColumns(20);
     checkOutDate.setColumns(20);
     checkInDate.setColumns(20);
     email.setColumns(20);
     
     txtFlds = new JPanel(new GridLayout(1,4,5,5));
     txtFlds.add(name);
     txtFlds.add(checkOutDate);
     txtFlds.add(checkInDate);
     txtFlds.add(email);
     
     infoPanel = new JPanel(new GridLayout(0,1,2,2));
     infoPanel.add(txtFldNames);
     infoPanel.add(txtFlds);
   
     
     mainPanel = new JPanel(new BorderLayout(5,5));
     mainPanel.add(infoPanel,BorderLayout.PAGE_START);
     scrollBar = new JScrollPane(mainPanel);
     scrollBar.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
           
     
  
     this.add(scrollBar, BorderLayout.CENTER);
     this.add(bttn, BorderLayout.PAGE_END);     
     this.pack();
     setTitle("Form 48 Tracker");
     setDefaultCloseOperation(EXIT_ON_CLOSE);
     setPreferredSize(new Dimension(650,400));
     setLocationRelativeTo(null);
     setVisible(true);
	
	}

public static void main(String[] args) {
    
    new UI();
   
         
}



}     
      
      
     
     


