package view;
import model.ex2.*;

public class Ex2{
    public static void main(String[] args) {
        String[] produtos = {"Lápis","Borracha","Caneta"};
        double[] precos = {1.2,3.0,1.0};
        int[] quantidades = {3,2,1};
        PagamentoCartao pgc = new PagamentoCartao(produtos,precos,quantidades);
        PagamentoDinheiro pgd = new PagamentoDinheiro(produtos,precos,quantidades);

        System.out.println(pgc.emitirRecibo());
        System.out.println(pgd.emitirRecibo());
    }
}