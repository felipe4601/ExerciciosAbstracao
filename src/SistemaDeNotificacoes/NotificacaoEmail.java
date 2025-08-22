package SistemaDeNotificacoes;

public class NotificacaoEmail implements Notificacao{

    public void enviar( String mensagem){
        System.out.println("\n\n  -------------------------------------------------");
        System.out.println("   Email:                                          ");
        System.out.println("   " + mensagem);
        System.out.println("  -------------------------------------------------");


    }
}
