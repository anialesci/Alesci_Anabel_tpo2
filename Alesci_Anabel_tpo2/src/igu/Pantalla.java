
package igu;

import excepciones.PerroException;
import excepciones.PersonaException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import logica.Controladora;
import logica.Persona;



public class Pantalla extends javax.swing.JFrame {
Controladora control;
    //-------METODO PARA LLAMAR A LA PANTALLA POR EL CONTROLADOR-------------//
    public Pantalla(Controladora control) {
        this.control = control;
        initComponents();
       
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        atencion_especial = new javax.swing.JLabel();
        num_cliente = new javax.swing.JLabel();
        nombre_perro = new javax.swing.JLabel();
        raza = new javax.swing.JLabel();
        color = new javax.swing.JLabel();
        alergico = new javax.swing.JLabel();
        observaciones = new javax.swing.JLabel();
        nombre_duenio = new javax.swing.JLabel();
        celular_duenio = new javax.swing.JLabel();
        comboboxatencionespecial = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnguardar = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();
        txtobservaciones = new javax.swing.JTextField();
        txtcelduenio = new javax.swing.JTextField();
        txtnombreduenio = new javax.swing.JTextField();
        txtcolorperro = new javax.swing.JTextField();
        txtrazaperro = new javax.swing.JTextField();
        txtnombrecliente = new javax.swing.JTextField();
        txtnrocliente = new javax.swing.JTextField();
        comboboxalergico = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(100000000, 100000000));

        Titulo.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        Titulo.setForeground(new java.awt.Color(0, 0, 204));
        Titulo.setText("Peluquería Canina");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(373, 373, 373)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        atencion_especial.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        atencion_especial.setText("Atención Especial:");

        num_cliente.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        num_cliente.setText("Cliente Nº:");

        nombre_perro.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        nombre_perro.setText("Nombre:");

        raza.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        raza.setText("Raza:");

        color.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        color.setText("Color:");

        alergico.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        alergico.setText("Alérgico:");

        observaciones.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        observaciones.setText("Observaciones:");

        nombre_duenio.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        nombre_duenio.setText("Nombre Dueño:");

        celular_duenio.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        celular_duenio.setText("Cel Dueño:");

