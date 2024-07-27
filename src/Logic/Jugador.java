package Logic;

public class Jugador {

    private String nombre,nombre2;

    private int puntaje,puntaje2;

    private String tema,tema2;

    public Jugador() {

    }

    public Jugador(String nombre, String nombre2, int puntaje, int puntaje2, String tema, String tema2) {
        this.nombre = nombre;
        this.nombre2 = nombre2;
        this.puntaje = puntaje;
        this.puntaje2 = puntaje2;
        this.tema = tema;
        this.tema2 = tema2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public int getPuntaje2() {
        return puntaje2;
    }

    public void setPuntaje2(int puntaje2) {
        this.puntaje2 = puntaje2;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getTema2() {
        return tema2;
    }

    public void setTema2(String tema2) {
        this.tema2 = tema2;
    }


  
    
    
    
    
    
    
    
    

}
