package com.widgets;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Wlab extends JFrame{
    private JPanel p1;
    private JButton Btn;



    public Wlab() {
        setBounds(20, 20, 500, 400);
        setTitle("Label");
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

        JLabel etiqueta = new JLabel("Las Labels de Java son widgets básicos");
        etiqueta.setForeground(new Color(255, 255, 255));
        etiqueta.setFont(new Font("Arial", Font.BOLD, 15));
        etiqueta.setBounds(30, 10, 400, 30);
        p1.add(etiqueta);

        JLabel etiqueta3 = new JLabel("Su uso es para comunicarse con el usuario");
        etiqueta3.setForeground(new Color(255, 255, 255));
        etiqueta3.setFont(new Font("Arial", Font.BOLD, 15));
        etiqueta3.setBounds(30, 40, 400, 30);
        p1.add(etiqueta3);

        JLabel etiqueta4 = new JLabel("Se podría decir que son una serie de instrucciones");
        etiqueta4.setForeground(new Color(255, 255, 255));
        etiqueta4.setFont(new Font("Arial", Font.BOLD, 15));
        etiqueta4.setBounds(30, 70, 450, 30);
        p1.add(etiqueta4);

        JLabel etiqueta5 = new JLabel("Que nos permiten conocer más del programa");
        etiqueta5.setForeground(new Color(255, 255, 255));
        etiqueta5.setFont(new Font("Arial", Font.BOLD, 15));
        etiqueta5.setBounds(30, 100, 450, 30);
        p1.add(etiqueta5);

        JLabel etiqueta6 = new JLabel("Esta y todas las anteriores son Labels");
        etiqueta6.setForeground(new Color(255, 255, 255));
        etiqueta6.setFont(new Font("Arial", Font.BOLD, 15));
        etiqueta6.setBounds(30, 130, 450, 30);
        p1.add(etiqueta6);

        Btn = new JButton("Pasar al siguiente widget ➡");
        Btn.setBackground(new Color(255, 255, 255));
        Btn.setForeground(new Color(0, 0, 0));
        Btn.setBounds(30, 200, 225, 40);
        p1.add(Btn);



        ActionListener Bot = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Check v3 = new Check();
                v3.setVisible(true);
                Wlab v2 = new Wlab();
                v2.setVisible(false);
                v2.dispose();


            }
        };

        Btn.addActionListener(Bot);




    }
}
