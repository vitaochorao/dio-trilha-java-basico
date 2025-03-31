package ExemploAppsMenssagem.Apps;

public abstract class ServicoDeMensagemInstatanea {

    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    
    protected void validarConexaoInternet() {
        System.out.println("Validando se está conectado à internet");
    }

}
