
package satellite;

import javax.swing.JOptionPane;


public class Satellite {

    //atributos
     private double meridiano ;
     private double paralelo ;
     private double distanciaTerra ;
   
     //contructor
 public Satellite ( ) {

  meridiano = paralelo = distanciaTerra = 0 ;
}
public Satellite ( double m, double p , double d )  {

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

JOptionPane.showMessageDialog(null,"O satellite atopase  no paralelo "+ paralelo + ", meridiano " + meridiano+ ", a unha distancia da terra " + distanciaTerra );
}
}
    
    
        
    
    

