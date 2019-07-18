/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package z80;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Zylfrox
 */
public class MemoryTableModel extends AbstractTableModel
{
    private final List<Memory> memoryList;
    public int[] memory = new int[65536];
    public Z80 z80 = new Z80();
    private final String[] columnNames = new String[] {
            "ID", "0","1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B",
            "C","D","E","F"
    };
    private final Class[] columnClass = new Class[] {
        String.class, String.class, String.class, String.class,
        String.class, String.class, String.class, String.class,
        String.class, String.class, String.class, String.class,
        String.class, String.class, String.class, String.class,
        String.class
    };

    public MemoryTableModel(List<Memory> memoryList)
    {
        this.memoryList = memoryList;
    }

    @Override
    public String getColumnName(int column)
    {
        return columnNames[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex)
    {
        return columnClass[columnIndex];
    }

    @Override
    public int getColumnCount()
    {
        return columnNames.length;
    }

    @Override
    public int getRowCount()
    {
        return memoryList.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex)
    {
        Memory row = memoryList.get(rowIndex);
        if(0 == columnIndex) {
            return row.getId();
        }
        else if(1 == columnIndex) {
            return row.getC0();
        }
        else if(2 == columnIndex) {
            return row.getC1();
        }
        else if(3 == columnIndex) {
            return row.getC2();
        }
        else if(4 == columnIndex) {
            return row.getC3();
        }
        else if(5 == columnIndex) {
            return row.getC4();
        }
        else if(6 == columnIndex) {
            return row.getC5();
        }
        else if(7 == columnIndex) {
            return row.getC6();
        }
        else if(8 == columnIndex) {
            return row.getC7();
        }
        else if(9 == columnIndex) {
            return row.getC8();
        }
        else if(10 == columnIndex) {
            return row.getC9();
        }
        else if(11 == columnIndex) {
            return row.getCA();
        }
        else if(12 == columnIndex) {
            return row.getCB();
        }
        else if(13 == columnIndex) {
            return row.getCC();
        }
        else if(14 == columnIndex) {
            return row.getCD();
        }
        else if(15 == columnIndex) {
            return row.getCE();
        }
        else if(16 == columnIndex) {
            return row.getCF();
        }
        return null;
    }
    @Override
   public void setValueAt(Object aValue, int rowIndex, int columnIndex)
   {
       String texto = (String) aValue;
       //System.out.println(texto);
       if(texto.length()<=2){
           texto=texto.toUpperCase();
           texto=texto.replaceAll("[^A-F0-9_-]", "0");
           Memory row = memoryList.get(rowIndex);
           if(0 == columnIndex) {
               row.setId(texto);
           }
           else if(1 == columnIndex) {
               row.setC0(texto);
           }
           else if(2 == columnIndex) {
               row.setC1(texto);
           }
           else if(3 == columnIndex) {
               row.setC2(texto);
           }
           else if(4 == columnIndex) {
               row.setC3(texto);
           }
           else if(5 == columnIndex) {
               row.setC4(texto);
           }
           else if(6 == columnIndex) {
               row.setC5(texto);
           }
           else if(7 == columnIndex) {
               row.setC6(texto);
           }
           else if(8 == columnIndex) {
               row.setC7(texto);
           }
           else if(9 == columnIndex) {
               row.setC8(texto);
           }
           else if(10 == columnIndex) {
               row.setC9(texto);
           }
           else if(11 == columnIndex) {
               row.setCA(texto);
           }
           else if(12 == columnIndex) {
               row.setCB(texto);
           }
           else if(13 == columnIndex) {
               row.setCC(texto);
           }
           else if(14 == columnIndex) {
               row.setCD(texto);
           }
           else if(15 == columnIndex) {
               row.setCE(texto);
           }
           else if(16 == columnIndex) {
               row.setCF(texto);
           }
           int index = ((columnIndex-1))+(rowIndex*16);
           memory[index]= number(texto);
           z80.memory = memory;
           
           //System.out.println("Cambio en la direccion: "+index);
           //System.out.println("Nuevo dato: "+memory[index]);
       }
   }
public void actualizarTablaMemoria(){
    int[] memory = this.z80.memory;
    for (int i = 0; i <= 4095; i++) {
        for (int j = 1; j <= 16; j++) {
            int index = ((j-1))+(i*16);
            String value=hexa8(memory[index]);
            this.setValueAt(value, i, j);
        }
    }
}
   @Override
public boolean isCellEditable(int rowIndex, int columnIndex)
{   
    if(columnIndex==0){
         return false;
    }else{
         return true;  
    }

}

public int number(String Hexa){
    int number =Integer.parseInt(Hexa,16); 
    return number;
}
    
public String hexa16(int integer){
    String hex = Integer.toHexString(integer);
    if(hex.length()==1){
        hex = "000"+hex;
    }
    if(hex.length()==2){
        hex = "00"+hex;
    }
    if(hex.length()==3){
        hex = "0"+hex;
    }
    return hex;
}
    
public String hexa8(int integer){
    String hex = Integer.toHexString(integer);
    if(hex.length()==1){
        hex = "0"+hex;
    }
    return hex;
}


}