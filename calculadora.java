public static void menu(Scanner sc) {
    int op = -1;

    while (op != 6){
        System.out.println("1 - Multiplicação: ");
        System.out.println("2 - Divisão: ");
        System.out.println("3 - Soma: ");
        System.out.println("4 - Subtração: ");
        System.out.println("5 - Tabuada");
        System.out.println("6 - Quit");
        op = sc.nextInt();
        sc.nextLine();
        switch (op){
            case 1:
               System.out.println("Digite o 1ª numero: ");
                int mult1 = sc.nextInt();
                sc.nextLine();

                System.out.println("Digite o 2ª numero para multiplicar: ");
                int mult2 = sc.nextInt();
                sc.nextLine();
                System.out.println("Resultado: " + multiplicacao(mult1, mult2));
                 break;
            case 2:
                System.out.println("Qual número você vai dividir? ");
                double n1 = sc.nextDouble();
                sc.nextLine();
                System.out.println("Por qual número você quer dividir? ");
                double n2 = sc.nextDouble();
                sc.nextLine();
                 if(n2 == 0){
                 System.out.println("IMPOSSIVEL DIVIDIR POR ZERO!");
                 } else {
                System.out.println("Resultado da divisão: " + divisao(n1,n2));
                 }
                break;

            case 3:
                System.out.println("Digite o 1ª numero para soma: ");
                int sum1 = sc.nextInt();
                sc.nextLine();
                
                System.out.println("Digite o 2ª numero para soma: ");
                int sum2 = sc.nextInt();
                sc.nextLine();
                
                System.out.println("Resultado da soma: " + soma(sum1, sum2));
                break;

            case 4:
               System.out.println("Digite o número:");
                int sub1 = sc.nextInt();
                sc.nextLine();
                System.out.println("Por qual número você quer subtrair?");
                int sub2 = sc.nextInt();
                sc.nextLine();

                System.out.println("Resultado da subtração: " + subtrair(sub1, sub2));
                break;

            case 5:
               System.out.println("Digite um numero: ");
                int numeroDigitado = sc.nextInt();
                sc.nextLine();
                tabuada(numeroDigitado);
                break;
            case 6:

        System.out.println("Saindo....");
                break;
            default:
                System.out.println("Operação invalida");
                break;
        }
    }
    sc.close();
}


public static int multiplicacao(int n1, int n2){
    return n1 * n2;
}

public static double divisao(double n1, double n2){
 return n1 / n2;
}
public static int soma(int n1, int n2){
    return n1+n2;
}

public static int subtrair(int n1, int n2){
    return n1 - n2;
}

public static void tabuada(int numero){
    for(int i = 1; i <= 10; i++){
         int resultado = numero * i;
        System.out.println(numero + " x " + i + " = " + resultado);

    }
}