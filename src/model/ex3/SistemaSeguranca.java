package model.ex3;

public class SistemaSeguranca implements Autenticavel{
    public boolean logado = false;
    public String usuario;
    public String senha;
    
    public SistemaSeguranca(String usuario,String senha){
        this.usuario = usuario;
        this.senha = senha;
    }

    public void login(String usuario,String senha){
        if(this.usuario == usuario && this.senha == senha){
            System.out.println("Usuário Logado");
            logado = true;
        }else{
            System.out.println("Tentativa inválida, tente novamente");
        }
    }
    
    public void logout(){
        if(logado){
            System.out.println("Usuário deslogado");
            logado = false;
        }else{
            System.out.println("Nenhum usuário logado no momento");
        }
    }
}