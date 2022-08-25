package Videojuego;

public class Guerrero {
    private String nombre;
    private Arma arma;
    private int ataque;
    private int vida;
    private int fuerza = 15;

    public Guerrero(String nombre, Arma arma, int ataque, int vida) {
        this.nombre = nombre;
        this.arma = arma;
        this.ataque = ataque;
        this.vida = vida;
    }
    
    public void atacar() {
        System.out.println("Esta atacando " + nombre + "!!");
        arma.usar();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    @Override
    public String toString() {
        return "Guerrero{" + "nombre=" + nombre + ", arma=" + arma + ", ataque=" + ataque + ", vida=" + vida + ", fuerza=" + fuerza + '}';
    }
    
    
 
}
