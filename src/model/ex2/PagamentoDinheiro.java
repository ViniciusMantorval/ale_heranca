package model.ex2;

public class PagamentoDinheiro implements Pagamento{
    public String[] produtos;
    public double[] precos;
    public int[] quantidades;
    public double total;

    public PagamentoDinheiro(String[] produtos,double[] precos,int[] quantidades){
        this.produtos = produtos;
        this.precos = precos;
        this.quantidades = quantidades;
        total = 0;
    }
    public void calcularPagamento(){
        total=0;
        if(precos.length != quantidades.length){
            System.out.println("Erro nos produtos passadso, tente novamente");
            return;
        }

        for(int i=0;i<precos.length;i++){
           total+= precos[i]*quantidades[i];
        }
    }
    public String emitirRecibo(){
        String recibo="";
        calcularPagamento();
        for (int i = 0; i < produtos.length; i++) {
            recibo += produtos[i] + " ----- " + quantidades[i] + "x ----- " + precos[i] + "\n";
        }
        recibo += "Taxa do cartão ----- " + total * 0.05 + "\n";
        recibo += "Total ===== "+ total *1.05 + "\n";
        return recibo;
    }
}