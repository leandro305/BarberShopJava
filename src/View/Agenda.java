/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.AgendaController;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;

/**
 *
 * @author bigolho16
 */
public class Agenda extends javax.swing.JFrame {

    private final AgendaController controller;

    /**
     * Creates new form Agenda
     */
    public Agenda() {
        initComponents(); // Iniciado pelo netbeans (Form Editor)
        
        initComponentsPeronalizado(); // Iniciado por mim (p/ manipulação dos itens visuais)
        
        this.controller = new AgendaController(this);
        
        iniciar();
    }
    
    
    private void initComponentsPeronalizado() {
        // MANIPULAÇÃO DOS ITENS VISUAIS AQUI
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1Modal = new javax.swing.JInternalFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableAgendamentos = new javax.swing.JTable();
        jButtonAgendar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaObservacao = new javax.swing.JTextArea();
        jComboBoxServico = new javax.swing.JComboBox<>();
        jComboBoxCliente = new javax.swing.JComboBox<>();
        jTextFieldHora = new javax.swing.JTextField();
        jTextFieldValor = new javax.swing.JTextField();
        jTextFieldData = new javax.swing.JTextField();
        jTextFieldId = new javax.swing.JTextField();
        jLabelObservacao = new javax.swing.JLabel();
        jLabelId = new javax.swing.JLabel();
        jLabelCliente = new javax.swing.JLabel();
        jLabelServico = new javax.swing.JLabel();
        jLabelValor = new javax.swing.JLabel();
        jLabelData = new javax.swing.JLabel();
        jLabelHora = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        msg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jInternalFrame1Modal.setVisible(false);
        jInternalFrame1Modal.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jInternalFrame1Modal, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 450, 270));

        jTableAgendamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"0", "Pedro", "Barba", "12", "13/02/2022", "09:00", null, "excluir"},
                {"1", "Joao", "Corte simples", "12", "13/02/2022", "09:30", null, "excluir"}
            },
            new String [] {
                "Id", "Cliente", "Serviços", "Valor", "Data", "Hora", "Observação", "Ação"
            }
        ));
        jTableAgendamentos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(jTableAgendamentos);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 700, 170));

        jButtonAgendar.setForeground(new java.awt.Color(35, 241, 14));
        jButtonAgendar.setText("Agendar");
        jButtonAgendar.setToolTipText("");
        jButtonAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgendarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAgendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 270, -1));

        jTextAreaObservacao.setColumns(20);
        jTextAreaObservacao.setRows(5);
        jScrollPane1.setViewportView(jTextAreaObservacao);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 270, 170));

        jComboBoxServico.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxServicoItemStateChanged(evt);
            }
        });
        getContentPane().add(jComboBoxServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 180, -1));

        getContentPane().add(jComboBoxCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 180, -1));

        jTextFieldHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldHoraActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 180, -1));

        jTextFieldValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldValorActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 180, -1));
        getContentPane().add(jTextFieldData, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 180, -1));

        jTextFieldId.setText("0");
        jTextFieldId.setEditable(false);
        jTextFieldId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldId, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 180, -1));

        jLabelObservacao.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabelObservacao.setForeground(new java.awt.Color(254, 254, 254));
        jLabelObservacao.setText("Observação:");
        getContentPane().add(jLabelObservacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, -1, -1));

        jLabelId.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabelId.setForeground(new java.awt.Color(254, 254, 254));
        jLabelId.setText("Id:");
        getContentPane().add(jLabelId, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        jLabelCliente.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabelCliente.setForeground(new java.awt.Color(254, 254, 254));
        jLabelCliente.setText("Cliente:");
        getContentPane().add(jLabelCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        jLabelServico.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabelServico.setForeground(new java.awt.Color(254, 254, 254));
        jLabelServico.setText("Serviço:");
        getContentPane().add(jLabelServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        jLabelValor.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabelValor.setForeground(new java.awt.Color(254, 254, 254));
        jLabelValor.setText("Valor (R$):");
        getContentPane().add(jLabelValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        jLabelData.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabelData.setForeground(new java.awt.Color(254, 254, 254));
        jLabelData.setText("Data");
        getContentPane().add(jLabelData, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        jLabelHora.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabelHora.setForeground(new java.awt.Color(254, 254, 254));
        jLabelHora.setText("Hora:");
        getContentPane().add(jLabelHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/Agenda-PainelFundo.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 10, 780, 510));

        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/AgendaFundo.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -90, 780, 650));
        getContentPane().add(msg, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 260, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgendarActionPerformed
        // TODO add your handling code here:
        this.controller.agendar();
    }//GEN-LAST:event_jButtonAgendarActionPerformed

    private void jComboBoxServicoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxServicoItemStateChanged
        // TODO add your handling code here:
        this.controller.atualizaValor();
    }//GEN-LAST:event_jComboBoxServicoItemStateChanged

    private void jTextFieldValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldValorActionPerformed

    private void jTextFieldIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdActionPerformed

    private void jTextFieldHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldHoraActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgendar;
    private javax.swing.JComboBox<String> jComboBoxCliente;
    private javax.swing.JComboBox<String> jComboBoxServico;
    private javax.swing.JInternalFrame jInternalFrame1Modal;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelCliente;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelHora;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelObservacao;
    private javax.swing.JLabel jLabelServico;
    private javax.swing.JLabel jLabelValor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableAgendamentos;
    private javax.swing.JTextArea jTextAreaObservacao;
    private javax.swing.JTextField jTextFieldData;
    private javax.swing.JTextField jTextFieldHora;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldValor;
    private javax.swing.JLabel msg;
    // End of variables declaration//GEN-END:variables

    private void iniciar() {
        this.controller.atualizarTabela();
        this.controller.atualizaCliente();
        this.controller.atualizaServiços();
    }

    /*
     * Estes getters e setters da tabela de agendamentos vão ser usados para o AgendaHelper exibir os dados nele!
    */

    public JLabel getMsg() {
        return msg;
    }

    public void setMsg(JLabel msg) {
        this.msg = msg;
    }
    
    public JTable getjTableAgendamentos() {
        return jTableAgendamentos;
    }

    public void setjTableAgendamentos(JTable jTableAgendamentos) {
        this.jTableAgendamentos = jTableAgendamentos;
    }

    public JComboBox<String> getjComboBoxCliente() {
        return jComboBoxCliente;
    }

    public void setjComboBoxCliente(JComboBox<String> jComboBoxCliente) {
        this.jComboBoxCliente = jComboBoxCliente;
    }

    public JComboBox<String> getjComboBoxServico() {
        return jComboBoxServico;
    }

    public void setjComboBoxServico(JComboBox<String> jComboBoxServico) {
        this.jComboBoxServico = jComboBoxServico;
    }

    public JTextField getjTextFieldValor() {
        return jTextFieldValor;
    }

    public void setjTextFieldValor(JTextField jTextFieldValor) {
        this.jTextFieldValor = jTextFieldValor;
    }

    public JTextArea getjTextAreaObservacao() {
        return jTextAreaObservacao;
    }

    public void setjTextAreaObservacao(JTextArea jTextAreaObservacao) {
        this.jTextAreaObservacao = jTextAreaObservacao;
    }

    public JTextField getjTextFieldHora() {
        return jTextFieldHora;
    }

    public void setjTextFieldHora(JTextField jTextFieldHora) {
        this.jTextFieldHora = jTextFieldHora;
    }

    public JTextField getjTextFieldId() {
        return jTextFieldId;
    }

    public void setjTextFieldId(JTextField jTextFieldId) {
        this.jTextFieldId = jTextFieldId;
    }

    public JTextField getjTextFieldData() {
        return jTextFieldData;
    }

    public void setjTextFieldData(JTextField jTextFieldData) {
        this.jTextFieldData = jTextFieldData;
    }
    
    
    
}
