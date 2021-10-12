package com.widgets;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Inicio extends JFrame{

    public Inicio(){
        setBounds(20,20,500,400);
        setTitle("Inicio");
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        startc();
        setResizable(false);
    }

    private JPanel p1;
    private JButton Btn;
    private ButtonGroup group;

    public void startc(){
        cP();
        ceti();
    }
    public void cP(){
        p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(125,125,255));
        this.add(p1);
    }
    public void ceti() {

        JLabel etiqueta1 = new JLabel("Bienvenido a un tutorial de java");
        etiqueta1.setForeground(new Color(255, 255, 255));
        etiqueta1.setFont(new Font("Arial", Font.BOLD, 15));
        etiqueta1.setBounds(30, 15, 250, 30);
        p1.add(etiqueta1);

        JLabel etiqueta2 = new JLabel("En el le enseñaré la función de cada widget de Jframe");
        etiqueta2.setForeground(new Color(255, 255, 255));
        etiqueta2.setFont(new Font("Arial", Font.BOLD, 15));
        etiqueta2.setBounds(30, 50, 400, 30);
        p1.add(etiqueta2);

        JLabel etiqueta3 = new JLabel("Presione el Boton para comenzar");
        etiqueta3.setForeground(new Color(255, 255, 255));
        etiqueta3.setFont(new Font("Arial", Font.BOLD, 15));
        etiqueta3.setBounds(30, 85, 250, 30);
        p1.add(etiqueta3);

        Btn = new JButton("Ver primer widget ➡");
        Btn.setBackground(new Color(255,255,255));
        Btn.setForeground(new Color(0,0,0));
        Btn.setBounds(30,160,175,40);
        p1.add(Btn);

        group = new ButtonGroup();
        group.add(Btn);

        ActionListener Bot = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Inicio v1 = new Inicio();
                v1.setVisible(false);
                v1.hide();
                Wlab v2 = new Wlab();
                v2.setVisible(true);

            }
        };
        Btn.addActionListener(Bot);
    }


}
