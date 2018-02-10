/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Data.RegisterAccident;
import Data.RegisterConductor;
import Data.RegisterVehiculo;
import Data.RegisterVictima;
import Data.Subscriber;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author circ
 */
public class Formulario extends javax.swing.JInternalFrame {
    
    private String tempIpat;

    public Formulario() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtIpat = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        rbGravedad = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtLugar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        rbLocalidad = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtFechaAccidente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtFechaEntrega = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        rbClase = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        rbChoque = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        txtHeridos = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        txtObservaciones = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        txtMuertos = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jThipotesis1 = new javax.swing.JTextField();
        jThipotesis2 = new javax.swing.JTextField();
        jThipotesis3 = new javax.swing.JTextField();
        jThipotesis4 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        txtAgente = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        rbDocVictima = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        txtDocVictima = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        rbNacionalidadVictima = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        txtEdadVictima = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        rbSexoVictima = new javax.swing.JComboBox<>();
        jLabel34 = new javax.swing.JLabel();
        rbGravedadVictima = new javax.swing.JComboBox<>();
        cbEmbriagezVictima = new javax.swing.JRadioButton();
        cbCinturonVictima = new javax.swing.JRadioButton();
        cbCascoVictima = new javax.swing.JRadioButton();
        cbChalecoVictima = new javax.swing.JRadioButton();
        jLabel35 = new javax.swing.JLabel();
        rbCondicion = new javax.swing.JComboBox<>();
        btnAddVictima = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        rbDocConductor = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        txtDocConuductor = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        rbNacionalidadConductor = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        txtEdadConductor = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        rbSexoConductor = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        rbGravedadConductor = new javax.swing.JComboBox<>();
        cbEmbriaguez = new javax.swing.JRadioButton();
        cbLicencia = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        rbCategoria = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        rbRestriccion = new javax.swing.JComboBox<>();
        cbChaleco = new javax.swing.JRadioButton();
        cbCasco = new javax.swing.JRadioButton();
        cbCinturon = new javax.swing.JRadioButton();
        jRadioBtmecanica = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        rbNacionalidad = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        rbMarca = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        rbEmpresa = new javax.swing.JComboBox<>();
        cbTec = new javax.swing.JRadioButton();
        cbSoat = new javax.swing.JRadioButton();
        cbRegistro = new javax.swing.JRadioButton();
        cbPropietario = new javax.swing.JRadioButton();
        jLabel26 = new javax.swing.JLabel();
        rbClasevehiculo = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        rbServicio = new javax.swing.JComboBox<>();
        btnAddConductor = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        setTitle("INFORME POLICIAL DE ACCIDENTE DE TRANSITO");
        setToolTipText("");
        setMaximumSize(new java.awt.Dimension(500, 2147483647));
        setPreferredSize(new java.awt.Dimension(1006, 950));
        setVerifyInputWhenFocusTarget(false);
        getContentPane().setLayout(null);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 4, true));

        jLabel1.setText("No.");

        txtIpat.setBackground(new java.awt.Color(240, 240, 240));

        jLabel2.setText("Gravedad");

        rbGravedad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Daños", "Heridos", "Muertos" }));

        jLabel3.setText("Lugar");

        txtLugar.setBackground(new java.awt.Color(240, 240, 240));

        jLabel4.setText("Localidad");

        rbLocalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));

        jLabel5.setText("Fecha Accidente");

        txtFechaAccidente.setBackground(new java.awt.Color(240, 240, 240));

        jLabel6.setText("Fecha Entrega");

        txtFechaEntrega.setBackground(new java.awt.Color(240, 240, 240));

        jLabel8.setText("Clase de Accidente");

        rbClase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choque", "Atropello", "Volcamiento", "Caida Ocupante", "Incendio", "Otro" }));

        jLabel9.setText("Choque Con");

        rbChoque.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vehiculo", "Semoviente", "Muro", "Poste", "Arbol", "Barranda", "Semaforo", "Inmueble", "Señal", "Vehiculo Estacionado", "Otro" }));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel36.setText("Total Heridos");

        txtHeridos.setBackground(new java.awt.Color(240, 240, 240));

        jLabel40.setText("Observaciones");

        txtObservaciones.setBackground(new java.awt.Color(240, 240, 240));

        jLabel37.setText("Total Muertos");

        txtMuertos.setBackground(new java.awt.Color(240, 240, 240));

        jLabel38.setText("Hipotesis");

        jThipotesis1.setBackground(new java.awt.Color(240, 240, 240));

        jThipotesis2.setBackground(new java.awt.Color(240, 240, 240));

        jThipotesis3.setBackground(new java.awt.Color(240, 240, 240));

        jThipotesis4.setBackground(new java.awt.Color(240, 240, 240));

        jLabel39.setText("Agente");

        txtAgente.setBackground(new java.awt.Color(240, 240, 240));

        btnNuevo.setText("Nuevo");
        btnNuevo.setEnabled(false);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(519, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addGap(51, 51, 51)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIpat, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rbGravedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel36)
                                    .addComponent(jLabel37)
                                    .addComponent(jLabel38))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jThipotesis1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jThipotesis2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jThipotesis3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jThipotesis4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(100, 100, 100)
                                        .addComponent(jLabel39)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtAgente, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtMuertos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtHeridos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel40)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLugar, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtFechaEntrega, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                            .addComponent(txtFechaAccidente))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(rbClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(42, 42, 42)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(rbLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rbChoque, 0, 164, Short.MAX_VALUE)))))
                        .addGap(35, 35, 35))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIpat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(rbGravedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(rbLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtFechaAccidente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtFechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(rbClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(rbChoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel40)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel36)
                                .addComponent(txtHeridos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel37)
                            .addComponent(txtMuertos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel38)
                            .addComponent(jThipotesis1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jThipotesis2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jThipotesis3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jThipotesis4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel39)
                            .addComponent(txtAgente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txtObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnNuevo))
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(32, 36, 904, 343);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(943, 524, 45, 0);

        jLabel28.setText("Victima");
        getContentPane().add(jLabel28);
        jLabel28.setBounds(32, 744, 110, 16);

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 4, true));

        jLabel29.setText("Doc.");

        rbDocVictima.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CC", "TI", "RC", "CE", "PASS" }));

        jLabel30.setText("No.");

        txtDocVictima.setBackground(new java.awt.Color(240, 240, 240));

        jLabel31.setText("Nacionalidad");

        rbNacionalidadVictima.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Colombiano", "Extranjero" }));

        jLabel32.setText("Edad");

        txtEdadVictima.setBackground(new java.awt.Color(240, 240, 240));

        jLabel33.setText("Sexo");

        rbSexoVictima.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));

        jLabel34.setText("Gravedad");

        rbGravedadVictima.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "?", "Muerto", "Herido" }));

        cbEmbriagezVictima.setText("Embriaguez");

        cbCinturonVictima.setText("Cinturon");

        cbCascoVictima.setText("Casco");

        cbChalecoVictima.setText("Chaleco");

        jLabel35.setText("Condicion");

        rbCondicion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Peaton", "Pasajero", "Acompañante" }));

        btnAddVictima.setText("Añadir");
        btnAddVictima.setEnabled(false);
        btnAddVictima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddVictimaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbDocVictima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDocVictima, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbNacionalidadVictima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEdadVictima, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbSexoVictima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbGravedadVictima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(cbEmbriagezVictima)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbCinturonVictima)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbCascoVictima)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbChalecoVictima)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbCondicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAddVictima, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(145, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(rbDocVictima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30)
                    .addComponent(txtDocVictima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31)
                    .addComponent(rbNacionalidadVictima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32)
                    .addComponent(txtEdadVictima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33)
                    .addComponent(rbSexoVictima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34)
                    .addComponent(rbGravedadVictima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbEmbriagezVictima)
                    .addComponent(cbCinturonVictima)
                    .addComponent(cbCascoVictima)
                    .addComponent(cbChalecoVictima)
                    .addComponent(jLabel35)
                    .addComponent(rbCondicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddVictima)
                .addGap(7, 7, 7))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(32, 767, 904, 129);

        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 4, true));

        jLabel12.setText("Doc.");

        rbDocConductor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CC", "TI", "RC", "CE", "PASS" }));

        jLabel13.setText("No.");

        txtDocConuductor.setBackground(new java.awt.Color(240, 240, 240));

        jLabel14.setText("Nacionalidad");

        rbNacionalidadConductor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Colombiano", "Extranjero" }));

        jLabel15.setText("Edad");

        txtEdadConductor.setBackground(new java.awt.Color(240, 240, 240));

        jLabel16.setText("Sexo");

        rbSexoConductor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));

        jLabel17.setText("Gravedad");

        rbGravedadConductor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "?", "Muerto", "Herido" }));

        cbEmbriaguez.setText("Embriaguez");

        cbLicencia.setText("Licencia");

        jLabel18.setText("Categoria");

        rbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A1", "A2", "B1", "B2", "B3", "C1", "C2", "C3", "EXT", " " }));

        jLabel19.setText("Restricción");

        rbRestriccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7" }));

        cbChaleco.setText("Chaleco");

        cbCasco.setText("Casco");

        cbCinturon.setText("Cinturon");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cbEmbriaguez)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbLicencia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbRestriccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbChaleco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbCasco)
                        .addGap(4, 4, 4)
                        .addComponent(cbCinturon))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbDocConductor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDocConuductor, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbNacionalidadConductor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEdadConductor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbSexoConductor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbGravedadConductor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbDocConductor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(txtDocConuductor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(rbNacionalidadConductor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(txtEdadConductor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(rbSexoConductor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17)
                        .addComponent(rbGravedadConductor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbEmbriaguez)
                    .addComponent(cbLicencia)
                    .addComponent(jLabel18)
                    .addComponent(rbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(rbRestriccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbChaleco)
                    .addComponent(cbCasco)
                    .addComponent(cbCinturon))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel21.setText("Placa");

        txtPlaca.setBackground(new java.awt.Color(240, 240, 240));

        jLabel22.setText("Nacionalidad");

        rbNacionalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Colombiano", "Extranjero" }));

        jLabel23.setText("Marca");

        rbMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "?", "Alfa Romeo", "Audi", "BMW", "Brilliance", "BYD", "Chana", "Changan", "Changhe", "Chery", "Chevrolet", "Citroen", "DFSK", "Dodge", "Ferrari", "Fiat", "Ford", "Foton", "Geely", "Great Wall", "Hafei", "Honda", "Hyundai", "JAC", "Jaguar", "Jeep", "Jinbei", "JMC", "Kia", "Land Rover", "Mahindra", "Maserati", "Mazda", "Mercedes Bens", "MG", "Mini Cooper", "Mitsubishi", "Nissan", "Peugeot", "Porsche", "Ram", "Renault", "Seat", "Skoda", "Ssngyong", "Subaru", "Suzuki", "Toyota", "Volkswagen", "Volvo", "ZNA", "Zotye", " ", " ", " ", " ", " " }));

        jLabel24.setText("Modelo");

        txtModelo.setBackground(new java.awt.Color(240, 240, 240));

        jLabel25.setText("Empresa");

        rbEmpresa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "?", "Flota de Lujo", "Renaciente", "Castellanos Garcia Etul", "Media Luna", "Pemape", "Cootaxcontucar", "Metrocar", "Montero", "Vehitrans", "Rodriguez Torices", "Cootransurb", "Cooprotax", "Cootransnbol", "Cootaxcart", "Rapido el Carmen", "Heroica", "Coointracar", "Cortransindia", "Taxmar", "Taxi Lugo", "Transambiental", "Transcaribe", " " }));

        cbTec.setText("Tec. Mec.");

        cbSoat.setText("Soat");

        cbRegistro.setText("Seg. Res. Civil");

        cbPropietario.setText("Propietario");

        jLabel26.setText("Clase Vehiculo");

        rbClasevehiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "?", "Auto", "Bus", "Buseta", "Camion", "Camioneta", "Campero", "Microbus", "Tractocamion", "Volqueta", "Moto", "M. Agricola", "M. Industrial", "Bicicleta", "Motocarro", "Traccion Animal", "Motociclo", "Cuatrimoto", "Remolque", " " }));

        jLabel27.setText("Clase Servicio");

        rbServicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Oficial", "Publico", "Particular", "Diplomatico" }));

        javax.swing.GroupLayout jRadioBtmecanicaLayout = new javax.swing.GroupLayout(jRadioBtmecanica);
        jRadioBtmecanica.setLayout(jRadioBtmecanicaLayout);
        jRadioBtmecanicaLayout.setHorizontalGroup(
            jRadioBtmecanicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jRadioBtmecanicaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jRadioBtmecanicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jRadioBtmecanicaLayout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jRadioBtmecanicaLayout.createSequentialGroup()
                        .addComponent(cbTec)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbSoat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbRegistro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbPropietario))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jRadioBtmecanicaLayout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbClasevehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jRadioBtmecanicaLayout.setVerticalGroup(
            jRadioBtmecanicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jRadioBtmecanicaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jRadioBtmecanicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(rbNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(rbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(rbEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jRadioBtmecanicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTec)
                    .addComponent(cbSoat)
                    .addComponent(cbRegistro)
                    .addComponent(cbPropietario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jRadioBtmecanicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(rbClasevehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(rbServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        btnAddConductor.setText("Añadir");
        btnAddConductor.setEnabled(false);
        btnAddConductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddConductorActionPerformed(evt);
            }
        });

        jLabel10.setText("Información del Vehiculo:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddConductor, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioBtmecanica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioBtmecanica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddConductor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5);
        jPanel5.setBounds(32, 409, 904, 317);

        jLabel11.setText("Informacion del Conductor:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(32, 386, 156, 16);

        jLabel20.setText("Informe de Accidentalidad");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(32, 13, 149, 16);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clear() {
        
    }
    
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Map<String, String> accidente = new HashMap();
        
        if(txtIpat.getText() == null) {
            tempIpat = txtIpat.getText();
            accidente.put("Ipat", tempIpat);
            accidente.put("Gravedad", rbGravedad.getSelectedItem().toString());
            accidente.put("Lugar", txtLugar.getText());
            accidente.put("Fecha accidente", txtFechaAccidente.getText());
            accidente.put("Fecha entrega", txtFechaEntrega.getText());
            accidente.put("Clase Accidente", rbClase.getSelectedItem().toString());
            accidente.put("Localidad", rbLocalidad.getSelectedItem().toString());
            accidente.put("Choque Con", rbChoque.getSelectedItem().toString());
            accidente.put("Total Muertos", txtMuertos.getText());
            accidente.put("Total Heridos", txtHeridos.getText());
            accidente.put("txtAgente", txtAgente.getText());
            accidente.put("txtObservaciones", txtObservaciones.getText());
            accidente.put("", "");
        
            /**
             * Espacio Temporal
             */
            boolean focus = new RegisterAccident().addAccidente(accidente);
            if(focus) {
               btnAddVictima.setEnabled(true);
               btnAddConductor.setEnabled(true);
               btnNuevo.setEnabled(true);
               btnGuardar.setEnabled(false);
            }
            /**
             * Fin
             */
        } else {
            Subscriber.toSubscribe().setLog("No se ha asginado un Ipat al informe");
        }
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnAddConductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddConductorActionPerformed
        Map<String, String> conductor = new HashMap();
        Map<String, String> vehiculo = new HashMap();
        
        conductor.put("Doc", rbDocConductor.getSelectedItem().toString());
        conductor.put("Identificacion", txtDocConuductor.getText());
        conductor.put("Nacionalidad", rbNacionalidadConductor.getSelectedItem().toString());
        conductor.put("Edad", txtEdadConductor.getText());
        conductor.put("Sexo", rbSexoConductor.getSelectedItem().toString());
        conductor.put("Gravedad", rbGravedadConductor.getSelectedItem().toString());
        conductor.put("Embriaguez", String.valueOf(cbEmbriaguez.isSelected()));
        conductor.put("Licencia", String.valueOf(cbLicencia.isSelected()));
        conductor.put("Categoria", rbCategoria.getSelectedItem().toString());
        conductor.put("Retrinccion", rbRestriccion.getSelectedItem().toString());
        conductor.put("Chaleco", String.valueOf(cbChaleco.isSelected()));
        conductor.put("Casco", String.valueOf(cbCasco.isSelected()));
        conductor.put("Cinturon", String.valueOf(cbCinturon.isSelected()));
        
        vehiculo.put("Placa", txtPlaca.getText());
        vehiculo.put("Nacionalidad", rbNacionalidad.getSelectedItem().toString());
        vehiculo.put("Marca", rbMarca.getSelectedItem().toString());
        vehiculo.put("Modelo", txtModelo.getText());
        vehiculo.put("Empresa", rbEmpresa.getSelectedItem().toString());
        vehiculo.put("Clase vehiculo", rbClasevehiculo.getSelectedItem().toString());
        vehiculo.put("Servicio", rbServicio.getSelectedItem().toString());
        vehiculo.put("Tec", String.valueOf(cbTec.isSelected()));
        vehiculo.put("soat", String.valueOf(cbSoat.isSelected()));
        vehiculo.put("Registro Civil", String.valueOf(cbRegistro.isSelected()));
        vehiculo.put("Propietario", String.valueOf(cbPropietario.isSelected()));
        
        /**
         * Espacio Temporal
         */
        new RegisterConductor().addConductor(tempIpat, conductor);
        new RegisterVehiculo().addVehiculo(txtDocConuductor.getText(), vehiculo);
        /**
         * Fin
         */
    }//GEN-LAST:event_btnAddConductorActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        btnGuardar.setEnabled(true);
        btnNuevo.setEnabled(false);
        btnAddVictima.setEnabled(false);
        btnAddConductor.setEnabled(false);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnAddVictimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddVictimaActionPerformed
        Map<String, String> victima = new HashMap();
        
        victima.put("Doc", rbDocVictima.getSelectedItem().toString());
        victima.put("Identificacion", txtDocVictima.getText());
        victima.put("Nacionalidad", rbNacionalidadVictima.getSelectedItem().toString());
        victima.put("Edad", txtEdadVictima.getText());
        victima.put("Sexo", rbSexoVictima.getSelectedItem().toString());
        victima.put("Gravedad", rbGravedadVictima.getSelectedItem().toString());
        victima.put("Embriaguez", String.valueOf(cbEmbriagezVictima.isSelected()));
        victima.put("Condicion", rbCondicion.getSelectedItem().toString());
        victima.put("Categoria", rbCategoria.getSelectedItem().toString());
        victima.put("Chaleco", String.valueOf(cbChalecoVictima.isSelected()));
        victima.put("Casco", String.valueOf(cbCascoVictima.isSelected()));
        victima.put("Cinturon", String.valueOf(cbCinturonVictima.isSelected()));
        
        /**
         * Espacio Temporal
         */
        new RegisterVictima().addVictima(tempIpat, victima);
        /**
         * Fin
         */
    }//GEN-LAST:event_btnAddVictimaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddConductor;
    private javax.swing.JButton btnAddVictima;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JRadioButton cbCasco;
    private javax.swing.JRadioButton cbCascoVictima;
    private javax.swing.JRadioButton cbChaleco;
    private javax.swing.JRadioButton cbChalecoVictima;
    private javax.swing.JRadioButton cbCinturon;
    private javax.swing.JRadioButton cbCinturonVictima;
    private javax.swing.JRadioButton cbEmbriagezVictima;
    private javax.swing.JRadioButton cbEmbriaguez;
    private javax.swing.JRadioButton cbLicencia;
    private javax.swing.JRadioButton cbPropietario;
    private javax.swing.JRadioButton cbRegistro;
    private javax.swing.JRadioButton cbSoat;
    private javax.swing.JRadioButton cbTec;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jRadioBtmecanica;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JTextField jThipotesis1;
    private javax.swing.JTextField jThipotesis2;
    private javax.swing.JTextField jThipotesis3;
    private javax.swing.JTextField jThipotesis4;
    private javax.swing.JComboBox<String> rbCategoria;
    private javax.swing.JComboBox<String> rbChoque;
    private javax.swing.JComboBox<String> rbClase;
    private javax.swing.JComboBox<String> rbClasevehiculo;
    private javax.swing.JComboBox<String> rbCondicion;
    private javax.swing.JComboBox<String> rbDocConductor;
    private javax.swing.JComboBox<String> rbDocVictima;
    private javax.swing.JComboBox<String> rbEmpresa;
    private javax.swing.JComboBox<String> rbGravedad;
    private javax.swing.JComboBox<String> rbGravedadConductor;
    private javax.swing.JComboBox<String> rbGravedadVictima;
    private javax.swing.JComboBox<String> rbLocalidad;
    private javax.swing.JComboBox<String> rbMarca;
    private javax.swing.JComboBox<String> rbNacionalidad;
    private javax.swing.JComboBox<String> rbNacionalidadConductor;
    private javax.swing.JComboBox<String> rbNacionalidadVictima;
    private javax.swing.JComboBox<String> rbRestriccion;
    private javax.swing.JComboBox<String> rbServicio;
    private javax.swing.JComboBox<String> rbSexoConductor;
    private javax.swing.JComboBox<String> rbSexoVictima;
    private javax.swing.JTextField txtAgente;
    private javax.swing.JTextField txtDocConuductor;
    private javax.swing.JTextField txtDocVictima;
    private javax.swing.JTextField txtEdadConductor;
    private javax.swing.JTextField txtEdadVictima;
    private javax.swing.JTextField txtFechaAccidente;
    private javax.swing.JTextField txtFechaEntrega;
    private javax.swing.JTextField txtHeridos;
    private javax.swing.JTextField txtIpat;
    private javax.swing.JTextField txtLugar;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtMuertos;
    private javax.swing.JTextField txtObservaciones;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables
}
