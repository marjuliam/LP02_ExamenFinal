/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package z80;

import java.io.File;

/**
 *
 * @author Zylfrox
 */
public class VentanaMain extends javax.swing.JFrame {
    public static VentanaMemoria memoria = new VentanaMemoria();
    public static VentanaAssembler assembler = new VentanaAssembler();
    public static VentanaCodigo codigo = new VentanaCodigo();
   
    /**
     * Creates new form VentanaM
     */
    public VentanaMain() {
        initComponents();
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        F_Value = new javax.swing.JTextField();
        F1_Value = new javax.swing.JTextField();
        A_Value = new javax.swing.JTextField();
        A1_Value = new javax.swing.JTextField();
        IX_Value = new javax.swing.JTextField();
        IY_Value = new javax.swing.JTextField();
        SP_Value = new javax.swing.JTextField();
        PC_Value = new javax.swing.JTextField();
        B_Value = new javax.swing.JTextField();
        D_Value = new javax.swing.JTextField();
        H_Value = new javax.swing.JTextField();
        C_Value = new javax.swing.JTextField();
        E_Value = new javax.swing.JTextField();
        L_Value = new javax.swing.JTextField();
        B1_Value = new javax.swing.JTextField();
        D1_Value = new javax.swing.JTextField();
        H1_Value = new javax.swing.JTextField();
        C1_Value = new javax.swing.JTextField();
        E1_Value = new javax.swing.JTextField();
        L1_Value = new javax.swing.JTextField();
        I_Value = new javax.swing.JTextField();
        R_Value = new javax.swing.JTextField();
        BtnExecute = new javax.swing.JButton();
        cargarAssembler = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        cyclesNumber = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Imagen = new javax.swing.JLabel();
        BarraMenu = new javax.swing.JMenuBar();
        MenuCodigo = new javax.swing.JMenu();
        MenuAssembler = new javax.swing.JMenu();
        MenuMemoria = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Z80 Emulador");
        setMaximumSize(new java.awt.Dimension(930, 650));
        setMinimumSize(new java.awt.Dimension(930, 650));
        setPreferredSize(new java.awt.Dimension(930, 650));
        setResizable(false);
        getContentPane().setLayout(null);

        F_Value.setEditable(false);
        F_Value.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        F_Value.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        F_Value.setText("00");
        F_Value.setMinimumSize(new java.awt.Dimension(80, 80));
        F_Value.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F_ValueActionPerformed(evt);
            }
        });
        getContentPane().add(F_Value);
        F_Value.setBounds(820, 150, 30, 20);

        F1_Value.setEditable(false);
        F1_Value.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        F1_Value.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        F1_Value.setText("00");
        F1_Value.setMinimumSize(new java.awt.Dimension(80, 80));
        F1_Value.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F1_ValueActionPerformed(evt);
            }
        });
        getContentPane().add(F1_Value);
        F1_Value.setBounds(820, 180, 30, 20);

        A_Value.setEditable(false);
        A_Value.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        A_Value.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A_Value.setText("00");
        A_Value.setMinimumSize(new java.awt.Dimension(80, 80));
        A_Value.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A_ValueActionPerformed(evt);
            }
        });
        getContentPane().add(A_Value);
        A_Value.setBounds(730, 150, 30, 20);

        A1_Value.setEditable(false);
        A1_Value.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        A1_Value.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A1_Value.setText("00");
        A1_Value.setMinimumSize(new java.awt.Dimension(80, 80));
        A1_Value.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A1_ValueActionPerformed(evt);
            }
        });
        getContentPane().add(A1_Value);
        A1_Value.setBounds(730, 180, 30, 20);

        IX_Value.setEditable(false);
        IX_Value.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        IX_Value.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        IX_Value.setText("0000");
        IX_Value.setMinimumSize(new java.awt.Dimension(80, 80));
        IX_Value.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IX_ValueActionPerformed(evt);
            }
        });
        getContentPane().add(IX_Value);
        IX_Value.setBounds(440, 270, 60, 20);

        IY_Value.setEditable(false);
        IY_Value.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        IY_Value.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        IY_Value.setText("0000");
        IY_Value.setMinimumSize(new java.awt.Dimension(80, 80));
        IY_Value.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IY_ValueActionPerformed(evt);
            }
        });
        getContentPane().add(IY_Value);
        IY_Value.setBounds(440, 300, 60, 20);

        SP_Value.setEditable(false);
        SP_Value.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        SP_Value.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SP_Value.setText("0000");
        SP_Value.setMinimumSize(new java.awt.Dimension(80, 80));
        SP_Value.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SP_ValueActionPerformed(evt);
            }
        });
        getContentPane().add(SP_Value);
        SP_Value.setBounds(440, 330, 60, 20);

        PC_Value.setEditable(false);
        PC_Value.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        PC_Value.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PC_Value.setText("0000");
        PC_Value.setMinimumSize(new java.awt.Dimension(80, 80));
        PC_Value.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PC_ValueActionPerformed(evt);
            }
        });
        getContentPane().add(PC_Value);
        PC_Value.setBounds(440, 360, 60, 20);

        B_Value.setEditable(false);
        B_Value.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        B_Value.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        B_Value.setText("00");
        B_Value.setMinimumSize(new java.awt.Dimension(80, 80));
        B_Value.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_ValueActionPerformed(evt);
            }
        });
        getContentPane().add(B_Value);
        B_Value.setBounds(500, 170, 30, 20);

        D_Value.setEditable(false);
        D_Value.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        D_Value.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        D_Value.setText("00");
        D_Value.setMinimumSize(new java.awt.Dimension(80, 80));
        D_Value.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D_ValueActionPerformed(evt);
            }
        });
        getContentPane().add(D_Value);
        D_Value.setBounds(500, 210, 30, 20);

        H_Value.setEditable(false);
        H_Value.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        H_Value.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        H_Value.setText("00");
        H_Value.setMinimumSize(new java.awt.Dimension(80, 80));
        H_Value.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H_ValueActionPerformed(evt);
            }
        });
        getContentPane().add(H_Value);
        H_Value.setBounds(500, 240, 30, 20);

        C_Value.setEditable(false);
        C_Value.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        C_Value.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        C_Value.setText("00");
        C_Value.setMinimumSize(new java.awt.Dimension(80, 80));
        C_Value.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_ValueActionPerformed(evt);
            }
        });
        getContentPane().add(C_Value);
        C_Value.setBounds(560, 170, 30, 20);

        E_Value.setEditable(false);
        E_Value.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        E_Value.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        E_Value.setText("00");
        E_Value.setMinimumSize(new java.awt.Dimension(80, 80));
        E_Value.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E_ValueActionPerformed(evt);
            }
        });
        getContentPane().add(E_Value);
        E_Value.setBounds(560, 210, 30, 20);

        L_Value.setEditable(false);
        L_Value.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        L_Value.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        L_Value.setText("00");
        L_Value.setMinimumSize(new java.awt.Dimension(80, 80));
        L_Value.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L_ValueActionPerformed(evt);
            }
        });
        getContentPane().add(L_Value);
        L_Value.setBounds(560, 240, 30, 20);

        B1_Value.setEditable(false);
        B1_Value.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        B1_Value.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        B1_Value.setText("00");
        B1_Value.setMinimumSize(new java.awt.Dimension(80, 80));
        B1_Value.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1_ValueActionPerformed(evt);
            }
        });
        getContentPane().add(B1_Value);
        B1_Value.setBounds(360, 170, 30, 20);

        D1_Value.setEditable(false);
        D1_Value.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        D1_Value.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        D1_Value.setText("00");
        D1_Value.setMinimumSize(new java.awt.Dimension(80, 80));
        D1_Value.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D1_ValueActionPerformed(evt);
            }
        });
        getContentPane().add(D1_Value);
        D1_Value.setBounds(360, 210, 30, 20);

        H1_Value.setEditable(false);
        H1_Value.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        H1_Value.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        H1_Value.setText("00");
        H1_Value.setMinimumSize(new java.awt.Dimension(80, 80));
        H1_Value.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H1_ValueActionPerformed(evt);
            }
        });
        getContentPane().add(H1_Value);
        H1_Value.setBounds(360, 240, 30, 20);

        C1_Value.setEditable(false);
        C1_Value.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        C1_Value.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        C1_Value.setText("00");
        C1_Value.setMinimumSize(new java.awt.Dimension(80, 80));
        C1_Value.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1_ValueActionPerformed(evt);
            }
        });
        getContentPane().add(C1_Value);
        C1_Value.setBounds(420, 170, 30, 20);

        E1_Value.setEditable(false);
        E1_Value.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        E1_Value.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        E1_Value.setText("00");
        E1_Value.setMinimumSize(new java.awt.Dimension(80, 80));
        E1_Value.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E1_ValueActionPerformed(evt);
            }
        });
        getContentPane().add(E1_Value);
        E1_Value.setBounds(420, 210, 30, 20);

        L1_Value.setEditable(false);
        L1_Value.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        L1_Value.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        L1_Value.setText("00");
        L1_Value.setMinimumSize(new java.awt.Dimension(80, 80));
        L1_Value.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L1_ValueActionPerformed(evt);
            }
        });
        getContentPane().add(L1_Value);
        L1_Value.setBounds(420, 240, 30, 20);

        I_Value.setEditable(false);
        I_Value.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        I_Value.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        I_Value.setText("00");
        I_Value.setMinimumSize(new java.awt.Dimension(80, 80));
        I_Value.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I_ValueActionPerformed(evt);
            }
        });
        getContentPane().add(I_Value);
        I_Value.setBounds(150, 130, 30, 20);

        R_Value.setEditable(false);
        R_Value.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        R_Value.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R_Value.setText("00");
        R_Value.setMinimumSize(new java.awt.Dimension(80, 80));
        R_Value.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_ValueActionPerformed(evt);
            }
        });
        getContentPane().add(R_Value);
        R_Value.setBounds(210, 130, 30, 20);

        BtnExecute.setText("Ejecutar Programa");
        BtnExecute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExecuteActionPerformed(evt);
            }
        });
        getContentPane().add(BtnExecute);
        BtnExecute.setBounds(650, 470, 130, 23);

        cargarAssembler.setText("Cargar Assembler");
        cargarAssembler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarAssemblerActionPerformed(evt);
            }
        });
        getContentPane().add(cargarAssembler);
        cargarAssembler.setBounds(440, 500, 130, 23);

        btnReset.setText("Reiniciar Z80");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset);
        btnReset.setBounds(440, 470, 130, 23);

        cyclesNumber.setText("4");
        getContentPane().add(cyclesNumber);
        cyclesNumber.setBounds(650, 500, 130, 20);

        jLabel1.setText("Ciclos de CPU:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(580, 500, 70, 20);

        Imagen.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Imagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/z80/asd.png"))); // NOI18N
        getContentPane().add(Imagen);
        Imagen.setBounds(10, 10, 912, 559);

        MenuCodigo.setText("Editor de Código");
        MenuCodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuCodigoMouseClicked(evt);
            }
        });
        BarraMenu.add(MenuCodigo);

        MenuAssembler.setText("Editor de Assembler");
        MenuAssembler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuAssemblerMouseClicked(evt);
            }
        });
        BarraMenu.add(MenuAssembler);

        MenuMemoria.setText("Editor de Memoria Z80 y DEBUG");
        MenuMemoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuMemoriaMouseClicked(evt);
            }
        });
        BarraMenu.add(MenuMemoria);

        setJMenuBar(BarraMenu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void F_ValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F_ValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_F_ValueActionPerformed

    private void F1_ValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F1_ValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_F1_ValueActionPerformed

    private void E_ValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E_ValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_E_ValueActionPerformed

    private void A1_ValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A1_ValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A1_ValueActionPerformed

    private void PC_ValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PC_ValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PC_ValueActionPerformed

    private void IY_ValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IY_ValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IY_ValueActionPerformed

    private void A_ValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A_ValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A_ValueActionPerformed

    private void L_ValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L_ValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_L_ValueActionPerformed

    private void D_ValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D_ValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D_ValueActionPerformed

    private void C_ValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_ValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C_ValueActionPerformed

    private void H_ValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H_ValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_H_ValueActionPerformed

    private void H1_ValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H1_ValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_H1_ValueActionPerformed

    private void B_ValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_ValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B_ValueActionPerformed

    private void D1_ValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D1_ValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D1_ValueActionPerformed

    private void E1_ValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E1_ValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_E1_ValueActionPerformed

    private void IX_ValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IX_ValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IX_ValueActionPerformed

    private void SP_ValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SP_ValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SP_ValueActionPerformed

    private void C1_ValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1_ValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C1_ValueActionPerformed

    private void B1_ValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1_ValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B1_ValueActionPerformed

    private void L1_ValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L1_ValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_L1_ValueActionPerformed

    private void I_ValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I_ValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_I_ValueActionPerformed

    private void R_ValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_ValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R_ValueActionPerformed

    private void MenuMemoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMemoriaMouseClicked
       
       memoria.setTitle("Editor de Memoria");
       memoria.setVisible(true);
    }//GEN-LAST:event_MenuMemoriaMouseClicked

    private void MenuAssemblerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuAssemblerMouseClicked
        assembler.setTitle("Editor de Assembler");
        assembler.setVisible(true);
    }//GEN-LAST:event_MenuAssemblerMouseClicked

    private void BtnExecuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExecuteActionPerformed
        memoria.model.z80.setDebug(true);
        memoria.model.actualizarTablaMemoria();
        int ciclos = Integer.parseInt(this.cyclesNumber.getText());
        memoria.model.z80.exec(ciclos);
        memoria.ActualizarVistaMemoria();
        memoria.DebugTextArea.setText(memoria.model.z80.DebugText);
        this.actualizaVistaVariables();
    }//GEN-LAST:event_BtnExecuteActionPerformed

    private void cargarAssemblerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarAssemblerActionPerformed
        // TODO add your handling code here:
        memoria.model.z80.memory = assembler.memory;
        memoria.model.actualizarTablaMemoria();
        memoria.ActualizarVistaMemoria();
    }//GEN-LAST:event_cargarAssemblerActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        memoria.model.z80.reset();
        this.A_Value.setText(hexa8(memoria.model.z80.A));
        this.B_Value.setText(hexa8(memoria.model.z80.B));       
        this.C_Value.setText(hexa8(memoria.model.z80.C));       
        this.D_Value.setText(hexa8(memoria.model.z80.D));
        this.E_Value.setText(hexa8(memoria.model.z80.E));
        this.F_Value.setText(hexa8(memoria.model.z80.F));
        this.H_Value.setText(hexa8(memoria.model.z80.H));
        this.L_Value.setText(hexa8(memoria.model.z80.L));
        
        this.I_Value.setText(hexa8(memoria.model.z80.I));
        this.R_Value.setText(hexa8(memoria.model.z80.R));
        
        this.A1_Value.setText(hexa8(memoria.model.z80.A1));
        this.B1_Value.setText(hexa8(memoria.model.z80.B1));       
        this.C1_Value.setText(hexa8(memoria.model.z80.C1));       
        this.D1_Value.setText(hexa8(memoria.model.z80.D1));
        this.E1_Value.setText(hexa8(memoria.model.z80.E1));
        this.F1_Value.setText(hexa8(memoria.model.z80.F1));
        this.H1_Value.setText(hexa8(memoria.model.z80.H1));
        this.L1_Value.setText(hexa8(memoria.model.z80.L1));
        
        this.IX_Value.setText(hexa16(memoria.model.z80.IX));
        this.IY_Value.setText(hexa16(memoria.model.z80.IY));
        this.SP_Value.setText(hexa16(memoria.model.z80.SP));
        this.PC_Value.setText(hexa16(memoria.model.z80.PC));
        memoria.setVisible(false);
        memoria = new VentanaMemoria();
    }//GEN-LAST:event_btnResetActionPerformed

    private void MenuCodigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuCodigoMouseClicked
        codigo.setTitle("Editor de Codigo");
        codigo.setVisible(true);
    }//GEN-LAST:event_MenuCodigoMouseClicked
    public void actualizaVistaVariables(){
        this.A_Value.setText(hexa8(memoria.model.z80.A));
        this.B_Value.setText(hexa8(memoria.model.z80.B));       
        this.C_Value.setText(hexa8(memoria.model.z80.C));       
        this.D_Value.setText(hexa8(memoria.model.z80.D));
        this.E_Value.setText(hexa8(memoria.model.z80.E));
        this.F_Value.setText(hexa8(memoria.model.z80.F));
        this.H_Value.setText(hexa8(memoria.model.z80.H));
        this.L_Value.setText(hexa8(memoria.model.z80.L));
        
        this.I_Value.setText(hexa8(memoria.model.z80.I));
        this.R_Value.setText(hexa8(memoria.model.z80.R));
        
        this.A1_Value.setText(hexa8(memoria.model.z80.A1));
        this.B1_Value.setText(hexa8(memoria.model.z80.B1));       
        this.C1_Value.setText(hexa8(memoria.model.z80.C1));       
        this.D1_Value.setText(hexa8(memoria.model.z80.D1));
        this.E1_Value.setText(hexa8(memoria.model.z80.E1));
        this.F1_Value.setText(hexa8(memoria.model.z80.F1));
        this.H1_Value.setText(hexa8(memoria.model.z80.H1));
        this.L1_Value.setText(hexa8(memoria.model.z80.L1));
        
        this.IX_Value.setText(hexa16(memoria.model.z80.IX));
        this.IY_Value.setText(hexa16(memoria.model.z80.IY));
        this.SP_Value.setText(hexa16(memoria.model.z80.SP));
        this.PC_Value.setText(hexa16(memoria.model.z80.PC));
    }
    
    
    
