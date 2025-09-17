package exerciceregex;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameExpReg extends JFrame {
    private JPanel panel1;
    private JTextField champNom;
    private JTextField champMotPasse;
    private JTextField champCourriel;
    private JButton bouton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Expressions régulières");
        frame.setContentPane(new FrameExpReg().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public FrameExpReg() {
        Ecouteur ec = new Ecouteur ();
        bouton.addActionListener ( ec );
    }

    private class Ecouteur implements ActionListener {
        public void actionPerformed  ( ActionEvent ae ) {
            //codez ici

            // créer un objet Enregistrement
                Enregistrement e = new Enregistrement(champNom.getText(),champMotPasse.getText(), champCourriel.getText());
            // créer un objet Controleur
                Controleur c = new Controleur();
            //faire les vérifications
            boolean q1 = c.verifCouriel(e);
            boolean q2 = c.verifNom(e);
            boolean q3 = c.verifMotDePasse(e);
            System.out.println("good");
        }
    }
}
