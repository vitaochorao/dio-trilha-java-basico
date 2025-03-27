package Brasil;

public enum EstadoBrasileiro {

    SAO_PAULO("SP", "São Paulo"),
    RIO_JANEIRO("RJ", "Rio de Janeiro"),
    PIAUI("PI", "Piauí"),
    MARANHAO("MA", "Maranhão");

    private final String sigla;
    private final String nome;

    
    EstadoBrasileiro(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
    }

    
    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }
}
