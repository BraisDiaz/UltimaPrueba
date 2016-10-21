
package boletin6_0;


public class Boletin6_0 {

    
    public static void main(String[] args) {
        
        ContaBanco obj1 = new ContaBanco();
       
        
        obj1.setNome("Pepe");
        obj1.setNumCuenta("30303");
        obj1.setSaldo(4000);
        obj1.retirado(0);
        obj1.setIngresado(5000);
        obj1.visualizar();
        
        ContaBanco obj2 = new ContaBanco();
        
        obj2.setNome("Manolo");
        obj2.setNumCuenta("12345");
        obj2.setSaldo(25000);
        obj2.retirado(2200);
        obj2.setIngresado(0);
        obj2.visualizar();
        
        obj2.Transferencia("12345", "30303", 500);
    }
    
    
    
    

       
}
