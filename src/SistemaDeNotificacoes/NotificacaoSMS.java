package SistemaDeNotificacoes;

import java.sql.SQLOutput;

public class NotificacaoSMS implements Notificacao{



    public void enviar( String mensagem){
        System.out.println("\n\n  -------------------------------------------------");
        System.out.println("   SMS  :                                          ");
        System.out.println("   " + mensagem);
        System.out.println("  -------------------------------------------------");

    }
}
