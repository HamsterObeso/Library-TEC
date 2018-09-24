

package interfaz;
//Se importa lo necesario para que la ventana funcione
import atencionClientes.*;
import clientes.*;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import libros.*;
import listaSimpleLibros.*;
import java.util.Date;
public final class VentanaClientes extends javax.swing.JFrame {

    //Se definen las variables a utilizar en la ventana clientes
    Cliente info1 = new Cliente ();
    ListaClientes lc = new ListaClientes();
    DefaultListModel modeloLibritos = new DefaultListModel();
    DefaultListModel modeloLibrosCliente = new DefaultListModel();
    VentanaLibros vlibros = null;
    ListaLibros librosCliente = new ListaLibros();
    ListaLibros librosExistentes = new ListaLibros();
    
    //Se crea una nueva ventana para clientes
    public VentanaClientes() {
        initComponents();
        setTitle("Ventana de clientes");
        jListLibritos.setModel(modeloLibritos);
        jListLibrosCliente.setModel(modeloLibrosCliente);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    //Código para extraer la lista de libros y meterla en la combobox
    public void llenarComboBox(){
        String s = "";
        this.jComboBoxLibritos.removeAllItems();
        try
        {
            librosExistentes = vlibros.getLibros();
            Libro l;
            
            int cantLibros = librosExistentes.largoLista();

            for (int i = 0; i < cantLibros; i++){
                this.jComboBoxLibritos.addItem(librosExistentes.devolverDato(i).getNombre());
            }
        }
        catch (Exception e){
            System.out.println("Error al cargar los libros.");
        }
        
    }
    
    public void setventanaLibros(VentanaLibros pvLibros){
        this.vlibros = pvLibros;
    }
    
    public void añadir(){
        // Obtiene valores de la ventana
        Cliente cliente = new Cliente ();
        String name = jTextNombre.getText();
        String correoElectrónico = jTextCorreo.getText();
        int cédula = Integer.parseInt(jTextCedula.getText());
        int telefono = Integer.parseInt(jTextTeléfono.getText());
	Date date = new Date();
        
        // Agrega los valores al cliente
        cliente.setName(name);
        cliente.setTeléfono(telefono);
        cliente.setCorreoElectrónico(correoElectrónico);
        cliente.setCédula(cédula);
        cliente.setDirección(this.jTextDirrecion.getText());
        cliente.setLibros(librosCliente);
        cliente.setFecha(date.toString());
        // Limpia la lista 
        librosCliente = new ListaLibros();
        
        // Añade a lista clientes
        lc.insertarUltimo(cliente);
        modeloLibritos.addElement(cliente);
        System.out.println("ListaClientes.largo "+lc.largoLista());
        JOptionPane.showMessageDialog(rootPane, "El registro del cliente ha sido creado correctamente");  
    }

    public void mostrar(){
        

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabelName = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jLabelTeléfono = new javax.swing.JLabel();
        jTextTeléfono = new javax.swing.JTextField();
        jLabelLibro = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListLibritos = new javax.swing.JList<>();
        jButton2 = new javax.swing.JButton();
        jComboBoxLibritos = new javax.swing.JComboBox<>();
        jLabelCedula = new javax.swing.JLabel();
        jLabelDireccion = new javax.swing.JLabel();
        jTextDirrecion = new javax.swing.JTextField();
        jTextCedula = new javax.swing.JTextField();
        jButtonRegistrar = new javax.swing.JButton();
        jLabelCorreo = new javax.swing.JLabel();
        jTextCorreo = new javax.swing.JTextField();
        jButtonAgregarLibro = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListLibrosCliente = new javax.swing.JList<>();
        jButtonBorrarLibro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonCargarCliente = new javax.swing.JButton();
        jLabelFecha = new javax.swing.JLabel();
        jTextFecha = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabelName.setText("Nombre");

        jTextNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombreActionPerformed(evt);
            }
        });

        jLabelTeléfono.setText("Teléfono");

        jLabelLibro.setText("Libro");

        jScrollPane1.setViewportView(jListLibritos);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Volver a la pantalla principal");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBoxLibritos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxLibritos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxLibritosMouseClicked(evt);
            }
        });
        jComboBoxLibritos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxLibritosActionPerformed(evt);
            }
        });

        jLabelCedula.setText("Cédula");

        jLabelDireccion.setText("Dirección");

        jButtonRegistrar.setText("Registrar");
        jButtonRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRegistrarMouseClicked(evt);
            }
        });

        jLabelCorreo.setText("Correo");

        jButtonAgregarLibro.setText("Agregar libro");
        jButtonAgregarLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAgregarLibroMouseClicked(evt);
            }
        });

        jScrollPane2.setViewportView(jListLibrosCliente);

        jButtonBorrarLibro.setText("Borrar libro");
        jButtonBorrarLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonBorrarLibroMouseClicked(evt);
            }
        });

        jLabel1.setText("Libros actuales del cliente");

        jButtonCargarCliente.setText("Cargar cliente");
        jButtonCargarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCargarClienteMouseClicked(evt);
            }
        });

        jLabelFecha.setText("Fecha");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jButtonBorrarLibro, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonAgregarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonCargarCliente)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelName)
                            .addComponent(jLabelCedula)
                            .addComponent(jLabelTeléfono)
                            .addComponent(jLabelDireccion)
                            .addComponent(jLabelLibro)
                            .addComponent(jLabelCorreo)
                            .addComponent(jLabelFecha))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxLibritos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextTeléfono)
                            .addComponent(jTextNombre)
                            .addComponent(jTextDirrecion)
                            .addComponent(jTextCedula)
                            .addComponent(jTextCorreo)
                            .addComponent(jTextFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(284, 284, 284)
                                .addComponent(jButtonRegistrar)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonRegistrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCedula)
                            .addComponent(jTextCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelName)
                            .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDireccion)
                            .addComponent(jTextDirrecion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTeléfono)
                            .addComponent(jTextTeléfono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCorreo)
                            .addComponent(jTextCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelLibro)
                            .addComponent(jComboBoxLibritos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelFecha)
                            .addComponent(jTextFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonAgregarLibro)
                            .addComponent(jButtonBorrarLibro)
                            .addComponent(jButtonCargarCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jTextNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreActionPerformed
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        VentanaPrincipal v1 = new VentanaPrincipal();
        v1.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void jComboBoxLibritosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxLibritosActionPerformed
        
    }//GEN-LAST:event_jComboBoxLibritosActionPerformed

    //Botón para cargar todos los libros en la ventana principal de libros a la combobox
    private void jComboBoxLibritosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxLibritosMouseClicked
        // TODO add your handling code here:
        if (jComboBoxLibritos.getItemCount() != 0)
        {
            llenarComboBox();
        }
        
    }//GEN-LAST:event_jComboBoxLibritosMouseClicked
    
    //Botón para añadir los libros seleccionados en el combobox a la lista del cliente
    private void jButtonAgregarLibroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAgregarLibroMouseClicked
        // TODO add your handling code here:
        int index = jComboBoxLibritos.getSelectedIndex();
        librosCliente.insertarUltimo(librosExistentes.devolverDato(index));
        modeloLibrosCliente.addElement(librosExistentes.devolverDato(index).getNombre());
    }//GEN-LAST:event_jButtonAgregarLibroMouseClicked
    
    //Botón para registrar a los clientes, metiendo toda la información en la lista y limpiando la interfaz
    private void jButtonRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRegistrarMouseClicked
        // TODO add your handling code here:
        añadir();
        LimpiarInterfaz();
    }//GEN-LAST:event_jButtonRegistrarMouseClicked
    // Limpia la interfaz para poder volverle a meter valores
    private void LimpiarInterfaz(){
        jTextNombre.setText("");
        jTextCedula.setText("");
        jTextTeléfono.setText("");
        jTextDirrecion.setText("");
        jTextCorreo.setText("");
        jTextFecha.setText("");
        
        modeloLibrosCliente.removeAllElements();
        
    }
    //configura el botón para borrar los libros que el cliente desee
    private void jButtonBorrarLibroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBorrarLibroMouseClicked
        // TODO add your handling code here:
        int index = jListLibrosCliente.getSelectedIndex();
        librosCliente.borraPosicion(index);
        modeloLibrosCliente.removeElementAt(index);
        System.out.println(modeloLibrosCliente.size());
    }//GEN-LAST:event_jButtonBorrarLibroMouseClicked

    private void jButtonCargarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCargarClienteMouseClicked
        // TODO add your handling code here:
        
        // Saca la cédula para buscar
        int cédula = Integer.parseInt(this.jTextCedula.getText());
        
        // Guarda el cliente encontrado en info1
        info1 = ObtenerCliente(cédula);
        
        if (info1 == null){
            // Manejar el error, porque no encontró cliente
            return;
        }
        
        // Actualizar interfaz con los datos de info1
        jTextNombre.setText(info1.getName());
        jTextCedula.setText(""+info1.getCédula());
        jTextTeléfono.setText(""+info1.getTeléfono());
        jTextDirrecion.setText(info1.getDirección());
        jTextCorreo.setText(info1.getCorreoElectrónico());
        jTextFecha.setText(info1.getFecha());
        
        // Actualizar la lista de libros (lógica e interfaz)
        modeloLibrosCliente.removeAllElements();
        for (int i = 0; i < info1.getLibros().largoLista(); i++) {
            String nombre = info1.getLibros().devolverDato(i).getNombre();
            String descripcion = info1.getLibros().devolverDato(i).getDescripción();
            modeloLibrosCliente.addElement(nombre+" "+descripcion);
            librosCliente.insertarUltimo(info1.getLibros().devolverDato(i));
        }
        
        
        
    }//GEN-LAST:event_jButtonCargarClienteMouseClicked

    private Cliente ObtenerCliente(int cédula){
        
        // Molde para cliente
        Cliente clienteTemp;
        
        // Búsqueda
        for (int i = 0; i < lc.largoLista(); i++) {
            // Para cada cliente en la lista, lo copio a temporal
            clienteTemp = lc.devolverDato(i);
            
            // Devuelvo el cliente que concuerde
            if (clienteTemp.getCédula() == cédula){
                lc.borraPosicion(i);
                modeloLibritos.remove(i);
                return clienteTemp;
            }
        }
        System.out.println("El cliente con la cédula ingresada no existe.");
        return null;
    }

    
    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonAgregarLibro;
    private javax.swing.JButton jButtonBorrarLibro;
    private javax.swing.JButton jButtonCargarCliente;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JComboBox<String> jComboBoxLibritos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCedula;
    private javax.swing.JLabel jLabelCorreo;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelLibro;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelTeléfono;
    private javax.swing.JList<String> jListLibritos;
    private javax.swing.JList<String> jListLibrosCliente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextCedula;
    private javax.swing.JTextField jTextCorreo;
    private javax.swing.JTextField jTextDirrecion;
    private javax.swing.JTextField jTextFecha;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextTeléfono;
    // End of variables declaration//GEN-END:variables

}
