import java.util.ArrayList; //import sempre no topo da lista
import java.util.List;
import java.util.Scanner;

public class Bot {
    private String nome;
    private int tarefasExecutadas;

    
     public Bot(String nome){
        this.nome = nome;
        this.tarefasExecutadas= 0;

     }
     public String getName(){
         return this.nome;
     }

    public static void main(String[] args) {
        // Cria o leitor de teclado
        Scanner teclado = new Scanner(System.in);   

        //primeiro criar a lista dos bots
        List<Bot> frota = new ArrayList<>();

        System.out.println("Digite o nome do novo Bot:");
        String nomeDigitado = teclado.nextLine(); 

        
        frota.add(new Bot(nomeDigitado));



        // 2. Adicionando bots
        frota.add(new Bot("Alpha"));
        frota.add(new Bot("Beta"));
        // 3. O Loop (For-each)
        
        for (Bot b : frota){
            b.executarTarefas(); // Chama o metodo de trabalho para o bot da vez
            System.out.println(" Status: " + b.getName() + " PRONTO!!. ");
        }

// Criando um bot isolado (fora da lista) para teste individual
         Bot meuBot = new  Bot ("Robocop");
        System.out.println(meuBot.getName());// Imprime o nome usando o Getter
        meuBot.executarTarefas();// Faz o Robocop trabalhar
        meuBot.executarTarefas(); // Faz ele trabalhar de novo (contador vai para 2)

    }
    public void executarTarefas(){
         this.tarefasExecutadas++;
         System.out.println("bot" + this.nome + " completou uma tarefa! Total: " + this.tarefasExecutadas);
    }
}
