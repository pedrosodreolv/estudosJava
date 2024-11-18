package gerenciamentofuncionarios;

public class Funcionario {
    private String nome;
    private double salario;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularSalario(){
        return this.salario;
    }

    public void exibirInformacoes(){
        System.out.println("Nome: " +getNome());
        System.out.println("Salário: "+calcularSalario());
    }



}