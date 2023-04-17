
package classes;
//superclasse, classe generalista, classe pai
public class Funcionario {
    
    protected String nome;
    protected String ct;
    protected double salario;
    protected double porcentagemComissao;
    protected double totalVendas;
    
    //construtores
    public Funcionario(String nome, String ct, double salario, double porcentagemComissao, double totalVendas){
        setSalario(salario);
        this.nome = nome;
        this.ct = ct;
        this.porcentagemComissao = porcentagemComissao;
        this.totalVendas = totalVendas;
    }
    //metodos setters(modificadores) e getters(modificadores)

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCt() {
        return ct;
    }
    public void setCt(String ct) {
        this.ct = ct;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        if (salario < 1400.0){
            System.out.println("Valor salario invalido");
        }
        this.salario = salario;
    }

    public double getPorcentagemComissao() {
        return porcentagemComissao;
    }

    public void setPorcentagemComissao(double porcentagemComissao) {
        this.porcentagemComissao = porcentagemComissao;
    }
    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }
    
    public double rendimento(){
        return salario + (totalVendas * porcentagemComissao);
    }
        
    //sobrescrita do método toString
    @Override
    public String toString(){
        return "Nome: " +nome
                +"\nCarteira Trabalho: "+ct
                +"\nSalario: " +salario
                +"\nporcentagemComissao: " +porcentagemComissao
                +"\nTotal de vendas: " +totalVendas;
    }
    
}
