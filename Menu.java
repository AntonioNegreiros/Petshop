import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int opcao=0;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Categoria> categorias = new ArrayList<>();
        ArrayList<Tutor> tutores = new ArrayList<>();
        ArrayList<Animal> animais = new ArrayList<>();

        do{
            System.out.println("Opções: ");
            System.out.println("1 - Cadastrar Categoria");
            System.out.println("2 - Cadastrar Tutor");
            System.out.println("3 - Cadastrar Animal");
            System.out.println("4 - Listar Categoria");
            System.out.println("5 - Listar Tutor");
            System.out.println("6 - Listar Animal");
            try {
                opcao = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Opção inválida");
                scanner.nextLine();
                continue;
            }
            switch (opcao){
            case 1:
                System.out.println("Digite o ID da categoria");
                int IdCategoria = scanner.nextInt();
                System.out.println("Digite a descrição da categoria");
                String descricao = scanner.next();
                Categoria categoria = new Categoria(IdCategoria, descricao);
                categorias.add(categoria);
                break;
                case 2:
                System.out.println("Digite o ID do tutor");
                int IdTutor = scanner.nextInt();
                System.out.println("Digite o nome do tutor");
                String nome = scanner.next();
                System.out.println("Digite o telefone do tutor");
                String telefone = scanner.next();
                System.out.println("Digite o e-mail do tutor");
                String email = scanner.next();
                Tutor tutor = new Tutor(IdTutor,nome,telefone,email);
                tutores.add(tutor);
                break;
                case 3:
                System.out.println("Digite o ID do animal");
                int IdAnimal = scanner.nextInt();
                System.out.println("Digite o nome do animal");
                String nomeanimal = scanner.next();
                System.out.println("Digite a raca do animal");
                String raca = scanner.next();
                System.out.println("Digite o peso do animal");
                double peso = scanner.nextDouble();
                Animal animal = new Animal(IdAnimal, nomeanimal, raca, peso, 0, 0);
                animais.add(animal);
                break;
                case 4:
                System.out.println("Listagem de animais");
                for (Animal animalPrint : animais){
                System.out.println(animalPrint.nomeanimal);
                }
                break;
                case 5:
                System.out.println("Listagem de animais");
                for (Tutor tutorPrint : tutores){
                System.out.println(tutorPrint.nome);
                }
                break;
                case 6:
                System.out.println("Listagem de categorias");
                    for (Categoria categoriaPrint : categorias){  
                        System.out.println(categoriaPrint.descricao);                      
                    }
                    break;
                }
            
        }while (opcao !=7);
        scanner.close();
    }

    
}

