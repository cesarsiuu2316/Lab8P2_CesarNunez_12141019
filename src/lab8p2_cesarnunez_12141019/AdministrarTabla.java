package lab8p2_cesarnunez_12141019;
import java.util.ArrayList;
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

    public AdministrarTabla(JTable table, JProgressBar barra, ArrayList<Auto> autos) {
        this.table = table; 
        this.barra = barra;
        iniciar = avanzar = true;
        largo = barra.getMaximum();
        this.autos = autos;
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
    
    @Override
    public void run() {
        while(iniciar){
            if(avanzar){
                try{
                    Thread.sleep(1000);
                }catch(Exception e){
                }
                for (int i = 0; i < table.getRowCount(); i++) {
                    Auto a;
                    String n = (String) table.getValueAt(i, 1);
                    System.out.println("id "+ n);
                    for (Auto auto : autos) {
                        if(n.equals(auto.getNombreCorredor())){
                            int x = auto.distanciaAleatoria();
                            auto.setDistanciaRecorrida(auto.getDistanciaRecorrida() + x);
                            break;
                        }
                    }
                }                 
                refrescarTabla();
                barra.setValue(barra.getValue() + 10);
                if(barra.getValue() >= largo){
                    iniciar = false;
                }     
            }
        }
    }
    
    private void refrescarTabla(){
        DefaultTableModel m = new DefaultTableModel();
        for (Auto a : autos) {
            System.out.println(a.getNombreCorredor());
            Object[] newRow = {
                a.getNumIdentificador(), a.getNombreCorredor(), a.getDistanciaRecorrida()
            };
            m.addRow(newRow);
        }
        table.setModel(m);
    }
    
}
