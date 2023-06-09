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

import Metodos.MetodosPersona;
import Metodos.Metodos_funciones;
import modelo.Conceptos;
import modelo.Persona;

import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.util.Date;
import java.awt.Font;
import javax.swing.JPanel;

/**
 *
 * @author yefer
 */
public class Logueo extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Creates new form Logueo
	 */
	public Logueo(String nombre, String id) {

		this.empleadoid = id;
		this.nombre = nombre;
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jDesktopPane1 = new javax.swing.JDesktopPane();
		jTabbedPane1 = new javax.swing.JTabbedPane();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel1.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 18));
		jLabel5 = new javax.swing.JLabel();
		jLabel5.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 18));
		labelfecha = new javax.swing.JLabel();
		labelfecha.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 15));

		jLabel1.setText("Conjunto:");

		jLabel5.setText("Fecha:");

		labelfecha.setText(date.toString());

		lblNewLabel_1 = new JLabel("Empleado:");
		lblNewLabel_1.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 18));

		lblNewLabel_2 = new JLabel("Conjunto Residencial los Rosales");
		lblNewLabel_2.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 15));

		labelnombre = new JLabel("");
		labelnombre.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 15));
		labelnombre.setText(nombre);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING).addGroup(Alignment.LEADING,
						jPanel1Layout.createSequentialGroup().addGap(136)
								.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblNewLabel_1).addComponent(jLabel1).addComponent(jLabel5))
								.addGap(18)
								.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addComponent(labelfecha)
										.addComponent(lblNewLabel_2).addComponent(labelnombre))
								.addContainerGap(287, Short.MAX_VALUE)));
		jPanel1Layout
				.setVerticalGroup(
						jPanel1Layout
								.createParallelGroup(
										Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap(39, Short.MAX_VALUE)
										.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
												.addComponent(labelfecha).addComponent(jLabel5))
										.addGap(18)
										.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
												.addComponent(jLabel1).addComponent(lblNewLabel_2))
										.addGap(18).addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblNewLabel_1).addComponent(labelnombre))
										.addGap(233)));
		jPanel1.setLayout(jPanel1Layout);

		jTabbedPane1.addTab("Inicio", jPanel1);

		jPanel2_1 = new JPanel();
		jTabbedPane1.addTab("Egreso", null, jPanel2_1, null);

		Scrolltabla_1 = new JScrollPane();

		jLabel15_1 = new JLabel();
		jLabel15_1.setText("Busqueda por nombre:");

		lblNewLabel_4 = new JLabel("Valor");

		valor_1 = new JTextField();
		valor_1.setColumns(10);

		concepto_1 = new JComboBox<String>();

		textField_1 = new JTextField();

		Crear_1 = new JButton("Crear Registro");
		Crear_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				DefaultTableModel modelo = (DefaultTableModel) table_1.getModel();
				MetodosPersona funcion = new MetodosPersona();
				Metodos_funciones funcion1 = new Metodos_funciones();

				funcion.Estructura(persona1_1.getSelectedItem().toString());
				funcion.concepto(concepto_1.getSelectedItem().toString());
				modelo.addRow(new Object[] { funcion.getIdestructura(), concepto_1.getSelectedItem().toString(),
						funcion.getUnidad(), 1, soporte.getText(),valor_1.getText() });
				valorfinal1 = Integer.parseInt(valor_1.getText()) + valorfinal1;
				funcion1.crearregistro1(concepto_1.getSelectedItem().toString(), empleadoid,
						Integer.parseInt(valor_1.getText()), soporte.getText());
				funcion1.actualizarvalor(valorfinal1);
				total2.setText(valorfinal1 + "$");
			}
		});

		Buscar_1 = new JButton();
		Buscar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String name = textField_1.getText();
				if (!name.isEmpty()) {
					BuscarNombre1();

				} else {

				}
			}
		});
		Buscar_1.setText("Buscar");

		lblSeleccioneUnNombre_1 = new JLabel();
		lblSeleccioneUnNombre_1.setText("Seleccione un nombre:");

		persona1_1 = new JComboBox();
		persona1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (persona1_1.getSelectedItem() != null) {

					sujeto = persona1_1.getSelectedItem().toString();
					mostrarConceptos1();

				}
			}
		});

		crearfactura_1 = new JButton("Crear Factura");
		crearfactura_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Metodos_funciones funcion = new Metodos_funciones();
				funcion.crearfacturaingreso(persona1.getSelectedItem().toString(), empleadoid, null);
			}
		});

		jLabel9_1 = new JLabel();
		jLabel9_1.setText("Concepto");

		lblNewLabel_5 = new JLabel("Formulario Egresos");
		lblNewLabel_5.setFont(new Font("Tw Cen MT Condensed", Font.BOLD | Font.ITALIC, 26));

		lblNewLabel_7 = new JLabel("Total:");

		total2 = new JLabel("0");
		
		lblNewLabel_8 = new JLabel("Soporte");
		
		soporte = new JTextField();
		soporte.setColumns(10);
		GroupLayout gl_jPanel2_1 = new GroupLayout(jPanel2_1);
		gl_jPanel2_1.setHorizontalGroup(
			gl_jPanel2_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jPanel2_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_jPanel2_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jPanel2_1.createSequentialGroup()
							.addComponent(Scrolltabla_1, GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(gl_jPanel2_1.createSequentialGroup()
							.addGroup(gl_jPanel2_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_jPanel2_1.createSequentialGroup()
									.addGroup(gl_jPanel2_1.createParallelGroup(Alignment.LEADING)
										.addComponent(jLabel15_1)
										.addGroup(gl_jPanel2_1.createSequentialGroup()
											.addComponent(lblNewLabel_4)
											.addGap(18)
											.addComponent(valor_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_jPanel2_1.createParallelGroup(Alignment.TRAILING)
										.addComponent(concepto_1, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
										.addComponent(Crear_1))
									.addGroup(gl_jPanel2_1.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_jPanel2_1.createSequentialGroup()
											.addGap(49)
											.addComponent(crearfactura_1)
											.addGap(33)
											.addComponent(lblNewLabel_8)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(soporte, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_jPanel2_1.createSequentialGroup()
											.addGap(129)
											.addComponent(Buscar_1)
											.addGap(18)
											.addGroup(gl_jPanel2_1.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_jPanel2_1.createSequentialGroup()
													.addComponent(lblSeleccioneUnNombre_1, GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
													.addPreferredGap(ComponentPlacement.RELATED))
												.addComponent(persona1_1, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)))))
								.addComponent(jLabel9_1))
							.addGap(63))))
				.addGroup(gl_jPanel2_1.createSequentialGroup()
					.addGap(258)
					.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(282, Short.MAX_VALUE))
				.addGroup(gl_jPanel2_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_7)
					.addGap(18)
					.addComponent(total2)
					.addContainerGap(668, Short.MAX_VALUE))
		);
		gl_jPanel2_1.setVerticalGroup(
			gl_jPanel2_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jPanel2_1.createSequentialGroup()
					.addGap(23)
					.addComponent(lblNewLabel_5)
					.addGap(99)
					.addGroup(gl_jPanel2_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_7)
						.addComponent(total2))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_jPanel2_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(jLabel15_1)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(Buscar_1)
						.addComponent(lblSeleccioneUnNombre_1))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_jPanel2_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(jLabel9_1)
						.addComponent(concepto_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(persona1_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(gl_jPanel2_1.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_jPanel2_1.createParallelGroup(Alignment.BASELINE)
							.addComponent(Crear_1)
							.addComponent(crearfactura_1)
							.addComponent(lblNewLabel_8)
							.addComponent(soporte, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_jPanel2_1.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblNewLabel_4)
							.addComponent(valor_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addComponent(Scrolltabla_1, GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
					.addGap(13))
		);

		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "Estructura", "Concepto", "UnidadMedida", "Cantidad", "Soporte","ValorItem" }));
		Scrolltabla_1.setViewportView(table_1);
		jPanel2_1.setLayout(gl_jPanel2_1);

		jDesktopPane1.setLayer(jTabbedPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

		javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
		jDesktopPane1.setLayout(jDesktopPane1Layout);
		jDesktopPane1Layout
				.setHorizontalGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE));
		jDesktopPane1Layout.setVerticalGroup(jDesktopPane1Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jTabbedPane1));
		jPanel2 = new javax.swing.JPanel();
		jTextField1 = new javax.swing.JTextField();
		jLabel15 = new javax.swing.JLabel();
		Buscar = new javax.swing.JButton();
		Buscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = jTextField1.getText();
				if (!name.isEmpty()) {
					BuscarNombre();

				} else {

				}
			}
		});
		concepto = new javax.swing.JComboBox<>();
		jLabel9 = new javax.swing.JLabel();

		jLabel15.setText("Busqueda por nombre:");

		Buscar.setText("Buscar");

		concepto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));

		jLabel9.setText("Concepto");

		JLabel lblSeleccioneUnNombre = new JLabel();
		lblSeleccioneUnNombre.setText("Seleccione un nombre:");

		persona1 = new JComboBox();
		persona1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (persona1.getSelectedItem() != null) {

					sujeto = persona1.getSelectedItem().toString();
					mostrarConceptos();

				}
			}
		});

		JButton Crear = new JButton("Crear Registro");
		Crear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel modelo = (DefaultTableModel) table.getModel();
				MetodosPersona funcion = new MetodosPersona();
				Metodos_funciones funcion1 = new Metodos_funciones();
				int valor = 0;

				if (concepto.getSelectedItem().toString().equals("Cuota Administración")) {

					funcion.Estructura(persona1.getSelectedItem().toString());
					funcion.concepto(concepto.getSelectedItem().toString());
					valor = funcion.getArea() * Integer.parseInt(cantidad.getText()) * funcion.getValor();
					modelo.addRow(new Object[] { funcion.getIdestructura(), concepto.getSelectedItem().toString(),
							funcion.getUnidad(), cantidad.getText(), valor });
				}
				if (concepto.getSelectedItem().toString().equals("Prestamo Hora Parilla")
						|| concepto.getSelectedItem().toString().equals("Prestamo Hora Salon Comunal")) {

					funcion.Estructura(persona1.getSelectedItem().toString());
					funcion.concepto(concepto.getSelectedItem().toString());
					valor = Integer.parseInt(cantidad.getText()) * funcion.getValor();
					modelo.addRow(new Object[] { funcion.getIdestructura(), concepto.getSelectedItem().toString(),
							funcion.getUnidad(), cantidad.getText(), valor });
				}
				if (concepto.getSelectedItem().toString().equals("Prestamo Hora Parilla") == false
						&& concepto.getSelectedItem().toString().equals("Prestamo Hora Salon Comunal") == false
						&& concepto.getSelectedItem().toString().equals("Cuota Administración") == false) {
					funcion.Estructura(persona1.getSelectedItem().toString());
					funcion.concepto(concepto.getSelectedItem().toString());
					modelo.addRow(new Object[] { funcion.getIdestructura(), concepto.getSelectedItem().toString(),
							funcion.getUnidad(), 1, funcion.getValor() });
					valor = funcion.getValor();
				}
				valorfinal = valorfinal + valor;
				System.out.println(valorfinal);
				funcion1.crearregistro(concepto.getSelectedItem().toString(), empleadoid, valor);
				funcion1.actualizarvalor(valorfinal);
				Total.setText(valorfinal + "$");
			}
		});

		JScrollPane Scrolltabla = new JScrollPane();

		lblNewLabel = new JLabel("Cantidad");

		cantidad = new JTextField();
		cantidad.setColumns(10);

		lblNewLabel_3 = new JLabel("Formulario Ingresos");
		lblNewLabel_3.setFont(new Font("Tw Cen MT Condensed", Font.BOLD | Font.ITALIC, 26));

		crearfactura = new JButton("Crear Factura");
		crearfactura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Metodos_funciones funcion = new Metodos_funciones();
				funcion.crearfacturaingreso(persona1.getSelectedItem().toString(), empleadoid, null);
			}
		});

		JLabel lblNewLabel_6 = new JLabel("Total");

		Total = new JLabel("0");

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2Layout
				.setHorizontalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap()
								.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
										.addGroup(jPanel2Layout.createSequentialGroup().addComponent(
												Scrolltabla, GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
												.addContainerGap())
										.addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout
												.createParallelGroup(Alignment.LEADING)
												.addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout
														.createParallelGroup(Alignment.LEADING).addComponent(jLabel15)
														.addGroup(jPanel2Layout
																.createSequentialGroup().addComponent(lblNewLabel)
																.addGap(18).addComponent(cantidad,
																		GroupLayout.PREFERRED_SIZE,
																		GroupLayout.DEFAULT_SIZE,
																		GroupLayout.PREFERRED_SIZE)))
														.addPreferredGap(ComponentPlacement.RELATED)
														.addGroup(jPanel2Layout.createParallelGroup(
																Alignment.TRAILING)
																.addComponent(concepto, GroupLayout.PREFERRED_SIZE, 185,
																		GroupLayout.PREFERRED_SIZE)
																.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE,
																		132, GroupLayout.PREFERRED_SIZE)
																.addComponent(Crear))
														.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
																.addGroup(jPanel2Layout.createSequentialGroup()
																		.addGap(18).addComponent(Buscar).addGap(18)
																		.addGroup(jPanel2Layout
																				.createParallelGroup(Alignment.LEADING)
																				.addGroup(jPanel2Layout
																						.createSequentialGroup()
																						.addComponent(
																								lblSeleccioneUnNombre,
																								GroupLayout.DEFAULT_SIZE,
																								237, Short.MAX_VALUE)
																						.addPreferredGap(
																								ComponentPlacement.RELATED))
																				.addComponent(persona1,
																						GroupLayout.PREFERRED_SIZE, 126,
																						GroupLayout.PREFERRED_SIZE)))
																.addGroup(jPanel2Layout.createSequentialGroup()
																		.addGap(117).addComponent(crearfactura))))
												.addComponent(jLabel9)).addGap(63))
										.addGroup(jPanel2Layout.createSequentialGroup()
												.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 190,
														GroupLayout.PREFERRED_SIZE)
												.addGap(224))
										.addGroup(jPanel2Layout.createSequentialGroup().addComponent(lblNewLabel_6)
												.addGap(18).addComponent(Total)
												.addContainerGap(610, Short.MAX_VALUE)))));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout
				.createSequentialGroup().addGap(21).addComponent(lblNewLabel_3).addGap(101)
				.addGroup(jPanel2Layout
						.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel_6).addComponent(Total))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel15)
						.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(Buscar).addComponent(lblSeleccioneUnNombre))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel9)
						.addComponent(concepto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(persona1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE))
				.addGap(11)
				.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
						.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(Crear)
								.addComponent(crearfactura))
						.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel)
								.addComponent(cantidad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)))
				.addGap(18).addComponent(Scrolltabla, GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE).addGap(13)));

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "Estructura", "Concepto", "UnidadMedida", "Cantidad", "ValorItem" }));
		Scrolltabla.setViewportView(table);
		jPanel2.setLayout(jPanel2Layout);

		jTabbedPane1.addTab("Ingreso", jPanel2);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jDesktopPane1));
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jDesktopPane1));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
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
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Logueo(null, null).setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton Buscar;
	private javax.swing.JComboBox<String> concepto;
	private javax.swing.JDesktopPane jDesktopPane1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel15;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel labelfecha;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JTabbedPane jTabbedPane1;
	private javax.swing.JTextField jTextField1;
	private JComboBox<String> persona1;
	private String sujeto;
	private JTable table;
	private JLabel lblNewLabel;
	private JTextField cantidad;
	Date date = new Date();
	String nombre;
	String empleadoid;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel labelnombre;
	private JLabel lblNewLabel_3;
	private JButton crearfactura;
	private float valorfinal;
	private float valorfinal1;
	private JPanel jPanel2_1;
	private JScrollPane Scrolltabla_1;
	private JLabel jLabel15_1;
	private JLabel lblNewLabel_4;
	private JTextField valor_1;
	private JComboBox<String> concepto_1;
	private JTextField textField_1;
	private JButton Crear_1;
	private JButton Buscar_1;
	private JLabel lblSeleccioneUnNombre_1;
	private JComboBox persona1_1;
	private JButton crearfactura_1;
	private JLabel jLabel9_1;
	private JLabel lblNewLabel_5;
	private JTable table_1;
	private JLabel Total;
	private JLabel lblNewLabel_7;
	private JLabel total2;
	private JLabel lblNewLabel_8;
	private JTextField soporte;

	public void mostrarConceptos() {
		Metodos_funciones funcion = new Metodos_funciones();
		concepto.removeAllItems();
		ArrayList<Conceptos> lista;
		lista = funcion.obteneronceptos(sujeto);
		concepto.addItem("seleccionar");
		for (int i = 0; i < lista.size(); i++) {
			concepto.addItem(lista.get(i).toString());
		}
	}

	public void mostrarConceptos1() {
		Metodos_funciones funcion = new Metodos_funciones();
		concepto_1.removeAllItems();
		ArrayList<Conceptos> lista;
		lista = funcion.obteneronceptos1(sujeto);
		concepto_1.addItem("seleccionar");
		for (int i = 0; i < lista.size(); i++) {
			concepto_1.addItem(lista.get(i).toString());
		}
	}

	public void BuscarNombre() {
		MetodosPersona funcion = new MetodosPersona();
		persona1.removeAllItems();
		ArrayList<Persona> lista;
		lista = funcion.buscarPersona(jTextField1.getText());
		persona1.addItem("seleccionar");
		for (int i = 0; i < lista.size(); i++) {
			persona1.addItem(lista.get(i).toString());

		}
	}

	public void BuscarNombre1() {
		MetodosPersona funcion = new MetodosPersona();
		persona1_1.removeAllItems();
		ArrayList<Persona> lista;
		lista = funcion.buscarPersona(textField_1.getText());
		persona1_1.addItem("seleccionar");
		for (int i = 0; i < lista.size(); i++) {
			persona1_1.addItem(lista.get(i).toString());

		}
	}

	public float getValorfinal() {
		return valorfinal;
	}

	public void setValorfinal(float valorfinal) {
		this.valorfinal = valorfinal;
	}
}
