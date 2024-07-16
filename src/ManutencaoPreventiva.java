import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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

    public void resolverProblema(String problema) {
        System.out.println("Tentando resolver o problema: " + problema);

        switch (problema) {
            case "Problema crítico no disco rígido":
                resolverProblemaDisco();
                break;
            case "Falha na memória RAM":
                resolverProblemaMemoria();
                break;
            case "Erro de software":
                resolverProblemaSoftware();
                break;
            case "Problema na rede":
                resolverProblemaRede();
                break;
            default:
                System.out.println("Tipo de problema desconhecido.");
                break;
        }

        System.out.println("Problema " + problema + " resolvido.");
    }

    private void resolverProblemaDisco() {
        System.out.println("Executando verificação de disco...");
        try {
            Process process = Runtime.getRuntime().exec("cmd /c chkdsk /f");
            process.waitFor();

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("Reparos de disco concluídos.");
        } catch (IOException | InterruptedException e) {
            System.out.println("Erro durante a verificação de disco: " + e.getMessage());
        }
    }


    private void resolverProblemaMemoria() {
        System.out.println("Executando diagnóstico de memória...");
        try {
            // Executa o comando para abrir o Diagnóstico de Memória do Windows
            Process process = Runtime.getRuntime().exec("cmd /c mdsched.exe");
            process.waitFor();

            // Lê a saída do comando
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("Diagnóstico de memória iniciado. O sistema será reiniciado para completar o teste.");
        } catch (IOException | InterruptedException e) {
            System.out.println("Erro durante o diagnóstico de memória: " + e.getMessage());
        }
    }


    private void resolverProblemaSoftware() {
        System.out.println("Reiniciando software problemático...");
        try {
            // Exemplo genérico para reiniciar um serviço (substitua "NomeDoServico" pelo nome real do serviço)
            Process stopProcess = Runtime.getRuntime().exec("cmd /c net stop NomeDoServico");
            stopProcess.waitFor();
            Process startProcess = Runtime.getRuntime().exec("cmd /c net start NomeDoServico");
            startProcess.waitFor();

            // Lê a saída do comando
            BufferedReader reader = new BufferedReader(new InputStreamReader(startProcess.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("Software reiniciado com sucesso.");
        } catch (IOException | InterruptedException e) {
            System.out.println("Erro durante a reinicialização do software: " + e.getMessage());
        }
    }


    private void resolverProblemaRede() {
        System.out.println("Reiniciando adaptador de rede...");
        try {
            // Substitua "NomeDoAdaptador" pelo nome real do adaptador de rede
            String nomeDoAdaptador = "Ethernet";
            Process disableProcess = Runtime.getRuntime().exec("cmd /c netsh interface set interface \"" + nomeDoAdaptador + "\" admin=disable");
            disableProcess.waitFor();
            Process enableProcess = Runtime.getRuntime().exec("cmd /c netsh interface set interface \"" + nomeDoAdaptador + "\" admin=enable");
            enableProcess.waitFor();

            // Lê a saída do comando
            BufferedReader reader = new BufferedReader(new InputStreamReader(enableProcess.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("Adaptador de rede reiniciado com sucesso.");
        } catch (IOException | InterruptedException e) {
            System.out.println("Erro durante a reinicialização do adaptador de rede: " + e.getMessage());
        }
    }

}
