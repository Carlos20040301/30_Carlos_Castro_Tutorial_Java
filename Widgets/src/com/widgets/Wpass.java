package com.widgets;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Wpass extends JFrame {

    private JPanel p1;
    private JPasswordField c;
    private JButton com;
    private JButton Btn;


    public Wpass(){
        setBounds(20,20,550,400);
        setTitle("PasswordField");
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

        JLabel etiqueta = new JLabel("Los PasswordFields son campos de entrada de texto");
        etiqueta.setForeground(new Color(255, 255, 255));
        etiqueta.setFont(new Font("Arial", Font.BOLD, 15));
        etiqueta.setBounds(10, 10, 400, 30);
        p1.add(etiqueta);

        JLabel etiqueta3 = new JLabel("Con la caracteristica que estas son solo utilizadas en contraseñas");
        etiqueta3.setForeground(new Color(255, 255, 255));
        etiqueta3.setFont(new Font("Arial", Font.BOLD, 15));
        etiqueta3.setBounds(10, 40, 500, 30);
        p1.add(etiqueta3);

        JLabel etiqueta4 = new JLabel("Y siempre muestran un solo caracter que normalmente son ●●●●●");
        etiqueta4.setForeground(new Color(255, 255, 255));
        etiqueta4.setFont(new Font("Arial", Font.BOLD, 15));
        etiqueta4.setBounds(10, 70, 500, 30);
        p1.add(etiqueta4);

        JLabel etiqueta2 = new JLabel("La contraseña es el resultado de 150x250");
        etiqueta2.setForeground(new Color(255, 255, 255));
        etiqueta2.setFont(new Font("Arial", Font.BOLD, 15));
        etiqueta2.setBounds(10, 130, 350, 30);
        p1.add(etiqueta2);


        c = new JPasswordField();
        c.setBounds(10,155,300,30);
        c.setFont(new Font("Arial", Font.BOLD, 15));
        p1.add(c);

        com = new JButton("Revisar");
        com.setBackground(new Color(255, 255, 255));
        com.setForeground(new Color(0, 0, 0));
        com.setBounds(10, 210, 80, 40);
        p1.add(com);

        JLabel etiqueta6 = new JLabel(" ");
        etiqueta6.setForeground(new Color(255, 255, 255));
        etiqueta6.setFont(new Font("Arial", Font.BOLD, 15));
        etiqueta6.setBounds(30, 300, 400, 30);
        p1.add(etiqueta6);



        Btn = new JButton("Pasar al siguiente widget ➡");
        Btn.setBackground(new Color(255, 255, 255));
        Btn.setForeground(new Color(0, 0, 0));
        Btn.setBounds(300, 210, 225, 40);
        p1.add(Btn);





        ActionListener comprobar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                char[] compa = c.getPassword();
                String a="37500";

                if (String.valueOf(compa).equals(a)){
                    etiqueta6.setText("Contraseña Correcta");
                }else {
                    etiqueta6.setText("Incorrecto vuelve a intentarlo");
                }
            }
        };

        ActionListener Bot = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RButton v5 = new RButton();
                v5.setVisible(true);
                Wpass v4 = new Wpass();
                v4.setVisible(false);
                v4.dispose();
            }
        };

        Btn.addActionListener(Bot);
        com.addActionListener(comprobar);





    }
}

