
package satelite;

import javax.swing.JOptionPane;


public class Satelite {

    //atributos
     private double meridiano ;
     private double paralelo ;
     private double distanciaTerra ;
   
     //contructor
 public Satelite ( ) {

  meridiano = paralelo = distanciaTerra = 0 ;
}
public Satelite ( double m, double p , double d )  {

meridiano = m ;
paralelo = p;
distanciaTerra = d ;

}
//metodos
public double getMeridiano(){
    return meridiano;
}
public double getParalelo (){
    return paralelo;
}
public double getDistanciaTerra (){
    return distanciaTerra;
}
public void verPosicion ( ) {

JOptionPane.showMessageDialog(null,"O satelite atopase  no paralelo "+ paralelo + ", meridiano " + meridiano+ ", a unha distancia da terra " + distanciaTerra );
}
}
    
    
        
    
    

