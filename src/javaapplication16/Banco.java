
package javaapplication16;

public class Banco {
    
    public String nome ;
    public int digitos;
    public double valorInicial ;
  
    public double saque ;
    public int saquesRealizados = 0;
    public double depositar;

    public Banco(String nome , double valor , int digitos ){ 
        this.nome = nome;
        this.digitos = digitos;  
        this.valorInicial = valor;
    }   
    
    
    
    public String getnome(){
        return nome;
    }
    public void setnome(String nome){
        this.nome = nome;
    }
    
    public int getdigitos(){
     
        
        return digitos;
    }
    public void setdigitos(int digitos){
        this.digitos = digitos;
    }
    
    public double  getvalorInicial(){
        return valorInicial;
    }
    
    
    public double getsaque(){
        
        if(saque > valorInicial){
            System.out.println("Valor não pode ser sacado");
             System.exit(0);
        }
        if(saque < 0 ){
             System.out.println("Valor não pode ser sacado , é negativo ");
             System.exit(0);             
        }
        valorInicial =  valorInicial - saque  ;
        saquesRealizados++;
        return saque;
    }
    
    public double getdepositar(){
        return depositar;
    }
    public void setdepositar(double depositar){
        this.depositar = depositar;
    }
    
    public int getsaquesRealizados(){
        if(saquesRealizados == 3){
            System.out.println("Você atingiu seu limite por dia ");
            System.exit(0);
        }
        return saquesRealizados;
    }
    
    public void exibir(){
        System.out.println("seu nome: " + nome);
        System.out.println("Seu Digito: " + digitos);
        System.out.println("Valor da Conta: " + valorInicial );
   
        
    }
    
    public void Extrato(){
        System.out.println("seu nome: " + nome);
        System.out.println("Seu Número da Conta: " + digitos);
        System.out.println("Saldo: " + valorInicial );
        System.out.println("saques Realizados nmr : " + saquesRealizados);       
        
    }
    
    public void sacar(){
        System.out.println("Seu saldo Atual  : "  + valorInicial);
        
    }
    
    public void depositar(){
        System.out.println(" Seu Valor depositado  : " + depositar + " seu saldo " + valorInicial);
    }

}
