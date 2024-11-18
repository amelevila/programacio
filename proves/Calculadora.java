import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame implements ActionListener {

    // Crear los componentes
    private JTextField pantalla;
    private JButton[] numeros = new JButton[10];
    private JButton[] operaciones = new JButton[4];
    private JButton botonIgual, botonClear;
    private JPanel panel;

    // Variables para la operación
    private String operador;
    private double num1, num2, resultado;

    public Calculadora() {
        // Configuración de la ventana
        setTitle("Calculadora");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar en la pantalla

        // Crear la pantalla de la calculadora
        pantalla = new JTextField();
        pantalla.setEditable(false);
        pantalla.setFont(new Font("Arial", Font.PLAIN, 24));
        pantalla.setHorizontalAlignment(JTextField.RIGHT);

        // Crear los botones de números
        for (int i = 0; i < 10; i++) {
            numeros[i] = new JButton(String.valueOf(i));
            numeros[i].addActionListener(this);
        }

        // Crear los botones de operaciones
        String[] ops = {"+", "-", "*", "/"};
        for (int i = 0; i < 4; i++) {
            operaciones[i] = new JButton(ops[i]);
            operaciones[i].addActionListener(this);
        }

        // Botón de igual y clear
        botonIgual = new JButton("=");
        botonIgual.addActionListener(this);
        botonClear = new JButton("C");
        botonClear.addActionListener(this);

        // Crear el panel y agregar los botones
        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        // Añadir los números y operaciones en el panel
        for (int i = 1; i <= 9; i++) {
            panel.add(numeros[i]);
        }
        panel.add(operaciones[0]); // Suma

        panel.add(numeros[0]);
        panel.add(botonClear);
        panel.add(botonIgual);
        panel.add(operaciones[1]); // Resta
        panel.add(operaciones[2]); // Multiplicación
        panel.add(operaciones[3]); // División

        // Configurar el layout principal
        setLayout(new BorderLayout());
        add(pantalla, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);

        // Mostrar la ventana
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numeros[i]) {
                pantalla.setText(pantalla.getText().concat(String.valueOf(i)));
            }
        }

        for (int i = 0; i < 4; i++) {
            if (e.getSource() == operaciones[i]) {
                num1 = Double.parseDouble(pantalla.getText());
                operador = operaciones[i].getText();
                pantalla.setText("");
            }
        }

        if (e.getSource() == botonIgual) {
            num2 = Double.parseDouble(pantalla.getText());

            switch (operador) {
                case "+":
                    resultado = num1 + num2;
                    break;
                case "-":
                    resultado = num1 - num2;
                    break;
                case "*":
                    resultado = num1 * num2;
                    break;
                case "/":
                    resultado = num1 / num2;
                    break;
            }
            pantalla.setText(String.valueOf(resultado));
        }

        if (e.getSource() == botonClear) {
            pantalla.setText("");
        }
    }

    public static void main(String[] args) {
        new Calculadora();
    }
}
