public class Estagiario extends Funcionario{
    private Professor professorvinculado;
    public Estagiario(String nome,String cpf,String numeroregistro,String orgaolotacão,Professor professorvinculado){
        super(nome,cpf,numeroregistro,orgaolotacão,0);
        this.professorvinculado=professorvinculado;}
    public Professor getProfessorvinculado(){
        return professorvinculado;}
    public void setProfessorvinculado(Professor professorvinculado){
        this.professorvinculado=professorvinculado;}
    @Override
    public void reembolsodespensas(){
    }
}
