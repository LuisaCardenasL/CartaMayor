package cartaMayor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This class is used for ...
 * @autor Luisa Maria Cardenas, Nancy Stella Vega
 * @version v.1.0.0 date: 15/12/2021
 */
public class GUI extends JFrame {
    private static final String MENSAJE_INICIO = "Bienvenido a Carta Mayor \n"
            + "\nOprime el boton sacar carta para iniciar el juego"
            + "\nSi tu y la máquina sacan cartas de igual valor "
            + "\nel ganador será definido por el Palo, "
            + "\nteniendo en cuenta que Oros es mayor que Copas, "
            + "\nCopas es mayor que Espadas y Espadas es mayor que Bastos.";

    private Header headerProject;
    private JLabel carta1, carta2;
    private JButton sacarCarta, ayuda;
    private JPanel panelBaraja;
    private ImageIcon imagenBaraja;
    private JTextArea mensajesSalida, resultadosCarta;
    private Escucha escucha;
    private ModelMayor modelMayor;

    /**
     * Constructor of GUI class
     */
    public GUI(){
        initGUI();

        //Default JFrame configuration
        this.setTitle("Carta Mayor");
        //this.setUndecorated(true);
        this.setBackground(new Color(255,255,255,255));
        this.pack();
        this.setResizable(true);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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

        ayuda = new JButton(" ? ");
        ayuda.addActionListener(escucha);
        constraints.gridx=0;
        constraints.gridy=1;
        constraints.gridwidth=1;
        constraints.fill=GridBagConstraints.NONE;
        constraints.anchor=GridBagConstraints.LINE_START;
        this.add(ayuda,constraints);

        carta1 = new JLabel(imagenBaraja);
        carta2 = new JLabel(imagenBaraja);

        panelBaraja = new JPanel();
        panelBaraja.setPreferredSize(new Dimension(300,180));
        panelBaraja.setBorder(BorderFactory.createTitledBorder("La baraja "));
        panelBaraja.add(carta1);
        panelBaraja.add(carta2);

        constraints.gridx=0;
        constraints.gridy=2;
        constraints.gridwidth=2;
        constraints.fill=GridBagConstraints.NONE;
        constraints.anchor=GridBagConstraints.CENTER;

        add(panelBaraja,constraints);

        resultadosCarta = new JTextArea(4,31);
        resultadosCarta.setBorder(BorderFactory.createTitledBorder("Resultados"));
        resultadosCarta.setText("Debes sacar una carta");
        resultadosCarta.setBackground(null);
        resultadosCarta.setEditable(false);

        constraints.gridx=1;
        constraints.gridy=4;
        constraints.gridwidth=1;
        constraints.fill=GridBagConstraints.NONE;
        constraints.anchor=GridBagConstraints.CENTER;
        add(resultadosCarta,constraints);

        sacarCarta = new JButton("Sacar Carta");
        sacarCarta.addActionListener(escucha);

        constraints.gridx=0;
        constraints.gridy=3;
        constraints.gridwidth=2;
        constraints.fill=GridBagConstraints.NONE;
        constraints.anchor=GridBagConstraints.CENTER;
        add(sacarCarta,constraints);

        mensajesSalida = new JTextArea(4,31);
        mensajesSalida.setText("Usa el botón (?) para ver las reglas del juego");
        mensajesSalida.setBorder(BorderFactory.createTitledBorder("Mensajes"));
        mensajesSalida.setBackground(null);
        mensajesSalida.setEditable(false);

        constraints.gridx=0;
        constraints.gridy=4;
        constraints.gridwidth=1;
        constraints.fill=GridBagConstraints.BOTH;
        constraints.anchor=GridBagConstraints.CENTER;
        add(mensajesSalida,constraints);

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
    private class Escucha implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==sacarCarta){
                modelMayor.getGanador();
                resultadosCarta.setText(modelMayor.getGanador());
            }else{
                if(e.getSource()==ayuda){
                    JOptionPane.showMessageDialog(null,MENSAJE_INICIO);
                }else{
                    System.exit(0);
                }
            }

        }
    }
}
