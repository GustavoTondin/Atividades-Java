import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc = 0;

        System.out.print("Crie o seu novo animal \nInsira o nome: ");
        String nome = sc.nextLine();
        System.out.print("Qual vai ser a classe dele: ");
        String classe = sc.nextLine();
        System.out.print("Qual sera a familia dele: ");
        String familia = sc.nextLine();

        Animal a1 = new Animal(nome,classe,familia);
        System.out.println(a1.nasceu());

        while (opc != 5){
            System.out.println("Qual ação o " + a1.getNome() + " deve realziar:");
            System.out.println("1- Comer");
            System.out.println("2- Correr");
            System.out.println("3- Dormir");
            System.out.println("4- Ver Status de Fome e Força: ");
            System.out.println("5- Morrer ");
            opc = sc.nextInt();

            if (opc > 0 && opc < 6){
                switch (opc){
                    case 1:
                        System.out.println(a1.comer());
                        break;
                    case 2:
                        System.out.println(a1.correr());
                        break;
                    case 3:
                        System.out.println(a1.dormir());
                        break;
                    case 4:
                        System.out.println(a1.status());
                        break;
                    case 5:
                        System.out.println(a1.morreu());
                        break;
                }
            }else{
                System.out.println("Opçao invalida, tente novamente!! \n");
            }
        }
        System.out.println("O jogo acabou !!");

    }
}