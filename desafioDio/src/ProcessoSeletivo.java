import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args){
        //selecaoCandidato();
        //imprimirSelecionados();
        String [] candidatos = {"ANA", "BRUNO", "CARLA", "DIEGO", "EDUARDA"};
        for(String candidato: candidatos){
            entrandoEmContato(candidato);
        }
    }
       
    static boolean atender() {
        return new Random().nextInt(3)==1;
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO");    
        }while(continuarTentando && tentativasRealizadas <3);
        if(atendeu)
            System.out.println("CONDEGUIMOS CONTATO COM "+ candidato + "NA" +tentativasRealizadas+ "TENTATIVA");
                else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM "+candidato+", NUMERO MAXIMO DE TENTATIVAS"+ tentativasRealizadas+"TENTATIVAS");    

    }

    static void imprimirSelecionados() {
        String [] candidatos = {"ANA", "BRUNO", "CARLA", "DIEGO", "EDUARDA"};
        System.out.println("Imprimindo a lista de candidatos informando o indice de elemento");

        for(int indice=1; indice < candidatos.length;indice++) //Não faria sentido começar do zero no contexto
        {
            System.out.println("O candidato de n° "+ indice+ " é o "+candidatos[indice]);
        }
    }



        static void selecaoCandidato() {
            String [] candidatos = {"ANA", "BRUNO", "CARLA", "DIEGO", "EDUARDA", "FELIPE", "GABRIELA", "HENRIQUE", "ISABELA", "JÚLIO", "KARINA", "LUCAS", "MARIANA", "NATHAN", "OTÁVIO", "PATRÍCIA", "RAFAEL", "SABRINA", "TIAGO", "VIVIANE"};

            double salarioBase = 2000.0;
            int candidatosSelecionado = 0;
            int candidatosAtual = 10;
            while(candidatosSelecionado < 5 && candidatosAtual < candidatos.length){
                String candidato = candidatos[candidatosAtual];
                double salarioPretendido = valorPretendido();
                System.out.println("O candidato "+ candidato+ " Solicitou este valor de salário "+ salarioPretendido );
                
                if(salarioBase >= salarioPretendido) 
                {
                    System.out.println("O candidato "+ candidato + "foi selecionado");
                    candidatosSelecionado++;
                }
                candidatosAtual++;
            }
        }
    

        static double valorPretendido() {
            return ThreadLocalRandom.current().nextDouble(1800,2200);
        }





    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
        } else if(salarioBase ==salarioPretendido)
                System.out.println("Ligar para o candidato com contra resposta");
                else{
                    System.out.println("Aguardando o resultado dos demais candidatos");
                }
    }
}
