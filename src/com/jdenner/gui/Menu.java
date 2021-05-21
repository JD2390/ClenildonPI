package com.jdenner.gui;

/**
 * Janela menu da aplicação
 *
 * @author Clenildon Ferreira
 */
public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        toolBar = new javax.swing.JToolBar();
        btVenda = new javax.swing.JButton();
        btCompra = new javax.swing.JButton();
        btProduto = new javax.swing.JButton();
        btCliente = new javax.swing.JButton();
        btFornecedor = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        menuCadastros = new javax.swing.JMenu();
        miProduto = new javax.swing.JMenuItem();
        miCliente = new javax.swing.JMenuItem();
        miFornecedor = new javax.swing.JMenuItem();
        menuMovimentos = new javax.swing.JMenu();
        miVenda = new javax.swing.JMenuItem();
        miCompra = new javax.swing.JMenuItem();
        menuSistema = new javax.swing.JMenu();
        miSobre = new javax.swing.JMenuItem();
        miSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Vendas");

        desktopPane.setBackground(new java.awt.Color(204, 204, 255));
        desktopPane.setOpaque(false);
        desktopPane.addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
                desktopPaneAncestorResized(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jdenner/gui/img/logo1.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 70, 480, 350);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Open Source versão: 1.0.4");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(240, 460, 183, 17);

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 460, 660, 20);

        toolBar.setFloatable(false);
        toolBar.setOrientation(javax.swing.SwingConstants.VERTICAL);
        toolBar.setOpaque(false);
        toolBar.setPreferredSize(new java.awt.Dimension(69, 69));

        btVenda.setBackground(new java.awt.Color(153, 204, 255));
        btVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jdenner/gui/img/venda.png"))); // NOI18N
        btVenda.setText("Venda");
        btVenda.setToolTipText("Venda");
        btVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btVenda.setFocusable(false);
        btVenda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btVenda.setMargin(new java.awt.Insets(2, 12, 2, 12));
        btVenda.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jdenner/gui/img/venda-foco.png"))); // NOI18N
        btVenda.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btVenda.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miVendaActionPerformed(evt);
            }
        });
        toolBar.add(btVenda);

        btCompra.setBackground(new java.awt.Color(153, 204, 255));
        btCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jdenner/gui/img/compra.png"))); // NOI18N
        btCompra.setText("Compra");
        btCompra.setToolTipText("Compra");
        btCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCompra.setFocusable(false);
        btCompra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCompra.setMargin(new java.awt.Insets(2, 12, 2, 12));
        btCompra.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jdenner/gui/img/compra-foco.png"))); // NOI18N
        btCompra.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btCompra.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCompraActionPerformed(evt);
            }
        });
        toolBar.add(btCompra);

        btProduto.setBackground(new java.awt.Color(153, 204, 255));
        btProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jdenner/gui/img/produto.png"))); // NOI18N
        btProduto.setText("Produto");
        btProduto.setToolTipText("Add Produto");
        btProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btProduto.setFocusable(false);
        btProduto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btProduto.setMargin(new java.awt.Insets(2, 12, 2, 12));
        btProduto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jdenner/gui/img/produto-foco.png"))); // NOI18N
        btProduto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miProdutoActionPerformed(evt);
            }
        });
        toolBar.add(btProduto);

        btCliente.setBackground(new java.awt.Color(153, 204, 255));
        btCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jdenner/gui/img/cliente.png"))); // NOI18N
        btCliente.setText("Cliente");
        btCliente.setToolTipText("Add Cliente");
        btCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCliente.setFocusable(false);
        btCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCliente.setMargin(new java.awt.Insets(2, 12, 2, 12));
        btCliente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jdenner/gui/img/cliente-foco.png"))); // NOI18N
        btCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miClienteActionPerformed(evt);
            }
        });
        toolBar.add(btCliente);

        btFornecedor.setBackground(new java.awt.Color(153, 204, 255));
        btFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jdenner/gui/img/fornecedor.png"))); // NOI18N
        btFornecedor.setText("Forne");
        btFornecedor.setToolTipText("Add Fornecedor");
        btFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btFornecedor.setFocusable(false);
        btFornecedor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btFornecedor.setMargin(new java.awt.Insets(2, 12, 2, 12));
        btFornecedor.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jdenner/gui/img/fornecedor-foco.png"))); // NOI18N
        btFornecedor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miFornecedorActionPerformed(evt);
            }
        });
        toolBar.add(btFornecedor);

        btSair.setBackground(new java.awt.Color(153, 204, 255));
        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jdenner/gui/img/sair.png"))); // NOI18N
        btSair.setText("Sair");
        btSair.setToolTipText("Fecha o Sistema");
        btSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSair.setFocusable(false);
        btSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSair.setMargin(new java.awt.Insets(2, 12, 2, 12));
        btSair.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jdenner/gui/img/sair-foco.png"))); // NOI18N
        btSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSairActionPerformed(evt);
            }
        });
        toolBar.add(btSair);

        jPanel1.add(toolBar);
        toolBar.setBounds(550, 30, 100, 410);

        desktopPane.add(jPanel1);
        jPanel1.setBounds(0, 0, 660, 480);

        getContentPane().add(desktopPane, java.awt.BorderLayout.CENTER);

        menuBar.setBackground(new java.awt.Color(0, 102, 153));
        menuBar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        menuBar.setForeground(new java.awt.Color(255, 255, 255));

        menuCadastros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jdenner/gui/img/document_add_256_icon-icons.com_75994.png"))); // NOI18N
        menuCadastros.setText("Cadastros");
        menuCadastros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        miProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        miProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jdenner/gui/img/produto.png"))); // NOI18N
        miProduto.setText("Cadastrar Produto");
        miProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        miProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miProdutoActionPerformed(evt);
            }
        });
        menuCadastros.add(miProduto);

        miCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        miCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jdenner/gui/img/cliente.png"))); // NOI18N
        miCliente.setText("Cadastrar Cliente");
        miCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        miCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miClienteActionPerformed(evt);
            }
        });
        menuCadastros.add(miCliente);

        miFornecedor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        miFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jdenner/gui/img/fornecedor.png"))); // NOI18N
        miFornecedor.setText("Cadastrar Fornecedor");
        miFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        miFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miFornecedorActionPerformed(evt);
            }
        });
        menuCadastros.add(miFornecedor);

        menuBar.add(menuCadastros);

        menuMovimentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jdenner/gui/img/caixa.png"))); // NOI18N
        menuMovimentos.setText("Movimentos");
        menuMovimentos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        miVenda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        miVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jdenner/gui/img/venda.png"))); // NOI18N
        miVenda.setText("Registrar Venda");
        miVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        miVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miVendaActionPerformed(evt);
            }
        });
        menuMovimentos.add(miVenda);

        miCompra.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        miCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jdenner/gui/img/compra.png"))); // NOI18N
        miCompra.setText("Registrar Compra");
        miCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        miCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCompraActionPerformed(evt);
            }
        });
        menuMovimentos.add(miCompra);

        menuBar.add(menuMovimentos);

        menuSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jdenner/gui/img/sistema.png"))); // NOI18N
        menuSistema.setText("Sistema");
        menuSistema.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        miSobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        miSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jdenner/gui/img/sobre (2).png"))); // NOI18N
        miSobre.setText("Sobre");
        miSobre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        miSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSobreActionPerformed(evt);
            }
        });
        menuSistema.add(miSobre);

        miSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        miSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jdenner/gui/img/sair.png"))); // NOI18N
        miSair.setText("Sair");
        miSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        miSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSairActionPerformed(evt);
            }
        });
        menuSistema.add(miSair);

        menuBar.add(menuSistema);

        setJMenuBar(menuBar);

        setSize(new java.awt.Dimension(663, 545));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void miProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miProdutoActionPerformed
        CadastroProduto c = new CadastroProduto();
        desktopPane.add(c);
        c.setVisible(true);
    }//GEN-LAST:event_miProdutoActionPerformed

    private void miClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miClienteActionPerformed
        CadastroCliente c = new CadastroCliente();
        desktopPane.add(c);
        c.setVisible(true);
    }//GEN-LAST:event_miClienteActionPerformed

    private void miFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miFornecedorActionPerformed
        CadastroFornecedor c = new CadastroFornecedor();
        desktopPane.add(c);
        c.setVisible(true);
    }//GEN-LAST:event_miFornecedorActionPerformed

    private void miVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miVendaActionPerformed
        LancamentoVenda v = new LancamentoVenda();
        desktopPane.add(v);
        v.setVisible(true);
    }//GEN-LAST:event_miVendaActionPerformed

    private void miCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCompraActionPerformed
        LancamentoCompra c = new LancamentoCompra();
        desktopPane.add(c);
        c.setVisible(true);
    }//GEN-LAST:event_miCompraActionPerformed

    private void miSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_miSairActionPerformed

    private void miSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSobreActionPerformed
        Sobre s = new Sobre(this, true);
        s.setVisible(true);
    }//GEN-LAST:event_miSobreActionPerformed

    private void desktopPaneAncestorResized(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_desktopPaneAncestorResized
        setResizable(false);
    }//GEN-LAST:event_desktopPaneAncestorResized

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCliente;
    private javax.swing.JButton btCompra;
    private javax.swing.JButton btFornecedor;
    private javax.swing.JButton btProduto;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btVenda;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuCadastros;
    private javax.swing.JMenu menuMovimentos;
    private javax.swing.JMenu menuSistema;
    private javax.swing.JMenuItem miCliente;
    private javax.swing.JMenuItem miCompra;
    private javax.swing.JMenuItem miFornecedor;
    private javax.swing.JMenuItem miProduto;
    private javax.swing.JMenuItem miSair;
    private javax.swing.JMenuItem miSobre;
    private javax.swing.JMenuItem miVenda;
    private javax.swing.JToolBar toolBar;
    // End of variables declaration//GEN-END:variables
}
