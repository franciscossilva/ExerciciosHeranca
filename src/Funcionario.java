public abstract class Funcionario {
    private String nome;
    private String cpf;
    private String numeroregisto;
    private  String orgaolotacão;
    private double salario;
    public Funcionario(String nome,String cpf,String numeroregisto,String orgaolotacão,double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.numeroregisto = numeroregisto;
        this.orgaolotacão = orgaolotacão;
        this.salario = salario;}
public String getNome(){
    return  nome;}

    public void setNome(String nome){
        this.nome= nome;}

    public  String getCpf(){
        return cpf;}
    public  void  setCpf(String cpf){
        this.cpf=cpf;}
    public String getNumeroregisto(){
        return numeroregisto;}
    public void setNumeroregisto(String numeroregisto){
        this.numeroregisto=numeroregisto;}
    public  String getOrgaolotacão(){
        return  orgaolotacão;}
    public  void setOrgaolotação(String orgaolotacão){
        this.orgaolotacão=orgaolotacão;}

    public double getSalario() {
        return salario;}
    public void setSalario(double salario) {
        this.salario=salario;}
    public abstract void reembolsodespesas();
    public void aumentoSalario(){
        if (this instanceof Coordenador){
            salario+=salario*0.05;}
        else {salario+=salario*0.1;
        }
    }
}

