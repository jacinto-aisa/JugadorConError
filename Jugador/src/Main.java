import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
class Jugador{
    private String NombreJugador;
    private int DorsalJugador;

    public Jugador()
    {
        NombreJugador = "pepe";
        DorsalJugador = 2023;
    }
    public Jugador(String nombreJugador, int dorsalJugador) {
        setNombreJugador(nombreJugador);
        setDorsalJugador(dorsalJugador);
    }

    public String getNombreJugador() {
        return NombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        if (nombreJugador != "")
            this.NombreJugador = "no puede ser vacio";
        else
            this.NombreJugador = nombreJugador;
    }

    public int getDorsalJugador() {
        return DorsalJugador;
    }

    public void setDorsalJugador(int DorsalJugador) {
        if (DorsalJugador < 0)
            DorsalJugador = 0;
        else
            DorsalJugador = DorsalJugador;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "NombreJugador:='" + NombreJugador + '\'' +
                ", DorsalJugador:=" + DorsalJugador +
                '}';
    }
}

class JugadorDeBaloncesto extends Jugador{

    int puntos;

    public JugadorDeBaloncesto(String nombreJugador, int dorsalJugador, int puntos) {
        super(nombreJugador, dorsalJugador);
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return super.toString()+
                "puntos=" + puntos +
                '}';
    }
}

class JugadorDeFutbol extends Jugador{
    int goles;

    public JugadorDeFutbol(String nombreJugador, int dorsalJugador, int goles) {
        super(nombreJugador, dorsalJugador);
        this.goles = goles;
    }

    @Override
    public String toString() {
        return super.toString()+
                "JugadorDeFutbol{" +
                "goles=" + goles +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador("jugador1", 1);
        Jugador jugador2 = new Jugador("jugador2", 2);
        Jugador jugador3 = new Jugador("jugador3", 3);
        Jugador jugador4 = new Jugador("jugador4", 4);
        Jugador jugador5 = new Jugador("jugador5", 5);
        Jugador jugador8 = new Jugador();
        JugadorDeBaloncesto baloncesto1 = new JugadorDeBaloncesto("baloncesto1",23,10);
        JugadorDeBaloncesto baloncesto2 = new JugadorDeBaloncesto("baloncesto2",30,20);
        JugadorDeFutbol futbol1 = new JugadorDeFutbol("futbol1", 10, 5);


        ArrayList<Jugador> ColeccionJugadores = new ArrayList();
        ColeccionJugadores.add(jugador1);
        ColeccionJugadores.add(jugador2);
        ColeccionJugadores.add(jugador3);
        ColeccionJugadores.add(jugador4);
        ColeccionJugadores.add(jugador5);
        ColeccionJugadores.add(baloncesto1);
        ColeccionJugadores.add(baloncesto2);
        ColeccionJugadores.add(futbol1);

        System.out.println("Los jugadores son: " + ColeccionJugadores.size());
        System.out.println("la coleccion ha encontrado el jugador1: " + ColeccionJugadores.contains(jugador1) );
        System.out.println("la coleccion no ha encontrado el jugador8: " + ColeccionJugadores.contains(jugador8) );
        System.out.println("los jugadore de baloncesto son: " + "jugador 1: " + baloncesto1 + " jugador 2: " + baloncesto2); // NO LOGRO MOSTAR NUMERO DE PUNTO ademas el dorsal siempre es 0
        System.out.println("el jugador de futbol es: " + futbol1);// no se como mostrar la suma de goles

        for (Jugador mostrarJugador : ColeccionJugadores)
        {
            System.out.println(mostrarJugador);
        }

    }
}