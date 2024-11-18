package gerenciamentofuncionarios;

public class FuncionarioMeioPeriodo extends FuncionarioTempoIntegral{

    private double bonusSalario;

    @Override
    public double getBonusSalario(){
        bonusSalario = 0.50;
        return bonusSalario;

    }

    @Override
    public double calcularSalario(){
        return super.calcularSalario();
    }
    
}
