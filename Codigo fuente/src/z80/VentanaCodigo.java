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
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import nl.grauw.glass.Source;
import nl.grauw.glass.SourceBuilder;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 *
 * @author Zylfrox
 */
public class VentanaCodigo extends javax.swing.JFrame {
   
    public VentanaCodigo() {
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
        CodigoTextArea = new javax.swing.JTextArea();
        RelocCode = new javax.swing.JScrollPane();
        DebugTextArea = new javax.swing.JTextArea();
        compilarButton = new javax.swing.JButton();
        ScrollNumerText = new javax.swing.JScrollPane();
        NumberTextArea = new javax.swing.JTextArea();
        ficheroDireccion = new javax.swing.JTextField();
        buscarBoton = new javax.swing.JButton();
        guardarFichero = new javax.swing.JButton();
        guardarASBBtn = new javax.swing.JButton();

        CodigoTextArea.setColumns(20);
        CodigoTextArea.setRows(5);
        CodigoTextArea.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                CodigoTextAreaCaretUpdate(evt);
            }
        });
        CodigoTextArea.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                CodigoTextAreaPropertyChange(evt);
            }
        });
        CodigoTextArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CodigoTextAreaKeyPressed(evt);
            }
        });
        AssemblerTextEditor.setViewportView(CodigoTextArea);

        DebugTextArea.setColumns(20);
        DebugTextArea.setRows(5);
        RelocCode.setViewportView(DebugTextArea);

        compilarButton.setText("Compilar");
        compilarButton.setEnabled(false);
        compilarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compilarButtonActionPerformed(evt);
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

        guardarASBBtn.setText("Guardar Assembler");
        guardarASBBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarASBBtnActionPerformed(evt);
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
                    .addComponent(RelocCode)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(guardarASBBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buscarBoton)
                        .addGap(18, 18, 18)
                        .addComponent(guardarFichero, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(compilarButton, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ScrollNumerText, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AssemblerTextEditor)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarBoton)
                    .addComponent(guardarFichero)
                    .addComponent(compilarButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RelocCode, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(guardarASBBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NumberTextAreaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_NumberTextAreaCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_NumberTextAreaCaretUpdate

    private void CodigoTextAreaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CodigoTextAreaKeyPressed

        // TODO add your handling code here:
    }//GEN-LAST:event_CodigoTextAreaKeyPressed

    private void CodigoTextAreaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_CodigoTextAreaPropertyChange

    }//GEN-LAST:event_CodigoTextAreaPropertyChange

    private void CodigoTextAreaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_CodigoTextAreaCaretUpdate
        String texto = CodigoTextArea.getText();
        String[] textopartido = texto.split("\n");
        String Numeros = "";
        
        for (int i = 0; i < textopartido.length; i++) {
            Numeros = Numeros +i+"\n";
        }
        NumberTextArea.setText(Numeros);
        for (int i = 0; i < textopartido.length; i++) {
            String[] inst= textopartido[i].split(",");
        }
        
        
    }//GEN-LAST:event_CodigoTextAreaCaretUpdate

    private void compilarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compilarButtonActionPerformed
        String text = "";
        String codigo = this.CodigoTextArea.getText();
        mafeLexer lexer = new mafeLexer(CharStreams.fromString(codigo));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        mafeParser parser = new mafeParser(tokens);
        ParseTree tree = parser.program();
        //System.out.println(parser.assembler);
        this.DebugTextArea.setText(parser.assembler);
    }//GEN-LAST:event_compilarButtonActionPerformed

    private void ficheroDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ficheroDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ficheroDireccionActionPerformed

    private void buscarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBotonActionPerformed
        try {
            JFileChooser chooser = new JFileChooser();
            chooser.setDialogTitle(buscarBoton.getText());
            FileFilter filter = new FileNameExtensionFilter("MAFE MA files(*.ma)", "ma");
            chooser.setFileFilter(filter);
            chooser.showOpenDialog(this);
            File f = chooser.getSelectedFile();
            Scanner sc = new Scanner(f);
            String text = "";
            while (sc.hasNextLine()) { 
                text += sc.nextLine()+"\n";
            }
            this.CodigoTextArea.setText(text);
            ficheroDireccion.setText(f.getAbsolutePath());
            if(!ficheroDireccion.getText().equals("")){
                this.guardarFichero.setEnabled(true);
                this.compilarButton.setEnabled(true);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(VentanaCodigo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buscarBotonActionPerformed

    private void guardarFicheroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarFicheroActionPerformed
        String text = "El archivo no se ha podido Guardar";
        try {
            text = "Archivo guardado exitosamente";
            FileWriter fw=new FileWriter(ficheroDireccion.getText());
            for (int i = 0; i < this.CodigoTextArea.getText().length(); i++) 
            fw.write(this.CodigoTextArea.getText().charAt(i)); 
            fw.close();
            
            this.DebugTextArea.setText(text);
        } catch (IOException ex) {
            Logger.getLogger(VentanaCodigo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_guardarFicheroActionPerformed

    private void guardarASBBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarASBBtnActionPerformed
        JFileChooser guardar = new JFileChooser();
        guardar.showSaveDialog(null);
        guardar.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        
        File archivo = guardar.getSelectedFile();
        try {
            this.guardarFichero(this.DebugTextArea.getText(), archivo);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(VentanaCodigo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_guardarASBBtnActionPerformed
    
    
    public void guardarFichero(String cadena, File archivo) throws FileNotFoundException{
    FileWriter escribir;
    PrintWriter writer = new PrintWriter(archivo);
    writer.print("");
    writer.close();
    try {
        escribir = new FileWriter(archivo, true);
        escribir.write(cadena);
        escribir.close();
    } catch (FileNotFoundException ex) {
        JOptionPane.showMessageDialog(null, "Error al guardar, ponga nombre al archivo");
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Error al guardar, en la salida");
    }
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
    private javax.swing.JScrollPane AssemblerTextEditor;
    private javax.swing.JTextArea CodigoTextArea;
    private javax.swing.JTextArea DebugTextArea;
    private javax.swing.JTextArea NumberTextArea;
    private javax.swing.JScrollPane RelocCode;
    private javax.swing.JScrollPane ScrollNumerText;
    private javax.swing.JButton buscarBoton;
    private javax.swing.JButton compilarButton;
    public static javax.swing.JTextField ficheroDireccion;
    private javax.swing.JButton guardarASBBtn;
    private javax.swing.JButton guardarFichero;
    // End of variables declaration//GEN-END:variables
}
