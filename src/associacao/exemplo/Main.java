package associacao.exemplo;

public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        f1.setNome("Bill Gates");

        Funcionario f2 = new Funcionario();
        f2.setNome("Steve Jobs");

        Departamento d = new Departamento();
        d.setNome("TI");

        //fazendo associação entre funcionarios e departamento
        f1.setDepartamento(d);
        d.getFuncionarios().add(f1);

        f2.setDepartamento(d);
        d.getFuncionarios().add(f2);


        //imprimindo funcionário:
        System.out.println(f1.getNome() 
                + " trabalha no departamento " 
                + f1.getDepartamento().getNome());

        //imprimindo o departamento
        System.out.println(d.getNome() + " tem os funcionários: ");
        for(Funcionario f : d.getFuncionarios()) {
            System.out.println(f.getNome());
        }

        //adicione a funcionário Maria que trabalha no TI
        Funcionario f3 = new Funcionario();
        f3.setNome("Maria");
        f3.setDepartamento(d);
        d.getFuncionarios().add(f3);

        
        //adicione o Severino que trabalha na Recepção
        Departamento d2 = new Departamento();
        d2.setNome("Recepção");

        Funcionario f4 = new Funcionario();
        f4.setNome("Severino");
        f4.setDepartamento(d2);
        d2.getFuncionarios().add(f4);
        
    }

}
