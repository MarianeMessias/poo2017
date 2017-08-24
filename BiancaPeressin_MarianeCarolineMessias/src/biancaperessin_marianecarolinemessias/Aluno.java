package biancaperessin_marianecarolinemessias;

//Um aluno é uma pessoa, portanto a classe Pessoa é a classe mãe e a classe Aluno é a classe filha:
public class Aluno extends Pessoa
{
    //Atributos da classe Aluno:
    private String Prontuario; //Atributo privado, portanto, deve ser usado GET / SET (Encapsulamento).
    private InstituicaoDeEnsino IDE; //Atributo privado, portanto, deve ser usado GET / SET (Encapsulamento).
    
    //Construtores da classe Aluno:

    public Aluno(String Prontuario, InstituicaoDeEnsino IDE, String Nome, String CPF, String RG)
    {
        super(Nome, CPF, RG);
        this.Prontuario = Prontuario;
        this.IDE = IDE;
    }
    
    //Métodos GET da classe Aluno:
    public String getProntuario()
    {
        return Prontuario;
    }

    public InstituicaoDeEnsino getIDE()
    {
        return IDE;
    }
    
    //Métodos SET da classe Aluno:
    public void setProntuario(String Prontuario)
    {
        this.Prontuario = Prontuario;
    } 

    public void setIDE(InstituicaoDeEnsino IDE)
    {
        this.IDE = IDE;
    }
    
    //Métodos da classe Aluno:
    @Override //Sobrescrita de métodos.
    public void Dizer(String Nome) throws Exception
    {
        if(Nome != null)
        {
            System.out.print("\n" + Nome + ", você é um ALUNO!\n");
        }
        else
        {
            throw new Exception("\nNome inválido!\n");
        }
    }
    
    public void Agradecer()
    {
        System.out.print("\nO ALUNO está agradecendo...\n");
    }
}
