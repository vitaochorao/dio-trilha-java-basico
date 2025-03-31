package ExemploAppsMenssagem.Apps;

public class MSNMessenger extends ServicoDeMensagemInstatanea{
    
    @Override
    public void enviarMensagem() {
        validarConexaoInternet();
        System.out.println("Enviando mensagem pelo MSN");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MSN");
    }
    
}
