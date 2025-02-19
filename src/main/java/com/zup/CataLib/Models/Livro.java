import java.util.ArrayList;
import java.util.Scanner;

class Livro {
    int id;
    String titulo;
    String autor;
    int ano;
    String genero;

    public Livro(int id, String titulo, String autor, int ano, String genero) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Título: " + titulo + ", Autor: " + autor + ", Ano: " + ano + ", Gênero: " + genero;
    }
}

public class Livro {
    static ArrayList<Livro> livros = new ArrayList<>();
    static int contadorId = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Sistema de Gerenciamento de Biblioteca ---");
            System.out.println("1. Cadastrar Livro");
            System.out.println("2. Listar Livros");
            System.out.println("3. Atualizar Livro");
            System.out.println("4. Excluir Livro");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> cadastrarLivro(scanner);
                case 2 -> listarLivros();
                case 3 -> atualizarLivro(scanner);
                case 4 -> excluirLivro(scanner);
                case 5 -> System.out.println("Saindo do sistema...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 5);
    }

    public static void cadastrarLivro(Scanner scanner) {
        System.out.print("Digite o título do livro: ");
        scanner.nextLine(); // Consumir a quebra de linha
        String titulo = scanner.nextLine();
        System.out.print("Digite o autor do livro: ");
        String autor = scanner.nextLine();
        System.out.print("Digite o ano de publicação: ");
        int ano = scanner.nextInt();
        System.out.print("Digite o gênero do livro: ");
        scanner.nextLine(); // Consumir a quebra de linha
        String genero = scanner.nextLine();

        Livro livro = new Livro(contadorId++, titulo, autor, ano, genero);
        livros.add(livro);
        System.out.println("Livro cadastrado com sucesso!");
    }

    public static void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
        } else {
            System.out.println("\n--- Lista de Livros ---");
            for (Livro livro : livros) {
                System.out.println(livro);
            }
        }
    }

    public static void atualizarLivro(Scanner scanner) {
        System.out.print("Digite o ID do livro que deseja atualizar: ");
        int id = scanner.nextInt();
        Livro livro = buscarLivroPorId(id);

        if (livro != null) {
            System.out.print("Digite o novo título do livro: ");
            scanner.nextLine(); // Consumir a quebra de linha
            livro.titulo = scanner.nextLine();
            System.out.print("Digite o novo autor do livro: ");
            livro.autor = scanner.nextLine();
            System.out.print("Digite o novo ano de publicação: ");
            livro.ano = scanner.nextInt();
            System.out.print("Digite o novo gênero do livro: ");
            scanner.nextLine(); // Consumir a quebra de linha
            livro.genero = scanner.nextLine();
            System.out.println("Livro atualizado com sucesso!");
        } else {
            System.out.println("Livro não encontrado.");
        }
    }

    public static void excluirLivro(Scanner scanner) {
        System.out.print("Digite o ID do livro que deseja excluir: ");
        int id = scanner.nextInt();
        Livro livro = buscarLivroPorId(id);

        if (livro != null) {
            livros.remove(livro);
            System.out.println("Livro excluído com sucesso!");
        } else {
            System.out.println("Livro não encontrado.");
        }
    }

    public static Livro buscarLivroPorId(int id) {
        for (Livro livro : livros) {
            if (livro.id == id) {
                return livro;
            }
        }
        return null;
    }
}