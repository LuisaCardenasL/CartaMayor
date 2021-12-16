package cartaMayor;

/**
 * ModelMayor apply the rules, the user wins if his card is the highest value
 * @author Luisa Maria Cardenas, Nancy Stella Vega
 * @version v.1.0.0 date:14/12/2021
 */
public class ModelMayor {
    private Baraja cartaUsuario, cartaMaquina;
    private String ganador;
    private int valorUsuario, valorMaquina;
    private String paloUsuario, paloMaquina;

    /**
     * Class constructor
     */
    public ModelMayor(){
        cartaMaquina = new Baraja();
        cartaUsuario = new Baraja();
    }

    /**
     * establish who was the winner based on the value of the card
     * @return message about whether the user wins
     */
    public String getGanador() {
        if(cartaUsuario.getValor() < cartaMaquina.getValor()){
            ganador = "Tu carta a sido mayor, Ganaste la ronda!!";
        }
        else{
            if(cartaUsuario.getValor() > cartaMaquina.getValor()){
                ganador = "Tu carta no ha sido la mayor, Perdiste :(";
            }
            else{
                if(cartaUsuario.getValor() == cartaMaquina.getValor()){
                    if(cartaUsuario.getPalo() < cartaMaquina.getPalo() ){
                        ganador = "Tu carta a sido mayor, Ganaste la ronda!!";
                    }
                    else{
                        if(cartaUsuario.getPalo() > cartaMaquina.getPalo() ){
                            ganador = "Tu carta no ha sido la mayor, Perdiste :(";
                        }
                    }
                }
            }
        }
        return ganador;
    }

    public int getValorMaquina() {
        valorMaquina = cartaMaquina.getValorReal();
        return valorMaquina;
    }

    public int getValorUsuario() {
        valorUsuario = cartaUsuario.getValorReal();
        return valorUsuario;
    }

    public String getPaloUsuario(){
        paloUsuario = cartaUsuario.getPaloReal();
        return  paloUsuario;
    }

    public String getPaloMaquina() {
        paloMaquina = cartaMaquina.getPaloReal();
        return paloMaquina;
    }
}