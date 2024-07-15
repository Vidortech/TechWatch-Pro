public class ManutencaoPreventiva {

    public void executarManutencaoPreventiva() {
        System.out.println("Executando manutenção preventiva de hardware e software...");

        while (true) {
            verificarHardware();
            verificarSoftware();

            try {
                Thread.sleep(3600000); // 1 hora 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void verificarHardware() {
        System.out.println("Verificando estado do hardware...");
    }

    private void verificarSoftware() {
        System.out.println("Verificando estado do software...");
    }
}
