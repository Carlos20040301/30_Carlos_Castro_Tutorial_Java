package com.widgets;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Wtoggle extends JFrame {
    private JPanel p1;
    private JToggleButton to;
    private JButton Btn;



    public Wtoggle() {
        setBounds(20, 20, 500, 400);
        setTitle("ToggleButton");
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

        JLabel etiqueta = new JLabel("Los ToggleButton son botones boleanos");
        etiqueta.setForeground(new Color(255, 255, 255));
        etiqueta.setFont(new Font("Arial", Font.BOLD, 15));
        etiqueta.setBounds(30, 10, 400, 30);
        p1.add(etiqueta);

        JLabel etiqueta3 = new JLabel("osea que son botones con dos valores 1 o 0");
        etiqueta3.setForeground(new Color(255, 255, 255));
        etiqueta3.setFont(new Font("Arial", Font.BOLD, 15));
        etiqueta3.setBounds(30, 40, 400, 30);
        p1.add(etiqueta3);

        JLabel etiqueta4 = new JLabel("Encendido o apagado");
        etiqueta4.setForeground(new Color(255, 255, 255));
        etiqueta4.setFont(new Font("Arial", Font.BOLD, 15));
        etiqueta4.setBounds(30, 70, 450, 30);
        p1.add(etiqueta4);

        JLabel etiqueta5 = new JLabel("Y este valor no cambiara hasta que lo vuelvas a presionar");
        etiqueta5.setForeground(new Color(255, 255, 255));
        etiqueta5.setFont(new Font("Arial", Font.BOLD, 15));
        etiqueta5.setBounds(30, 100, 450, 30);
        p1.add(etiqueta5);

        JLabel etiqueta2 = new JLabel("Pulse el botón para ver la acción");
        etiqueta2.setForeground(new Color(255, 255, 255));
        etiqueta2.setFont(new Font("Arial", Font.BOLD, 15));
        etiqueta2.setBounds(30, 150, 250, 30);
        p1.add(etiqueta2);

        to = new JToggleButton("PRESIONAMEE!!!");
        to.setBackground(new Color(255, 255, 255));
        to.setForeground(new Color(0, 0, 0));
        to.setBounds(30, 180, 180, 40);
        p1.add(to);



        Btn = new JButton("Pasar al siguiente widget ➡");
        Btn.setBackground(new Color(255, 255, 255));
        Btn.setForeground(new Color(0, 0, 0));
        Btn.setBounds(250, 210, 225, 40);
        p1.add(Btn);




        to.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent itemEvent) {
                int estado = itemEvent.getStateChange();
                if(estado == ItemEvent.SELECTED){
                    to.setText("Encendido");
                    p1.setBackground(Color.WHITE);
                    etiqueta.setForeground(Color.BLACK);
                    etiqueta2.setForeground(Color.BLACK);
                    etiqueta3.setForeground(Color.BLACK);
                    etiqueta4.setForeground(Color.BLACK);
                    etiqueta5.setForeground(Color.BLACK);
                } else {
                    to.setText("Apagado");
                    p1.setBackground(Color.BLACK);
                    etiqueta.setForeground(Color.white);
                    etiqueta2.setForeground(Color.white);
                    etiqueta3.setForeground(Color.white);
                    etiqueta4.setForeground(Color.white);
                    etiqueta5.setForeground(Color.white);
                }
            }
        });



        ActionListener Bot = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                WPanel v9 = new WPanel();
                v9.setVisible(true);
                Wtoggle v8 = new Wtoggle();
                v8.setVisible(false);
                v8.dispose();
            }
        };

        Btn.addActionListener(Bot);





    }
}
