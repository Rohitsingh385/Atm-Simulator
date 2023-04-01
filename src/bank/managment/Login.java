
package bank.managment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {
    
    // the constructor will be called by JVM when JVM will run the main method
    JButton login,clear,signUp;
    JTextField cardTextField;
    JPasswordField PinTextField;
    Login(){
        setTitle("Dxis Bank Atm");
        setLayout(null);
        ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image img2 = img1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon img3 = new ImageIcon(img2);     
        JLabel label = new JLabel(img3);
        label.setBounds(70,10,100,100);
        
        JLabel title = new JLabel("WELCOME TO ATM");
        title.setFont(new Font("Osward",Font.BOLD,38));
        title.setBounds(200,40,400,40);
        add(title);
        
        JLabel cardNumber = new JLabel("Card No");
        cardNumber.setFont(new Font("Railway",Font.BOLD,28));
        cardNumber.setBounds(120,150,150,30);
        add(cardNumber);
        
        cardTextField = new JTextField();
        cardTextField.setBounds(300,150,230,30);
        cardTextField.setFont(new Font("Aerial",Font.BOLD, 14));
        add(cardTextField);
        
        JLabel cardPin = new JLabel("Pin");
        cardPin.setFont(new Font("Railway",Font.BOLD,28));
        cardPin.setBounds(120,220,250,30);
        add(cardPin);
        
        PinTextField = new JPasswordField();
        PinTextField.setBounds(300,220,230,30);
        PinTextField.setFont(new Font("Aerial",Font.BOLD, 14));
        add(PinTextField);
        
        login = new JButton("SIGN IN");
        login.setBounds(300,300,100,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
        clear = new JButton("CLEAR");
        clear.setBounds(430,300,100,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);
        
        signUp = new JButton("SIGN UP");
        signUp.setBounds(300,350,230,30);
        signUp.setBackground(Color.BLACK);
        signUp.setForeground(Color.WHITE);
        signUp.addActionListener(this);
        add(signUp);
        
        getContentPane().setBackground(Color.WHITE);
       
        add(label);
        setSize(800,480);
        setVisible(true);
        setLocation(350,200);   
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == clear){
            cardTextField.setText("");
            PinTextField.setText("");
            
        }else if(ae.getSource() == login){
            Conn conn = new Conn();
            String cardnumber = cardTextField.getText();
            String pinnumber = PinTextField.getText();
            String query = "select * from login where cardnumber = '"+cardnumber+"' and pin = '"+pinnumber+"'";
            try{
                ResultSet rs = conn.s.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null,"Incorrect Card Number or Pin");
                }
            }catch(Exception e){
                System.out.println(e);
            }
        }else if(ae.getSource() == signUp){
            setVisible(false);
            new SignUpOne().setVisible(true);
        }
    }

    public static void main(String args[]) {
        new Login();
    }
}
