
package bank.managment;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class PinChange extends JFrame implements ActionListener {

    JPasswordField pin,repin;
    JButton change,back;
    String pinnumber;
   PinChange(String pinnumber){
       this.pinnumber = pinnumber;
       setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,800,700);
        add(image);
        
        JLabel text = new JLabel("CHANGE YOUR PIN");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Railway",Font.BOLD,16));
        text.setBounds(200,200,700,35);
        image.add(text);
        
        JLabel pintext = new JLabel("NEW PIN:");
        pintext.setForeground(Color.WHITE);
        pintext.setFont(new Font("Railway",Font.BOLD,12));
        pintext.setBounds(120,250,150,30);
        image.add(pintext);
        
        pin = new JPasswordField();
        pin.setFont(new Font("Railway",Font.BOLD,14));
        pin.setBounds(300,250,150,25);
        image.add(pin);
        
        JLabel repintext = new JLabel("RE-ENTER NEW PIN:");
        repintext.setForeground(Color.WHITE);
        repintext.setFont(new Font("Railway",Font.BOLD,12));
        repintext.setBounds(120,285,150,30);
        image.add(repintext);
        
        repin = new JPasswordField();
        repin.setFont(new Font("Railway",Font.BOLD,14));
        repin.setBounds(300,285,150,25);
        image.add(repin);
        
        change = new JButton("CHANGE");
        change.setBounds(300,385,150,30);
        change.addActionListener(this);
        image.add(change);
        
        back = new JButton("BACK");
        back.setBounds(300,420,150,30);
        back.addActionListener(this);
        image.add(back);
        
        setSize(800,700);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
   }
   public void actionPerformed(ActionEvent ae){
       if(ae.getSource()==change){
       try{
           String npin = pin.getText();
           String rpin = repin.getText();
           
           if(!npin.equals(rpin)){
               JOptionPane.showMessageDialog(null,"Enter PIN doesn't match");
               return;
           }
           if(npin.equals("")){
               JOptionPane.showMessageDialog(null,"Please Enter Pin");
               return;
           }
           if(rpin.equals("")){
               JOptionPane.showMessageDialog(null,"please re-enter new PIN");
               return;
           }
           
           Conn conn = new Conn();
           String query1 = "update bank set pin = '"+rpin+"' where pin='"+pinnumber+"'";
           String query2 = "update login set pin = '"+rpin+"' where pin='"+pinnumber+"'";
           String query3 = "update signupthree set pin = '"+rpin+"' where pin='"+pinnumber+"'";
           conn.s.executeUpdate(query1);
           conn.s.executeUpdate(query2);
           conn.s.executeUpdate(query3);
           
           JOptionPane.showMessageDialog(null,"PIN chnaged Successfully");
           
           setVisible(false);
           new Transactions(rpin).setVisible(true);
    }catch(Exception e){
           System.out.println(e);
    }
   }else{
           setVisible(false);
           new Transactions(pinnumber).setVisible(true);
       }
 }
    public static void main(String args[]) {
       
        new PinChange("").setVisible(true);
    }
}