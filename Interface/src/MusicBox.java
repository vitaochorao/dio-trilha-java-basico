public record MusicBox(String music, boolean isPaused)implements MusicPlayer {

    @Override
    public void playMusic() {
       System.out.println("Play music ON"); 
    }

    @Override
    public void pauseMusic() {
        System.out.println("Pause Music");
    }

    @Override
    public void stopMusic() {
        System.out.println("Stop music");
    }


}
