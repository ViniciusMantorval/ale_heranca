package view;
import model.ex3.*;

public class Ex3{
    public static void main(String[] args) {
        SistemaSeguranca ss = new SistemaSeguranca("user123","1234");
        
        ss.login("user123","1234");
        
        ss.logout();
    }
}