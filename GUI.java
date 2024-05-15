/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.calculadora;
import javax.swing.JFrame;


public class GUI extends javax.swing.JFrame {
     private Calculadora calculadora;

private boolean punto = true;
    private double n1, n2;
    private String operador;
    private String contenido;
    private Double resultado;

    public GUI() {
        initComponents();
         calculadora = new Calculadora();
       this.setLocationRelativeTo(null);
       setTitle("Calculadora");
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setResizable(false);
     operador = "";
   
    }
 private void mostrarResultado(double resultado) {
        jLabel2.setText(sin0(resultado));
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton16 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton0 = new javax.swing.JButton();
        jButtonpunto = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButtonigual = new javax.swing.JButton();
        jButtonmultip = new javax.swing.JButton();
        jButtonresta = new javax.swing.JButton();
        jButtondiv = new javax.swing.JButton();
        jButtonsum = new javax.swing.JButton();
        jButtonclear = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButtoneliminar = new javax.swing.JButton();

        jButton16.setBackground(new java.awt.Color(56, 119, 229));
        jButton16.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jButton16.setText("0");
        jButton16.setOpaque(true);

        jButton15.setBackground(new java.awt.Color(56, 119, 229));
        jButton15.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jButton15.setText("%");
        jButton15.setOpaque(true);

        jButton17.setBackground(new java.awt.Color(56, 119, 229));
        jButton17.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jButton17.setText(".");
        jButton17.setOpaque(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(237, 379));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 21)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));
        jLabel2.setOpaque(true);
        jLabel2.setPreferredSize(new java.awt.Dimension(29, 16));

        jButton0.setBackground(new java.awt.Color(56, 119, 229));
        jButton0.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jButton0.setForeground(new java.awt.Color(255, 255, 255));
        jButton0.setText("0");
        jButton0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton0.setOpaque(true);
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0ActionPerformed(evt);
            }
        });

        jButtonpunto.setBackground(new java.awt.Color(56, 119, 229));
        jButtonpunto.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jButtonpunto.setForeground(new java.awt.Color(255, 255, 255));
        jButtonpunto.setText(".");
        jButtonpunto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButtonpunto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonpunto.setOpaque(true);
        jButtonpunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonpuntoActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(56, 119, 229));
        jButton3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("3");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setOpaque(true);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(56, 119, 229));
        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("1");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(56, 119, 229));
        jButton9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("9");
        jButton9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton9.setOpaque(true);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(56, 119, 229));
        jButton7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("7");
        jButton7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setOpaque(true);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(56, 119, 229));
        jButton8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("8");
        jButton8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.setOpaque(true);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(56, 119, 229));
        jButton6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("6");
        jButton6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setOpaque(true);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(56, 119, 229));
        jButton4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("4");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setOpaque(true);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(56, 119, 229));
        jButton5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("5");
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setOpaque(true);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButtonigual.setBackground(new java.awt.Color(102, 102, 102));
        jButtonigual.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jButtonigual.setForeground(new java.awt.Color(255, 255, 255));
        jButtonigual.setText("=");
        jButtonigual.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButtonigual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonigual.setOpaque(true);
        jButtonigual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonigualActionPerformed(evt);
            }
        });

        jButtonmultip.setBackground(new java.awt.Color(102, 102, 102));
        jButtonmultip.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jButtonmultip.setForeground(new java.awt.Color(255, 255, 255));
        jButtonmultip.setText("x");
        jButtonmultip.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButtonmultip.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonmultip.setOpaque(true);
        jButtonmultip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonmultipActionPerformed(evt);
            }
        });

        jButtonresta.setBackground(new java.awt.Color(102, 102, 102));
        jButtonresta.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jButtonresta.setForeground(new java.awt.Color(255, 255, 255));
        jButtonresta.setText("-");
        jButtonresta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButtonresta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonresta.setOpaque(true);
        jButtonresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonrestaActionPerformed(evt);
            }
        });

        jButtondiv.setBackground(new java.awt.Color(102, 102, 102));
        jButtondiv.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jButtondiv.setForeground(new java.awt.Color(255, 255, 255));
        jButtondiv.setText("÷");
        jButtondiv.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButtondiv.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtondiv.setOpaque(true);
        jButtondiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtondivActionPerformed(evt);
            }
        });

        jButtonsum.setBackground(new java.awt.Color(102, 102, 102));
        jButtonsum.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jButtonsum.setForeground(new java.awt.Color(255, 255, 255));
        jButtonsum.setText("+");
        jButtonsum.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButtonsum.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonsum.setOpaque(true);
        jButtonsum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsumActionPerformed(evt);
            }
        });

        jButtonclear.setBackground(new java.awt.Color(249, 14, 61));
        jButtonclear.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jButtonclear.setForeground(new java.awt.Color(255, 255, 255));
        jButtonclear.setText("C");
        jButtonclear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButtonclear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonclear.setOpaque(true);
        jButtonclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonclearActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(56, 119, 229));
        jButton2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("2");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setOpaque(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButtoneliminar.setBackground(new java.awt.Color(249, 14, 61));
        jButtoneliminar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jButtoneliminar.setForeground(new java.awt.Color(255, 255, 255));
        jButtoneliminar.setText("D");
        jButtoneliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButtoneliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtoneliminar.setOpaque(true);
        jButtoneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoneliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButtonpunto, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButtonsum, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonigual, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonresta, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addComponent(jButtonmultip, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtondiv, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonclear, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtoneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtondiv, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonmultip, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtoneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonclear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonresta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonsum, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonpunto, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonigual, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private boolean mostrarResultado = false;
    
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if(mostrarResultado){
            jLabel2.setText("8");
            mostrarResultado = false;
        }else{
            jLabel2.setText(jLabel2.getText()+"8");
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButtonigualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonigualActionPerformed
       
    operar();
}
private void operar(String nuevoOperador) {
    operar();
}

private void operar() {
    if (!operador.isEmpty()) {
            try {
                n2 = Double.parseDouble(jLabel2.getText());
                switch (operador) {
                    case "+":
                        resultado = calculadora.sumar(n1, n2);
                        break;
                    case "-":
                        resultado = calculadora.restar(n1, n2);
                        break;
                    case "*":
                        resultado = calculadora.multiplicar(n1, n2);
                        break;
                    case "/":
                        if (n2 == 0) {
                            jLabel2.setText("No se divide entre 0");
                            return;
                        }
                        resultado = calculadora.dividir(n1, n2);
                        break;
                }
                mostrarResultado(resultado);
            } catch (NumberFormatException e) {
                jLabel2.setText("Error: formato incorrecto");
            }
        }
        operador = "";
        mostrarResultado = true;     
    }//GEN-LAST:event_jButtonigualActionPerformed

    private void jButtonsumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsumActionPerformed
      n1 = Double.parseDouble(jLabel2.getText());
        operador = "+";
        jLabel2.setText(""); 
    }//GEN-LAST:event_jButtonsumActionPerformed

    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0ActionPerformed
        if(mostrarResultado){
            jLabel2.setText("0");
            mostrarResultado = false;
        }else{
            jLabel2.setText(jLabel2.getText()+"0");
        }
        
    }//GEN-LAST:event_jButton0ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(mostrarResultado){
            jLabel2.setText("1");
            mostrarResultado = false;
        }else{
            jLabel2.setText(jLabel2.getText()+"1");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(mostrarResultado){
            jLabel2.setText("3");
            mostrarResultado = false;
        }else{
            jLabel2.setText(jLabel2.getText()+"3");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(mostrarResultado){
            jLabel2.setText("4");
            mostrarResultado = false;
        }else{
            jLabel2.setText(jLabel2.getText()+"4");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(mostrarResultado){
            jLabel2.setText("5");
            mostrarResultado = false;
        }else{
            jLabel2.setText(jLabel2.getText()+"5");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(mostrarResultado){
            jLabel2.setText("6");
            mostrarResultado = false;
        }else{
            jLabel2.setText(jLabel2.getText()+"6");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButtonpuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonpuntoActionPerformed
        
       contenido = jLabel2.getText();
       //Si el campo esta vacio muestra "0.1"
       if(contenido.length()<=0){
           jLabel2.setText("0.1");
       } else
           if(jLabel2.getText().contains(".")){
               
           }else { 
               jLabel2.setText (jLabel2.getText()+".");
               punto=false;
           }
           //Solo se puede ingresar 1 punto
         
    }//GEN-LAST:event_jButtonpuntoActionPerformed
        public String sin0(double resultado){
            String retorno="";
            
            retorno=Double.toString(resultado);
            if(resultado%1==0){
                retorno=retorno.substring(0, retorno.length()-2);
            }
            return retorno;
        }
    private void jButtonrestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonrestaActionPerformed
       n1 = Double.parseDouble(jLabel2.getText());
        operador = "-";
        jLabel2.setText("");
    }//GEN-LAST:event_jButtonrestaActionPerformed

    private void jButtonmultipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonmultipActionPerformed
        n1 = Double.parseDouble(jLabel2.getText());
        operador = "*";
        jLabel2.setText("");
    }//GEN-LAST:event_jButtonmultipActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if(mostrarResultado){
            jLabel2.setText("7");
            mostrarResultado = false;
        }else{
            jLabel2.setText(jLabel2.getText()+"7");
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if(mostrarResultado){
            jLabel2.setText("9");
            mostrarResultado = false;
        }else{
            jLabel2.setText(jLabel2.getText()+"9");
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButtonclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonclearActionPerformed
        jLabel2.setText("");
    }//GEN-LAST:event_jButtonclearActionPerformed

    private void jButtondivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtondivActionPerformed
         n1 = Double.parseDouble(jLabel2.getText());
        operador = "/";
        jLabel2.setText("");
    }//GEN-LAST:event_jButtondivActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(mostrarResultado){
            jLabel2.setText("2");
            mostrarResultado = false;
        }else{
            jLabel2.setText(jLabel2.getText()+"2");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtoneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoneliminarActionPerformed
      //Boton borrar
      contenido= jLabel2.getText();
      if(contenido.length()>0){
          contenido=contenido.substring(0, contenido.length()-1);
          jLabel2.setText(contenido);
      }
    }//GEN-LAST:event_jButtoneliminarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonclear;
    private javax.swing.JButton jButtondiv;
    private javax.swing.JButton jButtoneliminar;
    private javax.swing.JButton jButtonigual;
    private javax.swing.JButton jButtonmultip;
    private javax.swing.JButton jButtonpunto;
    private javax.swing.JButton jButtonresta;
    private javax.swing.JButton jButtonsum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
