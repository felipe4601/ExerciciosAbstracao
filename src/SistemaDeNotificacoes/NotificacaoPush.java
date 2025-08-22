package SistemaDeNotificacoes;

public class NotificacaoPush implements Notificacao{

    public void enviar(String mensagem){
        System.out.println("\n\n  -------------------------------------------------");
        System.out.println("   Notificação:                                    ");
        System.out.println("   " + mensagem);
        System.out.println("  -------------------------------------------------");
    }
}
