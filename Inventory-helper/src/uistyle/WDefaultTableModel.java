package uistyle;

import java.awt.Component;

import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

@SuppressWarnings("serial")
public class WDefaultTableModel extends DefaultTableModel{

	public WDefaultTableModel(String [] headers) {
		super(new Object [][] {},headers);
	}

	//	@SuppressWarnings("rawtypes")
	//	Class[] types = new Class [] {
	//        java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
	//    };
	//    
	//    @SuppressWarnings({ "rawtypes", "unchecked" })
	//	public Class getColumnClass(int columnIndex) {
	//        return types [columnIndex];
	//    }

	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return false;
	}

	public static void setJTableColumnsWidth(JTable table, int tablePreferredWidth,
			double... percentages) {
		double total = 0;
		for (int i = 0; i < table.getColumnModel().getColumnCount(); i++) {
			total += percentages[i];
		}

		for (int i = 0; i < table.getColumnModel().getColumnCount(); i++) {
			TableColumn column = table.getColumnModel().getColumn(i);
			column.setPreferredWidth((int)
					(tablePreferredWidth * (percentages[i] / total)));
		}
	}

	public static void wrapCell(JTable tb, int columnIndex) {
		tb.getColumnModel().getColumn(columnIndex).setCellRenderer(new WordWrapCellRenderer());
	}
	
	@SuppressWarnings("serial")
	static class WordWrapCellRenderer extends JTextArea implements TableCellRenderer {
		WordWrapCellRenderer() {
			setLineWrap(true);
			setWrapStyleWord(true);
		}

		public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
			
			setText(value.toString());
			setSize(table.getColumnModel().getColumn(column).getWidth(), getPreferredSize().height);
			if (table.getRowHeight(row) != getPreferredSize().height) {
				table.setRowHeight(row, getPreferredSize().height);
			}
			return this;
		}
	}

}
