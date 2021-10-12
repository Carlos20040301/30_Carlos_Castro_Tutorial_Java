package com.widgets;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Box extends JFrame{
    private JPanel p1;
    private JCheckBox b1;
    private JCheckBox b2;
    private JCheckBox b3;
    private JCheckBox b4;
    private JCheckBox b5;
    private JCheckBox b6;
    private JButton Btn;
    private ButtonGroup group;

    public Box() {
        setBounds(20, 20, 600, 500);
        setTitle("CheckBox");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        startc();
        setResizable(false);
    }

    public void startc() {
        cP();
        cBtn();
    }

    public void cP() {
        p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(125, 125, 255));
        this.add(p1);
    }


    public void cBtn() {

        JLabel etiqueta = new JLabel("Los CheckBox de Java son similares a los RadioButton.");
        etiqueta.setForeground(new Color(255, 255, 255));
        etiqueta.setFont(new Font("Arial", Font.BOLD, 15));
        etiqueta.setBounds(30, 10, 450, 30);
        p1.add(etiqueta);

        JLabel etiqueta3 = new JLabel("Los encuentras en los mismos lugares");
        etiqueta3.setForeground(new Color(255, 255, 255));
        etiqueta3.setFont(new Font("Arial", Font.BOLD, 15));
        etiqueta3.setBounds(30, 40, 400, 30);
        p1.add(etiqueta3);

        JLabel etiqueta4 = new JLabel("Y sus funciones son similares");
        etiqueta4.setForeground(new Color(255, 255, 255));
        etiqueta4.setFont(new Font("Arial", Font.BOLD, 15));
        etiqueta4.setBounds(30, 70, 450, 30);
        p1.add(etiqueta4);

        JLabel etiqueta5 = new JLabel("tanto que muchas veces solo se diferencian por su forma");
        etiqueta5.setForeground(new Color(255, 255, 255));
        etiqueta5.setFont(new Font("Arial", Font.BOLD, 15));
        etiqueta5.setBounds(30, 95, 500, 30);
        p1.add(etiqueta5);

        JLabel etiqueta2 = new JLabel("Elige un color:");
        etiqueta2.setForeground(new Color(255, 255, 255));
        etiqueta2.setFont(new Font("Arial", Font.BOLD, 15));
        etiqueta2.setBounds(30, 150, 250, 30);
        p1.add(etiqueta2);

        b1 = new JCheckBox("Rojo");
        b1.setBackground(new Color(125, 125, 255));
        b1.setForeground(new Color(255, 255, 255));
        b1.setBounds(30, 180, 70, 40);
        p1.add(b1);

        b2 = new JCheckBox("Azúl");
        b2.setBackground(new Color(125, 125, 255));
        b2.setForeground(new Color(255, 255, 255));
        b2.setBounds(30, 230, 70, 40);
        p1.add(b2);

        b3 = new JCheckBox("Verde");
        b3.setBackground(new Color(125, 125, 255));
        b3.setForeground(new Color(255, 255, 255));
        b3.setBounds(30, 280, 70, 40);
        p1.add(b3);

        b4 = new JCheckBox("Amarillo");
        b4.setBackground(new Color(125, 125, 255));
        b4.setForeground(new Color(255, 255, 255));
        b4.setBounds(100, 180, 90, 40);
        p1.add(b4);

        b5 = new JCheckBox("Naranja");
        b5.setBackground(new Color(125, 125, 255));
        b5.setForeground(new Color(255, 255, 255));
        b5.setBounds(100, 230, 70, 40);
        p1.add(b5);

        b6 = new JCheckBox("Negro");
        b6.setBackground(new Color(125, 125, 255));
        b6.setForeground(new Color(255, 255, 255));
        b6.setBounds(100, 280, 70, 40);
        p1.add(b6);

        Btn = new JButton("Ver siguiente pantalla ➡");
        Btn.setBackground(new Color(255, 255, 255));
        Btn.setForeground(new Color(0, 0, 0));
        Btn.setBounds(300, 210, 225, 40);
        p1.add(Btn);

        JLabel etiqueta6 = new JLabel(" ");
        etiqueta6.setForeground(new Color(255, 255, 255));
        etiqueta6.setFont(new Font("Arial", Font.BOLD, 15));
        etiqueta6.setBounds(30, 350, 400, 30);
        p1.add(etiqueta6);



        ActionListener radio1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiqueta6.setText("Nada llama la atención como este color");
                b2.setSelected(false);
                b3.setSelected(false);
                b4.setSelected(false);
                b5.setSelected(false);
                b6.setSelected(false);
            }
        };

        ActionListener radio2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiqueta6.setText("Dicen que es el color más cercano a la verdad");
                b1.setSelected(false);
                b3.setSelected(false);
                b4.setSelected(false);
                b5.setSelected(false);
                b6.setSelected(false);
            }
        };

        ActionListener radio3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiqueta6.setText("Es el color que viste el mundo de belleza");
                b2.setSelected(false);
                b1.setSelected(false);
                b4.setSelected(false);
                b5.setSelected(false);
                b6.setSelected(false);
            }
        };

        ActionListener radio4 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiqueta6.setText("El que de amarillo viste a su belleza se atiene");
                b2.setSelected(false);
                b3.setSelected(false);
                b1.setSelected(false);
                b5.setSelected(false);
                b6.setSelected(false);
            }
        };

        ActionListener radio5 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiqueta6.setText("Y tu ¿ya encontraste tu media naranja?");
                b2.setSelected(false);
                b3.setSelected(false);
                b4.setSelected(false);
                b1.setSelected(false);
                b6.setSelected(false);
            }
        };

        ActionListener radio6 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiqueta6.setText("Un color que luce con todo");
                b2.setSelected(false);
                b3.setSelected(false);
                b4.setSelected(false);
                b5.setSelected(false);
                b1.setSelected(false);
            }
        };



        ActionListener Bot = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fin v12 = new fin();
                v12.setVisible(true);
                Box v11 = new Box();
                v11.setVisible(false);
                v11.dispose();
            }
        };

        Btn.addActionListener(Bot);
        b1.addActionListener(radio1);
        b2.addActionListener(radio2);
        b3.addActionListener(radio3);
        b4.addActionListener(radio4);
        b5.addActionListener(radio5);
        b6.addActionListener(radio6);



    }
}

