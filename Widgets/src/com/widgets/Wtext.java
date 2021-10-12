package com.widgets;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Wtext extends JFrame {

    private JPanel p1;
    private JTextField t;
    private JButton com;
    private JButton Btn;


    public Wtext(){
        setBounds(20,20,550,400);
        setTitle("TextField");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
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

        JLabel etiqueta = new JLabel("Los TextFields son campos de entrada de texto");
        etiqueta.setForeground(new Color(255, 255, 255));
        etiqueta.setFont(new Font("Arial", Font.BOLD, 15));
        etiqueta.setBounds(10, 10, 400, 30);
        p1.add(etiqueta);

        JLabel etiqueta3 = new JLabel("En ellos se introduce información que es almacenada");
        etiqueta3.setForeground(new Color(255, 255, 255));
        etiqueta3.setFont(new Font("Arial", Font.BOLD, 15));
        etiqueta3.setBounds(10, 40, 500, 30);
        p1.add(etiqueta3);

        JLabel etiqueta4 = new JLabel("Y recibe un uso posteriormente");
        etiqueta4.setForeground(new Color(255, 255, 255));
        etiqueta4.setFont(new Font("Arial", Font.BOLD, 15));
        etiqueta4.setBounds(10, 70, 500, 30);
        p1.add(etiqueta4);

        JLabel etiqueta2 = new JLabel("Introduzca una frase y luego presione el botón");
        etiqueta2.setForeground(new Color(255, 255, 255));
        etiqueta2.setFont(new Font("Arial", Font.BOLD, 15));
        etiqueta2.setBounds(10, 130, 350, 30);
        p1.add(etiqueta2);


        t = new JTextField();
        t.setBounds(10,155,300,30);
        t.setFont(new Font("Arial", Font.BOLD, 15));
        p1.add(t);

        com = new JButton("Imprimir Frase");
        com.setBackground(new Color(255, 255, 255));
        com.setForeground(new Color(0, 0, 0));
        com.setBounds(10, 210, 150, 40);
        p1.add(com);

        JLabel etiqueta6 = new JLabel(" ");
        etiqueta6.setForeground(new Color(255, 255, 255));
        etiqueta6.setFont(new Font("Arial", Font.BOLD, 17));
        etiqueta6.setBounds(30, 270, 400, 30);
        p1.add(etiqueta6);



        Btn = new JButton("Pasar al siguiente widget ➡");
        Btn.setBackground(new Color(255, 255, 255));
        Btn.setForeground(new Color(0, 0, 0));
        Btn.setBounds(300, 210, 225, 40);
        p1.add(Btn);





        ActionListener comprobar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiqueta6.setText(t.getText());
                t.setText("");

            }
        };

        ActionListener Bot = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Wtarea v7 = new Wtarea();
                v7.setVisible(true);
                Wtext v6 = new Wtext();
                v6.setVisible(false);
                v6.dispose();
            }
        };

        Btn.addActionListener(Bot);
        com.addActionListener(comprobar);





    }
}
