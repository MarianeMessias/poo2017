package biancaperessin_marianecarolinemessias;

public class Pessoa 
{
    //Atributos da classe Pessoa:
    public  String Nome; //Atributo público.
    private String CPF; //Atributo privado, portanto, deve ser usado GET / SET (Encapsulamento).
    private String RG; //Atributo privado, portanto, deve ser usado GET / SET (Encapsulamento).
    
    //Construtores da classe Pessoa:
    public Pessoa(String Nome, String CPF, String RG)
    {
        this.Nome = Nome;
        this.CPF = CPF;
        this.RG = RG;
    }
    
    //Métodos GET da classe Pessoa:
    public String getNome()
    {
        return Nome;
    }

    public String getCPF()
    {
        return CPF;
    }

    public String getRG()
    {
        return RG;
    }
    
    //Métodos SET da classe Pessoa:
    public void setNome(String Nome)
    {
        this.Nome = Nome;
    }

    public void setCPF(String CPF)
    {
        this.CPF = CPF;
    }

    public void setRG(String RG)
    {
        this.RG = RG;
    }
    
    //Métodos da classe Pessoa:
    public void Cumprimentar(String Nome) throws Exception
    {
        if(Nome != null)
        {
            System.out.print("\nOlá, " + Nome + ". Seja bem vinda(o)!\n");
        }
        else
        {
            throw new Exception("\nNome inválido!\n");
        }
    }
    
    public void Dizer(String Nome) throws Exception
    {
        if(Nome != null)
        {
            System.out.print("\n" + Nome + ", você é uma PESSOA!\n");
        }
        else
        {
            throw new Exception("\nNome inválido!\n");
        }
    }
    
    public void Agradecer()
    {
        System.out.print("\nA PESSOA está agradecendo...\n");
    }
}
