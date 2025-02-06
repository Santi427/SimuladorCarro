/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuladorcarro;

import java.util.ArrayList;

/**
 *
 * @author juano
 */
public class Registro {
    
    private ArrayList<Vehiculo>vehiculos;

    public Registro() {
        this.vehiculos = new ArrayList<Vehiculo>();
    }
    
    public boolean agregarVehiculo(Vehiculo vehiculo) {
        return this.vehiculos.add(vehiculo);
    }
    
    public Vehiculo buscarVehiculo(String placa) {
        for (int i = 0; i < this.vehiculos.size(); i++) {

            Vehiculo temp = this.vehiculos.get(i);

            if (temp.getPlaca().equals(placa)) {
                return temp;
            }
        }
        return null;
    }
}
