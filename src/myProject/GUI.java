package myProject;

import javax.swing.*;
import java.awt.*;

/**
 * This class is used for ...
 * @autor Paola-J Rodriguez-C paola.rodriguez@correounivalle.edu.co
 * @version v.1.0.0 date:21/11/2021
 */
public class GUI extends JFrame {
    private static final String MENSAJE_INICIO = "Bienvenido a Carta Mayor \n"
            + "Oprime el boton sacar carta para iniciar el juego"
            + "Si tu y la máquina sacan cartas de igual valor "
            + "el ganador será definido por el Palo, "
            + "teniendo en cuenta que Oros es mayor que Copas, "
            + "Copas es mayor que Espadas y Espadas es mayor que Bastos.";

    private Header headerProject;
    private JLabel carta;
    private JButton sacarCarta;
    private JPanel baraja;
    private ImageIcon imagenBaraja;
    private JTextArea mensjesSalida, resultadosCarta;
    private Escucha escucha;
    private ModelMayor modelMayor;

    /**
     * Constructor of GUI class
     */
    public GUI(){
        initGUI();

        //Default JFrame configuration
        this.setTitle("Juego Craps");
        this.setUndecorated(true);
        this.setBackground(new Color(255,255,255,255));
        this.pack();
        this.setResizable(true);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * This method is used to set up the default JComponent Configuration,
     * create Listener and control Objects used for the GUI class
     */
    private void initGUI() {
        //Set up JFrame Container's Layout
        this.getContentPane().setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();

        //Create Listener Object and Control Object
        escucha = new Escucha();
        modelMayor = new ModelMayor();

        //Set up JComponents
        headerProject = new Header("Mesa Carta Mayor", Color.BLACK);
        constraints.gridx=0;
        constraints.gridy=0;
        constraints.gridwidth=2;
        constraints.fill=GridBagConstraints.HORIZONTAL;
        this.add(headerProject,constraints);

    }

    /**
     * Main process of the Java program
     * @param args Object used in order to send input data from command line when
     *             the program is execute by console.
     */
    public static void main(String[] args){
        EventQueue.invokeLater(() -> {
            GUI miProjectGUI = new GUI();
        });
    }

    /**
     * inner class that extends an Adapter Class or implements Listeners used by GUI class
     */
    private class Escucha {

    }
}
