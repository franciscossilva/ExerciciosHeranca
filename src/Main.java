publpublic class Main {
    public static void main(String[] args) {
        Professor professor = new Professor("FRANCISCO","027.233.232.09","001","RH","R$:2000","Ensino superior cursando","Ingles","22","1");
        Coordenador coordenador= new Coordenador("Fabricio","027.433.434.22","002","TI","R$:10.600",);
        coordenador.adicionaProfessor();
        FuncionarioAdm administrativo = new FuncionarioAdm("Helio","033.333.222.11","009","Equipe de limpeza","R$:1,300","Auxiliar","Jovem Aprendiz");
        Estagiario estagiario = new Estagiario("Igor","222.333.444.65","0099","Departamento pessoal",professor);
        System.out.println("Professor: "+professor.getNome());
        System.out.println("Coodernador: "+ coordenador.getNome());
        System.out.println(" Funcionario Adm: "+administrativo.getNome());
        System.out.println("Estagiario: "+estagiario.getNome());

        professor.aumentoSalario();
        coordenador.aumentoSalario();
        administrativo.aumentoSalario();

        System.out.println("Salario do professor " +professor.getSalario());
        System.out.println("Salario Coordenador: "+coordenador.getSalario());
        System.out.println("Salario Funcionario Adm: "+administrativo.getSalario());

        professor.adicionartturma();
        professor.adicionartturma();
        professor.adicionartturma();
        System.out.println("Quantidade de turmas do professor: "+professor.getQuantidadedeturmas());}
    }
}