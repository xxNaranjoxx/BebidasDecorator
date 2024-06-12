package Interfaz;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import Bebidas.Bebida;
import Bebidas.Cafe;
import Bebidas.Cappuccino;
import Bebidas.ChocolateCaliente;
import Bebidas.Espresso;
import Bebidas.Latte;
import Bebidas.Macchiato;
import Bebidas.Mocha;
import Bebidas.Te;
import Bebidas.TeVerde;
import Decorador.Avellana;
import Decorador.Azucar;
import Decorador.Canela;
import Decorador.Caramelo;
import Decorador.Chocolate;
import Decorador.Crema;
import Decorador.Frambuesa;
import Decorador.Leche;
import Decorador.LecheAlmendra;
import Decorador.Menta;
import Decorador.NuezMoscada;
import Decorador.Vainilla;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazUsuario extends JFrame {

    private JComboBox<String> bebidaComboBox;
    private JCheckBox lecheCheckBox, azucarCheckBox, cremaCheckBox, vainillaCheckBox, canelaCheckBox;
    private JCheckBox mentaCheckBox, carameloCheckBox, nuezMoscadaCheckBox, chocolateCheckBox, avellanaCheckBox, lecheAlmendraCheckBox, frambuesaCheckBox;
    private JCheckBox lecheDeslactosadaCheckBox, lecheEnteraCheckBox, lecheSinLactosaCheckBox, cremaBatidaCheckBox, chispasChocolateCheckBox;
    private JTextArea resultadoArea;
    private JButton confirmarButton;
    private JButton revisarCarritoButton;
    private JDialog carritoDialog;
    private JTextArea carritoArea;

    private JLabel descripcionLabel;
    private JLabel precioLabel;

    public InterfazUsuario() {
        setTitle("Personalización de Bebidas");
        setSize(600, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setResizable(false);

        // Crear etiquetas para mostrar descripción y precio
        descripcionLabel = new JLabel("");
        precioLabel = new JLabel("");

        // Panel para mostrar información de la bebida base
        JPanel infoPanel = new JPanel();
        infoPanel.setLayout(new GridLayout(2, 1));
        infoPanel.setBorder(BorderFactory.createTitledBorder("Información de la bebida base"));
        infoPanel.add(descripcionLabel);
        infoPanel.add(precioLabel);

        // Agregar el panel de información a la derecha
        add(infoPanel, BorderLayout.EAST);

        // Establecer fondo y estilo global
        getContentPane().setBackground(Color.WHITE);
        UIManager.put("Button.background", new Color(255, 102, 102));
        UIManager.put("Button.foreground", Color.WHITE);
        Font font = new Font("Arial", Font.PLAIN, 14);
        UIManager.put("Button.font", font);

        // Panel de selección de bebidas base
        JPanel bebidaPanel = new JPanel();
        bebidaPanel.setLayout(new GridBagLayout());
        bebidaPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(00, 00, 139), 2), "Seleccione una bebida base"));
        bebidaPanel.setBackground(Color.WHITE);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.gridx = 0;
        gbc.gridy = 0;

        bebidaPanel.add(new JLabel("Bebida:"), gbc);

        gbc.gridx = 1;
        String[] bebidas = {"Café", "Té", "Chocolate Caliente", "Latte", "Mocha", "Cappuccino", "Espresso", "Macchiato", "Té Verde"};
        bebidaComboBox = new JComboBox<>(bebidas);
        bebidaComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Cuando se selecciona una bebida, mostrar su información
                String bebidaSeleccionada = (String) bebidaComboBox.getSelectedItem();
                mostrarInformacionBebidaBase(bebidaSeleccionada);
            }
        });
        bebidaComboBox.setBackground(Color.WHITE);
        bebidaPanel.add(bebidaComboBox, gbc);

        // Crear etiquetas para mostrar descripción y precio
        descripcionLabel = new JLabel("");
        precioLabel = new JLabel("");

        String bebidaSeleccionada = (String) bebidaComboBox.getSelectedItem();
        mostrarInformacionBebidaBase(bebidaSeleccionada);

        // Panel de selección de ingredientes
        JPanel ingredientesPanel = new JPanel();
        ingredientesPanel.setLayout(new GridLayout(17, 1));
        ingredientesPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(00, 00, 139), 2), "Seleccione ingredientes adicionales"));
        ingredientesPanel.setBackground(Color.WHITE);

        lecheCheckBox = new JCheckBox("Leche");
        azucarCheckBox = new JCheckBox("Azúcar");
        cremaCheckBox = new JCheckBox("Crema");
        vainillaCheckBox = new JCheckBox("Vainilla");
        canelaCheckBox = new JCheckBox("Canela");
        mentaCheckBox = new JCheckBox("Menta");
        carameloCheckBox = new JCheckBox("Caramelo");
        nuezMoscadaCheckBox = new JCheckBox("Nuez Moscada");
        chocolateCheckBox = new JCheckBox("Chocolate");
        avellanaCheckBox = new JCheckBox("Jarabe de Avellana");
        lecheAlmendraCheckBox = new JCheckBox("Leche de Almendra");
        frambuesaCheckBox = new JCheckBox("Jarabe de Frambuesa");
        lecheDeslactosadaCheckBox = new JCheckBox("Leche Deslactosada");
        lecheEnteraCheckBox = new JCheckBox("Leche Entera");
        lecheSinLactosaCheckBox = new JCheckBox("Leche Sin Lactosa");
        cremaBatidaCheckBox = new JCheckBox("Crema Batida");
        chispasChocolateCheckBox = new JCheckBox("Chispas de Chocolate");

        lecheCheckBox.setBackground(Color.WHITE);
        azucarCheckBox.setBackground(Color.WHITE);
        cremaCheckBox.setBackground(Color.WHITE);
        vainillaCheckBox.setBackground(Color.WHITE);
        canelaCheckBox.setBackground(Color.WHITE);
        mentaCheckBox.setBackground(Color.WHITE);
        carameloCheckBox.setBackground(Color.WHITE);
        nuezMoscadaCheckBox.setBackground(Color.WHITE);
        chocolateCheckBox.setBackground(Color.WHITE);
        avellanaCheckBox.setBackground(Color.WHITE);
        lecheAlmendraCheckBox.setBackground(Color.WHITE);
        frambuesaCheckBox.setBackground(Color.WHITE);
        lecheDeslactosadaCheckBox.setBackground(Color.WHITE);
        lecheEnteraCheckBox.setBackground(Color.WHITE);
        lecheSinLactosaCheckBox.setBackground(Color.WHITE);
        cremaBatidaCheckBox.setBackground(Color.WHITE);
        chispasChocolateCheckBox.setBackground(Color.WHITE);

        ingredientesPanel.add(lecheCheckBox);
        ingredientesPanel.add(azucarCheckBox);
        ingredientesPanel.add(cremaCheckBox);
        ingredientesPanel.add(vainillaCheckBox);
        ingredientesPanel.add(canelaCheckBox);
        ingredientesPanel.add(mentaCheckBox);
        ingredientesPanel.add(carameloCheckBox);
        ingredientesPanel.add(nuezMoscadaCheckBox);
        ingredientesPanel.add(chocolateCheckBox);
        ingredientesPanel.add(avellanaCheckBox);
        ingredientesPanel.add(lecheAlmendraCheckBox);
        ingredientesPanel.add(frambuesaCheckBox);
        ingredientesPanel.add(lecheDeslactosadaCheckBox);
        ingredientesPanel.add(lecheEnteraCheckBox);
        ingredientesPanel.add(lecheSinLactosaCheckBox);
        ingredientesPanel.add(cremaBatidaCheckBox);
        ingredientesPanel.add(chispasChocolateCheckBox);

        // Panel de resultado
        resultadoArea = new JTextArea(10, 40);
        resultadoArea.setEditable(false);
        resultadoArea.setBorder(BorderFactory.createLineBorder(new Color(255, 102, 102), 2));
        JScrollPane scrollPane = new JScrollPane(resultadoArea);
        scrollPane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(255, 102, 102), 2), "Resumen de la bebida"));
        scrollPane.setBackground(Color.WHITE);

        // Botón de confirmación
        confirmarButton = new JButton("Confirmar");
        confirmarButton.setBackground(new Color(90, 163, 142));
        confirmarButton.setBorder(BorderFactory.createEmptyBorder(10, 30, 10, 30));
        confirmarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Bebida bebida = crearBebida();
                String descripcionFinal = bebida.getDescripcion();
                double costoFinal = bebida.costo();

                resultadoArea.setText("Descripción: " + descripcionFinal + "\nCosto: $" + String.format("%.2f", costoFinal));
            }
        });

        // Botón para revisar el carrito
        revisarCarritoButton = new JButton("Revisar Carrito");
        revisarCarritoButton.setBackground(new Color(90, 163, 142));
        revisarCarritoButton.setBorder(BorderFactory.createEmptyBorder(10, 30, 10, 30));
        revisarCarritoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarCarrito();
            }
        });

        // Panel de botones
        JPanel botonesPanel = new JPanel();
        botonesPanel.setBackground(Color.WHITE);
        botonesPanel.setBorder(new EmptyBorder(20, 0, 0, 0));
        botonesPanel.add(confirmarButton);
        botonesPanel.add(revisarCarritoButton);

        // Añadir componentes al frame
        add(bebidaPanel, BorderLayout.NORTH);
        add(ingredientesPanel, BorderLayout.CENTER);
        add(scrollPane, BorderLayout.SOUTH);
        add(botonesPanel, BorderLayout.PAGE_END);
    }//InterfazUsuario



    private void mostrarInformacionBebidaBase(String nombreBebida) {
        // Aquí puedes obtener la descripción y el precio de la bebida base
        String descripcion = obtenerDescripcionBebidaBase(nombreBebida);
        double precio = obtenerPrecioBebidaBase(nombreBebida);

        // Actualizar las etiquetas de descripción y precio
        descripcionLabel.setText("Descripción: " + descripcion);
        precioLabel.setText("Precio: $" + String.format("%.2f", precio));
    }

    // Métodos para obtener la descripción y el precio de la bebida base
    private String obtenerDescripcionBebidaBase(String nombreBebida) {
        // Implementa la lógica para obtener la descripción según el nombre de la bebida
        // Por ejemplo, podrías tener un mapa de nombres de bebidas a descripciones
        // O podrías hacer consultas a una base de datos
        // Por ahora, retornamos una descripción de ejemplo
        return "Descripción de " + nombreBebida;
    }

    private double obtenerPrecioBebidaBase(String nombreBebida) {
        // Implementa la lógica para obtener el precio según el nombre de la bebida
        // Por ejemplo, podrías tener un mapa de nombres de bebidas a precios
        // O podrías hacer consultas a una base de datos
        // Por ahora, retornamos un precio de ejemplo
        return 2.50;
    }

    private Bebida crearBebida() {
        Bebida bebida;
        switch ((String) bebidaComboBox.getSelectedItem()) {
            case "Té":
                bebida = new Te();
                break;
            case "Chocolate Caliente":
                bebida = new ChocolateCaliente();
                break;
            case "Latte":
                bebida = new Latte();
                break;
            case "Mocha":
                bebida = new Mocha();
                break;
            case "Cappuccino":
                bebida = new Cappuccino();
                break;
            case "Espresso":
                bebida = new Espresso();
                break;
            case "Macchiato":
                bebida = new Macchiato();
                break;
            case "Té Verde":
                bebida = new TeVerde();
                break;
            case "Café":
            default:
                bebida = new Cafe();
                break;
        }

        if (lecheCheckBox.isSelected()) {
            bebida = new Leche(bebida);
        }
        if (azucarCheckBox.isSelected()) {
            bebida = new Azucar(bebida);
        }
        if (cremaCheckBox.isSelected()) {
            bebida = new Crema(bebida);
        }
        if (vainillaCheckBox.isSelected()) {
            bebida = new Vainilla(bebida);
        }
        if (canelaCheckBox.isSelected()) {
            bebida = new Canela(bebida);
        }
        if (mentaCheckBox.isSelected()) {
            bebida = new Menta(bebida);
        }
        if (carameloCheckBox.isSelected()) {
            bebida = new Caramelo(bebida);
        }
        if (nuezMoscadaCheckBox.isSelected()) {
            bebida = new NuezMoscada(bebida);
        }
        if (chocolateCheckBox.isSelected()) {
            bebida = new Chocolate(bebida);
        }
        if (avellanaCheckBox.isSelected()) {
            bebida = new Avellana(bebida);
        }
        if (lecheAlmendraCheckBox.isSelected()) {
            bebida = new LecheAlmendra(bebida);
        }
        if (frambuesaCheckBox.isSelected()) {
            bebida = new Frambuesa(bebida);
        }

        return bebida;
    }

    private void mostrarCarrito() {
        if (carritoDialog == null) {
            carritoDialog = new JDialog(this, "Carrito de Compras", true);
            carritoArea = new JTextArea(10, 40);
            carritoArea.setEditable(false);
            carritoDialog.add(new JScrollPane(carritoArea), BorderLayout.CENTER);
            JButton cerrarButton = new JButton("Cerrar");
            cerrarButton.setBackground(new Color(90, 163, 141));
            cerrarButton.setBorder(BorderFactory.createEmptyBorder(10, 30, 10, 30));
            cerrarButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    carritoDialog.setVisible(false);
                }
            });
            carritoDialog.add(cerrarButton, BorderLayout.SOUTH);
            carritoDialog.pack();
        }

        // Actualizar el contenido del carrito
        String contenidoCarrito = resultadoArea.getText();
        carritoArea.setText(contenidoCarrito);
        carritoDialog.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                InterfazUsuario frame = new InterfazUsuario();
                frame.setVisible(true);
            }
        });
    }
}


