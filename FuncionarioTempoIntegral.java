package gerenciamentofuncionarios;

public class FuncionarioTempoIntegral extends Funcionario{
    private double bonusSalario;
    private double salarioAtt;

    public double getSalarioAtt() {
        return salarioAtt;
    }

    public void setSalarioAtt(double salarioAtt) {
        this.salarioAtt = salarioAtt;
    }

    public double getBonusSalario() {
        bonusSalario = 0.10;
        return bonusSalario;
    }

    @Override
    
    public double calcularSalario(){
        double salarioAtt = (getBonusSalario() * getSalario()) + getSalario();
        return salarioAtt;

    }

    


    
}
