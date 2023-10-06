
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.*;

public class EjercicioSwing extends JFrame implements ActionListener {

    private JScrollPane scrollpane1;
    private JTextArea textarea1;
    private JButton boton1;

    public EjercicioSwing() {

        setLayout(null);
        //crear el objeto de la clase JTextArea
        textarea1 = new JTextArea(6, 20);
        textarea1.setText("Escribe algo aquí...");
        textarea1.append("nuevo texto");

        //color y fuente predeterminados del texto        
        textarea1.setForeground(Color.RED);
        textarea1.setFont(new Font("Serif", Font.ITALIC, 16));

        //Color del texto cuando se selecciona
        textarea1.setSelectedTextColor(Color.GREEN);

        //Color de fondo del áres de texto
        textarea1.setBackground(Color.YELLOW);

        // Se acomodan las líneas dependiendo del tamaño del área de texto
        textarea1.setLineWrap(true);
        textarea1.setWrapStyleWord(true);
        textarea1.setEditable(true);

        //Para otorgar la capacidad de scrolear ponemos el área de texto dentro del objeto de la clase JScrollPane
        scrollpane1 = new JScrollPane(textarea1);
        scrollpane1.setBounds(45, 20, 400, 300);
        add(scrollpane1);
        
        //Determina como se visualiza la barra deslizable vertical
        scrollpane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        //JScrollPane.VERTICAL_SCROLLBAR_ALWAYS
        //JScrollPane.VERTICAL_SCROLLBAR_NEVER
        //JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED
        
        //Determina como se visualiza la barra deslizable horizontal.
        scrollpane1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        //JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS
        //JScrollPane.HORIZONTAL_SCROLLBAR_NEVER
        //JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED
        boton1 = new JButton("Métodos");
        boton1.setBounds(200, 325, 100, 30);
        add(boton1);
        boton1.addActionListener(this);

    }

    public void actionPerformed(ActionEvent metodo) {
        boolean continuar = true;
        Scanner entrada = new Scanner(System.in);

        while (continuar) {

            System.out.println("Elige una Opcion");

            String cadena = entrada.nextLine();
            if (cadena.equals("10")) {
                continuar = false;
                System.out.println("Proceso Finalizado");
            } else {
                switch (cadena) {

                    case "1":
                        System.out.println("get text()");
                        if (metodo.getSource() == boton1) {
                            String texto = textarea1.getText();
                            System.out.println(texto);
                        }
                        break;

                    case "2":
                        System.out.println("getLineCount()");
                        System.out.println(textarea1.getLineCount());
                        break;

                    case "3":
                        System.out.println("getRows()");
                        System.out.println(textarea1.getRows());
                        System.out.println("getColumns()");
                        System.out.println(textarea1.getColumns());
                        System.out.println("getLineCount()");
                        System.out.println(textarea1.getLineCount());
                        break;

                }
            }
        }

    }

    public static void main(String[] ar) {
        EjercicioSwing formulario1 = new EjercicioSwing();
        formulario1.setBounds(450, 200, 500, 400);
        formulario1.setVisible(true);
        formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
