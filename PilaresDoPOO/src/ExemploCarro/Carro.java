package ExemploCarro;

public class Carro extends Veiculo {
    
    public void ligar () {
        System.out.println("CARRO LIGADO");
        confereCambio();
        confereCombustivel();
    }

    private void confereCambio() {
        System.out.println("CONFERE CAMBIO EM P");
    }

    private void confereCombustivel() {
        System.out.println("CONFERE COMBUSTIVEL");
    }
}
