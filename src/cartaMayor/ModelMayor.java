package cartaMayor;

/**
 * ModelMayor apply the rules, the user wins if his card is the highest value
 * @author Luisa Maria Cardenas, Nancy Stella Vega
 * @version v.1.0.0 date:14/12/2021
 */
public class ModelMayor {
    private Baraja cartaUsuario, cartaMaquina;
    private String ganador, maquinaValorPaloReal, usuarioValorPaloReal;
    private int usuarioValorReal, maquinaValorReal;
    private int usuarioValorPalo, maquinaValorPalo;
   // private String[] estadoToString;

    /**
     * Class constructor
     */
    public ModelMayor(){
        cartaMaquina = new Baraja();
        cartaUsuario = new Baraja();
        cartaUsuario.getValor();
        int usuarioValorReal = cartaUsuario.getValorReal();
        int usuarioValorPalo = cartaUsuario.getPalo();

        cartaMaquina.getValor();
        int maquinaValorReal = cartaMaquina.getValorReal();
        int maquinaValorPalo = cartaMaquina.getPalo();

    }

    /**
     * establish who was the winner based on the value of the card
     * @return message about whether the user wins
     */
    /**public String getGanador() {


        if(this.usuarioValorPalo > this.maquinaValorPalo) {
            ganador = "Tu carta a sido mayor, Ganaste la ronda!!";
        }else{
            if(usuarioValorPalo < maquinaValorPalo){
                ganador = "Tu carta no ha sido la mayor, Perdiste :(";
            }else{
                if (usuarioValorPalo == maquinaValorPalo){
                    if (usuarioValorReal > maquinaValorReal){
                        ganador = "Tu carta a sido mayor, Ganaste la ronda!!";
                    } else {
                        if (usuarioValorReal < maquinaValorPalo){
                            ganador = "Tu carta no ha sido la mayor, Perdiste :(";
                        }else {
                            ganador = "Las cartas son iguales, debes volver a sacar";
                        }
                    }
                }
            }
        }
        return ganador;
    }*/

    public int getValorMaquina() {
        cartaMaquina.getValor();
        maquinaValorReal = cartaMaquina.getValorReal();
        return maquinaValorReal;
    }

    public int getValorUsuario() {
        cartaUsuario.getValor();
        usuarioValorReal = cartaUsuario.getValorReal();
        return usuarioValorReal;
    }

    public String getPaloRealUsuario(){
        usuarioValorPaloReal = cartaUsuario.getPaloReal();
        return  usuarioValorPaloReal;
    }

    public String getPaloRealMaquina() {
        maquinaValorPaloReal = cartaMaquina.getPaloReal();
        return maquinaValorPaloReal;
    }

    public int getPaloMaquina(){
        maquinaValorPalo = cartaMaquina.getPalo();
        return maquinaValorPalo;
    }

    public int getPaloUsuario(){
        usuarioValorPalo = cartaUsuario.getPalo();
        return usuarioValorPalo;
    }
}