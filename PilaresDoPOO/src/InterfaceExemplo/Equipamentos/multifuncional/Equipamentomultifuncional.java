package InterfaceExemplo.Equipamentos.multifuncional;

import InterfaceExemplo.Equipamentos.copiadora.Copiadora;
import InterfaceExemplo.Equipamentos.digitalizadora.Digitalizadora;
import InterfaceExemplo.Equipamentos.impressora.Impressora;

public class Equipamentomultifuncional implements Copiadora, Digitalizadora, Impressora {
    

    public void Copiar(){
        System.out.println("COPIANDO VIA MULTIFUNCIONAL");
    }

    public void Digitalizar() {
        System.out.println("Digitalizando via Multifuncional");
    }

    public void Imprimir(){
        System.out.println("Imprimindo via Multifuncional");
    }

     
}
