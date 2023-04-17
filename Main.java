package aplicacao;

import classes.Funcionario;
import classes.Gerente;

public class Main {
    public static void main(String[] args) {
        
        //instancia dos objetos
        Funcionario f = new Funcionario("Pedro", "123", 2000.0, 0.10, 1000.0);
        Gerente g = new Gerente("Luis", "123", 2000.0, 0.10, 1000.0, "RH");
        
        System.out.println("Dados de Funcionario: \n" +f.toString());
        
        System.out.println("------//----------");
        
        System.out.println("Dados de Gerente: \n" +g.toString());
       
    }
    
}
