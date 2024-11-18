package gerenciamentofuncionarios;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        FuncionarioTempoIntegral funcio2 = new FuncionarioTempoIntegral();
        FuncionarioMeioPeriodo funcio3 = new FuncionarioMeioPeriodo();

        funcionario.setNome("Pedro Igor de Oliveira Sodré");
        funcionario.setSalario(8650.36);
        funcionario.exibirInformacoes();

        System.out.println();

        funcio2.setNome("Edigar");
        funcio2.setSalario(8350);
        funcio2.getBonusSalario();

        funcio2.exibirInformacoes();

        System.out.println();
        funcio3.setNome("Pabllo Davi Sá Gomes");
        funcio3.setSalario(8450.36);
        funcio3.getBonusSalario();

        funcio3.exibirInformacoes();

    }
}
