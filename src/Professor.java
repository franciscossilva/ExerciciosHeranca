public class Professor extends Funcionario{
    private String nivelgraduação;
    private String disciplinaMinistada;
    private Int quantidadedealunos;
    private Int quantidedeturmas;

    public Professor(String nome,String cpf,String numeroregistro,String orgaolotação,double salario,String nivelgraduação,
                     String disciplinaMinistada, int quatidadedealunos,int quantidadedeturmas){
        super(nome,cpf,numeroregistro,orgaolotação,salario);
        this.nivelgraduação=nivelgraduação;
        this.disciplinaMinistada=disciplinaMinistada;
        this.quantidadedealunos=quatidadedealunos;
        this.quantidedeturmas=quantidadedeturmas;
    }
    public String getNivelgraduação(){
        return  nivelgraduação;}
    public void setNivelgraduação(String nivelgraduação){
        this.nivelgraduação=nivelgraduação;}

    public String getDisciplinaMinistada(){
        return  disciplinaMinistada;}
    public void setDisciplinaMinistada(String disciplinaMinistada){
        this.disciplinaMinistada=disciplinaMinistada;}

    public Int getQuantidadedealunos() {
        (return quantidadedealunos;)}
    public void setQuantidadedealunos(int quantidadedealunos){
        this.quantidadedealunos=quantidadedealunos;}
    public int getQuantidadedeturmas(){
        return quantidedeturmas;}
    public void setQuantidedeturmas(int quantidedeturmas){
        this.quantidedeturmas=quantidedeturmas;}
    public void adicionartturma(){
        quantidedeturmas++;}
    @Override
    public void reembolsodespesas() {
    }
