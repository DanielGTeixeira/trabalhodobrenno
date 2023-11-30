import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nomeCliente = scanner.nextLine();

        boolean continuar = true;
        int acertos = 0;
        int erros = 0;

        while (continuar) {
            System.out.println("");
            System.out.println("Escolha um tema:");
            System.out.println("1. História");
            System.out.println("2. Ciência");
            System.out.println("3. Esportes");
            System.out.println("4. Cinema");
            System.out.println("5. Tecnologia");

            int escolhaTema = scanner.nextInt();

            switch (escolhaTema) {
                case 1:
                    int resultadoHistoria = perguntasHistoria();
                    acertos += resultadoHistoria;
                    erros += 3 - resultadoHistoria;
                    break;
                case 2:
                    int resultadoCiencia = perguntasCiencia();
                    acertos += resultadoCiencia;
                    erros += 3 - resultadoCiencia;
                    break;
                case 3:
                    int resultadoEsportes = perguntasEsportes();
                    acertos += resultadoEsportes;
                    erros += 3 - resultadoEsportes;
                    break;
                case 4:
                    int resultadoCinema = perguntasCinema();
                    acertos += resultadoCinema;
                    erros += 3 - resultadoCinema;
                    break;
                case 5:
                    int resultadoTecnologia = perguntasTecnologia();
                    acertos += resultadoTecnologia;
                    erros += 3 - resultadoTecnologia;
                    break;
                default:
                    System.out.println("Escolha um tema válido.");
            }

            System.out.print("Deseja escolher outro tema? (s/n): ");
            String resposta = scanner.next();
            if (resposta.equalsIgnoreCase("n")) {
                continuar = false;
            }
        }
        System.out.println("");
        System.out.println("Resultado do participante: " + nomeCliente);
        System.out.println("Resultado final:");
        System.out.println("Acertos: " + acertos);
        System.out.println("Erros: " + erros);

        scanner.close();
    }

    public static int perguntasHistoria() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("Perguntas sobre história:");
        System.out.println("1. Quem foi o primeiro presidente dos Estados Unidos?");
        System.out.println("a) Thomas Jefferson");
        System.out.println("b) Abraham Lincoln");
        System.out.println("c) George Washington");
        System.out.println("d) John F. Kennedy");
        System.out.print("Resposta: ");
        String resposta1 = scanner.nextLine();

        System.out.println("");
        System.out.println("2. Qual foi o evento que marcou o início da Primeira Guerra Mundial?");
        System.out.println("a) Ataque a Pearl Harbor");
        System.out.println("b) Tratado de Versalhes");
        System.out.println("c) Assassinato de Franz Ferdinand");
        System.out.println("d) Queda do Muro de Berlim");
        System.out.print("Resposta: ");
        String resposta2 = scanner.nextLine();

        System.out.println("");
        System.out.println("3. Quem foi o líder da Revolução Cubana?");
        System.out.println("a) Che Guevara");
        System.out.println("b) Fidel Castro");
        System.out.println("c) Hugo Chávez");
        System.out.println("d) Augusto Pinochet");
        System.out.print("Resposta: ");
        String resposta3 = scanner.nextLine();

        int acertos = 0;

        if (resposta1.equalsIgnoreCase("c")) {
            acertos++;
        }

        if (resposta2.equalsIgnoreCase("c")) {
            acertos++;
        }

        if (resposta3.equalsIgnoreCase("b")) {
            acertos++;
        }

        return acertos;
    }

    public static int perguntasCiencia() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("Perguntas sobre ciência:");
        System.out.println("1. Qual é o símbolo químico para o oxigênio?");
        System.out.println("a) O");
        System.out.println("b) Ox");
        System.out.println("c) Oxg");
        System.out.println("d) O2");
        System.out.print("Resposta: ");
        String resposta1 = scanner.nextLine();

        System.out.println("");
        System.out.println("2. Quem é considerado o pai da física moderna?");
        System.out.println("a) Albert Einstein");
        System.out.println("b) Isaac Newton");
        System.out.println("c) Marie Curie");
        System.out.println("d) Galileu Galilei");
        System.out.print("Resposta: ");
        String resposta2 = scanner.nextLine();

        System.out.println("");
        System.out.println("3. Qual é o planeta mais próximo do Sol?");
        System.out.println("a) Terra");
        System.out.println("b) Marte");
        System.out.println("c) Vênus");
        System.out.println("d) Júpiter");
        System.out.print("Resposta: ");
        String resposta3 = scanner.nextLine();

        int acertos = 0;

        if (resposta1.equalsIgnoreCase("d")) {
            acertos++;
        }

        if (resposta2.equalsIgnoreCase("a")) {
            acertos++;
        }

        if (resposta3.equalsIgnoreCase("c")) {
            acertos++;
        }

        return acertos;
    }

    public static int perguntasEsportes() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("Perguntas sobre esportes:");
        System.out.println("1. Qual esporte é conhecido como 'o esporte rei'?");
        System.out.println("a) Basquete");
        System.out.println("b) Tênis");
        System.out.println("c) Futebol");
        System.out.println("d) Natação");
        System.out.print("Resposta: ");
        String resposta1 = scanner.nextLine();

        System.out.println("");
        System.out.println("2. Qual país é famoso por inventar o críquete?");
        System.out.println("a) Inglaterra");
        System.out.println("b) Índia");
        System.out.println("c) Estados Unidos");
        System.out.println("d) Brasil");
        System.out.print("Resposta: ");
        String resposta2 = scanner.nextLine();

        System.out.println("");
        System.out.println("3. Quantos jogadores uma equipe de vôlei tem em quadra durante uma partida?");
        System.out.println("a) 5");
        System.out.println("b) 6");
        System.out.println("c) 7");
        System.out.println("d) 8");
        System.out.print("Resposta: ");
        String resposta3 = scanner.nextLine();

        int acertos = 0;

        if (resposta1.equalsIgnoreCase("c")) {
            acertos++;
        }

        if (resposta2.equalsIgnoreCase("a")) {
            acertos++;
        }

        if (resposta3.equalsIgnoreCase("b")) {
            acertos++;
        }

        return acertos;
    }

    public static int perguntasCinema() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Perguntas sobre cinema:");
        System.out.println("1. Qual filme ganhou o Oscar de Melhor Filme em 1994?");
        System.out.println("a) Titanic");
        System.out.println("b) O Silêncio dos Inocentes");
        System.out.println("c) Forrest Gump");
        System.out.println("d) A Lista de Schindler");
        System.out.print("Resposta: ");
        String resposta1 = scanner.nextLine();

        System.out.println("2. Quem interpretou o papel de James Bond em '007 - Casino Royale'?");
        System.out.println("a) Sean Connery");
        System.out.println("b) Roger Moore");
        System.out.println("c) Pierce Brosnan");
        System.out.println("d) Daniel Craig");
        System.out.print("Resposta: ");
        String resposta2 = scanner.nextLine();

        System.out.println("3. Qual é o diretor famoso pelo filme 'Pulp Fiction'?");
        System.out.println("a) Quentin Tarantino");
        System.out.println("b) Martin Scorsese");
        System.out.println("c) Steven Spielberg");
        System.out.println("d) Christopher Nolan");
        System.out.print("Resposta: ");
        String resposta3 = scanner.nextLine();

        int acertos = 0;

        if (resposta1.equalsIgnoreCase("c")) {
            acertos++;
        }

        if (resposta2.equalsIgnoreCase("d")) {
            acertos++;
        }

        if (resposta3.equalsIgnoreCase("a")) {
            acertos++;
        }

        return acertos;
    }

    public static int perguntasTecnologia() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Perguntas sobre tecnologia:");
        System.out.println("1. Qual empresa desenvolveu o sistema operacional Windows?");
        System.out.println("a) Apple");
        System.out.println("b) Google");
        System.out.println("c) Microsoft");
        System.out.println("d) IBM");
        System.out.print("Resposta: ");
        String resposta1 = scanner.nextLine();

        System.out.println("2. Qual é a linguagem de programação mais utilizada para desenvolvimento web?");
        System.out.println("a) Java");
        System.out.println("b) C++");
        System.out.println("c) Python");
        System.out.println("d) JavaScript");
        System.out.print("Resposta: ");
        String resposta2 = scanner.nextLine();

        System.out.println("3. Quem é o co-fundador da empresa de tecnologia Apple Inc.?");
        System.out.println("a) Bill Gates");
        System.out.println("b) Mark Zuckerberg");
        System.out.println("c) Steve Wozniak");
        System.out.println("d) Larry Page");
        System.out.print("Resposta: ");
        String resposta3 = scanner.nextLine();

        int acertos = 0;

        if (resposta1.equalsIgnoreCase("c")) {
            acertos++;
        }

        if (resposta2.equalsIgnoreCase("d")) {
            acertos++;
        }

        if (resposta3.equalsIgnoreCase("c")) {
            acertos++;
        }

        return acertos;
    }
}
