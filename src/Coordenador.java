import java.util.ArrayList;
import java.util.List;

public class Coordenador extends Funcionario{
    private List<Professor> professorsupervisionado;
    public Coordenador(String nome,String cpf,String numeroregistro,String orgaolotacão,double salario) {
        super(nome, cpf, numeroregistro, orgaolotacão, salario);
        professorsupervisionado = new ArrayList<>();
    }
    public List<Professor>getProfessorsupervisionado(){
        return professorsupervisionado;}
    public void setProfessorsupervisionado(List<Professor>professorsupervisionado){
        this.professorsupervisionado=professorsupervisionado;
    }
    public void adicionaProfessor(Professor professor){
        if (professorsupervisionado.size()<2) {
            professorsupervisionado.add(professor);
        }else {
            System.out.println("Coordenador ja supervisionar o max de prof");
        }
    }
@Override
public void reembolsodespensas(){
    }
}