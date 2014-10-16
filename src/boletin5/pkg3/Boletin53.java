package boletin5.pkg3;


public class Boletin53 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        
               double radio, area, lonxitude;
        
        Circulo circ1=new Circulo(7);
        
        area=circ1.calcularArea();
        lonxitude=circ1.calcularLonxitude();
        
        System.out.println("O area dun circulo de radio 7 é: "+area+ " e a sua lonxitude é: "+lonxitude);
    }
    
}
