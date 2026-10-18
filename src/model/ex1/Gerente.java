package model;

public class Gerente implements IFuncionario{

    public void baterPonto(String time){
        System.out.println("O gerente bateu o ponto as " + time);
    }
    public void fecharLoja(){
        System.out.println("O gerente fechou a loja");
    }
}