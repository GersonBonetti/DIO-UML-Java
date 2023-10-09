import componente.Iphone;

public class Main {
    public static void main(String[]args){
        Iphone novoIphone = new Iphone();

        System.out.println("--- Aparelho Telefonico ---");
        novoIphone.ligar();
        novoIphone.atender();
        novoIphone.iniciarCorreioDeVoz();

        System.out.println("--- Navegação Web ---");
        novoIphone.selecionarMusica();
        novoIphone.tocar();
        novoIphone.pausar();

        System.out.println("--- Reproduzir Música ---");
        novoIphone.adicionarNovaAba();
        novoIphone.exibirPagina();
        novoIphone.atualizarPagina();
    }
}
