package view;

import model.ex1.*;

public class Ex1{
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor();
        Faxineiro faxineiro = new Faxineiro();
        Gerente gerente = new Gerente();
       
        vendedor.vender("Colchão inflável");
        faxineiro.varrerComodo("Sala do gerente");

        vendedor.baterPonto("19:30:00");
        
        faxineiro.baterPonto("19:50:00");

        gerente.fecharLoja();
        gerente.baterPonto("20:00:00");  
    }
}