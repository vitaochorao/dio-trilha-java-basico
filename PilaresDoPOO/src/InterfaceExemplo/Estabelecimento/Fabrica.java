package InterfaceExemplo.Estabelecimento;

import InterfaceExemplo.Equipamentos.impressora.Deskjet;
import InterfaceExemplo.Equipamentos.impressora.Impressora;

public class Fabrica {
public static void main(String[] args) {
    Impressora impressora = new Deskjet();
    impressora.Imprimir();
}
}
