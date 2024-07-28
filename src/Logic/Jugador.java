package Logic;

public class Jugador {

    private String nombre;

    private int puntaje;

    private int tema;

    private String alias;

    public Jugador() {

    }

    public Jugador(String nombre, String alias, int puntaje, int tema) {
        this.nombre = nombre;

        this.alias = alias;

        this.puntaje = puntaje;

        this.tema = tema;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public int getTema() {
        return tema;
    }

    public void setTema(int tema) {
        this.tema = tema;
    }

}
