package com.widgets;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WPanel extends JFrame {
    private JPanel p1;
    private JPanel p2;
    private JPanel p3;
    private JButton Btn;

    public WPanel(){
        setBounds(20,20,500,400);
        setTitle("Panel");
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

        JLabel etiqueta = new JLabel("Las Panels son otros widgets básicos");
        etiqueta.setForeground(new Color(255, 255, 255));
        etiqueta.setFont(new Font("Arial", Font.BOLD, 15));
        etiqueta.setBounds(30, 10, 400, 30);
        p1.add(etiqueta);

        JLabel etiqueta3 = new JLabel("Su función principal es servir como lienzo");
        etiqueta3.setForeground(new Color(255, 255, 255));
        etiqueta3.setFont(new Font("Arial", Font.BOLD, 15));
        etiqueta3.setBounds(30, 40, 400, 30);
        p1.add(etiqueta3);

        JLabel etiqueta4 = new JLabel("Un lienzo donde colocaremos los objetos");
        etiqueta4.setForeground(new Color(255, 255, 255));
        etiqueta4.setFont(new Font("Arial", Font.BOLD, 15));
        etiqueta4.setBounds(30, 70, 450, 30);
        p1.add(etiqueta4);

        p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(Color.RED);
        p2.setBounds(10,150,150,80);
        p1.add(p2);

        JLabel etiqueta5 = new JLabel("Panel 1");
        etiqueta5.setForeground(new Color(255, 255, 255));
        etiqueta5.setFont(new Font("Arial", Font.BOLD, 15));
        etiqueta5.setBounds(50, 30, 60, 20);
        p2.add(etiqueta5);

        p3 = new JPanel();
        p3.setLayout(null);
        p3.setBackground(Color.BLACK);
        p3.setBounds(200,150,150,80);
        p1.add(p3);

        JLabel etiqueta6 = new JLabel("Panel 2");
        etiqueta6.setForeground(new Color(255, 255, 255));
        etiqueta6.setFont(new Font("Arial", Font.BOLD, 15));
        etiqueta6.setBounds(50, 30, 60, 20);
        p3.add(etiqueta6);



        Btn = new JButton("Pasar al siguiente widget ➡");
        Btn.setBackground(new Color(255, 255, 255));
        Btn.setForeground(new Color(0, 0, 0));
        Btn.setBounds(250, 300, 225, 40);
        p1.add(Btn);



        ActionListener Bot = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Wcombo v10 = new Wcombo();
                v10.setVisible(true);
                WPanel v9 = new WPanel();
                v9.setVisible(false);
                v9.dispose();
            }
        };

        Btn.addActionListener(Bot);




    }
}
