package bank.managment;

import java.awt.*;
import javax.swing.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignUpOne extends JFrame implements ActionListener {
    
    long random;
    JTextField nameTextField,fnameTextField, emailTextField,addressTextField,cityTextField,stateTextField,pincodeTextField;
    JButton next;
    JRadioButton male,female,others,married,unmarried;
    JDateChooser dateChooser;
    SignUpOne(){
        
        setLayout(null);
        Random ran =  new Random();
        random = Math.abs((ran.nextLong() % 9000L)+ 1000L);
        
        
        JLabel formno = new JLabel("APPLICATION FORM NO. "+ random);
        formno.setFont(new Font("Railway", Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        getContentPane().setBackground(Color.WHITE);
        add(formno);
        
        JLabel personalDetails = new JLabel("Page 1: Personal Details");
        personalDetails.setFont(new Font("Railway", Font.BOLD,22));
        personalDetails.setBounds(290,80,400,30);
        getContentPane().setBackground(Color.WHITE);
        add(personalDetails);
        
        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Railway", Font.BOLD,18));
        name.setBounds(100,140,100,30);
        getContentPane().setBackground(Color.WHITE);
        add(name);
        
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Railway",Font.BOLD,14));
        nameTextField.setBounds(300, 140, 400, 30);
        add(nameTextField);
        
        JLabel fname = new JLabel("Father's Name:");
        fname.setFont(new Font("Railway", Font.BOLD,18));
        fname.setBounds(100,180,200,30);
        getContentPane().setBackground(Color.WHITE);
        add(fname);
        
        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Railway",Font.BOLD,14));
        fnameTextField.setBounds(300, 180, 400, 30);
        add(fnameTextField);
        
        JLabel dob = new JLabel("Date Of Birth:");
        dob.setFont(new Font("Railway", Font.BOLD,18));
        dob.setBounds(100,220,200,30);
        getContentPane().setBackground(Color.WHITE);
        add(dob);
        
        dateChooser = new JDateChooser();
        dateChooser.setBounds(300,220,400,30);
        dateChooser.setForeground(new Color(105,105,105));
        add(dateChooser);
        
        
        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Railway", Font.BOLD,18));
        gender.setBounds(100,270,200,30);
        getContentPane().setBackground(Color.WHITE);
        add(gender);
        
        male = new JRadioButton("Male");
        male.setBounds(300,270,60,30);
        male.setBackground(Color.WHITE);
        add(male);
        
        female = new JRadioButton("Female");
        female.setBounds(450, 270,120,30);
        female.setBackground(Color.WHITE);
        add(female); 
        
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        
        JLabel email = new JLabel("Email:");
        email.setFont(new Font("Railway", Font.BOLD,18));
        email.setBounds(100,320,200,30);
        getContentPane().setBackground(Color.WHITE);
        add(email);
        
        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Railway",Font.BOLD,14));
        emailTextField.setBounds(300, 320, 400, 30);
        add(emailTextField);
        
        JLabel maritalstatus = new JLabel("Marital status:");
        maritalstatus.setFont(new Font("Railway", Font.BOLD,18));
        maritalstatus.setBounds(100,370,200,30);
        getContentPane().setBackground(Color.WHITE);
        add(maritalstatus);
        
        married = new JRadioButton("Married");
        married.setBounds(300, 370,100,30);
        married.setBackground(Color.WHITE);
        add(married); 
        
        unmarried = new JRadioButton("UnMarried");
        unmarried.setBounds(450,370,100,30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        
        others = new JRadioButton("Others");
        others.setBounds(630,370,100,30);
        others.setBackground(Color.WHITE);
        add(others);
        
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);
        maritalgroup.add(others);
        
        
        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Railway", Font.BOLD,18));
        address.setBounds(100,420,200,30);
        getContentPane().setBackground(Color.WHITE);
        add(address);
        
        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Railway",Font.BOLD,14));
        addressTextField.setBounds(300, 420, 400, 30);
        add(addressTextField);
        
        JLabel city = new JLabel("City:");
        city.setFont(new Font("Railway", Font.BOLD,18));
        city.setBounds(100,470,200,30);
        getContentPane().setBackground(Color.WHITE);
        add(city);
        
        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Railway",Font.BOLD,14));
        cityTextField.setBounds(300, 470, 400, 30);
        add(cityTextField);
        
        JLabel state = new JLabel("State:");
        state.setFont(new Font("Railway", Font.BOLD,18));
        state.setBounds(100,520,200,30);
        getContentPane().setBackground(Color.WHITE);
        add(state);
        
        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Railway",Font.BOLD,14));
        stateTextField.setBounds(300, 520, 400, 30);
        add(stateTextField);
        
        JLabel pincode = new JLabel("pincode:");
        pincode.setFont(new Font("Railway", Font.BOLD,18));
        pincode.setBounds(100,570,200,30);
        add(pincode);
        
        pincodeTextField = new JTextField();
        pincodeTextField.setFont(new Font("Railway",Font.BOLD,14));
        pincodeTextField.setBounds(300, 570, 400, 30);
        add(pincodeTextField);
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Railway",Font.BOLD,19));
        next.setBounds(570,610,90,30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,700);
        setLocation(350,10);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        String formno = "" + random;
        String name = nameTextField.getText();
        String fname = fnameTextField.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected()){
            gender = "Male";
        }else if(female.isSelected()){
            gender = "Female";
        }
        
        String email = emailTextField.getText();
        String marital = null;
        if(married.isSelected()){
            marital = "Married";
        }else if(unmarried.isSelected()){
            marital = "UnMarried";
        }else if(others.isSelected()){
            marital = "Other";
        }
        
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pin = pincodeTextField.getText();
        
        try{
            if(name.equals("")){
                JOptionPane.showMessageDialog(null,"Name is required");
            }else{
                Conn c = new Conn();
                String query = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pin+"','"+state+"')";
                c.s.executeUpdate(query);
                
                setVisible(false);
                new SignupTwo(formno).setVisible(true);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    
    public static void main(String args[]) {
        
        new SignUpOne();
    }
}
