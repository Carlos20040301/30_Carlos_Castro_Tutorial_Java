package com.widgets;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RButton extends JFrame {
    private JPanel p1;
    private JRadioButton r1;
    private JRadioButton r2;
    private JRadioButton r3;
    private JRadioButton r4;
    private JRadioButton r5;
    private JRadioButton r6;
    private JButton Btn;


    public RButton() {
        setBounds(20, 20, 600, 500);
        setTitle("RadioButton");
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

        JLabel etiqueta = new JLabel("Los RadioButton de Java son botones para elegir una opción.");
        etiqueta.setForeground(new Color(255, 255, 255));
        etiqueta.setFont(new Font("Arial", Font.BOLD, 15));
        etiqueta.setBounds(30, 10, 450, 30);
        p1.add(etiqueta);

        JLabel etiqueta3 = new JLabel("Normalmente los puedes encontrar en formularios");
        etiqueta3.setForeground(new Color(255, 255, 255));
        etiqueta3.setFont(new Font("Arial", Font.BOLD, 15));
        etiqueta3.setBounds(30, 40, 400, 30);
        p1.add(etiqueta3);

        JLabel etiqueta4 = new JLabel("Con respuestas predefinidas que pueden generar una acción");
        etiqueta4.setForeground(new Color(255, 255, 255));
        etiqueta4.setFont(new Font("Arial", Font.BOLD, 15));
        etiqueta4.setBounds(30, 70, 450, 30);
        p1.add(etiqueta4);

        JLabel etiqueta5 = new JLabel("O pueden alterar el resultado de tu formulario");
        etiqueta5.setForeground(new Color(255, 255, 255));
        etiqueta5.setFont(new Font("Arial", Font.BOLD, 15));
        etiqueta5.setBounds(30, 95, 450, 30);
        p1.add(etiqueta5);

        JLabel etiqueta2 = new JLabel("¿En que rango de edad estás?");
        etiqueta2.setForeground(new Color(255, 255, 255));
        etiqueta2.setFont(new Font("Arial", Font.BOLD, 15));
        etiqueta2.setBounds(30, 150, 250, 30);
        p1.add(etiqueta2);

        r1 = new JRadioButton("0-10");
        r1.setBackground(new Color(125, 125, 255));
        r1.setForeground(new Color(255, 255, 255));
        r1.setBounds(30, 180, 70, 40);
        p1.add(r1);

        r2 = new JRadioButton("11-15");
        r2.setBackground(new Color(125, 125, 255));
        r2.setForeground(new Color(255, 255, 255));
        r2.setBounds(30, 230, 70, 40);
        p1.add(r2);

        r3 = new JRadioButton("16-22");
        r3.setBackground(new Color(125, 125, 255));
        r3.setForeground(new Color(255, 255, 255));
        r3.setBounds(30, 280, 70, 40);
        p1.add(r3);

        r4 = new JRadioButton("23-50");
        r4.setBackground(new Color(125, 125, 255));
        r4.setForeground(new Color(255, 255, 255));
        r4.setBounds(100, 180, 70, 40);
        p1.add(r4);

        r5 = new JRadioButton("50-70");
        r5.setBackground(new Color(125, 125, 255));
        r5.setForeground(new Color(255, 255, 255));
        r5.setBounds(100, 230, 70, 40);
        p1.add(r5);

        r6 = new JRadioButton("mayor a 71");
        r6.setBackground(new Color(125, 125, 255));
        r6.setForeground(new Color(255, 255, 255));
        r6.setBounds(100, 280, 100, 40);
        p1.add(r6);

        Btn = new JButton("Pasar al siguiente widget ➡");
        Btn.setBackground(new Color(255, 255, 255));
        Btn.setForeground(new Color(0, 0, 0));
        Btn.setBounds(300, 210, 225, 40);
        p1.add(Btn);

        JLabel etiqueta6 = new JLabel(" ");
        etiqueta6.setForeground(new Color(255, 255, 255));
        etiqueta6.setFont(new Font("Arial", Font.BOLD, 15));
        etiqueta6.setBounds(30, 350, 300, 30);
        p1.add(etiqueta6);




        ActionListener radio1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiqueta6.setText("Usted es un niño");
            }
        };

        ActionListener radio2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiqueta6.setText("Usted es un pre-adolecente");
            }
        };

        ActionListener radio3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiqueta6.setText("Usted es un adolecente");
            }
        };

        ActionListener radio4 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiqueta6.setText("Usted es un adulto joven");
            }
        };

        ActionListener radio5 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiqueta6.setText("Usted es un adulto");
            }
        };

        ActionListener radio6 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiqueta6.setText("Usted es una persona de la 3era edad");
            }
        };



        ActionListener Bot = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Wtext v6 = new Wtext();
                v6.setVisible(true);
                RButton v5 = new RButton();
                v5.setVisible(false);
                v5.dispose();
            }
        };

        Btn.addActionListener(Bot);
        r1.addActionListener(radio1);
        r2.addActionListener(radio2);
        r3.addActionListener(radio3);
        r4.addActionListener(radio4);
        r5.addActionListener(radio5);
        r6.addActionListener(radio6);



    }
}
