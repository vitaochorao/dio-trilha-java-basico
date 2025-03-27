package Lanchonete.atendimento.cozinha;

import Lanchonete.atendimento.Atendente;

public class Cozinheiro {
    public void adicionarLancheNoBalcao() {
        System.out.println("ADICIONANDO LANCHE NO BALCÃO");
    }

public void adicionarSucoNoBalcao() {
    System.out.println("ADICIONAR SUCO AO BALCÃO");
}    
public void adicionarComboNoBalcao() {
    adicionarLancheNoBalcao();
    adicionarSucoNoBalcao();
    
}
private void prepararLanches() {
    System.out.println("PREPARANDO LANCHE TIPO HAMBURGUER");
}

private void prepararVitamina() {
    System.out.println("PREPARANDO SUCO");
}

private void prepararCombo() {
    prepararLanches();
    prepararVitamina();
}
    
private void selecionarIngredientesLanche() {
    System.out.println("SELECIONADO O PÃO, SALADA, OVO E CARNE");
}

private void selecionarIngredientesVitamina() {
    System.out.println("SELECIONADO FRUTA, LEITE E SUCO");
}

private void lavarIngredientes() {
    System.out.println("LAVANDO INGREDIENTES");
}

private void baterVitaminaLiquidificador() {
    System.out.println("BATENDO VITAMINA NO LIQUIDIFICADOR");
}

private void fritarIngredientesLanches() {
    System.out.println("FRITANDO A CARNE E OVO PARA O HAMBURGER");
}

public void pedirParaTrocarGas(Almoxarife meuAmigo) {
    meuAmigo.trocarGas();
}

public void pedirParaTrocarGas(Atendente meuAmigo) {
    meuAmigo.trocarGas();
} 

public void pedirIngredientes(Almoxarife almoxarife) {
    almoxarife.entregarIngredientes();
}

}
