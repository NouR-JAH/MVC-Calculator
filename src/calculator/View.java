package calculator;

import calculator.Model;
import calculator.Controller;
import javax.swing.*;
import java.awt.*;


@SuppressWarnings("serial")
public class View extends JFrame {
	
	public static JButton ac;
    public static JButton add;
    public static JTextField firstN;
    public static JTextField secondN;
    public static JTextField result;
    public static JButton div;
    public static JButton delete;
    public static JButton mod;
    public static JButton mul;
    public static JButton sqr;
    public static JButton sub;
    public static JPanel panel1;
    public static JPanel panel2;
    public static JPanel panel3;
    public static GridLayout layout;
    public static JLabel label1;
    public static JLabel label2;
    public static JLabel inst;

    
    public View(Model m) {
    

        firstN = new JTextField();
        secondN = new JTextField();
        result = new JTextField();
        inst = new JLabel("Insert the numbers,then choose the operation!");
        inst.setFont(new Font("TimesNewRoman", Font.BOLD+Font.ITALIC, 12));
        label1 = new JLabel("");
        label2 = new JLabel("=");
        mod = new JButton();
        div = new JButton();
        mul = new JButton();
        sub = new JButton();
        delete = new JButton();
        sqr = new JButton();
        add = new JButton();
        
        inst.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        firstN.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        secondN.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        result.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mod.setText("%");
        div.setText("/");        
        mul.setText("*");      
        sub.setText("-");       
        delete.setText("Delete");      
        sqr.setText("√");      
        add.setText("+");      
        
        this.setLayout(null);
        setSize(300 , 300);
        setVisible(true);
        setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        firstN.setLocation(10 , 10);
        firstN.setSize(70, 50);
        add(firstN);
        label1.setLocation(87 , 10);
        label1.setSize(20 , 50);
        add(label1);
        secondN.setLocation(100 , 10);
        secondN.setSize(70 , 50);
        add(secondN);
        label2.setLocation(173 , 10);
        label2.setSize(20 , 50);
        add(label2);
        result.setLocation(185 , 10);
        result.setSize(103 , 50);
        add(result);
        sqr.setLocation(10 , 65);
        sqr.setSize(91 , 50);
        add(sqr);
        add.setLocation(102 , 65);
        add.setSize(91 , 50);
        add(add);
        sub.setLocation(194 , 65);
        sub.setSize(91 , 50);
        add(sub);
        div.setLocation(10 , 120);
        div.setSize(91 , 50);
        add(div);
        mul.setLocation(102 , 120);
        mul.setSize(91 , 50);
        add(mul);
        mod.setLocation(194 , 120);
        mod.setSize(91 , 50);
        add(mod);
        delete.setLocation(10 , 175);
        delete.setSize(275 , 50);
        add(delete);
        
        inst.setLocation(10, 225);
        inst.setSize(275, 50);
        add(inst);
        
        add.addActionListener(new Controller(this , m));
        sub.addActionListener(new Controller(this , m));
        mul.addActionListener(new Controller(this , m));
        div.addActionListener(new Controller(this , m));
        mod.addActionListener(new Controller(this , m));
        delete.addActionListener(new Controller(this , m));
        sqr.addActionListener(new Controller(this , m));


           
     
    }
    
   
}
