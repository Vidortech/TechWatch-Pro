public class SuporteRemoto {

    public void fornecerSuporteRemoto() {
        System.out.println("Iniciando suporte remoto aos funcionários...");

        while (true) {
            System.out.println("Aguardando chamados de suporte...");

            try {
                Thread.sleep(1800000); // 30 minutos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
