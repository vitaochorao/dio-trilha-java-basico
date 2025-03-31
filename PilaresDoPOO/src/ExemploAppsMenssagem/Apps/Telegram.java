package ExemploAppsMenssagem.Apps;

public class Telegram extends ServicoDeMensagemInstatanea {

    @Override
    public void enviarMensagem() {
        validarConexaoInternet();
        System.out.println("Enviando mensagem pelo Telegram");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Telegram");
    }
    
}
