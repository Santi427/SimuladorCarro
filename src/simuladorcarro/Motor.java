/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuladorcarro;

/**
 *
 * @author juano
 */
public abstract class Motor {
    
    private String nombre;
    private int velocidadMaxima;

    public Motor(String nombre, int velocidadMaxima) {
        this.nombre = nombre;
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    
}
