/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package z80;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import nl.grauw.glass.Source;
import nl.grauw.glass.SourceBuilder;

/**
 *
 * @author Zylfrox
 */
public class VentanaAssembler extends javax.swing.JFrame {
    public int memory[] = new int[0x10000];
    /**
     * Creates new form VentanaAssembler
     */
    public VentanaAssembler() {
        try {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Windows".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaMemoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaMemoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaMemoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaMemoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AssemblerTextEditor = new javax.swing.JScrollPane();
        AssemblerTextArea = new javax.swing.JTextArea();
        RelocCode = new javax.swing.JScrollPane();
        RelocTextArea = new javax.swing.JTextArea();
        AssembleButton = new javax.swing.JButton();
        ScrollNumerText = new javax.swing.JScrollPane();
        NumberTextArea = new javax.swing.JTextArea();
        ficheroDireccion = new javax.swing.JTextField();
        buscarBoton = new javax.swing.JButton();
        guardarFichero = new javax.swing.JButton();

        AssemblerTextArea.setColumns(20);
        AssemblerTextArea.setRows(5);
        AssemblerTextArea.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                AssemblerTextAreaCaretUpdate(evt);
            }
        });
        AssemblerTextArea.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                AssemblerTextAreaPropertyChange(evt);
            }
        });
        AssemblerTextArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AssemblerTextAreaKeyPressed(evt);
            }
        });
        AssemblerTextEditor.setViewportView(AssemblerTextArea);

        RelocTextArea.setEditable(false);
        RelocTextArea.setColumns(20);
        RelocTextArea.setRows(5);
        RelocCode.setViewportView(RelocTextArea);

        AssembleButton.setText("Assemble");
        AssembleButton.setEnabled(false);
        AssembleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AssembleButtonActionPerformed(evt);
            }
        });

        ScrollNumerText.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        ScrollNumerText.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        NumberTextArea.setEditable(false);
        NumberTextArea.setColumns(20);
        NumberTextArea.setRows(5);
        NumberTextArea.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                NumberTextAreaCaretUpdate(evt);
            }
        });
        ScrollNumerText.setViewportView(NumberTextArea);

        ficheroDireccion.setEditable(false);
        ficheroDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ficheroDireccionActionPerformed(evt);
            }
        });

        buscarBoton.setText("Abrir Archivo");
        buscarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBotonActionPerformed(evt);
            }
        });

        guardarFichero.setText("Guardar Archivo");
        guardarFichero.setEnabled(false);
        guardarFichero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarFicheroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ficheroDireccion)
                    .addComponent(RelocCode, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ScrollNumerText, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AssemblerTextEditor, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buscarBoton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(guardarFichero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AssembleButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ScrollNumerText, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(AssemblerTextEditor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ficheroDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarBoton)
                    .addComponent(guardarFichero)
                    .addComponent(AssembleButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RelocCode, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NumberTextAreaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_NumberTextAreaCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_NumberTextAreaCaretUpdate

    private void AssemblerTextAreaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AssemblerTextAreaKeyPressed

        // TODO add your handling code here:
    }//GEN-LAST:event_AssemblerTextAreaKeyPressed

    private void AssemblerTextAreaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_AssemblerTextAreaPropertyChange

    }//GEN-LAST:event_AssemblerTextAreaPropertyChange

    private void AssemblerTextAreaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_AssemblerTextAreaCaretUpdate
        String texto = AssemblerTextArea.getText();
        String[] textopartido = texto.split("\n");
        String Numeros = "";
        
        for (int i = 0; i < textopartido.length; i++) {
            Numeros = Numeros +i+"\n";
        }
        NumberTextArea.setText(Numeros);
        for (int i = 0; i < textopartido.length; i++) {
            String[] inst= textopartido[i].split(",");
        }
        
        
    }//GEN-LAST:event_AssemblerTextAreaCaretUpdate

    private void AssembleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AssembleButtonActionPerformed
        String assembler = this.AssemblerTextArea.getText();
        StringBuilder builder = new StringBuilder();
        builder.append(assembler).append("\n");
        
        SourceBuilder sourceBuilder = new SourceBuilder(new ArrayList<File>());
        Source source = sourceBuilder.parse(new StringReader(builder.toString()), null);
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        
        this.RelocTextArea.setText("Error Compilando Assembler");
        String text;
        try {
            source.assemble(output);
            byte[] byteArray = output.toByteArray();
            text = "Compilado:\n";
            for (int i = 0; i < byteArray.length; i++){
                byte b = byteArray[i];
                String st = String.format("%02X", b);
                text+= "Dir Mem: "+hexa16(i)+" | Inst Maq:"+st+"\n";
                //System.out.print(st+" ");
                int value = b & 0xFF;
                this.memory[i] = value;
            }
            this.RelocTextArea.setText(text);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        
    }//GEN-LAST:event_AssembleButtonActionPerformed

    private void ficheroDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ficheroDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ficheroDireccionActionPerformed

    private void buscarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBotonActionPerformed
        try {
            JFileChooser chooser = new JFileChooser();
            chooser.setDialogTitle(buscarBoton.getText());
            FileFilter filter = new FileNameExtensionFilter("Assembler ASM files(*.asm)", "asm");
            chooser.setFileFilter(filter);
            chooser.showOpenDialog(this);
            File f = chooser.getSelectedFile();
            Scanner sc = new Scanner(f);
            String text = "";
            while (sc.hasNextLine()) { 
                text += sc.nextLine()+"\n";
            }
            this.AssemblerTextArea.setText(text);
            ficheroDireccion.setText(f.getAbsolutePath());
            if(!ficheroDireccion.getText().equals("")){
                this.guardarFichero.setEnabled(true);
                this.AssembleButton.setEnabled(true);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(VentanaAssembler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buscarBotonActionPerformed

    private void guardarFicheroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarFicheroActionPerformed
        String text = "El archivo no se ha podido Guardar";
        try {
            text = "Archivo guardado exitosamente";
            FileWriter fw=new FileWriter(ficheroDireccion.getText());
            for (int i = 0; i < this.AssemblerTextArea.getText().length(); i++) 
            fw.write(this.AssemblerTextArea.getText().charAt(i)); 
            fw.close();
            this.RelocTextArea.setText(text);
        } catch (IOException ex) {
            Logger.getLogger(VentanaAssembler.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_guardarFicheroActionPerformed
    
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
        hex = hex.toUpperCase();
        return hex;
    }
    /**
     * @param args the command line arguments
     */
    /*
    public static void main(String args[]) {
       

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaAssembler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAssembler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAssembler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAssembler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAssembler().setVisible(true);
            }
        });
    }
*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AssembleButton;
    private javax.swing.JTextArea AssemblerTextArea;
    private javax.swing.JScrollPane AssemblerTextEditor;
    private javax.swing.JTextArea NumberTextArea;
    private javax.swing.JScrollPane RelocCode;
    private javax.swing.JTextArea RelocTextArea;
    private javax.swing.JScrollPane ScrollNumerText;
    private javax.swing.JButton buscarBoton;
    public static javax.swing.JTextField ficheroDireccion;
    private javax.swing.JButton guardarFichero;
    // End of variables declaration//GEN-END:variables
}
