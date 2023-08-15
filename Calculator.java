import javax.swing.*;
import java.awt.*;
import static java.awt.BorderLayout.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    public Calculator() {

        //calculator attribute
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 600);
        setResizable(false);

        // Main Panel
        JPanel mainPanel = new JPanel();
        add(mainPanel);
        mainPanel.setBackground(Color.BLACK);

        //North Panel of Main
        JPanel nPanel = new JPanel();
        nPanel.setLayout(new BorderLayout());
        JPanel displayP = new JPanel();
        displayP.setBackground(Color.BLACK);
        displayP.setLayout(new BorderLayout());
        JTextArea display = new JTextArea(2,13);
        display.setEditable(false);
        displayP.setPreferredSize(new Dimension(350,90));
        display.setFont(new Font(Font.SANS_SERIF,Font.BOLD,22));
        displayP.add(display,SOUTH);
        nPanel.add(displayP,NORTH);
        nPanel.setBackground(Color.BLACK);
        mainPanel.add(nPanel,NORTH);
        //North Panel End

        //Center Panel of Main
        //Radio
        JPanel radioP = new JPanel();
        radioP.setBackground(Color.BLACK);
        radioP.setLayout(new BorderLayout());
        //Radio 1
        JRadioButton rB1 = new JRadioButton("Integer",false);
        rB1.setFont(new Font(Font.SANS_SERIF,Font.BOLD,12));
        rB1.setBackground(Color.BLACK);
        rB1.setForeground(Color.WHITE);
        //Radio 2
        JRadioButton rB2 = new JRadioButton("Floating",false);
        rB2.setFont(new Font(Font.SANS_SERIF,Font.BOLD,12));
        rB2.setBackground(Color.BLACK);
        rB2.setForeground(Color.WHITE);
        radioP.add(rB1,CENTER);
        radioP.add(rB2,SOUTH);
        //Radio Panel End
        rB1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rB1.setSelected(true);
                rB2.setSelected(false);
            }
        });
        rB2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rB2.setSelected(true);
                rB1.setSelected(false);
            }
        });

        //Radio End
        JPanel centerLayer1 = new JPanel();
        JPanel centerLayer2 = new JPanel();
        centerLayer1.setLayout(new BorderLayout());
        centerLayer2.setBackground(Color.BLACK);
        centerLayer2.setPreferredSize(new Dimension(1,25));
        //Main CENTER
        JPanel cPanel = new JPanel();

        radioP.setBackground(Color.BLACK);
        JButton bC = new JButton("C");
        JButton bDel = new JButton("DEL");
        JButton bDiv = new JButton("/");
        JButton bSquareRoot = new JButton("√");
        JButton bSquare = new JButton("X²");
        JButton b1Div = new JButton("1/x");
        JButton bSub = new JButton("-");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton bMul = new JButton("X");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton bAdd = new JButton("+");
        //setting up grid layout adding button and radio in 4 by 4
        cPanel.setBackground(Color.BLACK);
        cPanel.setLayout(new GridLayout(4, 4, 12, 10));
        radioP.setPreferredSize(new Dimension(78,55));
        //adding color to button
        bC.setForeground(Color.WHITE);
        bC.setBackground(Color.RED);
        bDel.setForeground(Color.WHITE);
        bDel.setBackground(Color.RED);
        bDiv.setBackground(Color.ORANGE);
        bSub.setBackground(Color.ORANGE);
        bMul.setBackground(Color.ORANGE);
        bAdd.setBackground(Color.ORANGE);
        cPanel.add(radioP);
        cPanel.add(bC);
        cPanel.add(bDel);
        cPanel.add(bDiv);
        cPanel.add(bSquareRoot);
        cPanel.add(bSquare);
        cPanel.add(b1Div);
        cPanel.add(bSub);
        cPanel.add(b7);
        cPanel.add(b8);
        cPanel.add(b9);
        cPanel.add(bMul);
        cPanel.add(b4);
        cPanel.add(b5);
        cPanel.add(b6);
        cPanel.add(bAdd);
        //Main Center END
        //ADD to main Pain
        centerLayer1.add(centerLayer2,NORTH);
        centerLayer1.add(cPanel,CENTER);
        mainPanel.add(centerLayer1,CENTER);

        //South Panel of Main
        JPanel s1 = new JPanel();
        JPanel s2 = new JPanel();
        s1.setLayout(new BorderLayout());
        s2.setLayout(new BorderLayout());
        s2.setPreferredSize(new Dimension(13,1));
        s2.setBackground(Color.BLACK);
        s1.add(s2,WEST);
        //Main South Panel
        JPanel southLayer1 = new JPanel();
        southLayer1.setLayout(new BorderLayout());
        JPanel southLayer2 = new JPanel();
        southLayer2.setLayout(new BorderLayout());
        southLayer2.setBackground(Color.BLACK);
        southLayer2.setPreferredSize(new Dimension(350,1));
        JPanel mainSouth = new JPanel();
        mainSouth.setLayout(new BorderLayout());
        southLayer1.add(southLayer2,NORTH);
        //South BUTTON of EAST "="
        JPanel seButtonP = new JPanel();
        JPanel seGAP = new JPanel();
        JPanel seGAP1 = new JPanel();
        JPanel seGAP2 = new JPanel();
        JButton bEqual = new JButton("=");
        seButtonP.setLayout(new BorderLayout());
        bEqual.setBackground(Color.ORANGE);
        bEqual.setPreferredSize(new Dimension(78,100));
        seGAP.setPreferredSize(new Dimension(12,1));
        seGAP2.setPreferredSize(new Dimension(10,1));
        seGAP1.setPreferredSize(new Dimension(10,14));
        seGAP.setBackground(Color.BLACK);
        seGAP1.setBackground(Color.BLACK);
        seGAP2.setBackground(Color.BLACK);
        seButtonP.add(seGAP,EAST);
        seButtonP.add(bEqual,CENTER);
        seButtonP.add(seGAP2,WEST);
        seButtonP.add(seGAP1,SOUTH);
        seButtonP.setBackground(Color.RED);
        seButtonP.setPreferredSize(new Dimension(100,0));
        //South Button of West
        JPanel swButtonP = new JPanel();
        swButtonP.setBackground(Color.BLACK);
        swButtonP.setLayout(new BorderLayout());
        //Button 1, 2 ,3
        JPanel swButtonNorth = new JPanel();
        swButtonNorth.setBackground(Color.BLACK);
        swButtonNorth.setLayout(new BorderLayout());
        JPanel swButtonN = new JPanel();
        swButtonN.setBackground(Color.BLACK);
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        b1.setPreferredSize(new Dimension(80,55));
        swButtonN.setLayout(new GridLayout(1,3,10,15));
        swButtonN.add(b1);
        swButtonN.add(b2);
        swButtonN.add(b3);
        swButtonNorth.add(swButtonN);
        swButtonP.add(swButtonNorth,NORTH);
        //Button "." the period
        JPanel swButtonE = new JPanel();
        swButtonE.setPreferredSize(new Dimension(80,55));
        swButtonE.setBackground(Color.BLACK);
        JButton bPeriod = new JButton(".");
        bPeriod.setPreferredSize(new Dimension(80,60));
        swButtonE.add(bPeriod);
        swButtonP.add(swButtonE,EAST);
        JPanel swButtonC = new JPanel();
        swButtonC.setBackground(Color.BLACK);
        JButton b0 = new JButton("0");
        b0.setPreferredSize(new Dimension(170,60));
        swButtonC.setPreferredSize(new Dimension(170,80));
        swButtonC.add(b0);
        swButtonP.add(swButtonC,WEST);
        mainSouth.add(seButtonP,EAST);
        mainSouth.add(swButtonP,CENTER);
        southLayer1.add(mainSouth, CENTER);
        southLayer1.setBackground(Color.BLACK);
        //Main South End then adding to main panel.
        s1.add(southLayer1,CENTER);
        mainPanel.add(s1,SOUTH);
        setVisible(true);

        //creating lister
        bC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!rB1.isSelected() && !rB2.isSelected()){
                    display.setText("Please select: Integer or Floating");
                }
                else {
                    display.setText("");
                }
            }
        });
        bDel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!rB1.isSelected() && !rB2.isSelected()){
                    display.setText("Please select: Integer or Floating");
                }
                else {
                    String s = display.getText();
                    if(s.length() > 0){
                        s = s.substring(0, s.length() - 1);
                        display.setText(s);
                    }
                    else{
                        display.setText("");
                    }
                }
            }
        });
        b0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!rB1.isSelected() && !rB2.isSelected()){
                    display.setText("Please select: Integer or Floating");
                }
                else {
                    display.append("0");
                }
            }
        });
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!rB1.isSelected() && !rB2.isSelected()){
                    display.setText("Please select: Integer or Floating");
                }
                else{
                    display.append("1");
                }

            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!rB1.isSelected() && !rB2.isSelected()){
                    display.setText("Please select: Integer or Floating");
                }
                else {
                    display.append("2");
                }
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!rB1.isSelected() && !rB2.isSelected()){
                    display.setText("Please select: Integer or Floating");
                }
                else {
                    display.append("3");
                }
            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!rB1.isSelected() && !rB2.isSelected()){
                    display.setText("Please select: Integer or Floating");
                }
                else {
                    display.append("4");
                }
            }
        });
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!rB1.isSelected() && !rB2.isSelected()){
                    display.setText("Please select: Integer or Floating");
                }
                else {
                    display.append("5");
                }
            }
        });
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!rB1.isSelected() && !rB2.isSelected()){
                    display.setText("Please select: Integer or Floating");
                }
                else {
                    display.append("6");
                }
            }
        });
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!rB1.isSelected() && !rB2.isSelected()){
                    display.setText("Please select: Integer or Floating");
                }
                else {
                    display.append("7");
                }
            }
        });
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!rB1.isSelected() && !rB2.isSelected()){
                    display.setText("Please select: Integer or Floating");
                }
                else {
                    display.append("8");
                }
            }
        });
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!rB1.isSelected() && !rB2.isSelected()){
                    display.setText("Please select: Integer or Floating");
                }
                else {
                    display.append("9");
                }
            }
        });
        bPeriod.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(rB1.isSelected()){
                    display.setText("Error: select Floating Function");
                }
                else if(rB2.isSelected()){
                    if(display.getText().equals("")){
                            display.append("0.");
                    }
                    else {
                            display.append(".");
                    }
                }
                else{
                    display.setText("Please select: Integer or Floating");
                }
            }
        });
        bSquareRoot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (!rB1.isSelected()) {
                        if (rB2.isSelected()) {
                            if (display.getText().equals("")) {
                                display.setText("Error: Input an Floating #");
                            } else {
                                float iNum1 = (float) Double.parseDouble(display.getText());
                                float iNum2 = (float) Math.sqrt(iNum1);
                                display.setText("" + iNum2);
                            }
                        } else {
                            display.setText("Please select: Integer or Floating");
                        }
                    } else {
                        if (!display.getText().equals("")) {
                            int iNum1 = (int) Double.parseDouble(display.getText());
                            int iNum2 = (int) Math.sqrt(iNum1);
                            if (iNum1 == Math.pow(iNum2, 2)) {
                                display.setText("" + iNum2);
                            } else {
                                display.setText("Not a Perfect Integer #");
                            }
                        }
                    }
                }
                catch (NumberFormatException n){
                    display.setText("Please push C to Clear");
                }
            }
        });
        bSquare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (!rB1.isSelected() && !rB2.isSelected()) {
                        display.setText("Select: Integer or Floating");
                    } else if (rB1.isSelected()) {
                        if (!display.getText().equals("")) {
                            int iNum1 = (int) Double.parseDouble(display.getText());
                            display.setText("" + (int) Math.pow(iNum1, 2));
                        }
                    } else if (rB2.isSelected()) {
                        if (!display.getText().equals("")) {
                            double iNum1 = Double.parseDouble(display.getText());
                            display.setText("" + (float) Math.pow(iNum1, 2));
                        }
                    }
                }
                catch (NumberFormatException n){
                    display.setText("Please push C to Clear");
                }
            }
        });
        b1Div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (!rB1.isSelected() && !rB2.isSelected()) {
                        display.setText("Please select: Integer or Floating");
                    } else if (rB1.isSelected()) {
                        if (!display.getText().equals("")) {
                            int num1 = Integer.parseInt(display.getText());
                            if (num1 == 0) {
                                display.setText("1 divide by 0 is Undefined");
                            } else {
                                int num2 = 1 / num1;
                                display.setText(num2 +"");
                            }
                        }
                    } else {
                        if (!display.getText().equals("")) {
                            float num1 = (float) Double.parseDouble(display.getText());
                            if (num1 == 0) {
                                display.setText("1 divide by 0 is Undefined");
                            } else {
                                float num2 = 1 / num1;
                                display.setText(num2 + "");
                            }
                        }
                    }
                }
                catch (NumberFormatException n){
                    display.setText("Please push C to Clear");
                }
            }
        });
        bDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (!rB1.isSelected() && !rB2.isSelected()) {
                        display.setText("Please select: Integer or Floating");
                    } else if (!display.getText().equals("") && !display.getText().contains("/")) {
                        if (!display.getText().contains("*")) {
                            if (!display.getText().contains("-")) {
                                if (!display.getText().contains("+")) {
                                    display.append("/");
                                }
                            }
                        }
                    }
                }
                catch (NumberFormatException n){
                    display.setText("Please push C to Clear");
                }
            }
        });
        bSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!rB1.isSelected() && !rB2.isSelected()) {
                    display.setText("Please select: Integer or Floating");
                }
                else if (!display.getText().equals("") && !display.getText().contains("/")) {
                    if (!display.getText().contains("*")) {
                        if (!display.getText().contains("-")) {
                            if (!display.getText().contains("+")) {
                                display.append("-");
                            }
                        }
                    }
                }
            }
        });
        bMul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!rB1.isSelected() && !rB2.isSelected()) {
                    display.setText("Please select: Integer or Floating");
                }
                else if (!display.getText().equals("") && !display.getText().contains("/")) {
                    if (!display.getText().contains("*")) {
                        if (!display.getText().contains("-")) {
                            if (!display.getText().contains("+")) {
                                display.append("*");
                            }
                        }
                    }
                }
            }
        });
        bAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!rB1.isSelected() && !rB2.isSelected()) {
                    display.setText("Please select: Integer or Floating");
                }
                else if (!display.getText().equals("") && !display.getText().contains("/")) {
                    if (!display.getText().contains("*")) {
                        if (!display.getText().contains("-")) {
                            if (!display.getText().contains("+")) {
                                display.append("+");
                            }
                        }
                    }
                }
            }
        });
        bEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    if (!rB1.isSelected() && !rB2.isSelected()) {
                        display.setText("Please select: Integer or Floating");
                    }
                    if(rB1.isSelected()){
                        if(display.getText().contains("/")){
                            String[] operands = display.getText().split("/");
                            if(operands.length == 1) {
                            }
                            if(operands.length == 2){
                                String num1 = operands[0];
                                String num2 = operands[1];
                                int intNum1 = Integer.parseInt(num1);
                                int intNum2 = Integer.parseInt(num2);
                                int intTotal = intNum1 / intNum2;
                                String total = Integer.toString(intTotal);
                                display.setText(total);
                            }

                        }
                        if(display.getText().contains("-")){
                            String[] operands = display.getText().split("-");
                            if(operands.length == 1) {
                            }
                            if(operands.length == 2){
                                String num1 = operands[0];
                                String num2 = operands[1];
                                int intNum1 = Integer.parseInt(num1);
                                int intNum2 = Integer.parseInt(num2);
                                int intTotal = intNum1 - intNum2;
                                String total = Integer.toString(intTotal);
                                display.setText(total);
                            }

                        }
                        if(display.getText().contains("*")){
                            String[] operands = display.getText().split("\\*");
                            if(operands.length == 1) {
                            }
                            if(operands.length == 2){
                                String num1 = operands[0];
                                String num2 = operands[1];
                                int intNum1 = Integer.parseInt(num1);
                                int intNum2 = Integer.parseInt(num2);
                                int intTotal = intNum1 * intNum2;
                                String total = Integer.toString(intTotal);
                                display.setText(total);
                            }

                        }
                        if(display.getText().contains("+")){
                            String[] operands = display.getText().split("\\+");
                            if(operands.length == 1) {
                            }
                            if(operands.length == 2){
                                String num1 = operands[0];
                                String num2 = operands[1];
                                int intNum1 = Integer.parseInt(num1);
                                int intNum2 = Integer.parseInt(num2);
                                int intTotal = intNum1 + intNum2;
                                String total = Integer.toString(intTotal);
                                display.setText(total);
                            }
                        }
                    }
                    if(rB2.isSelected()){
                        if(display.getText().contains("/")){
                            String[] operands = display.getText().split("/");
                            if(operands.length == 1) {
                            }
                            if(operands.length == 2){
                                String num1 = operands[0];
                                String num2 = operands[1];
                                float intNum1 = Float.parseFloat(num1);
                                float intNum2 = Float.parseFloat(num2);
                                float intTotal = intNum1 / intNum2;
                                String total = Float.toString(intTotal);
                                display.setText(total);
                            }
                        }
                        if(display.getText().contains("-")){
                            String[] operands = display.getText().split("-");
                            if(operands.length == 1) {
                            }
                            if(operands.length == 2){
                                String num1 = operands[0];
                                String num2 = operands[1];
                                float intNum1 = Float.parseFloat(num1);
                                float intNum2 = Float.parseFloat(num2);
                                float intTotal = intNum1 - intNum2;
                                String total = Float.toString(intTotal);
                                display.setText(total);
                            }
                        }
                        if(display.getText().contains("*")){
                            String[] operands = display.getText().split("\\*");
                            if(operands.length == 1) {
                            }
                            if(operands.length == 2){
                                String num1 = operands[0];
                                String num2 = operands[1];
                                float intNum1 = Float.parseFloat(num1);
                                float intNum2 = Float.parseFloat(num2);
                                float intTotal = intNum1 * intNum2;
                                String total = Float.toString(intTotal);
                                display.setText(total);
                            }
                        }
                        if(display.getText().contains("+")){
                            String[] operands = display.getText().split("\\+");
                            if(operands.length == 1) {
                            }
                            if(operands.length == 2){
                                String num1 = operands[0];
                                String num2 = operands[1];
                                float intNum1 = Float.parseFloat(num1);
                                float intNum2 = Float.parseFloat(num2);
                                float intTotal = intNum1 + intNum2;
                                String total = Float.toString(intTotal);
                                display.setText(total);
                            }
                        }

                    }

                }
                catch (NumberFormatException n){
                    display.setText("Please push C to Clear");
                }
            }
        });

    }

        public static void main(String[] args) {
            new Calculator();
        }

}


