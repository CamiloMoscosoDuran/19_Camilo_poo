package pe.edu.vallegrande;

import javax.swing.*;
        import java.util.Locale;
import java.util.ResourceBundle;

public class SaludoApp {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            System.out.println("No se pudo aplicar Look & Feel.");
        }

        SwingUtilities.invokeLater(() -> {
            Locale locale = Locale.getDefault();
            ResourceBundle bundle = ResourceBundle.getBundle("recursos.Mensajes", locale);
            new SaludoVentana(bundle);
        });
    }
}
