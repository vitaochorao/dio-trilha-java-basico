public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual? " +smartTv.canal);
        System.out.println("Volume atual? " +smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> Tv está ligada?   " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status -> Tv está ligada?   " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Aumentando o volume para: "+smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("Baxando o volume para: "+smartTv.volume);


        smartTv.aumentarCanal();
            System.out.println(smartTv.canal);
        smartTv.diminuirCanal();
            System.out.println(smartTv.canal);


            smartTv.mudarCanal(13);
            System.out.println("O canal atual é: " + smartTv.canal);


    }

    
}
