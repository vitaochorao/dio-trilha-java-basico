public class OperadoresJava {
    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM "+"JAVA";
        //System.out.println(nomeCompleto);
         
        String concatenacao ="";

        concatenacao = 1+1+1+"1";

        //System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;

        //System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";

        //System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;

        //System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);

        //System.out.println(concatenacao);


        int numero = 5;

       // numero = -5;

       // System.out.println(-numero);

        //numero = numero +2;

        //System.out.println(numero);

        

        //System.out.println(++ numero );
        
        //System.out.println(--numero);

        boolean variavel = true;

        //System.out.println(!variavel);
        
        //System.out.println(variavel);

        variavel = !variavel;

        //System.out.println(variavel);

       int a, b;

       a = 6;
       b = 6;

       String resultado = a==b ? "Verdadeiro" : "Falso";

       //System.out.println(resultado);



       int  numero1 = 1, numero2 = 2;

       boolean simNao = numero1 != numero2;

       //System.out.println("numero1 é diferente do numero2?=" +simNao);

       /*if(numero1 > numero2){
        System.out.println("A nossa condição é Verdadeira!");
    }
        else
        {
            System.out.println("A nossa condição é Falsa");
        }
       }*/



       boolean condicao1 = true;

       boolean condicao2 = false;

       if(condicao1 && condicao2)
       {
            System.out.println("as duas condições são verdadeiras");
        
       }

       if(condicao1 || condicao2)
       {
            System.out.println("uma das condições é verdadeira");
        
       }


       System.out.println("fim.");

    }
}
    

