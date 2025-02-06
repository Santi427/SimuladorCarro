/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuladorcarro;

/**
 *
 * @author juano
 */
public abstract class Llanta {
    
    private String nombre;
    private int velocidadLimite;
    
    

    public Llanta(String nombre, int velocidadLimite) {
        this.nombre = nombre;
        this.velocidadLimite = velocidadLimite;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVelocidadLimite() {
        return velocidadLimite;
    }
    
    
}
