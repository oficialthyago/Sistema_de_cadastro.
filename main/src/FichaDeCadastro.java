import java.util.Scanner;
/* 
PROJETO PROPOSTO 

Nome String
Idade Inteiro 
Peso Real
Altura Real
Sexo char 

DETALHES //

Nome, tamano minimo 6 e maximo 30
idade > 0 < 100
peso > 0
Altura > 0
Sexo 'M' ou 'F'

Após a leitura dos dados apresentar todos os dados lidos em uma ficha de cadastro na tela 
 */

public class FichaDeCadastro {

         static String nome  ;
         static int    idade ;
         static float  altura;
         static float  peso  ;
         static String sexo  ;
    
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        // Local onde o user final ira inserir o nome 
        do{
        System.out.println("Digite seu nome: ");
        String nome = leitor.nextLine(); // Nextline ( responsavel por ler variaveis do tipo String)
        }while (nome.length() < 6 || nome.length() >30 ); 
        // Logica de pensamento para o "DO WHILE", como um dos requisitos é "Nome, tamano minimo 6 e maximo 30" será feito isso 
        // pois caso o user n coloque caracteres suficientes, a solicitação seja refeita


        // Local onde o user final ira inserir a idade 
        do {
        System.out.println("Digite sua idade: ");
        int idade = leitor.nextInt(); // NextInt( responsavel por ler variaveis do tipo Int)
        }while( idade<= 0 || idade >=100 );
        //idade > 0 < 100

        // Local onde o user final ira inserir a Altura 
        do{
        System.out.println("Digite sua altura: ");
        float altura = leitor.nextFloat(); // NextFloat( responsavel por ler variaveis do tipo Float)
        }while (peso >0);
        // peso > 0     

        // Local onde o user final ira inserir o peso  
        do{
        System.out.println("Digite seu peso: ");
        float peso = leitor.nextFloat(); // NextFloat( responsavel por ler variaveis do tipo Float)
        }while (altura >0);
        //Altura > 0
        
        
        
        // Local onde o user final ira inserir o sexo
        do{
        System.out.println("Digite sua altura: ");
        String sexo = leitor.nextLine(); // Nextline ( responsavel por ler variaveis do tipo String) 
        }while(sexo != "F" && sexo !="M");

        System.out.println("\nNome  : "+ nome);
        System.out.println("Idade : "+ idade );
        System.out.println("Altura: "+ altura);
        System.out.println("Peso  : "+ peso  );
        System.out.println("Sexo  : "+ sexo  );
        
     
    }
}
