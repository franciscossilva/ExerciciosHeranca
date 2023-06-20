public class FuncionarioAdm extends Funcionario{
    private String funcaoadm;
    private String senioridade;
    public FuncionarioAdm(String nome,String cpf,String numeroregistro,String orgaolotacão,double salario,String funcaoadm,String senioridade{
        super(nome,cpf,numeroregistro,orgaolotacão,salario);
        this.funcaoadm=funcaoadm;
        this.senioridade=senioridade;}
    public String getFuncaoadm(){
        return funcaoadm;}
    public void setFuncaoadm(String funcaoadm){
        this.funcaoadm=funcaoadm;}
    public String getSenioridade(){
        return senioridade;}
    public void setSenioridade(String senioridade){
        this.funcaoadm=senioridade;}
    @Override
    public void reembolsodespesas(){
    }
}