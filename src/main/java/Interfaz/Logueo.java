/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;
import javax.swing.JTable;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import javax.swing.table.DefaultTableModel;

import Conexionbd.Conexion;
import Metodos.Metodos_funciones;
import modelo.Conceptos;
import modelo.Factura;

import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

/**
 *
 * @author yefer
 */
public class Logueo extends javax.swing.JFrame {

    /**
     * Creates new form Logueo
     */
    public Logueo() {
        initComponents();
        mostrarConceptos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String name = jTextField1.getText() ;
        		if (!name.isEmpty()) {
					modelo.Factura f = new Factura();
					f.buscarNombre(name);
				} else {

				}
        		DefaultTableModel modelo = (DefaultTableModel)table.getModel();
        		modelo.addRow(new Object[]{1,"Administración"});
        	}
        });
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel7.setText("Detalle factura");

        jTextField1.setText("jTextField1");

        jLabel15.setText("Busqueda por nombre:");

        jButton2.setText("jButton2");

        jLabel16.setText("factura");

        jLabel17.setText("Detalle factura");

        jTextField2.setText("jTextField1");

        jLabel18.setText("N. factura");

        jLabel19.setText("Codigo");

        jTextField3.setText("jTextField1");

        jLabel20.setText("Codigo Empleado");

        jTextField4.setText("jTextField1");

        jLabel21.setText("N. factura");

        jTextField5.setText("jTextField1");

        jLabel22.setText("Item");

        jTextField6.setText("jTextField1");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel8.setText("concepto");

        jLabel9.setText("Tipo concepto");
        
        JScrollPane scrollPane = new JScrollPane();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addGap(186)
        					.addComponent(jLabel16)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jLabel7))
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addGap(167)
        					.addComponent(jLabel17))
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addGap(177)
        					.addComponent(jLabel8))
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addGap(12)
        					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addContainerGap()
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(jPanel2Layout.createSequentialGroup()
        							.addGap(8)
        							.addComponent(jLabel15))
        						.addComponent(jLabel18)
        						.addComponent(jLabel20)
        						.addComponent(jLabel21)
        						.addGroup(jPanel2Layout.createSequentialGroup()
        							.addGap(35)
        							.addComponent(jLabel9)))
        					.addGap(18)
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING, false)
        						.addGroup(jPanel2Layout.createSequentialGroup()
        							.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addComponent(jButton2))
        						.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        							.addGroup(jPanel2Layout.createSequentialGroup()
        								.addGap(30)
        								.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        									.addGroup(jPanel2Layout.createSequentialGroup()
        										.addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
        										.addGap(37)
        										.addComponent(jLabel22)
        										.addGap(18)
        										.addComponent(jTextField6, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
        									.addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
        									.addGroup(jPanel2Layout.createSequentialGroup()
        										.addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
        										.addGap(32)
        										.addComponent(jLabel19)
        										.addPreferredGap(ComponentPlacement.RELATED)
        										.addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))))
        							.addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel16))
        			.addGap(18)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel18)
        				.addComponent(jLabel19)
        				.addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel20)
        				.addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(10)
        			.addComponent(jLabel17)
        			.addGap(3)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel21)
        				.addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel22)
        				.addComponent(jTextField6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jLabel8)
        			.addGap(6)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel9)
        				.addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel15)
        				.addComponent(jButton2)
        				.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        
        table = new JTable();
        scrollPane.setViewportView(table);
        table.setFillsViewportHeight(true);
        table.setModel(new DefaultTableModel(
        	new Object[][] {
        	},
        	new String[] {
        		"Item", "Nombre Concepto", "Unidad Medida", "Valor Activo", "Valor Item", "Soporte"
        	}
        ));
        table.getColumnModel().getColumn(0).setPreferredWidth(35);
        table.getColumnModel().getColumn(1).setPreferredWidth(97);
        table.getColumnModel().getColumn(2).setPreferredWidth(81);
        table.getColumnModel().getColumn(3).setPreferredWidth(70);
        table.getColumnModel().getColumn(4).setPreferredWidth(62);
        table.getColumnModel().getColumn(5).setPreferredWidth(53);
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        
                jLabel1.setText("Conjunto:");
                
                        jLabel2.setText("nombre");
                        
                                jLabel3.setText("Empleado:");
                                
                                        jLabel4.setText("Nombre");
                                        
                                                jLabel5.setText("Fecha:");
                                                
                                                        jLabel6.setText("00/00/0000");
                                                        
                                                                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                                                                jPanel1Layout.setHorizontalGroup(
                                                                	jPanel1Layout.createParallelGroup(Alignment.LEADING)
                                                                		.addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                			.addContainerGap(24, Short.MAX_VALUE)
                                                                			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
                                                                				.addComponent(jLabel2)
                                                                				.addComponent(jLabel1))
                                                                			.addPreferredGap(ComponentPlacement.RELATED, 255, Short.MAX_VALUE)
                                                                			.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
                                                                				.addComponent(jLabel4)
                                                                				.addComponent(jLabel3))
                                                                			.addGap(97))
                                                                		.addGroup(jPanel1Layout.createSequentialGroup()
                                                                			.addGap(152)
                                                                			.addComponent(jLabel5)
                                                                			.addGap(18)
                                                                			.addComponent(jLabel6)
                                                                			.addContainerGap(215, Short.MAX_VALUE))
                                                                );
                                                                jPanel1Layout.setVerticalGroup(
                                                                	jPanel1Layout.createParallelGroup(Alignment.LEADING)
                                                                		.addGroup(jPanel1Layout.createSequentialGroup()
                                                                			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
                                                                				.addGroup(jPanel1Layout.createSequentialGroup()
                                                                					.addGap(39)
                                                                					.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
                                                                						.addComponent(jLabel5)
                                                                						.addComponent(jLabel6)))
                                                                				.addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                					.addContainerGap(76, Short.MAX_VALUE)
                                                                					.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
                                                                						.addComponent(jLabel1)
                                                                						.addComponent(jLabel3))
                                                                					.addPreferredGap(ComponentPlacement.RELATED)))
                                                                			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
                                                                				.addGroup(jPanel1Layout.createSequentialGroup()
                                                                					.addGap(42)
                                                                					.addComponent(jLabel4))
                                                                				.addGroup(jPanel1Layout.createSequentialGroup()
                                                                					.addGap(52)
                                                                					.addComponent(jLabel2)))
                                                                			.addContainerGap(226, Short.MAX_VALUE))
                                                                );
                                                                jPanel1.setLayout(jPanel1Layout);
                                                                
                                                                        jTabbedPane1.addTab("Inicio", jPanel1);
        jPanel2.setLayout(jPanel2Layout);

        jTabbedPane1.addTab("Ingreso", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 448, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 336, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Egreso", jPanel3);

        jDesktopPane1.setLayer(jTabbedPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Logueo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Logueo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Logueo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Logueo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Logueo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private JTable table;
    
    public void mostrarConceptos() {
    Metodos_funciones funcion = new Metodos_funciones();
    ArrayList<Conceptos> lista = funcion.obteneronceptos(); 
    jComboBox1.addItem("seleccionar");
    for (int i = 0; i < lista.size(); i++) {
    	jComboBox1.addItem(lista.get(i).toString());
	}
    }
    
}
