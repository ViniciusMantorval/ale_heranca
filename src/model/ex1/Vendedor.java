

package model;

public class Vendedor implements IFuncionario{
    
    public void baterPonto(String time){
        System.out.println("O vendedor bateu o ponto as " + time);
    }
    public void vender(String objeto){
        System.out.println("O vendedor vendeu um/uma " + objeto);
    }
}