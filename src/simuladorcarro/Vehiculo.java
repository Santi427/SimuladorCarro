/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuladorcarro;

import Excepciones.ApagadoAccidenteException;
import Excepciones.CapacidadMotorSuperadaException;
import Excepciones.FrenadoBruscoException;
import Excepciones.FrenadoSuperiorVelocidadException;
import Excepciones.FrenarAcelerarApagadoException;
import Excepciones.FrenarDetenidoException;
import Excepciones.PatinadoApagadoException;
import Excepciones.PatinadoDetenidoException;
import Excepciones.PerdidaTotalException;
import Excepciones.VehiculoApagadoException;
import Excepciones.VehiculoEncendidoException;

/**
 *
 * @author Santi
 */
public class Vehiculo {

    private String marca;
    private String placa;
    private String color;
    private int velocidad;
    private boolean estado;
    private Motor motor;
    private Llanta llanta;
    private String fase = "Bueno";

    public Vehiculo(String marca, String color, String placa, Motor motor, Llanta llanta) {
        this.marca = marca;
        this.color = color;
        this.placa = placa;
        this.motor = motor;
        this.llanta = llanta;
    }

    public String getFase() {
        return fase;
    }

    /*GETTER Y SETTER*/
    public void setFase(String fase) {
        this.fase = fase;
    }

    public boolean isEstado() {
        return estado;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public Motor getMotor() {
        return motor;
    }

    public Llanta getLlanta() {
        return llanta;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    /*METODOS*/
    public void encender() throws VehiculoEncendidoException, PerdidaTotalException {

        if (!this.fase.equals("Estrellado")) {
            if (estado == false) {
                this.setEstado(true);

            } else {
                throw new VehiculoEncendidoException("El vehiculo esta encendido, no puede volverse a encender");
            }
        } else {
            throw new PerdidaTotalException("El vehiculo se ha estrellado y no puede encender");
        }

    }

    public void apagar() throws VehiculoApagadoException, ApagadoAccidenteException, PatinadoApagadoException {

        if (!this.fase.equals("Estrellado")) {
            if (!this.fase.equals("Patinando")) {

                if (estado == true) {
                    this.setEstado(false);
                    this.setVelocidad(0);

                } else {
                    throw new VehiculoApagadoException("El vehiculo esta apagado, no puede volverse a apagar");
                }
            } else {
                throw new PatinadoApagadoException("Este vehiculo esta patinando, no se podra apagar");
            }
        } else {
            throw new ApagadoAccidenteException("El vehiculo se estrello y automaticamente se apaga");
        }
    }

    public int acelerar(int aumentoVelocidad) throws FrenarAcelerarApagadoException, CapacidadMotorSuperadaException {

        if (this.estado == true) {
            if (this.velocidad >= 0 && aumentoVelocidad > 0) {
                this.velocidad = this.velocidad + aumentoVelocidad;

                if (this.velocidad <= this.motor.getVelocidadMaxima()) {

                    this.setVelocidad(velocidad);
                    return this.velocidad;
                } else {
                    throw new CapacidadMotorSuperadaException("El vehiculo ha superado la capacidad del motor");
                }
            }
        } else {
            throw new FrenarAcelerarApagadoException("Un vehiculo apagado no puede acelerar");
        }
        return this.velocidad;
    }

    public int frenar(int disminuirVelocidad) throws FrenarAcelerarApagadoException, FrenarDetenidoException, FrenadoBruscoException, FrenadoSuperiorVelocidadException, PatinadoDetenidoException {
        int velocidadTemp = 0;

        if (!this.fase.equals("Patinando")) {

            if (this.estado == true) {
                if (this.velocidad > 0 && disminuirVelocidad > 0) {
                    velocidadTemp = velocidad;
                    this.velocidad = this.velocidad - disminuirVelocidad;
                    if (velocidadTemp >= disminuirVelocidad) {
                        if (velocidadTemp < this.llanta.getVelocidadLimite()) {
                            return this.velocidad;
                        } else {
                            throw new FrenadoBruscoException("El vehiculo freno a mas del limite de las llantas, esta patinando");
                        }
                    } else {
                        throw new FrenadoSuperiorVelocidadException("El vehiculo freno a una velocidad mayor a la actual. Esta patinando.");
                    }

                } else {
                    throw new FrenarDetenidoException("Un vehiculo detenido no puede frenar");
                }
            } else {
                throw new FrenarAcelerarApagadoException("Un vehiculo apagado no puede frenar");

            }
        } else {
            throw new PatinadoDetenidoException("Si un vehículo patina, solo recuperara el control si es detenido");
        }
    }

    public int frenarBruscamente() throws FrenarDetenidoException, FrenarAcelerarApagadoException, FrenadoBruscoException, FrenadoSuperiorVelocidadException, PatinadoDetenidoException {
        int velocidadTemp = 0;
        if (!this.fase.equals("Patinando")) {
        
        if (this.estado == true) {
            if (this.velocidad > 0) {
                velocidadTemp = velocidad;
                this.velocidad = this.velocidad - 80;
                if (velocidadTemp >= 80) {
                    if (velocidadTemp < this.llanta.getVelocidadLimite()) {
                        return this.velocidad;
                    } else {
                        throw new FrenadoBruscoException("El vehiculo freno bruscamente a mas del limite de las llantas, esta patinando");
                    }
                } else {
                    throw new FrenadoSuperiorVelocidadException("El vehiculo freno bruscamente a una velocidad mayor a la actual. Esta patinando.");
                }
            } else {
                throw new FrenarDetenidoException("Un vehiculo detenido no puede frenar");
            }
        } else {
            throw new FrenarAcelerarApagadoException("Un vehiculo apagado no puede frenar");

        }
     } else {
            throw new PatinadoDetenidoException("Si un vehículo patina, solo recuperara el control si es detenido");
        }
    }
 
}
