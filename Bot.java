import java.util.ArrayList; //import sempre no topo da lista
import java.util.List;
import java.util.Scanner;

public class Bot {
    // 1. Atributos ficam aqui (Fora do main!)
    private String nome;
    private int tarefasExecutadas;

    // Construtor (o __init__)
     public Bot(String nome){
        this.nome = nome;
        this.tarefasExecutadas= 0;

     }
     public String getName(){
         return this.nome;
     }

    public static void main(String[] args) {
        // Cria o leitor de teclado
        Scanner teclado = new Scanner(System.in);   // Instancia o leitor de teclado apontando para a entrada do sistema (System.in)

        //primeiro criar a lista dos bots
        List<Bot> frota = new ArrayList<>();

        System.out.println("Digite o nome do novo Bot:");
        String nomeDigitado = teclado.nextLine(); // O programa vai pausar aqui e esperar você digitar

        // Agora cria o bot com o nome que você digitou
        frota.add(new Bot(nomeDigitado));



        // 2. Adicionando bots
        frota.add(new Bot("Alpha"));
        frota.add(new Bot("Beta"));
        // 3. O Loop (For-each)
        // LOOP FOR-EACH: "Para cada 'b' do tipo 'Bot' dentro da lista 'frota'..."
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
