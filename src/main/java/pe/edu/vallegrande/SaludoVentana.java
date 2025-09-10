package pe.edu.vallegrande;

import javax.swing.*;
import java.awt.*;
import java.util.ResourceBundle;

public class SaludoVentana extends JFrame {
    public SaludoVentana(ResourceBundle mensajes) {
        setTitle(mensajes.getString("titulo"));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 200);
        setLocationRelativeTo(null);

        ImageIcon icon = new ImageIcon("src/main/resources/icono.png");
        setIconImage(icon.getImage());

        JPanel panel = new JPanel();
        panel.setBackground(new Color(220, 240, 255));

        JButton boton = new JButton(mensajes.getString("boton"));
        boton.setBackground(new Color(100, 149, 237));
        boton.setForeground(Color.WHITE);

        boton.addActionListener(e -> {
            String nombre = JOptionPane.showInputDialog(this, mensajes.getString("ingresar_nombre"));
            if (nombre != null && !nombre.trim().isEmpty()) {
                String saludo = String.format(mensajes.getString("saludo"), nombre);
                JOptionPane.showMessageDialog(this, saludo);
            } else {
                JOptionPane.showMessageDialog(this, mensajes.getString("nombre_invalido"), "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        panel.add(boton);
        add(panel);

        setVisible(true);
    }
}
