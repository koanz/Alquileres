package Visual;

import javax.swing.JTable;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.table.DefaultTableCellRenderer;

public class Render extends DefaultTableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        if(value instanceof JButton){
            JButton btn = (JButton)value;
            
            return btn;
        }else if(value instanceof JCheckBox){
            JCheckBox opc = (JCheckBox)value;
            
            return opc;
        }
        
        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); //To change body of generated methods, choose Tools | Templates.
    }
    
}
