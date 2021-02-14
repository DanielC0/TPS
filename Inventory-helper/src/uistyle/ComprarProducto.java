package uistyle;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JTextField;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import com.toedter.calendar.JDateChooser;
import java.awt.Component;
import javax.swing.border.EmptyBorder;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

@SuppressWarnings("serial")
public class ComprarProducto extends JPanel {
	public JTextField txfProductName;
	public  WJTextFieldNumber txfProductQuant;
	public  WJTextFieldNumber txfNewQuantity;
	public  WJTextFieldNumber txfPuncharsePrice;
	public  WJTextFieldNumber txfUnitPrice;
	public JDateChooser dCFechaCompra;

	/**
	 * Create the panel.
	 */
	public ComprarProducto() {
		setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(2, 2, 12, 8));

		JLabel lblProducto = new JLabel("Producto:");
		lblProducto.setHorizontalAlignment(SwingConstants.CENTER);
		lblProducto.setPreferredSize(new Dimension(57, 30));
		panel.add(lblProducto);

		txfProductName = new JTextField();
		txfProductName.setFocusable(false);
		txfProductName.setEditable(false);
		txfProductName.setOpaque(false);
		txfProductName.setText("<productname>");
		panel.add(txfProductName);
		txfProductName.setColumns(10);

		JLabel lblProducto_1 = new JLabel("Producto:");
		lblProducto_1.setPreferredSize(new Dimension(57, 30));
		lblProducto_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblProducto_1);

		txfProductQuant = new WJTextFieldNumber("0");
		txfProductQuant.setFocusable(false);
		txfProductQuant.setText("<productname>");
		txfProductQuant.setOpaque(false);
		txfProductQuant.setEditable(false);
		txfProductQuant.setColumns(10);
		panel.add(txfProductQuant);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EmptyBorder(0, 4, 0, 4));
		add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(5, 2, 12, 8));

		JLabel lblCantidadAAgregar = new JLabel("Cantidad a agregar");
		lblCantidadAAgregar.setHorizontalTextPosition(SwingConstants.CENTER);
		lblCantidadAAgregar.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel_1.add(lblCantidadAAgregar);

		txfNewQuantity = new WJTextFieldNumber("0");
		txfNewQuantity.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (!tools.Utils.noempryString(txfPuncharsePrice.getText(), 1)) {
					txfPuncharsePrice.setText("0");
					txfUnitPrice.setText("0");
				}else {
					if (tools.Utils.noempryString(txfPuncharsePrice.getText(), 1) && 
							tools.Utils.noempryString(txfNewQuantity.getText(), 1) 
							) {
						double cant = Double.valueOf(txfNewQuantity.getText());
						double priceP = Double.valueOf(txfPuncharsePrice.getText());
						if (cant != 0 ) {
							txfUnitPrice.setText(String.valueOf((Double)(priceP / cant )));
						}else {
							txfUnitPrice.setText("0");
						}
						
					}else if (tools.Utils.noempryString(txfUnitPrice.getText(), 1) && 
							tools.Utils.noempryString(txfNewQuantity.getText(), 1) 
							) {
						// calculate
						double cant = Double.valueOf(txfNewQuantity.getText());
						double priceU = Double.valueOf(txfUnitPrice.getText());
						txfPuncharsePrice.setText(String.valueOf((Double)cant * priceU));
					}
				}
			}
		});
		panel_1.add(txfNewQuantity);
		txfNewQuantity.setColumns(10);

		JLabel lblPrecioTotal = new JLabel("Precio Total de compra");
		lblPrecioTotal.setHorizontalTextPosition(SwingConstants.CENTER);
		lblPrecioTotal.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel_1.add(lblPrecioTotal);

		txfPuncharsePrice = new WJTextFieldNumber("0");
		txfPuncharsePrice.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (!tools.Utils.noempryString(txfPuncharsePrice.getText(), 1)) {
					// no pasa la validación 
					if (tools.Utils.noempryString(txfUnitPrice.getText(), 1) && 
							tools.Utils.noempryString(txfNewQuantity.getText(), 1) 
							) {
						// calculate
						double cant = Double.valueOf(txfNewQuantity.getText());
						double priceU = Double.valueOf(txfUnitPrice.getText());
						txfPuncharsePrice.setText(String.valueOf((Double)cant * priceU));
					}else {
						txfPuncharsePrice.setText("0");
					}
				}else {
					// calculate the unit price
					double cant = Double.valueOf(txfNewQuantity.getText());
					double priceP = Double.valueOf(txfPuncharsePrice.getText());
					if(cant != 0 ) {
						txfUnitPrice.setText(String.valueOf((Double)(priceP / cant)));
					}else {
						txfUnitPrice.setText("0");
					}
					
				}
			}
		});
		txfPuncharsePrice.setColumns(10);
		panel_1.add(txfPuncharsePrice);

		JLabel lblPrecioDeCompra = new JLabel("Precio de compra unitario");
		lblPrecioDeCompra.setHorizontalTextPosition(SwingConstants.CENTER);
		lblPrecioDeCompra.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel_1.add(lblPrecioDeCompra);

		txfUnitPrice = new WJTextFieldNumber("0");
		txfUnitPrice.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (!tools.Utils.noempryString(txfUnitPrice.getText(), 1)) {
					// no pasa la validación 
					if (tools.Utils.noempryString(txfPuncharsePrice.getText(), 1) && 
							tools.Utils.noempryString(txfNewQuantity.getText(), 1) 
							) {
						// calculate
						double cant = Double.valueOf(txfNewQuantity.getText());
						double priceU = Double.valueOf(txfPuncharsePrice.getText());
						if (cant != 0) {
							txfUnitPrice.setText(String.valueOf((Double) priceU / cant));
						}else {
							txfUnitPrice.setText("0");
						}
						
					}else {
						txfPuncharsePrice.setText("0");
					}
				}else {
					// calculate the puncharse price
					double cant = Double.valueOf(txfNewQuantity.getText());
					double priceP = Double.valueOf(txfUnitPrice.getText());
					if(cant != 0 ) {
						txfPuncharsePrice.setText(String.valueOf((Double)(priceP * cant)));
					}else {
						txfPuncharsePrice.setText("0");
					}
					
				}
			}
		});
		txfUnitPrice.setColumns(10);
//		txfUnitPrice.setEditable(false);
//		txfUnitPrice.setFocusable(false);
		panel_1.add(txfUnitPrice);

		JLabel lblFechaDeCompra = new JLabel("Fecha de compra");
		lblFechaDeCompra.setHorizontalTextPosition(SwingConstants.CENTER);
		lblFechaDeCompra.setAlignmentX(0.5f);
		panel_1.add(lblFechaDeCompra);

		dCFechaCompra = new JDateChooser();
		dCFechaCompra.setForeground(Color.white);
		panel_1.add(dCFechaCompra);

	}


}
