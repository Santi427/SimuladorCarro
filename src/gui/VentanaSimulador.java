/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package gui;

import Excepciones.CapacidadMotorSuperadaException;
import Excepciones.FrenadoBruscoException;
import Excepciones.FrenadoSuperiorVelocidadException;
import Excepciones.FrenarAcelerarApagadoException;
import Excepciones.FrenarDetenidoException;
import Excepciones.PerdidaTotalException;
import Excepciones.VehiculoApagadoException;
import Excepciones.VehiculoEncendidoException;
import Excepciones.ApagadoAccidenteException;
import Excepciones.PatinadoApagadoException;
import Excepciones.PatinadoDetenidoException;
import java.awt.TextArea;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import simuladorcarro.LlantaBarata;
import simuladorcarro.LlantaBonita;
import simuladorcarro.LlantaBuena;
import simuladorcarro.Motor;
import simuladorcarro.Motor1000Cc;
import simuladorcarro.Motor2000Cc;
import simuladorcarro.Motor3000Cc;
import simuladorcarro.Registro;
import simuladorcarro.Vehiculo;


/**
 *
 * @author juano
 */
public class VentanaSimulador extends javax.swing.JDialog {

    private Registro registro;
    private Vehiculo vehiculo;

    /**
     * Creates new form VentanaSimulador
     */
    public VentanaSimulador(java.awt.Frame parent, boolean modal, Registro registro) {
        super(parent, modal);
        initComponents();
        this.registro = registro;
        this.vehiculo = vehiculo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btAcelerar = new javax.swing.JButton();
        btFrenar = new javax.swing.JButton();
        btFrenarBrusco = new javax.swing.JButton();
        txVelocidad = new javax.swing.JTextField();
        lbVehiculo = new javax.swing.JLabel();
        txPlacaBuscar = new javax.swing.JTextField();
        btBuscar = new javax.swing.JButton();
        btEncender = new javax.swing.JButton();
        btApagar = new javax.swing.JButton();
        lbMotor = new javax.swing.JLabel();
        lbLlanta = new javax.swing.JLabel();
        lbPlaca = new javax.swing.JLabel();
        lbPlaca1 = new javax.swing.JLabel();
        lbPlaca2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txConsola = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(29, 55, 82));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        btAcelerar.setBackground(new java.awt.Color(80, 191, 195));
        btAcelerar.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        btAcelerar.setForeground(new java.awt.Color(51, 51, 51));
        btAcelerar.setText("Acelerar");
        btAcelerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAcelerarActionPerformed(evt);
            }
        });

        btFrenar.setBackground(new java.awt.Color(80, 191, 195));
        btFrenar.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        btFrenar.setForeground(new java.awt.Color(51, 51, 51));
        btFrenar.setText("Frenar");
        btFrenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFrenarActionPerformed(evt);
            }
        });

        btFrenarBrusco.setBackground(new java.awt.Color(80, 191, 195));
        btFrenarBrusco.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        btFrenarBrusco.setForeground(new java.awt.Color(51, 51, 51));
        btFrenarBrusco.setText("Frenar bruscamente");
        btFrenarBrusco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFrenarBruscoActionPerformed(evt);
            }
        });

        txVelocidad.setEditable(false);
        txVelocidad.setBackground(new java.awt.Color(204, 204, 204));
        txVelocidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txVelocidadActionPerformed(evt);
            }
        });

        lbVehiculo.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N

        txPlacaBuscar.setBackground(new java.awt.Color(204, 204, 204));
        txPlacaBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txPlacaBuscarActionPerformed(evt);
            }
        });

        btBuscar.setBackground(new java.awt.Color(44, 118, 149));
        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        btEncender.setBackground(new java.awt.Color(33, 77, 114));
        btEncender.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        btEncender.setForeground(new java.awt.Color(51, 51, 51));
        btEncender.setText("Encender");
        btEncender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEncenderActionPerformed(evt);
            }
        });

        btApagar.setBackground(new java.awt.Color(33, 77, 114));
        btApagar.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        btApagar.setForeground(new java.awt.Color(51, 51, 51));
        btApagar.setText("Apagar");
        btApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btApagarActionPerformed(evt);
            }
        });

        lbMotor.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N

        lbLlanta.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N

        lbPlaca.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        lbPlaca.setForeground(new java.awt.Color(255, 255, 255));
        lbPlaca.setText("Placa:");

        lbPlaca1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        lbPlaca1.setForeground(new java.awt.Color(255, 255, 255));
        lbPlaca1.setText("Motor:");

        lbPlaca2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        lbPlaca2.setForeground(new java.awt.Color(255, 255, 255));
        lbPlaca2.setText("Llanta:");

        txConsola.setEditable(false);
        txConsola.setBackground(new java.awt.Color(204, 204, 204));
        txConsola.setColumns(20);
        txConsola.setRows(5);
        jScrollPane1.setViewportView(txConsola);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btEncender, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                        .addComponent(btApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btAcelerar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btFrenar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btFrenarBrusco, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btBuscar)
                                    .addComponent(lbPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbPlaca1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbPlaca2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33))
                                    .addComponent(txPlacaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbMotor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbLlanta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txPlacaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btBuscar))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbVehiculo)
                            .addComponent(txVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbPlaca))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbMotor)
                            .addComponent(lbPlaca1))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbPlaca2)
                            .addComponent(lbLlanta))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btEncender)
                            .addComponent(btApagar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btAcelerar)
                            .addComponent(btFrenar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btFrenarBrusco, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAcelerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAcelerarActionPerformed

        String velocidad = JOptionPane.showInputDialog(this, "Ingrese la velocidad ha acelerar");
        int velocidadInt = Integer.parseInt(velocidad);

        try {
            vehiculo.acelerar(velocidadInt);
            String temp = String.valueOf(vehiculo.getVelocidad());
            this.txVelocidad.setText(temp + "Km/h");
            this.txConsola.append("El vehiculo ha acelerado \n");

        } catch (FrenarAcelerarApagadoException a) {
            JOptionPane.showMessageDialog(this, "Un vehiculo apagado no puede acelerar");
            this.txConsola.append("El vehiculo intento encender estando apagado\n");
        } catch (CapacidadMotorSuperadaException b) {
            vehiculo.setVelocidad(0);
            JOptionPane.showMessageDialog(this, "El vehiculo ha superado la velocidad de su motor.Se ha estrellado.");
            this.txConsola.append("El vehiculo se ha estrellado \n");
            vehiculo.setFase("Estrellado");
            this.txVelocidad.setText(vehiculo.getVelocidad() + "Km/h");

        } finally {
            System.out.println("" + vehiculo.getVelocidad());
        }
    }//GEN-LAST:event_btAcelerarActionPerformed

    private void btFrenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFrenarActionPerformed
        String velocidad = JOptionPane.showInputDialog(this, "Ingrese la velocidad ha reducir");
        int velocidadInt = Integer.parseInt(velocidad);

        try {
            vehiculo.frenar(velocidadInt);
            String temp = String.valueOf(vehiculo.getVelocidad());
            this.txVelocidad.setText(temp + "Km/h");
            this.txConsola.append("El vehiculo ha frenado \n");
        } catch (FrenarAcelerarApagadoException a) {
            JOptionPane.showMessageDialog(this, "Un vehiculo apagado no puede frenar");
            this.txConsola.append("El vehiculo intento frenar estando apagado \n");
        } catch (FrenarDetenidoException b) {
            JOptionPane.showMessageDialog(this, "Un vehiculo detenido no puede frenar");
            this.txConsola.append("El vehiculo intento frenar estando detenido\n");

        } catch (FrenadoBruscoException c) {
            JOptionPane.showMessageDialog(this, "El vehiculo supero la velocidad limite de las llantas. Esta patinando");
            this.txConsola.append("El vehiculo esta patinando \n");
            this.txVelocidad.setText(vehiculo.getVelocidad() + "Km/h");
        } catch (FrenadoSuperiorVelocidadException d) {
            JOptionPane.showMessageDialog(this, "El vehiculo freno a una velocidad mayor a la actual. Esta patinando");
            this.txConsola.append("El vehiculo esta patinando \n");
        } catch (PatinadoDetenidoException w) {
            JOptionPane.showMessageDialog(this, "Si un vehículo patina, solo recuperara el control si es detenido");
            this.txConsola.append("Patinando \n");
        } finally {
            if (vehiculo.getVelocidad() < 0) {
                vehiculo.setVelocidad(velocidadInt/2);
                this.txVelocidad.setText(vehiculo.getVelocidad() + "Km/h");
                System.out.println("" + vehiculo.getVelocidad());
            } else {
                System.out.println("" + vehiculo.getVelocidad());

            }
        }
    }//GEN-LAST:event_btFrenarActionPerformed

    private void btFrenarBruscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFrenarBruscoActionPerformed
        try {
            vehiculo.frenarBruscamente();
            String temp = String.valueOf(vehiculo.getVelocidad());
            this.txVelocidad.setText(temp + "Km/h");
            this.txConsola.append("El vehiculo ha Frenado bruscamente \n");
        } catch (FrenarDetenidoException ex) {
            JOptionPane.showMessageDialog(this, "Un vehiculo detenido no puede frenar");
            this.txConsola.append("El vehiculo intento frenar bruscamente estando detenido \n");
        } catch (FrenarAcelerarApagadoException ex) {
            JOptionPane.showMessageDialog(this, "Un vehiculo apagado no puede frenar bruscamente");
            this.txConsola.append("El vehiculo intento frenar bruscamente estando apagado \n");
        } catch (FrenadoBruscoException ex) {
            JOptionPane.showMessageDialog(this, "El vehiculo freno bruscamente a mas de la velocidad limite de las llantas. Esta patinando");
            this.txConsola.append("El vehiculo esta patinando, solo recuperara el control si es detenido \n");
            this.txVelocidad.setText(vehiculo.getVelocidad() + "Km/h");
        } catch (FrenadoSuperiorVelocidadException ex) {
            JOptionPane.showMessageDialog(this, "El vehiculo freno bruscamente a una velocidad mayor a la actual. Esta patinando");
            this.txConsola.append("El vehiculo esta patinando, solo recuperara el control si es detenido \n");
            this.txVelocidad.setText(vehiculo.getVelocidad() + "Km/h");
        } catch (PatinadoDetenidoException w) {
            JOptionPane.showMessageDialog(this, "Si un vehículo patina, solo recuperara el control si es detenido");
            this.txConsola.append("Patinando \n");
            vehiculo.setFase("Patinando");
        } finally {
            if (vehiculo.getVelocidad() < 0) {
                vehiculo.setVelocidad(35);
                this.txVelocidad.setText(vehiculo.getVelocidad() + "Km/h");
                System.out.println("" + vehiculo.getVelocidad());
            } else {
                System.out.println("" + vehiculo.getVelocidad());

            }
        }
    }//GEN-LAST:event_btFrenarBruscoActionPerformed

    private void txVelocidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txVelocidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txVelocidadActionPerformed

    private void txPlacaBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txPlacaBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txPlacaBuscarActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        String placaBuscar = this.txPlacaBuscar.getText();

        Vehiculo vehiculoTemp = this.registro.buscarVehiculo(placaBuscar);

        if (vehiculoTemp != null) {
            this.vehiculo = vehiculoTemp;
            this.lbVehiculo.setText(placaBuscar);
            this.lbMotor.setText(comprobarMotor());
            this.lbLlanta.setText(comprobarLlanta());

            JOptionPane.showMessageDialog(this, "Vehiculo fue encontrado");
        } else {
            JOptionPane.showMessageDialog(this, "Vehiculo no encontrado");
        }
    }//GEN-LAST:event_btBuscarActionPerformed

    private void btEncenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEncenderActionPerformed
        try {
            vehiculo.encender();
            this.txConsola.append("El vehiculo se ha encendido \n");
        } catch (VehiculoEncendidoException a) {
            JOptionPane.showMessageDialog(this, "Un vehiculo encendido no puede volver ha encender");
        }catch(PerdidaTotalException b){
            JOptionPane.showMessageDialog(this, "El vehiculo se ha estrellado y no puede encender");
        }
        finally {
            System.out.println("Encendido");
        }

    }//GEN-LAST:event_btEncenderActionPerformed

    private void btApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btApagarActionPerformed
        try {
            this.vehiculo.apagar();
            this.txConsola.append("El vehiculo se ha Apagado \n");
            this.txVelocidad.setText(vehiculo.getVelocidad() + "Km/h");
        } catch (VehiculoApagadoException a) {
            JOptionPane.showMessageDialog(this, "Un vehiculo apagado no puede volver ha apagar");
        } catch (PatinadoApagadoException c) {
            JOptionPane.showMessageDialog(this, "Este vehiculo esta patinando, no se podra apagar");
            vehiculo.setFase("Patinando");
        } catch (ApagadoAccidenteException b) {
            JOptionPane.showMessageDialog(this, "El vehiculo se estrello y automaticamente se apaga");
            vehiculo.setFase("Estrellado");
            vehiculo.setEstado(false);
        } finally {
            System.out.println("apagado");
        }
    }

    public String comprobarLlanta() {
        String llantaEs;
        if (vehiculo.getLlanta() instanceof LlantaBarata) {
            return llantaEs = "Llanta barata";
        }
        if (vehiculo.getLlanta() instanceof LlantaBonita) {
            return llantaEs = "Llanta bonita";
        }
        if (vehiculo.getLlanta() instanceof LlantaBuena) {
            return llantaEs = "Llanta buena";
        }
        return null;
    }

    public String comprobarMotor() {
        String motorEs;
        if (vehiculo.getMotor() instanceof Motor1000Cc) {
            return motorEs = "1000 CC";
        }
        if (vehiculo.getMotor() instanceof Motor2000Cc) {
            return motorEs = "2000 CC";
        }
        if (vehiculo.getMotor() instanceof Motor3000Cc) {
            return motorEs = "3000 CC";
        }
        return null;
    }//GEN-LAST:event_btApagarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAcelerar;
    private javax.swing.JButton btApagar;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btEncender;
    private javax.swing.JButton btFrenar;
    private javax.swing.JButton btFrenarBrusco;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbLlanta;
    private javax.swing.JLabel lbMotor;
    private javax.swing.JLabel lbPlaca;
    private javax.swing.JLabel lbPlaca1;
    private javax.swing.JLabel lbPlaca2;
    private javax.swing.JLabel lbVehiculo;
    private javax.swing.JTextArea txConsola;
    private javax.swing.JTextField txPlacaBuscar;
    private javax.swing.JTextField txVelocidad;
    // End of variables declaration//GEN-END:variables
}
