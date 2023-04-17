
package classes;

//classe filha da classe funcionario
public class Gerente extends Funcionario{
    
    private String departamento;
    private double bonus = 0.10;

    //construtor da subclasse
    public Gerente(String nome, String ct, double salario, double porcentagemComissao, double totalVendas, String departamento){
        super(nome, ct, salario, porcentagemComissao,totalVendas);
        this.departamento = departamento;   
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    //sobrescrita de metodos = forma de polimorfismo
    @Override
    public double rendimento(){
        return salario + (salario * bonus);
    } 
    
    
    @Override
    public String toString(){
        return super.toString()
                + "\nDepartamento: " +departamento;
    }
    
}
