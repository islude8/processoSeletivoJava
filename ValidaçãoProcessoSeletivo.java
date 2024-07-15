import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ValidaçãoProcessoSeletivo {
    public static void main(String[] args) {
    String [] candidatos = {"João", "Maria", "José", "Ana", "Pedro"};
    for (String cadidato : candidatos){
        entrandoEmContato(cadidato);

    }
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizada = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                    tentativasRealizada++;
            else System.out.println("Contato realizado com sucesso");

        }while(continuarTentando && tentativasRealizada<3);
        if(atendeu)
                System.out.println("Candidato: " + candidato + " - Contato realizado com sucesso");
else System.out.println("Candidato: " + candidato + " - Contato não realizado");

    }

    static  boolean atender (){
        return new Random().nextInt(3) ==1;
    }
    static void imprimirSelecionados(){
        String [] candidatos = {"João", "Maria", "José", "Ana", "Pedro"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento ");
            for (int indice = 0; indice < candidatos.length; indice++){
                System.out.println("Candidato: " + (indice+1) + " - " + candidatos[indice]);
            }
    }
    static void  selecaoCadidatos(){
        String [] candidatos = {"João", "Maria", "José", "Ana", "Pedro", "Elisa", "Tiago", "Carla", "Paulo", "Luiza","Marcos", "Mariana",
                "Carlos", "Luisa", "Marta", "Lucas", "Mariane", "Joaquim", "Larissa", "Rafael"};

        int cadidatosSelecionados = 0;
        int cadidatosAtual = 0;
        double salarioBase= 2000.0;
        while (cadidatosSelecionados < 5 && cadidatosAtual < candidatos.length){
             String candidato = candidatos[cadidatosAtual];
             double salarioPretendido = valorPretendido();

             System.out.println("Candidato: " + candidato + " - Solicitou este valor de salário: " + salarioPretendido);
                if (salarioBase>= salarioPretendido){
                    System.out.println("Candidato selecionado: " + candidato);
                        cadidatosSelecionados++;
                }
                cadidatosAtual++;

        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
    }
    static void analisarCadidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contraproposta");
        } else {
            System.out.println("Descartar candidato");
        }
    }
}