        comboboxatencionespecial.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        comboboxatencionespecial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "SI", "NO" }));
        comboboxatencionespecial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxatencionespecialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1227, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(1236, 1236, 1236)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnguardar.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnguardar.setForeground(new java.awt.Color(0, 153, 51));
        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btnlimpiar.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnlimpiar.setForeground(new java.awt.Color(255, 51, 51));
        btnlimpiar.setText("Limpiar");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(532, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        txtobservaciones.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtobservaciones.setForeground(new java.awt.Color(153, 153, 153));
        txtobservaciones.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtobservaciones.setText("Agregue algún comentario");

        txtcelduenio.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtcelduenio.setForeground(new java.awt.Color(153, 153, 153));
        txtcelduenio.setText("Ingrese Celular del Dueño");

        txtnombreduenio.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtnombreduenio.setForeground(new java.awt.Color(153, 153, 153));
        txtnombreduenio.setText("Ingrese Nombre del Dueño");

        txtcolorperro.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtcolorperro.setForeground(new java.awt.Color(153, 153, 153));
        txtcolorperro.setText("Ingrese color perro");

        txtrazaperro.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtrazaperro.setForeground(new java.awt.Color(153, 153, 153));
        txtrazaperro.setText("Ingrese raza de su perro");
        txtrazaperro.setToolTipText("");

        txtnombrecliente.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtnombrecliente.setForeground(new java.awt.Color(153, 153, 153));
        txtnombrecliente.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtnombrecliente.setText("Ingrese Nombre de su perro");

        txtnrocliente.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtnrocliente.setForeground(new java.awt.Color(153, 153, 153));
        txtnrocliente.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtnrocliente.setText("Ingrese numero de cliente");
        txtnrocliente.setToolTipText("");
        txtnrocliente.setName("cliente"); // NOI18N
        txtnrocliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnroclienteActionPerformed(evt);
            }
        });

        comboboxalergico.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        comboboxalergico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "SI", "NO" }));
        comboboxalergico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxalergicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(254, 254, 254))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(observaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtobservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(alergico, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboboxalergico, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(color, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtnombrecliente, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                            .addComponent(txtrazaperro)
                            .addComponent(txtcolorperro))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(nombre_perro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(raza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(num_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtnrocliente, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(nombre_duenio, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(celular_duenio, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtcelduenio)
                                    .addComponent(txtnombreduenio, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(atencion_especial)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboboxatencionespecial, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(num_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtnrocliente, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nombre_perro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtnombrecliente, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(raza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtrazaperro, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(color, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtcolorperro, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(alergico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboboxalergico, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboboxatencionespecial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(atencion_especial, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(nombre_duenio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnombreduenio)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(celular_duenio, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcelduenio)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(observaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtobservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        txtnrocliente.getAccessibleContext().setAccessibleName("");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/imagepelu.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 765, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //----METODO PARA QUE EL BOTON LIMPIAR BORRE TODOS LOS DATOS INGRESADOS---//
    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        txtnrocliente.setText("");
        txtnombrecliente.setText("");
        txtrazaperro.setText("");
        txtcolorperro.setText("");
        comboboxalergico.setSelectedIndex(0);
        comboboxatencionespecial.setSelectedIndex(0);
        txtnombreduenio.setText("");
        txtcelduenio.setText("");
        txtobservaciones.setText("");
    }//GEN-LAST:event_btnlimpiarActionPerformed
    //-----METODO PARA QUE EL COMBOX ALÉRGICO MUESTRE SUS OPCIONES(-,SI,NO)---//
    private void comboboxalergicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxalergicoActionPerformed
        String alergico = comboboxalergico.getSelectedItem().toString();
        System.out.println("Alérgico: " + alergico);
    }//GEN-LAST:event_comboboxalergicoActionPerformed
    //METODO PARA QUE EL COMBOX ATENCIÓN ESPECIAL MUESTRE SUS OPCIONES(-,SI,NO)//
    private void comboboxatencionespecialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxatencionespecialActionPerformed
        String atencion_especial = comboboxatencionespecial.getSelectedItem().toString();
        System.out.println("Atencion especial: " + atencion_especial);
    }//GEN-LAST:event_comboboxatencionespecialActionPerformed
    //METODO PARA GUARDAR LOS DATOS INGRESADOS(Muestra mensaje si el cliente fue agregado)//
    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        Integer numero_cliente = Integer.valueOf( txtnrocliente.getText());
        System.out.println("numero"+numero_cliente);
        String nombre_perro = txtnombrecliente.getText();
        System.out.println(nombre_perro);
        String raza = txtrazaperro.getText();
         System.out.println(raza);
        String color = txtcolorperro.getText();
         System.out.println(color);
        boolean alergico;
        if(comboboxalergico.getItemAt(comboboxalergico.getSelectedIndex()).matches("SI")){
        alergico = true;
        }else{
        alergico = false;
        }
        boolean atencion_especial;
         System.out.println(alergico);
        if(comboboxatencionespecial.getItemAt(comboboxatencionespecial.getSelectedIndex()).matches("SI")){
            atencion_especial = true;
        }else{
            atencion_especial = false;
        }
         System.out.println(atencion_especial);
        String nombre_duenio = txtnombreduenio.getText();
        Integer celular_duenio = Integer.valueOf(txtnrocliente.getText());
        String observaciones = txtobservaciones.getText();
        //Guarda persona y perro en la base de datos
        Persona pers = new Persona();
        try{
        pers =control.crearPersona(nombre_duenio,celular_duenio,observaciones);
   
        }catch(PersonaException px){
             Logger.getLogger(Pantalla.class.getName()).log(Level.SEVERE, null, px);
           
        }
            try {
                control.crearPerro(numero_cliente,nombre_perro,raza,color,alergico,atencion_especial,pers);
            } catch (PerroException pex) {
                Logger.getLogger(Pantalla.class.getName()).log(Level.SEVERE, null, pex);
            }
            catch (Exception ex){
        Logger.getLogger(Pantalla.class.getName()).log(Level.SEVERE, null, ex);
    }
        //Muestra mensaje al agregar correctamente un cliente
        JOptionPane.showMessageDialog(rootPane, "Cliente agregado correctamente",
                "Cliente Agregado",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnguardarActionPerformed

    private void txtnroclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnroclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnroclienteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel alergico;
    private javax.swing.JLabel atencion_especial;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JLabel celular_duenio;
    private javax.swing.JLabel color;
    private javax.swing.JComboBox<String> comboboxalergico;
    private javax.swing.JComboBox<String> comboboxatencionespecial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel nombre_duenio;
    private javax.swing.JLabel nombre_perro;
    private javax.swing.JLabel num_cliente;
    private javax.swing.JLabel observaciones;
    private javax.swing.JLabel raza;
    private javax.swing.JTextField txtcelduenio;
    private javax.swing.JTextField txtcolorperro;
    private javax.swing.JTextField txtnombrecliente;
    private javax.swing.JTextField txtnombreduenio;
    private javax.swing.JTextField txtnrocliente;
    private javax.swing.JTextField txtobservaciones;
    private javax.swing.JTextField txtrazaperro;
    // End of variables declaration//GEN-END:variables

}