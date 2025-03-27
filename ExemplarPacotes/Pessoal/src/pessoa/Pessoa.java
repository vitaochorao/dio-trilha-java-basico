package pessoa;

public class Pessoa {
    private String nome;
    private String cpf;


    public Pessoa (String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }





    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public String getEndereço() {
        return endereço;
    }
    private String endereço;

    
}
