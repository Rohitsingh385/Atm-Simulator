
package bank.managment;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class Signupthree extends JFrame implements ActionListener {
    
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit,cancel;
    String formno;
    Signupthree(String formno){
        this.formno = formno;
    
        setLayout(null);
        
        JLabel l1 = new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Railway", Font.BOLD,22));
        l1.setBounds(280,40,400,40);
        add(l1);
        
        JLabel type = new JLabel("Account Type");
        type.setFont(new Font("Railway", Font.BOLD,22));
        type.setBounds(100,100,300,30);
        add(type);
        
        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Railway", Font.BOLD, 14));
        r1.setBackground(Color.WHITE);
        r1.setBounds(100,150,150,20);
        add(r1);
        
        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Railway", Font.BOLD, 14));
        r2.setBackground(Color.WHITE);
        r2.setBounds(350,150,250,20);
        add(r2);
        
        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Railway", Font.BOLD, 14));
        r3.setBackground(Color.WHITE);
        r3.setBounds(100,190,150,20);
        add(r3);
        
        r4 = new JRadioButton("Recurring Account");
        r4.setFont(new Font("Railway", Font.BOLD, 14));
        r4.setBackground(Color.WHITE);
        r4.setBounds(350,190,250,20);
        add(r4);
        
        ButtonGroup groupAccount = new ButtonGroup();
        groupAccount.add(r1);
        groupAccount.add(r2);
        groupAccount.add(r3);
        groupAccount.add(r4);
        
        JLabel card = new JLabel("Card Number");
        card.setFont(new Font("Railway", Font.BOLD,22));
        card.setBounds(100,250,200,30);
        add(card);
        
        JLabel number = new JLabel("xxxx-xxxx-xxxx-3855");
        number.setFont(new Font("Railway", Font.BOLD,22));
        number.setBounds(330,250,300,30);
        add(number);
        
        JLabel carddetail = new JLabel("Your Sixteen digit card Number");
        carddetail.setFont(new Font("Railway", Font.BOLD,10));
        carddetail.setBounds(100,275,300,20);
        add(carddetail);
        
        JLabel pin = new JLabel("PIN");
        pin.setFont(new Font("Railway", Font.BOLD,22));
        pin.setBounds(100,320,200,30);
        add(pin);
        
        JLabel pindetail = new JLabel("Your Four digit Pin Number");
        pindetail.setFont(new Font("Railway", Font.BOLD,10));
        pindetail.setBounds(100,345,300,20);
        add(pindetail);
        
        JLabel pnumber = new JLabel("xxxx");
        pnumber.setFont(new Font("Railway", Font.BOLD,22));
        pnumber.setBounds(330,320,300,30);
        add(pnumber);
        
        JLabel services = new JLabel("Services Required");
        services.setFont(new Font("Railway", Font.BOLD,22));
        services.setBounds(100,380,200,30);
        add(services);
        
        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Railway",Font.BOLD,14));
        c1.setBounds(100,430,200,30);
        add(c1);
        
        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Railway",Font.BOLD,14));
        c2.setBounds(350,430,200,30);
        add(c2);
        
        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Railway",Font.BOLD,14));
        c3.setBounds(100,470,200,30);
        add(c3);
        
        c4 = new JCheckBox("Email Alerts");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Railway",Font.BOLD,14));
        c4.setBounds(350,470,200,30);
        add(c4);
        
        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Railway",Font.BOLD,14));
        c5.setBounds(100,510,200,30);
        add(c5);
        
        c6 = new JCheckBox("E-Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Railway",Font.BOLD,14));
        c6.setBounds(350,510,200,30);
        add(c6);
        
        c7 = new JCheckBox("I Hereby declares that the above statements are correct to the best of my knowledge");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Railway",Font.BOLD,12));
        c7.setBounds(100,560,560,30);
        add(c7);
        
        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Railway",Font.BOLD,14));
        submit.setBounds(210,600,100,25);
        submit.addActionListener(this);
        add(submit);
        
        cancel = new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Railway",Font.BOLD,14));
        cancel.setBounds(400,600,100,25);
        cancel.addActionListener(this);
        add(cancel);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,700);
        setLocation(350,0);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == submit){
            String accountType = null;
            if(r1.isSelected()){
                accountType = "Saving Account";
            }else if(r2.isSelected()){
                accountType = "Fixed Deposit Account";
            }else if(r3.isSelected()){
                accountType = "Current Account";
            }else if(r4.isSelected()){
                accountType = "Reccuring Deposit Account";
            }
            
            Random random = new Random();
            String  cardnumber = "" + Math.abs((random.nextLong() % 90000000L) + 5040936000000000L);
            String pinnumber = "" + Math.abs((random.nextLong()% 9000L) + 1000L);
            
            String facility = "";
            if(c1.isSelected()){
                facility = facility + " ATM card";
            }else if(c2.isSelected()){
                facility = facility + " Internet Banking";
            }else if(c3.isSelected()){
                facility = facility + " Mobile Banking";
            }else if(c4.isSelected()){
                facility = facility + " Email Alerts";
            }else if(c5.isSelected()){
                facility = facility + " Cheque Book";
            }else if(c6.isSelected()){
                facility = facility + " E-Statement";
            }
            
            try {
                if(accountType.equals("")){
                    JOptionPane.showMessageDialog(null,"account Type is required");
                } else {
                    Conn conn = new Conn();
                    String query1 = "insert into signupthree values('"+formno+"','"+accountType+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
                    String query2 = "insert into login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";
                    conn.s.executeUpdate(query1);
                    conn.s.executeUpdate(query2);
                    
                    JOptionPane.showMessageDialog(null,"Card Number "+ cardnumber +"\n Pin: " + pinnumber);
                    
                    setVisible(true);
                    new Deposit(pinnumber).setVisible(false);
                }
            }catch(Exception e){
                System.out.println(e);
            }
            
        }else if(ae.getSource() == cancel){
        setVisible(false);
        new Login().setVisible(true);
    }
    }
    public static void main(String[] args){
    
        new Signupthree("");
    
    }
}
