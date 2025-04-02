public class ReproduzirVideo implements VideoPlayer{

    @Override
    public void playVideo() {
        System.out.println("reproduzindo video");
    }

    @Override
    public void pauseVideo() {
       System.out.println("pausando video");
    }

    @Override
    public void stopVideo() {
        System.out.println("encerrando atividade");
    }

}
