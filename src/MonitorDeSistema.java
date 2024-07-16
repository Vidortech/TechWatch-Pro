import java.util.Random;
import java.util.Scanner;

public class MonitorDeSistema {

    public void monitorarSistema() {
        System.out.println("Iniciando monitoramento de sistema...");

        while (true) {
            String problema = identificarProblema();

            if (problema != null) {
                solicitarAutorizacao(problema);
            }

            try {
                Thread.sleep(300000); // 5 minutos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private String identificarProblema() {
        Random random = new Random();
        int problema = random.nextInt(4); // Simular diferentes tipos de problemas

        switch (problema) {
            case 0:
                return "Problema crítico no disco rígido";
            case 1:
                return "Falha na memória RAM";
            case 2:
                return "Erro de software";
            case 3:
                return "Problema na rede";
            default:
                return null;
        }
    }

    private void solicitarAutorizacao(String problema) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(problema);
        System.out.print("Deseja autorizar a correção automática? (s/n): ");
        String resposta = scanner.nextLine();

        if (resposta.equalsIgnoreCase("s")) {
            ManutencaoPreventiva manutencao = new ManutencaoPreventiva();
            manutencao.resolverProblema(problema);
        } else {
            System.out.println("Ação cancelada pelo usuário.");
        }
    }
}
