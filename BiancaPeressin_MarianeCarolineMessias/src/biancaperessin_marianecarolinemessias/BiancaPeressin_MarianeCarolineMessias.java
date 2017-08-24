package biancaperessin_marianecarolinemessias;

import java.util.Scanner;

public class BiancaPeressin_MarianeCarolineMessias 
{
    public static void main(String[] args) throws Exception
    {
        Scanner Leitura = new Scanner(System.in);
        
        String Nome, CPF, RG, Prontuario;

        //Para Pessoa:
        System.out.println("Qual é o seu nome? ... ");
        Nome = Leitura.nextLine();  
        System.out.println("CPF: ");
        CPF = Leitura.nextLine();
        System.out.println("RG: ");
        RG = Leitura.nextLine();
        
        Pessoa P = new Pessoa(Nome, CPF, RG);
    
        P.Cumprimentar(Nome);
        P.Dizer(Nome);
        
        //Para Aluno:
        System.out.println("Qual é o seu nome? ... ");
        Nome = Leitura.nextLine();  
        System.out.println("CPF: ");
        CPF = Leitura.nextLine();
        System.out.println("RG: ");
        RG = Leitura.nextLine();
        System.out.println("Prontuário: ");
        Prontuario = Leitura.nextLine();
        
        //Associação entre classes (Entre a classe Aluno e a classe InstituicaoDeEnsino):
        InstituicaoDeEnsino IDE = new InstituicaoDeEnsino("IFSP - Capivari");
        
        Aluno A = new Aluno(Prontuario, IDE, Nome, CPF, RG);
        A.Dizer(Nome);
        
        //Polimorfismo:
        Teste T = new Teste();
        T.ExecutarAgradecimento(P);
        T.ExecutarAgradecimento(A);
        
        System.out.println(IDE.Instituicao);
    }
}
