
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.*;
import javax.swing.plaf.SliderUI;


public class hiloUno extends Thread{

    
    public hiloUno(String name) {
        this.setName(name);
    }//constr
    
    public void run(){
        
        
    
        if(getName().equals("Iron horse")){
            
            long ti=System.currentTimeMillis();
            
            for (int j = 0; j < 99; j++) {
                try {
                    frmInicio.lblCaballo1.setLocation(frmInicio.lblCaballo1.getLocation().x+carrera.losCaballos[0].getAvance(),frmInicio.lblCaballo1.getLocation().y);
                    //System.out.println(this.getName()+":"+frmInicio.lblCaballo1.getLocation()+" -- "+frmInicio.lblLinea.getLocation().x);
                    
                    
                    sleep(carrera.losCaballos[0].getVelocidad());
                    
                    if(frmInicio.lblCaballo1.getLocation().x>=frmInicio.lblLinea.getLocation().x){
                        long tf=System.currentTimeMillis();
                        long tt= tf-ti;
                        carrera.losCaballos[0].setTiempo(tt);
                        frmInicio.txtR.append("\n"+this.getName()+":"+carrera.losCaballos[0].getTiempo()+" ms");
                        j=99;
                        }else{
                        j++;
                    }//else
                } //for
                catch (InterruptedException ex) {
                    Logger.getLogger(hiloUno.class.getName()).log(Level.SEVERE, null, ex);
                }
              
              
             
        }//for
            
            frmInicio.lblCaballo1.setLocation(frmInicio.lblCaballo1.getLocation().x,frmInicio.lblCaballo1.getLocation().y);
             
             this.stop();
        }//if
              
        
        if(getName().equals("Ben 10")){
            long ti=System.currentTimeMillis();
for (int j = 0; j < 99; j++) {
                try {
                    frmInicio.lblCaballo2.setLocation(frmInicio.lblCaballo2.getLocation().x+carrera.losCaballos[1].getAvance(),frmInicio.lblCaballo2.getLocation().y);
                    //System.out.println(this.getName()+":"+frmInicio.lblCaballo1.getLocation()+" -- "+frmInicio.lblLinea.getLocation().x);
                    
                    
                    sleep(carrera.losCaballos[1].getVelocidad());
                    
                    if(frmInicio.lblCaballo2.getLocation().x>=frmInicio.lblLinea.getLocation().x){
                        long tf=System.currentTimeMillis();
                        long tt= tf-ti;
                        carrera.losCaballos[1].setTiempo(tt);
                        frmInicio.txtR.append("\n"+this.getName()+":"+carrera.losCaballos[1].getTiempo()+" ms");
                        j=99;
                        }else{
                        j++;
                    }//else
                } //for
                catch (InterruptedException ex) {
                    Logger.getLogger(hiloUno.class.getName()).log(Level.SEVERE, null, ex);
                }
              
              
             
        }//for
             frmInicio.lblCaballo2.setLocation(frmInicio.lblCaballo2.getLocation().x,frmInicio.lblCaballo2.getLocation().y);        
        this.stop();
        }//if
        
        if(getName().equals("Reese")){
            long ti=System.currentTimeMillis();
          for (int j = 0; j < 99; j++) {
                try {
                    frmInicio.lblCaballo3.setLocation(frmInicio.lblCaballo3.getLocation().x+carrera.losCaballos[2].getAvance(),frmInicio.lblCaballo3.getLocation().y);
                    //System.out.println(this.getName()+":"+frmInicio.lblCaballo1.getLocation()+" -- "+frmInicio.lblLinea.getLocation().x);
                    
                    
                    sleep(carrera.losCaballos[2].getVelocidad());
                    
                    if(frmInicio.lblCaballo3.getLocation().x>=frmInicio.lblLinea.getLocation().x){
                        long tf=System.currentTimeMillis();
                        long tt= tf-ti;
                        carrera.losCaballos[2].setTiempo(tt);
                        frmInicio.txtR.append("\n"+this.getName()+":"+carrera.losCaballos[2].getTiempo()+" ms");
                        j=99;
                        }else{
                        j++;
                    }//else
                } //for
                catch (InterruptedException ex) {
                    Logger.getLogger(hiloUno.class.getName()).log(Level.SEVERE, null, ex);
                }
              
              
             
        }//for
             frmInicio.lblCaballo3.setLocation(frmInicio.lblCaballo3.getLocation().x,frmInicio.lblCaballo3.getLocation().y);                
        this.stop();
        }//if
        
        if(getName().equals("Joshua")){
            long ti=System.currentTimeMillis();
          for (int j = 0; j < 99; j++) {
                try {
                    frmInicio.lblCaballo4.setLocation(frmInicio.lblCaballo4.getLocation().x+carrera.losCaballos[3].getAvance(),frmInicio.lblCaballo4.getLocation().y);
                    //System.out.println(this.getName()+":"+frmInicio.lblCaballo1.getLocation()+" -- "+frmInicio.lblLinea.getLocation().x);
                    
                    
                    sleep(carrera.losCaballos[3].getVelocidad());
                    
                    if(frmInicio.lblCaballo4.getLocation().x>=frmInicio.lblLinea.getLocation().x){
                        long tf=System.currentTimeMillis();
                        long tt= tf-ti;
                        carrera.losCaballos[3].setTiempo(tt);
                        frmInicio.txtR.append("\n"+this.getName()+":"+carrera.losCaballos[3].getTiempo()+" ms");
                        j=99;
                        }else{
                        j++;
                    }//else
                } //for
                catch (InterruptedException ex) {
                    Logger.getLogger(hiloUno.class.getName()).log(Level.SEVERE, null, ex);
                }
              
              
             
        }//for
             frmInicio.lblCaballo4.setLocation(frmInicio.lblCaballo4.getLocation().x,frmInicio.lblCaballo4.getLocation().y);                
        this.stop();
        }//if
        
        if(getName().equals("Rayo mcqueen")){
            
            long ti=System.currentTimeMillis();
            
            for (int j = 0; j < 99; j++) {
                try {
                    frmInicio.lblCaballo5.setLocation(frmInicio.lblCaballo5.getLocation().x+carrera.losCaballos[4].getAvance(),frmInicio.lblCaballo5.getLocation().y);
                    //System.out.println(this.getName()+":"+frmInicio.lblCaballo1.getLocation()+" -- "+frmInicio.lblLinea.getLocation().x);
                    
                    
                    sleep(carrera.losCaballos[4].getVelocidad());
                    
                    if(frmInicio.lblCaballo5.getLocation().x>=frmInicio.lblLinea.getLocation().x){
                        long tf=System.currentTimeMillis();
                        long tt= tf-ti;
                        carrera.losCaballos[4].setTiempo(tt);
                        frmInicio.txtR.append("\n"+this.getName()+":"+carrera.losCaballos[4].getTiempo()+" ms");
                        j=99;
                        }else{
                        j++;
                    }//else
                } //for
                catch (InterruptedException ex) {
                    Logger.getLogger(hiloUno.class.getName()).log(Level.SEVERE, null, ex);
                }
              
              
             
        }//for
            
            frmInicio.lblCaballo5.setLocation(frmInicio.lblCaballo5.getLocation().x,frmInicio.lblCaballo5.getLocation().y);
             
             this.stop();
        }//if
        
        if(getName().equals("Jason funderburker")){
            
            long ti=System.currentTimeMillis();
            
            for (int j = 0; j < 99; j++) {
                try {
                    frmInicio.lblCaballo6.setLocation(frmInicio.lblCaballo6.getLocation().x+carrera.losCaballos[5].getAvance(),frmInicio.lblCaballo6.getLocation().y);
                    //System.out.println(this.getName()+":"+frmInicio.lblCaballo1.getLocation()+" -- "+frmInicio.lblLinea.getLocation().x);
                    
                    
                    sleep(carrera.losCaballos[5].getVelocidad());
                    
                    if(frmInicio.lblCaballo6.getLocation().x>=frmInicio.lblLinea.getLocation().x){
                        long tf=System.currentTimeMillis();
                        long tt= tf-ti;
                        carrera.losCaballos[5].setTiempo(tt);
                        frmInicio.txtR.append("\n"+this.getName()+":"+carrera.losCaballos[5].getTiempo()+" ms");
                        j=99;
                        }else{
                        j++;
                    }//else
                } //for
                catch (InterruptedException ex) {
                    Logger.getLogger(hiloUno.class.getName()).log(Level.SEVERE, null, ex);
                }
              
              
             
        }//for
            
            frmInicio.lblCaballo6.setLocation(frmInicio.lblCaballo6.getLocation().x,frmInicio.lblCaballo6.getLocation().y);
             
             this.stop();
        }//if
        
        if(getName().equals("Thor")){
            
            long ti=System.currentTimeMillis();
            
            for (int j = 0; j < 99; j++) {
                try {
                    frmInicio.lblCaballo7.setLocation(frmInicio.lblCaballo7.getLocation().x+carrera.losCaballos[6].getAvance(),frmInicio.lblCaballo7.getLocation().y);
                    //System.out.println(this.getName()+":"+frmInicio.lblCaballo1.getLocation()+" -- "+frmInicio.lblLinea.getLocation().x);
                    
                    
                    sleep(carrera.losCaballos[6].getVelocidad());
                    
                    if(frmInicio.lblCaballo7.getLocation().x>=frmInicio.lblLinea.getLocation().x){
                        long tf=System.currentTimeMillis();
                        long tt= tf-ti;
                        carrera.losCaballos[6].setTiempo(tt);
                        frmInicio.txtR.append("\n"+this.getName()+":"+carrera.losCaballos[6].getTiempo()+" ms");
                        j=99;
                        }else{
                        j++;
                    }//else
                } //for
                catch (InterruptedException ex) {
                    Logger.getLogger(hiloUno.class.getName()).log(Level.SEVERE, null, ex);
                }
              
              
             
        }//for
            
            frmInicio.lblCaballo7.setLocation(frmInicio.lblCaballo7.getLocation().x,frmInicio.lblCaballo7.getLocation().y);
             
             this.stop();
        }//if
        
        if(getName().equals("Spidey")){
            
            long ti=System.currentTimeMillis();
            
            for (int j = 0; j < 99; j++) {
                try {
                    frmInicio.lblCaballo8.setLocation(frmInicio.lblCaballo8.getLocation().x+carrera.losCaballos[7].getAvance(),frmInicio.lblCaballo8.getLocation().y);
                    //System.out.println(this.getName()+":"+frmInicio.lblCaballo1.getLocation()+" -- "+frmInicio.lblLinea.getLocation().x);
                    
                    
                    sleep(carrera.losCaballos[7].getVelocidad());
                    
                    if(frmInicio.lblCaballo8.getLocation().x>=frmInicio.lblLinea.getLocation().x){
                        long tf=System.currentTimeMillis();
                        long tt= tf-ti;
                        carrera.losCaballos[7].setTiempo(tt);
                        frmInicio.txtR.append("\n"+this.getName()+":"+carrera.losCaballos[7].getTiempo()+" ms");
                        j=99;
                        }else{
                        j++;
                    }//else
                } //for
                catch (InterruptedException ex) {
                    Logger.getLogger(hiloUno.class.getName()).log(Level.SEVERE, null, ex);
                }
              
              
             
        }//for
            
            frmInicio.lblCaballo8.setLocation(frmInicio.lblCaballo8.getLocation().x,frmInicio.lblCaballo8.getLocation().y);
             
             this.stop();
        }//if
        
        if(getName().equals("Black widow")){
            
            long ti=System.currentTimeMillis();
            
            for (int j = 0; j < 99; j++) {
                try {
                    frmInicio.lblCaballo9.setLocation(frmInicio.lblCaballo9.getLocation().x+carrera.losCaballos[8].getAvance(),frmInicio.lblCaballo9.getLocation().y);
                    //System.out.println(this.getName()+":"+frmInicio.lblCaballo1.getLocation()+" -- "+frmInicio.lblLinea.getLocation().x);
                    
                    
                    sleep(carrera.losCaballos[8].getVelocidad());
                    
                    if(frmInicio.lblCaballo9.getLocation().x>=frmInicio.lblLinea.getLocation().x){
                        long tf=System.currentTimeMillis();
                        long tt= tf-ti;
                        carrera.losCaballos[8].setTiempo(tt);
                        frmInicio.txtR.append("\n"+this.getName()+":"+carrera.losCaballos[8].getTiempo()+" ms");
                        j=99;
                        }else{
                        j++;
                    }//else
                } //for
                catch (InterruptedException ex) {
                    Logger.getLogger(hiloUno.class.getName()).log(Level.SEVERE, null, ex);
                }
              
              
             
        }//for
            
            frmInicio.lblCaballo9.setLocation(frmInicio.lblCaballo9.getLocation().x,frmInicio.lblCaballo9.getLocation().y);
             
             this.stop();
        }//if
        
        if(getName().equals("Vegeta")){
            
            long ti=System.currentTimeMillis();
            
            for (int j = 0; j < 99; j++) {
                try {
                    frmInicio.lblCaballo10.setLocation(frmInicio.lblCaballo10.getLocation().x+carrera.losCaballos[9].getAvance(),frmInicio.lblCaballo10.getLocation().y);
                    //System.out.println(this.getName()+":"+frmInicio.lblCaballo1.getLocation()+" -- "+frmInicio.lblLinea.getLocation().x);
                    
                    
                    sleep(carrera.losCaballos[9].getVelocidad());
                    
                    if(frmInicio.lblCaballo10.getLocation().x>=frmInicio.lblLinea.getLocation().x){
                        long tf=System.currentTimeMillis();
                        long tt= tf-ti;
                        carrera.losCaballos[9].setTiempo(tt);
                        frmInicio.txtR.append("\n"+this.getName()+":"+carrera.losCaballos[9].getTiempo()+" ms");
                        j=99;
                        }else{
                        j++;
                    }//else
                } //for
                catch (InterruptedException ex) {
                    Logger.getLogger(hiloUno.class.getName()).log(Level.SEVERE, null, ex);
                }
              
              
             
        }//for
            
            frmInicio.lblCaballo10.setLocation(frmInicio.lblCaballo10.getLocation().x,frmInicio.lblCaballo10.getLocation().y);
             
             this.stop();
        }//if
    }//run

    
   

        
    }//class