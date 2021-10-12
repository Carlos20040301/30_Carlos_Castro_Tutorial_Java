package com.widgets;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Wcombo extends JFrame {
    private JPanel p1;
    private JComboBox b1;
    private JComboBox b2;
    private JComboBox b3;
    private JButton com;



    private String dias[]
            = { "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31" };

    private String meses[]
            = { "Enero", "Febrero", "Marzo", "Abril",
            "Mayo", "Junio", "Julio", "Agosto",
            "Septiembre", "Octubre", "Noviembre", "Diciembre" };

    private String años[]
            = { "1980","1981","1982","1983","1984","1985","1986","1987","1988","1989",
            "1990","1991","1992","1993","1994","1995","1996","1997","1998","1999",
            "2000","2001","2002","2003","2004","2005","2006","2007","2008","2009",

            };

    private JButton Btn;


    public Wcombo() {
        setBounds(20, 20, 600, 400);
        setTitle("ComboBox");
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

        JLabel etiqueta = new JLabel("Los ComboBox son widgets que contienen cadenas de caracteres");
        etiqueta.setForeground(new Color(255, 255, 255));
        etiqueta.setFont(new Font("Arial", Font.BOLD, 15));
        etiqueta.setBounds(30, 10, 450, 30);
        p1.add(etiqueta);

        JLabel etiqueta3 = new JLabel("Estos widgets se usan en formularios");
        etiqueta3.setForeground(new Color(255, 255, 255));
        etiqueta3.setFont(new Font("Arial", Font.BOLD, 15));
        etiqueta3.setBounds(30, 40, 400, 30);
        p1.add(etiqueta3);

        JLabel etiqueta4 = new JLabel("Y sus opciones son pre definidas por el desarrollador");
        etiqueta4.setForeground(new Color(255, 255, 255));
        etiqueta4.setFont(new Font("Arial", Font.BOLD, 15));
        etiqueta4.setBounds(30, 70, 450, 30);
        p1.add(etiqueta4);


        JLabel etiqueta2 = new JLabel("Ingresa tu Fecha de nacimiento");
        etiqueta2.setForeground(new Color(255, 255, 255));
        etiqueta2.setFont(new Font("Arial", Font.BOLD, 15));
        etiqueta2.setBounds(30, 150, 250, 30);
        p1.add(etiqueta2);

        b1 = new JComboBox(dias);
        b1.setBackground(new Color(255, 255, 255));
        b1.setForeground(new Color(0, 0, 0));
        b1.setBounds(30, 180, 70, 40);
        p1.add(b1);

        b2 = new JComboBox(meses);
        b2.setBackground(new Color(255, 255, 255));
        b2.setForeground(new Color(0, 0, 0));
        b2.setBounds(110, 180, 70, 40);
        p1.add(b2);

        b3 = new JComboBox(años);
        b3.setBackground(new Color(255, 255, 255));
        b3.setForeground(new Color(0, 0, 0));
        b3.setBounds(190, 180, 70, 40);
        p1.add(b3);

        com = new JButton("Enviar información");
        com.setBackground(new Color(255, 255, 255));
        com.setForeground(new Color(0, 0, 0));
        com.setBounds(30, 250, 250, 40);
        p1.add(com);


        Btn = new JButton("Pasar al siguiente widget ➡");
        Btn.setBackground(new Color(255, 255, 255));
        Btn.setForeground(new Color(0, 0, 0));
        Btn.setBounds(300, 210, 225, 40);
        p1.add(Btn);

        JLabel etiqueta6 = new JLabel(" ");
        etiqueta6.setForeground(new Color(255, 255, 255));
        etiqueta6.setFont(new Font("Arial", Font.BOLD, 15));
        etiqueta6.setBounds(30, 310, 480, 30);
        p1.add(etiqueta6);



        ActionListener radio3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a =  b3.getSelectedIndex();

                if(a<10){
                    etiqueta6.setText("Naciste en la decada que se lanzó el primer computador personal");

                }else if (a<20){
                    etiqueta6.setText("Naciste en la misma decada de Dolly, la primer oveja clonada");
                }else{
                    etiqueta6.setText("En esta decada naciste junto a Wikipedia");
                }


            }
        };





        ActionListener Bot = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Box v11 = new Box();
                v11.setVisible(true);
                Wcombo v10 = new Wcombo();
                v10.setVisible(false);
                v10.dispose();
            }
        };

        Btn.addActionListener(Bot);
        com.addActionListener(radio3);




    }
}
