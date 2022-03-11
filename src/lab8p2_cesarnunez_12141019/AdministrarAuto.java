package lab8p2_cesarnunez_12141019;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AdministrarAuto {
    
    private ArrayList<Auto> autos = new ArrayList();
    File file = null;

    public AdministrarAuto(String path) {
        file = new File(path);
    }

    public AdministrarAuto() {
    }

    public ArrayList<Auto> getAutos() {
        return autos;
    }

    public void setAutos(ArrayList<Auto> autos) {
        this.autos = autos;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
    
    public void setAuto(Auto a){
        autos.add(a);
    }
    
    public void cargarArchivo(){
        FileInputStream fi = null;
        ObjectInputStream oi = null;
        try{
            if(file.exists()){
                autos = new ArrayList();
                Auto a;
                fi = new FileInputStream(file);
                oi = new ObjectInputStream(fi);
                try{
                    while((a = (Auto) oi.readObject()) != null){
                        autos.add(a);
                    }
                }catch(EOFException e){
                    e.printStackTrace();
                }
            }
        }catch(IOException io){
            io.printStackTrace();
        }
        try{
            oi.close();
            fi.close();
        }catch(Exception e){
            
        }
    }
    
    public void escribirArchivo(){
        FileOutputStream fo = null;
        ObjectOutputStream oo = null;
        try{
            fo = new FileOutputStream(file);
            oo = new ObjectOutputStream(fo);
            for (Auto auto : autos) {
                oo.writeObject(auto);
            }
            oo.flush();
        }catch(IOException e){
            e.printStackTrace();
        }
        try{            
            oo.close();
            fo.close();
        }catch(Exception e){
        }
    }
        
}
