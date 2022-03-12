package lab8p2_cesarnunez_12141019;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AdministrarTabla implements Runnable{

    private boolean iniciar, avanzar;
    private JTable table;
    private JProgressBar barra;
    private int largo;
    private ArrayList<Auto> autos = new ArrayList();

    public AdministrarTabla() {
    }

    public AdministrarTabla(JTable table, JProgressBar barra) {
        this.table = table; 
        this.barra = barra;
        iniciar = avanzar = true;
        largo = barra.getMaximum();
    }

    public boolean isIniciar() {
        return iniciar;
    }

    public void setIniciar(boolean iniciar) {
        this.iniciar = iniciar;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public JTable getTable() {
        return table;
    }

    public void setTable(JTable table) {
        this.table = table;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public ArrayList<Auto> getAutos() {
        return autos;
    }

    public void setAutos(ArrayList<Auto> autos) {
        this.autos = autos;
    }

    
    @Override
    public void run() {
        while(iniciar){
            if(avanzar){
                for (int i = 0; i < table.getRowCount(); i++) {
                    int id = (Integer) table.getValueAt(i, 0);
                    for (Auto auto : autos) {
                        if(id == auto.getNumIdentificador()){
                            int x = auto.distanciaAleatoria();
                            auto.setDistanciaRecorrida(auto.getDistanciaRecorrida() + x);
                            DefaultTableModel m = (DefaultTableModel) table.getModel();
                            m.setValueAt(auto.getDistanciaRecorrida(), i, 2);
                            break;
                        }
                    }
                }        
                refrescarBarra();
                ordenarTable();
                for (int i = 0; i < table.getRowCount(); i++) {
                    DefaultTableModel m = (DefaultTableModel) table.getModel();
                    if((Integer) m.getValueAt(i, 2) > largo){
                        iniciar = false;
                    }
                }           
            }
            try{
                Thread.sleep(1000);
            }catch(Exception e){
            }
        }
    }
    
    private void imprimir(){
        for (Auto auto : autos) {
            System.out.println(auto.toString() + ") " + auto.getDistanciaRecorrida());
        }
    }
    
    private void refrescarBarra(){
        if(table.getSelectedRow() >= 0){            
            DefaultTableModel m = (DefaultTableModel) table.getModel();
            int dist = (Integer) m.getValueAt(table.getSelectedRow(), 2);
            barra.setValue(dist);            
            for (Auto auto : autos) {
                if(auto.getDistanciaRecorrida() == dist){
                    barra.setForeground(auto.getColor());
                }
            }    
        }
    }
    
    private void ordenarTable(){
        for (int i = 0; i < autos.size() - 1; i++) {
            for (int j = i + 1; j < autos.size(); j++) {
                DefaultTableModel m = (DefaultTableModel) table.getModel();
                int dist1 = (Integer) m.getValueAt(i, 2);
                int dist2 = (Integer) m.getValueAt(j, 2);
                if(dist2 > dist1){
                    m.moveRow(j, j, i);     
                }
            }
        }
    }
    
}
