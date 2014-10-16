package boletin5.pkg3;

/**
 *
 * @author aferreiradominguez
 */
public class Circulo {
     double radio;
     double PI=3.14;
    
    public Circulo(){
        
    }
    
    public Circulo(double radio){
        this.radio=radio;
    }
    
    public double calcularArea(){
        double area;
        
        area=PI* Math.pow(radio, 2);
        
        return area;
    }
    public double calcularLonxitude(){
        double lonxitude;
        
        lonxitude=2*PI*radio;
        
        return lonxitude;
    }
}
