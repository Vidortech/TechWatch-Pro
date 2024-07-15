public class AutomacaoSuporteTecnico {

    public static void main(String[] args) {
        MonitorDeSistema monitor = new MonitorDeSistema();
        Thread threadMonitor = new Thread(monitor::monitorarSistema);
        threadMonitor.start();

        ManutencaoPreventiva manutencao = new ManutencaoPreventiva();
        Thread threadManutencao = new Thread(manutencao::executarManutencaoPreventiva);
        threadManutencao.start();

        SuporteRemoto suporte = new SuporteRemoto();
        Thread threadSuporte = new Thread(suporte::fornecerSuporteRemoto);
        threadSuporte.start();

        while (true) {
            try {
                Thread.sleep(Long.MAX_VALUE);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
