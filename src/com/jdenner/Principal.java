package com.jdenner;

import com.jdenner.gui.Login;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * Classe principal que inicia a aplicação
 *
 * @author Clenildon Ferreira
 */
public class Principal {

    /**
     * Método responsável por iniciar a aplicação
     *
     * @param args lista de parâmetros do método main
     */
    public static void main(String[] args) {
        lookAndFeel();
        Login login = new Login();
        login.setLocationRelativeTo(null);
        login.setVisible(true);
    }

    private static void lookAndFeel() {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            JFrame.setDefaultLookAndFeelDecorated(true);
            JDialog.setDefaultLookAndFeelDecorated(true);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            JOptionPane.showMessageDialog(null, e, "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

}
