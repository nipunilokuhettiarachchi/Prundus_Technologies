/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prundustechnologies;

import com.jtattoo.plaf.mint.MintLookAndFeel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import prundustechnologies.View.LoginForm;

public class PrundusTechnologies {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new MintLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(PrundusTechnologies.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        new LoginForm().setVisible(true);
    }
    
}