public int number(String Hexa){
    int number =Integer.parseInt(Hexa,16); 
    return number;
}
    
public String hexa16(int integer){
    String hex = Integer.toHexString(integer);
    if(hex.length()==1){
        hex = "000"+hex;
    }
    if(hex.length()==2){
        hex = "00"+hex;
    }
    if(hex.length()==3){
        hex = "0"+hex;
    }
    return hex.toUpperCase();
}
    
public String hexa8(int integer){
    String hex = Integer.toHexString(integer);
    if(hex.length()==1){
        hex = "0"+hex;
    }
    return hex.toUpperCase();
}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField A1_Value;
    private javax.swing.JTextField A_Value;
    private javax.swing.JTextField B1_Value;
    private javax.swing.JTextField B_Value;
    private javax.swing.JMenuBar BarraMenu;
    private javax.swing.JButton BtnExecute;
    private javax.swing.JTextField C1_Value;
    private javax.swing.JTextField C_Value;
    private javax.swing.JTextField D1_Value;
    private javax.swing.JTextField D_Value;
    private javax.swing.JTextField E1_Value;
    private javax.swing.JTextField E_Value;
    private javax.swing.JTextField F1_Value;
    private javax.swing.JTextField F_Value;
    private javax.swing.JTextField H1_Value;
    private javax.swing.JTextField H_Value;
    private javax.swing.JTextField IX_Value;
    private javax.swing.JTextField IY_Value;
    private javax.swing.JTextField I_Value;
    private javax.swing.JLabel Imagen;
    private javax.swing.JTextField L1_Value;
    private javax.swing.JTextField L_Value;
    private javax.swing.JMenu MenuAssembler;
    private javax.swing.JMenu MenuCodigo;
    private javax.swing.JMenu MenuMemoria;
    private javax.swing.JTextField PC_Value;
    private javax.swing.JTextField R_Value;
    private javax.swing.JTextField SP_Value;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton cargarAssembler;
    private javax.swing.JTextField cyclesNumber;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
