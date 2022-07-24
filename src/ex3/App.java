package ex3;
public class App {
    public static void main(String[] args){
        BombaCombustivel bomba1 = new BombaCombustivel();
        bomba1.mostrarBomba();
        bomba1.abastecerPorLitro(25);
        bomba1.abastecerPorValor(100);
        bomba1.mostrarBomba();
        bomba1.alterarQuantidadeCombustivel(150);
        bomba1.alterarCombustivel("Gasolina");
        bomba1.alterarValor(5);
        bomba1.mostrarBomba();
        bomba1.abastecerPorLitro(9);
    }
}

    /*public static void main(String[] args) throws IOException{        
        BombaCombustivel bombaCombustivel = new BombaCombustivel();
        double y;
        String z;

        Scanner leitor = new Scanner(System.in);
        int x;
        do{
            System.out.println("1) Abastecer por valor. \n2) Abastecer por litro. \n3) Alterar valor. \n4) Alterar tipo de combustivel. \n5) Alterar quantidade do combustivel. \n6) Sair");

            x = leitor.nextInt();   //Tem algo errado aqui que não deixa o while repetir, só executa o primeiro loop........
            leitor.nextLine();

            switch(x){
                case 1:
                    try(Scanner leitora = new Scanner(System.in)){
                        System.out.println("Insira o valor: ");
                        y = leitora.nextDouble();
                    }
                    bombaCombustivel.abastecerPorValor(y);
                    break;
                case 2:
                    try(Scanner leitora = new Scanner(System.in)){
                        System.out.println("Insira a quantidade a ser abastecida em litros: ");
                        y = leitora.nextDouble();
                       }
                       bombaCombustivel.abastecerPorLitro(y);
                    break;
                case 3:
                    try(Scanner leitora = new Scanner(System.in)){
                           System.out.println("Insira o novo valor do litro: ");
                        y = leitora.nextDouble();
                    }
                    bombaCombustivel.alterarValor(y);
                    break;
                case 4:
                    try(Scanner leitora = new Scanner(System.in)){
                        System.out.println("Insira o novo tipo de combustivel: ");
                        z = leitora.next();
                    }
                    bombaCombustivel.alterarCombustivel(z);
                    break;
                case 5:
                    try(Scanner leitora = new Scanner(System.in)){
                        System.out.println("Insira a quantidade de combustivel na bomba: ");
                        y = leitora.nextDouble();
                    }
                    bombaCombustivel.alterarQuantidadeCombustivel(y);
                    break;
                case 6:
                    System.out.println("Finalizando.");
                    break;
                default:
                    break;
            }
            System.out.println("\nPróximo atendimento\n");

        } while ( x != 6);       
        leitor.close();            
    }
}
*/