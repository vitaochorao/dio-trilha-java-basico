package pessoa;


public class SistemaDeCadastro {
    public static void main(String[] args) {
        Pessoa marcos = new Pessoa(null, null);

        marcos.setEndereço("RUAS DAS MARIAS");

        System.out.println(marcos.getNome() + "-" + marcos.getCpf());
    }



    
}
