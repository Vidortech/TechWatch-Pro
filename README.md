# AutomacaoSuporteTecnico

## Descrição
Este projeto implementa um sistema básico de automação de suporte técnico em Java, que inclui monitoramento de sistema, manutenção preventiva e suporte remoto aos funcionários.

## Pré-Requisitos
- JDK (Java Development Kit) instalado na sua máquina.
- Ambiente de desenvolvimento Java, como IntelliJ IDEA, Eclipse, NetBeans, etc. (opcional).

## Compilação
Para compilar o projeto, siga os seguintes passos:

1. Abra um terminal ou prompt de comando.
2. Navegue até o diretório onde estão os arquivos `.java` do projeto (`/src`). 
3. Compile os arquivos `.java` usando o comando `javac`:

```
javac *.java
```

Isso compilará todos os arquivos `.java` e gerará os arquivos `.class` correspondentes.

## Execução
Para executar o programa, siga os seguintes passos:

1. No mesmo terminal ou prompt de comando, ainda no diretório onde os arquivos `.class` estão localizados, execute o seguinte comando para iniciar o programa:

```
java AutomacaoSuporteTecnico
```
Isso iniciará o programa, onde as funcionalidades de monitoramento de sistema, manutenção preventiva e suporte remoto serão iniciadas em threads separadas.

## Entendendo as Respostas do Sistema
- **Monitoramento de Sistema**: O sistema simula verificações periódicas para detectar problemas críticos. Se um problema for detectado, será exibido um alerta no console.
- **Manutenção Preventiva**: A manutenção preventiva verifica o estado do hardware e do software periodicamente, exibindo mensagens no console para indicar as verificações realizadas.
- **Suporte Remoto aos Funcionários**: O sistema fica aguardando chamados de suporte remoto simulados, exibindo mensagens no console para indicar que está aguardando interações.

## Observações
- Certifique-se de que o JDK esteja configurado corretamente no seu ambiente de desenvolvimento.
- Durante a execução, observe as mensagens no console para entender o funcionamento das diferentes funcionalidades do sistema.
- Para interromper a execução do programa, você pode usar `Ctrl+C` no terminal ou prompt de comando onde o programa está sendo executado.
