package com.widgets;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import static java.awt.Color.BLACK;

public class Check extends JFrame {
    private JPanel p1;
    private JButton azul;
    private JButton rojo;
    private JButton verde;
    private JButton Btn;
    private ButtonGroup group;


    public Check() {
        setBounds(20, 20, 500, 400);
        setTitle("Button");
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

        JLabel etiqueta = new JLabel("Los botones en Java realizan acciones");
        etiqueta.setForeground(new Color(255, 255, 255));
        etiqueta.setFont(new Font("Arial", Font.BOLD, 15));
        etiqueta.setBounds(30, 10, 400, 30);
        p1.add(etiqueta);

        JLabel etiqueta3 = new JLabel("Estas acciones son definidas por el desarrollador");
        etiqueta3.setForeground(new Color(255, 255, 255));
        etiqueta3.setFont(new Font("Arial", Font.BOLD, 15));
        etiqueta3.setBounds(30, 40, 400, 30);
        p1.add(etiqueta3);

        JLabel etiqueta4 = new JLabel("Y estás acciones funcionan a partir de ser pulsado el botón");
        etiqueta4.setForeground(new Color(255, 255, 255));
        etiqueta4.setFont(new Font("Arial", Font.BOLD, 15));
        etiqueta4.setBounds(30, 70, 450, 30);
        p1.add(etiqueta4);

        JLabel etiqueta2 = new JLabel("Presione un botón y vea la magia");
        etiqueta2.setForeground(new Color(255, 255, 255));
        etiqueta2.setFont(new Font("Arial", Font.BOLD, 15));
        etiqueta2.setBounds(30, 110, 250, 30);
        p1.add(etiqueta2);

        azul = new JButton("Azúl");
        azul.setBackground(new Color(255, 255, 255));
        azul.setForeground(new Color(0, 0, 0));
        azul.setBounds(30, 160, 80, 40);
        p1.add(azul);

        rojo = new JButton("Rojo");
        rojo.setBackground(new Color(255, 255, 255));
        rojo.setForeground(new Color(0, 0, 0));
        rojo.setBounds(30, 210, 80, 40);
        p1.add(rojo);

        verde = new JButton("Verde");
        verde.setBackground(new Color(255, 255, 255));
        verde.setForeground(new Color(0, 0, 0));
        verde.setBounds(30, 260, 80, 40);
        p1.add(verde);

        Btn = new JButton("Pasar al siguiente widget ➡");
        Btn.setBackground(new Color(255, 255, 255));
        Btn.setForeground(new Color(0, 0, 0));
        Btn.setBounds(250, 210, 225, 40);
        p1.add(Btn);

        group = new ButtonGroup();
        group.add(Btn);
        group.add(azul);
        group.add(rojo);
        group.add(verde);


        ActionListener blue = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p1.setBackground(Color.BLUE);
                etiqueta.setForeground(Color.white);
                etiqueta2.setForeground(Color.white);
                etiqueta3.setForeground(Color.white);
                etiqueta4.setForeground(Color.white);


            }
        };

        ActionListener red = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p1.setBackground(Color.RED);
                etiqueta.setForeground(Color.white);
                etiqueta2.setForeground(Color.white);
                etiqueta3.setForeground(Color.white);
                etiqueta4.setForeground(Color.white);


            }
        };

        ActionListener green = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p1.setBackground(Color.GREEN);
                etiqueta.setForeground(Color.BLACK);
                etiqueta2.setForeground(Color.BLACK);
                etiqueta3.setForeground(Color.BLACK);
                etiqueta4.setForeground(Color.BLACK);

            }
        };

            ActionListener Bot = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Wpass v4 = new Wpass();
                    v4.setVisible(true);
                    Check v3 = new Check();
                    v3.setVisible(false);
                    v3.dispose();
                }
            };

            Btn.addActionListener(Bot);
            azul.addActionListener(blue);
            rojo.addActionListener(red);
            verde.addActionListener(green);



    }
}
