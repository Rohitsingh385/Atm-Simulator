package bank.managment;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener {
    

    JTextField pan,adhaar;
    JButton next;
    JRadioButton syes,Sno,eyes,Eno;
    JComboBox religion,category,occupation,education,income;
    String formno;
    SignupTwo(String formno){ 
        
        this.formno = formno;
        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
      
        JLabel additionalDetails = new JLabel("Page 2: ADDITIONAL Details");
        additionalDetails.setFont(new Font("Railway", Font.BOLD,22));
        additionalDetails.setBounds(290,80,400,30);
        getContentPane().setBackground(Color.WHITE);
        add(additionalDetails);
        
        JLabel name = new JLabel("Religion:");
        name.setFont(new Font("Railway", Font.BOLD,18));
        name.setBounds(100,140,100,30);
        getContentPane().setBackground(Color.WHITE);
        add(name);
        
        String varReligion[] = {"Hindu","Muslim","Sikh","Christian","Others"};
        religion = new JComboBox(varReligion); 
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.WHITE);
        add(religion);
        
        
        JLabel fname = new JLabel("categories:");
        fname.setFont(new Font("Railway", Font.BOLD,18));
        fname.setBounds(100,180,200,30);
        getContentPane().setBackground(Color.WHITE);
        add(fname);
        
        String valCategory[] = {"General","OBC","SC","ST","Other"};
        category = new JComboBox(valCategory);
        category.setBounds(300, 180, 400, 30);
        category.setBackground(Color.WHITE);
        add(category);
        
        JLabel dob = new JLabel("Income:");
        dob.setFont(new Font("Railway", Font.BOLD,18));
        dob.setBounds(100,220,200,30);
        getContentPane().setBackground(Color.WHITE);
        add(dob);
        
        String incomeCategory[] = {"Null","< 1,50,000","< 2,50,000","< 5,00,000","upto 10,00,000"};
        income = new JComboBox(incomeCategory);
        income.setBounds(300, 220, 400, 30);
        income.setBackground(Color.WHITE);
        add(income);
        
        
        JLabel gender = new JLabel("Educational");
        gender.setFont(new Font("Railway", Font.BOLD,18));
        gender.setBounds(100,270,200,30);
        getContentPane().setBackground(Color.WHITE);
        add(gender);
        JLabel email = new JLabel("Qualification:");
        email.setFont(new Font("Railway", Font.BOLD,18));
        email.setBounds(100,290,200,30);
        getContentPane().setBackground(Color.WHITE);
        add(email);
        
        String educationValue[] = {"10th pass","Gradauate","Post Gradautate","Doctrate","Others"};
        education = new JComboBox(educationValue);
        education.setBounds(300, 295, 400, 30);
        education.setBackground(Color.WHITE);
        add(education);
        
        JLabel maritalstatus = new JLabel("Occupation:");
        maritalstatus.setFont(new Font("Railway", Font.BOLD,18));
        maritalstatus.setBounds(100,370,200,30);
        getContentPane().setBackground(Color.WHITE);
        add(maritalstatus);
        
        String occupationValue[] = {"Salaried","Self=Employed","Business","Students","Retired"};
        occupation = new JComboBox(occupationValue);
        occupation.setBounds(300, 370, 400, 30);
        occupation.setBackground(Color.WHITE);
        add(occupation);
        
        
        JLabel address = new JLabel("PAN Number:");
        address.setFont(new Font("Railway", Font.BOLD,18));
        address.setBounds(100,420,200,30);
        getContentPane().setBackground(Color.WHITE);
        add(address);
        
        pan = new JTextField();
        pan.setFont(new Font("Railway",Font.BOLD,14));
        pan.setBounds(300, 420, 400, 30);
        add(pan);
        
        JLabel adhaarNumber = new JLabel("Adhaar Number:");
        adhaarNumber.setFont(new Font("Railway", Font.BOLD,18));
        adhaarNumber.setBounds(100,470,200,30);
        getContentPane().setBackground(Color.WHITE);
        add(adhaarNumber);
        
        adhaar = new JTextField();
        adhaar.setFont(new Font("Railway",Font.BOLD,14));
        adhaar.setBounds(300, 470, 400, 30);
        add(adhaar);
        
        JLabel state = new JLabel("Senior Citizen:");
        state.setFont(new Font("Railway", Font.BOLD,18));
        state.setBounds(100,520,200,30);
        getContentPane().setBackground(Color.WHITE);
        add(state);
        
        syes = new JRadioButton("Yes");
        syes.setBounds(300, 520,100,30);
        syes.setBackground(Color.WHITE);
        add(syes); 
        
        Sno = new JRadioButton("No");
        Sno.setBounds(450,520,100,30);
        Sno.setBackground(Color.WHITE);
        add(Sno);

        ButtonGroup seniorCitizen = new ButtonGroup();
        seniorCitizen.add(syes);
        seniorCitizen.add(Sno);
               
        JLabel pincode = new JLabel("Exisiting Account:");
        pincode.setFont(new Font("Railway", Font.BOLD,18));
        pincode.setBounds(100,570,200,30);
        add(pincode);
        
        eyes = new JRadioButton("Yes");
        eyes.setBounds(300, 570,100,30);
        eyes.setBackground(Color.WHITE);
        add(eyes); 
        
        Eno = new JRadioButton("No");
        Eno.setBounds(450,570,100,30);
        Eno.setBackground(Color.WHITE);
        add(Eno);

        ButtonGroup existingAccount = new ButtonGroup();
        existingAccount.add(eyes);
        existingAccount.add(Eno);
        
        
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
        String sreligion = (String)religion.getSelectedItem();
        String scategory = (String) category.getSelectedItem();
        String sincome = (String) income.getSelectedItem();
        String seducation = (String) education.getSelectedItem();
        String soccupation = (String) occupation.getSelectedItem();
        String seniorcitizen = null;
        if(syes.isSelected()){
            seniorcitizen = "Yes";
        }else if(Sno.isSelected()){
            seniorcitizen = "No";
        }
        
        String existingaccount = null;
        if(eyes.isSelected()){
            existingaccount = "Yes";
        }else if(Eno.isSelected()){
            existingaccount = "No";
        }
        
        String span = pan.getText();
        String sadhaar = adhaar.getText();

        try{
               Conn c = new Conn();
                String query = "insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+sadhaar+"','"+seniorcitizen+"','"+existingaccount+"')";
                c.s.executeUpdate(query);
                
                //signup three object
                setVisible(false);
                new Signupthree(formno).setVisible(true);
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    
    public static void main(String args[]) {
        
        new SignupTwo("");
    }
}
