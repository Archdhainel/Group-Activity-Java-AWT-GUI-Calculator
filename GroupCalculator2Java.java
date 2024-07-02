/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package groupcalculator2.java;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GroupCalculator2Java {
    static String fNum = "";
    static String sNum = "";
    static int firstNum = 0;
    static int secondNum = 0;
    static String op = "";
    static int output = 0;
    
    public static void main(String[] args) {
      Frame frame = new Frame();
      frame.setSize(300,400);
      frame.setVisible(true);
      frame.setTitle("Group Calculator");
      frame.setResizable(false);
      frame.setLayout(new BorderLayout());
      frame.setLayout(new BorderLayout());
      
      Panel numfield = new Panel();
      TextField numarea = new TextField();
      numarea.setPreferredSize(new Dimension(250, 40));
      numfield.add(numarea);
      
      Panel numbuttons = new Panel();
        numbuttons.setLayout(new GridLayout(4, 4, 5, 5));
        
      Panel names = new Panel();
        Label groupnames = new Label("    Nigoza, Rodriquez, Masangkay, Bordarays, Lising");
        names.add(groupnames);
        
        Button button1 = new Button("1");
        Button button2 = new Button("2");
        Button button3 = new Button("3");
        Button button4 = new Button("4");
        Button button5 = new Button("5");
        Button button6 = new Button("6");
        Button button7 = new Button("7");
        Button button8 = new Button("8");
        Button button9 = new Button("9");
         Button add = new Button("+");
        Button subt = new Button("-");
        Button mult = new Button("*");
        Button div = new Button("/");
        Button clear = new Button("C");
        Button button0 = new Button("0");
        Button equal = new Button("=");
        
         Button[] buttons = {button1, button2, button3, button4, button5, button6, button7, button8, button9, mult, subt, add, div, clear, button0, equal};
        for (Button button : buttons) {
        button.setBackground(Color.decode("#00FFFF"));
        button.setForeground(Color.decode("#18181B"));   
        }
        
        numbuttons.add(button7);
        numbuttons.add(button8);
        numbuttons.add(button9);
        numbuttons.add(add);
        numbuttons.add(button4);
        numbuttons.add(button5);
        numbuttons.add(button6);
        numbuttons.add(subt);
        numbuttons.add(button1);
        numbuttons.add(button2);
        numbuttons.add(button3);
        numbuttons.add(mult);
        numbuttons.add(clear);
        numbuttons.add(button0);
        numbuttons.add(equal);
        numbuttons.add(div);
        
        frame.add(numfield, BorderLayout.NORTH);
        frame.add(numbuttons, BorderLayout.CENTER);
        frame.add(names, BorderLayout.SOUTH);
        
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    
        button1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if (op == "") {
                    fNum += "1";
                    numarea.setText(fNum);
                    firstNum = Integer.valueOf(fNum);
                }
                else {
                    sNum += "1";
                    numarea.setText(sNum);
                    secondNum = Integer.valueOf(sNum);
                }
            }
        });
        
        button2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if (op == "") {
                    fNum += "2";
                    numarea.setText(fNum);
                    firstNum = Integer.valueOf(fNum);
                }
                else {
                    sNum += "2";
                    numarea.setText(sNum);
                    secondNum = Integer.valueOf(sNum);
                }
            }
        });
        
        button3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if (op == "") {
                    fNum += "3";
                    numarea.setText(fNum);
                    firstNum = Integer.valueOf(fNum);
                }
                else {
                    sNum += "3";
                    numarea.setText(sNum);
                    secondNum = Integer.valueOf(sNum);
                }
            }
        });
        
        button4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if (op == "") {
                    fNum += "4";
                    numarea.setText(fNum);
                    firstNum = Integer.valueOf(fNum);
                }
                else {
                    sNum += "4";
                    numarea.setText(sNum);
                    secondNum = Integer.valueOf(sNum);
                }
            }
        });
        
        button5.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if (op == "") {
                    fNum += "5";
                    numarea.setText(fNum);
                    firstNum = Integer.valueOf(fNum);
                }
                else {
                    sNum += "5";
                    numarea.setText(sNum);
                    secondNum = Integer.valueOf(sNum);
                }
            }
        });
        
        button6.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if (op == "") {
                    fNum += "6";
                    numarea.setText(fNum);
                    firstNum = Integer.valueOf(fNum);
                }
                else {
                    sNum += "6";
                    numarea.setText(sNum);
                    secondNum = Integer.valueOf(sNum);
                }
            }
        });
        
        button7.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if (op == "") {
                    fNum += "7";
                    numarea.setText(fNum);
                    firstNum = Integer.valueOf(fNum);
                }
                else {
                    sNum += "7";
                    numarea.setText(sNum);
                    secondNum = Integer.valueOf(sNum);
                }
            }
        });
        
        button8.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if (op == "") {
                    fNum += "8";
                    numarea.setText(fNum);
                    firstNum = Integer.valueOf(fNum);
                }
                else {
                    sNum += "8";
                    numarea.setText(sNum);
                    secondNum = Integer.valueOf(sNum);
                }
            }
        });
        
        button9.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if (op == "") {
                    fNum += "9";
                    numarea.setText(fNum);
                    firstNum = Integer.valueOf(fNum);
                }
                else {
                    sNum += "9";
                    numarea.setText(sNum);
                    secondNum = Integer.valueOf(sNum);
                }
            }
        });
        
        button0.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if (op == "") {
                    fNum += "0";
                    numarea.setText(fNum);
                    firstNum = Integer.valueOf(fNum);
                }
                else {
                    sNum += "0";
                    numarea.setText(sNum);
                    secondNum = Integer.valueOf(sNum);
                }
            }
        });
        
        add.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                numarea.setText("");
                op = "+";
                sNum = "";
            }
        });
        
        subt.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                numarea.setText("");
                op = "-";
                sNum = "";
            }
        });
        
        mult.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                numarea.setText("");
                op = "*";
                sNum = "";
            }
        });
        
        div.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                numarea.setText("");
                op = "/";
                sNum = "";
            }
        });
        
        clear.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                numarea.setText("");
                op = "";
                firstNum = 0;
                secondNum = 0;
                fNum = "";
                sNum = "";
            }
        });
        
        equal.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                sNum = "";
                fNum = "";
                if (op == "+") {
                    output = firstNum + secondNum;
                    numarea.setText(String.valueOf(output));
                    firstNum = output;
                }
                else
                if (op == "-") {
                    output = firstNum - secondNum;
                    numarea.setText(String.valueOf(output));
                    firstNum = output;
                }
                else
                if (op == "*") {
                    output = firstNum * secondNum;
                    numarea.setText(String.valueOf(output));
                    firstNum = output;
                }
                
                if (op == "/") {
                    if (secondNum == 0) {
                        numarea.setText("Cannot divide by 0! Please clear the calculator.");
                    } else {
                      
                        float outputFloat = (float) firstNum / secondNum;
                        numarea.setText(String.valueOf(outputFloat));
                        firstNum = (int) outputFloat;
                    }
                }
            }
        });
        
        frame.setVisible(true);
    }
    
}

