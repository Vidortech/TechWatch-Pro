import java.util.Random;

public class MonitorDeSistema {

    public void monitorarSistema() {
        System.out.println("Iniciando monitoramento de sistema...");

        while (true) {
            boolean sistemaOK = verificarSistema();

            if (!sistemaOK) {
                alertarAdministrador();
            }

            try {
                Thread.sleep(300000); // 5 minutos 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private boolean verificarSistema() {
        Random random = new Random();
        return random.nextBoolean(); 
    }

    private void alertarAdministrador() {
        System.out.println("ALERTA: Problema crítico detectado no sistema!");
        System.out.println("Verifique imediatamente.");
    }
}
