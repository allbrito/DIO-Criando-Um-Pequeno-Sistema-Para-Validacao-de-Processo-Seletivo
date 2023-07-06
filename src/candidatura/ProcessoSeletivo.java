package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {

        selecaoCandidatos();
    }

    static void selecaoCandidatos() {
        String [] candidatos = {"JOAO", "MARIA", "FELIPE", "PEDRO", "SAMARA", "CAIO", "STEPHANIE", "LAURA", "ISABEL", "THIAGO"};
        int canditadoAtual = 0;

        while(canditadoAtual < candidatos.length) {
            String candidato = candidatos[canditadoAtual];

            System.out.println("O candidato " + candidato + " solicitou: " + String.format("%.2f", valorPretendido()) + " como seu salario");

            analisarCandidato(valorPretendido());

            System.out.println("-----");
            canditadoAtual++;
        }
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if(salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra-proposta");
        } else {
            System.out.println("Aguardando os resultados dos demais candidatos");
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}