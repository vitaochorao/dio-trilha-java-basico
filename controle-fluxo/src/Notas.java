public class Notas {
    public static void main(String[] args) {
        int nota = 6;

        if(nota>=7)
            System.out.println("Aprovado");

        else if(nota >= 5 && nota < 7 )
            System.out.println("Prova de recuperação");
            
        else
            System.out.println("Reprovado");


            String resultado = nota >=7 ? "Aprovado" : nota >= 5 && nota <7 ? "Recuperação":"reprovado";

                System.out.println(resultado);

    }
    
}
