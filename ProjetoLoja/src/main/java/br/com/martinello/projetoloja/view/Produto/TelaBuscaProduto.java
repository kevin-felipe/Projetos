/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.martinello.projetoloja.view.Produto;

import br.com.martinello.controll.model.MetodoBuscaProduto;
import br.com.martinello.projetoloja.Dao.Produto.DaoSelectProduto;
import br.com.martinello.projetoloja.view.Cliente.TelaBuscaCliente;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kevin.carvalho
 */
public class TelaBuscaProduto extends javax.swing.JInternalFrame {

    private JLabel txtNomeProduto;
    private JLabel txtQuantidadeProduto;
    private JLabel txtCategoriaProduto;
    private JLabel txtDataCadastroProduto;
    private JLabel txtValorProduto;
    private JLabel txtIdProduto;

    /**
     * ;
     * Creates new form TelaBuscaProduto
     */
    public TelaBuscaProduto()  {
        initComponents();
        
    }

    public TelaBuscaProduto(JLabel txtNomeProduto, JLabel txtQuantidadeProduto,
            JLabel txtCategoriaProduto, JLabel txtDataCadastroProduto,
            JLabel txtValorProduto, JLabel txtIdProduto) throws SQLException {
        initComponents();
        readTable();
        this.txtNomeProduto = txtNomeProduto;
        this.txtQuantidadeProduto = txtQuantidadeProduto;
        this.txtCategoriaProduto = txtCategoriaProduto;
        this.txtDataCadastroProduto = txtDataCadastroProduto;
        this.txtValorProduto = txtValorProduto;
        this.txtIdProduto = txtIdProduto;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtCampoBuscaProduto = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        tableBuscaProduto = new javax.swing.JScrollPane();
        tabelaBuscaProduto = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(685, 350));

        jLabel1.setText("Campo de Busca");

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tabelaBuscaProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id_produto", "nome", "data_fabricacao", "descricao", "valor", "quantidade", "categoria", "data_execucao"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableBuscaProduto.setViewportView(tabelaBuscaProduto);

        jButton2.setText("Inserir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tableBuscaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(txtCampoBuscaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(39, 39, 39)
                            .addComponent(jButton1))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCampoBuscaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tableBuscaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            buscaProduto(txtCampoBuscaProduto.getText());
        } catch (SQLException ex) {
            Logger.getLogger(TelaBuscaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        inserir();
        dispose();

    }//GEN-LAST:event_jButton2ActionPerformed

    public void readTable() throws SQLException {
        DefaultTableModel modelo = (DefaultTableModel) tabelaBuscaProduto.getModel();
        modelo.setNumRows(0);
        DaoSelectProduto pdao = new DaoSelectProduto();

        for (MetodoBuscaProduto p : pdao.carregarTabelaIniciar()) {
            modelo.addRow(new Object[]{
                p.getId(),
                p.getNome(),
                p.getDataFabricacao(),
                p.getDescricao(),
                p.getValor(),
                p.getQuantidade(),
                p.getCategoria(),
                p.getDataExecucao()

            });
        }

    }

    public void buscaProduto(String nomeProduto) throws SQLException {
        DefaultTableModel modelo = (DefaultTableModel) tabelaBuscaProduto.getModel();
        modelo.setNumRows(0);
        DaoSelectProduto pdao = new DaoSelectProduto();

        for (MetodoBuscaProduto p : pdao.buscaTabelaProduto(nomeProduto)) {
            modelo.addRow(new Object[]{
                p.getId(),
                p.getNome(),
                p.getDataFabricacao(),
                p.getDescricao(),
                p.getValor(),
                p.getQuantidade(),
                p.getCategoria(),
                p.getDataExecucao()

            });
        }

    }

    public void inserir() {
        int linha = tabelaBuscaProduto.getSelectedRow();

        txtIdProduto.setText(tabelaBuscaProduto.getValueAt(linha, 0).toString());
        txtNomeProduto.setText((tabelaBuscaProduto.getValueAt(linha, 1).toString()));
        txtDataCadastroProduto.setText(tabelaBuscaProduto.getValueAt(linha, 7).toString());
        txtValorProduto.setText(tabelaBuscaProduto.getValueAt(linha, 4).toString());
        txtQuantidadeProduto.setText((tabelaBuscaProduto.getValueAt(linha, 5).toString()));
        txtCategoriaProduto.setText(tabelaBuscaProduto.getValueAt(linha, 6).toString());

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTable tabelaBuscaProduto;
    private javax.swing.JScrollPane tableBuscaProduto;
    private javax.swing.JTextField txtCampoBuscaProduto;
    // End of variables declaration//GEN-END:variables
}
