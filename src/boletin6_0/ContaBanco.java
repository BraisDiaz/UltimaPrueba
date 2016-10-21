
package boletin6_0;

import javax.swing.JOptionPane;


public class ContaBanco {
    
    private String nome,numCuenta;
    private double saldo,retirado,ingresado;
    
    
    public  ContaBanco(){
        
                     
    }
    
    
    public ContaBanco(String nome,String numCuenta,double saldo,double retirado,double ingresado){
        
        this.nome = nome;
        this.numCuenta = numCuenta;
        this.saldo = saldo;
        this.ingresado = ingresado;
        this.retirado = retirado;
        
    }

    public void setIngresado(double ingresado) {
       
        this.ingresado = ingresado;
        
        if (ingresado>=0){
            System.out.println("true" );
        }   
        else
        
        System.out.println("false");
        saldo = saldo+ingresado;
                
    }

    public void retirado(double retirado){
        
        this.retirado = retirado;
        
        if (retirado>0)
            System.out.println("true");
        
        else
            System.out.println("false");
        
          saldo = saldo - retirado;
   
                
                }
    
    public void visualizar(){
        
        System.out.println(" os datos do cliente son "+ " nome " + nome+" con Numero de conta "+  numCuenta +
                " e o Saldo Actual e de "+saldo+" euros ");
    }
    
    public void setSaldo(double saldo) {
        
        this.saldo = saldo;
        
     }
            
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }
   
  public void Transferencia(String CuentaDestino,String CuentaOrigen,double importe){
      
      if (saldo >0)
          System.out.println(" Transfirese " + importe + " € dende o número de conta "+ CuentaOrigen + " o número de conta "+ CuentaDestino );
      
      else
          System.out.println(" O saldo e insuficiente ");
          
      
  }
       
    }
    
  
    
    
