package myProject;

import java.util.Random;

/**
 * Class Baraja generates two randoms values to palo and valor
 * @author Luisa Maria Cardenas, Nancy Stella Vega
 * @version v.1.0.0 date:14/12/2021
 */
public class Baraja {
    private int valor,palo, valorReal;
    private String paloReal;


    /**
     * Method that generate random values between 1 and 10 to valor
     * @return number between (1,10)
     */
    public int getValor(){
        Random aleatorio = new Random();
        valor = aleatorio.nextInt(10)+1;

        return valor;
    }

    /**
     * Method that generate random values between 1 and 4 to palo
     * @return number between (1,14)
     */
    public int getPalo(){
        Random aleatorio = new Random();
        palo = aleatorio.nextInt(4)+1;

        return palo;
    }

    /**
     * defines to valor according to the game parameters
     * @return number
     */
    public int getValorReal() {
        switch (valor) {
            case 1: valorReal=1;
                break;
            case 2: valorReal=2;
                break;
            case 3: valorReal=3;
                break;
            case 4: valorReal=4;
                break;
            case 5: valorReal=5;
                break;
            case 6: valorReal=6;
                break;
            case 7: valorReal=7;
                break;
            case 8: valorReal=10;
                break;
            case 9: valorReal=11;
                break;
            case 10: valorReal=12;
                break;
        }
        return valorReal;
    }

    /**
     * defines to palo according to the game parameters
     * @return value string to palo
     */
    public String getPaloReal() {
        switch (palo){
            case 1: paloReal="Oros";
                break;
            case 2: paloReal="Copas";
                break;
            case 3: paloReal="Espadas";
                break;
            case 4: paloReal="Bastos";
                break;

        }
        return paloReal;
    }
}