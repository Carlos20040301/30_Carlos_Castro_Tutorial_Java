package com.widgets;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Wtarea extends JFrame {

    private JPanel p1;
    private JTextField t;
    private JButton com;
    private JButton Btn;

    private JTextArea tout;


    public Wtarea(){
        setBounds(20,20,550,450);
        setTitle("TextArea");
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

        JLabel etiqueta = new JLabel("Los TextArea son widgets normalmente de solo lectura");
        etiqueta.setForeground(new Color(255, 255, 255));
        etiqueta.setFont(new Font("Arial", Font.BOLD, 15));
        etiqueta.setBounds(10, 10, 400, 30);
        p1.add(etiqueta);

        JLabel etiqueta3 = new JLabel("Aquí se almacenan grandes lineas de información de varios TextFields");
        etiqueta3.setForeground(new Color(255, 255, 255));
        etiqueta3.setFont(new Font("Arial", Font.BOLD, 15));
        etiqueta3.setBounds(10, 40, 550, 30);
        p1.add(etiqueta3);

        JLabel etiqueta4 = new JLabel("Y la información que almacena la muestra al instante");
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

        com = new JButton("Enviar");
        com.setBackground(new Color(255, 255, 255));
        com.setForeground(new Color(0, 0, 0));
        com.setBounds(10, 210, 150, 40);
        p1.add(com);


        tout = new JTextArea();
        tout.setFont(new Font("Arial", Font.PLAIN, 15));
        tout.setSize(200, 100);
        tout.setLocation(10, 270);
        tout.setLineWrap(true);
        tout.setEditable(false);
        tout.setBackground(Color.WHITE);
        tout.setForeground(Color.BLACK);
        p1.add(tout);



        Btn = new JButton("Pasar al siguiente widget ➡");
        Btn.setBackground(new Color(255, 255, 255));
        Btn.setForeground(new Color(0, 0, 0));
        Btn.setBounds(300, 210, 225, 40);
        p1.add(Btn);





        ActionListener comprobar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String info=t.getText();
                t.setText("");

                tout.setText(info);
                tout.setEditable(false);

            }
        };

        ActionListener Bot = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Wtoggle v8 = new Wtoggle();
                v8.setVisible(true);
                Wtarea v7 = new Wtarea();
                v7.setVisible(false);
                v7.dispose();
            }
        };

        Btn.addActionListener(Bot);
        com.addActionListener(comprobar);





    }
}
