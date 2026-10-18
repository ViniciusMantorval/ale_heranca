
package model;

public class Faxineiro implements IFuncionario{
    
    public void baterPonto(String time){
        System.out.println("O faxineiro bateu o ponto as " + time);
    }
    public void varrerComodo(String comodo){
        System.out.println("O faxineiro varreu " + comodo+ "com perfeição, parabéns senhor faxineiro");
    }
}