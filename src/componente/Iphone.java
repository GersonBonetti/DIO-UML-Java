package componente;

import comportamentos.AparelhoTelefonico;
import comportamentos.Navegador;
import comportamentos.ReprodutoMusical;

public class Iphone implements AparelhoTelefonico, Navegador, ReprodutoMusical {

    @Override
    public void ligar() {
        System.out.println("Ligando.");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada.");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Correio de voz iniciado.");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página web");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página web atualizada.");
    }

    @Override
    public void tocar() {
        System.out.println("Música iniciada");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Música selecionada");
    }
}
