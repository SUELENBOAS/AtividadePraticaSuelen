import java.util.Scanner;

public class AppVeiculo {

    public static void main(String[] args) {

        GerenciarVeiculos Car = new GerenciarVeiculos();
        Scanner teclado = new Scanner(System.in);
        int menu;
        String modelo,marca,placa,combustivel;
        int ano;
        double valor; 

 
   

        do {

            System.out.println("============Menu===========");
            System.out.println("Digite a opção desejada");
            System.out.println("1-Incluir Veículo");
            System.out.println("2-listar todos");
            System.out.println("3-Pesquisar Placa ");
            System.out.println("4-Remover Veículo");          
            System.out.println("5-Saber Valor do Imposto");
            System.out.println("6-Listar por tipo de Combustvel");
            System.out.println("7-sair");
            System.out.println("=============================");

            menu = Integer.parseInt(teclado.nextLine());

            switch (menu) {
            case 1:
                System.out.println("Digite modelo do Veículo:");
                modelo = teclado.nextLine();

                System.out.println("Digite a marca do Veículo:");
                marca = teclado.nextLine();

                System.out.println("Digite a placa do Veículo:");
                placa=teclado.nextLine();

                do{

                System.out.println("Digite a tipo de combustivel do Veículo:");
                combustivel = teclado.nextLine(); 

                if(combustivel.equalsIgnoreCase("Gasolina")||combustivel.equalsIgnoreCase("Diesel")||combustivel.equalsIgnoreCase("Flex")
                ||combustivel.equalsIgnoreCase("GNV")||combustivel.equalsIgnoreCase("Alcool")){

                }else{System.out.println("Opção inválida");}

            } while(!combustivel.equalsIgnoreCase("Gasolina")&&!combustivel.equalsIgnoreCase("Diesel")&&!combustivel.equalsIgnoreCase("Flex")&&!combustivel.equals("GNV")&&!combustivel.equalsIgnoreCase("Alcool"));
            
              
                    
                    
                     

                System.out.println("Digite o valor de mercado do Veículo:");
                 valor =Integer.parseInt(teclado.nextLine());
                System.out.println("Digite o ano de fabricação do Veículo:");
                ano =Integer.parseInt(teclado.nextLine());              
               
                

             Veiculo V1=new Veiculo(modelo, marca, ano, valor, placa, combustivel);

             Car.adicionar(V1);
                break;

            case 2:
                System.out.println(Car.listarVeiculos());
                 break;

            case 3:
                System.out.println("Digite a placa ");
                placa = teclado.nextLine();
                Car.buscarPorPlaca(placa);
                break;

            case 4:
            System.out.println(Car.listarVeiculos());
            System.out.println("Digite a placa do veiculo a ser removido ");
            placa = teclado.nextLine();
            Car.remover(placa);
            break;

            case 5:
            System.out.println(Car.listarVeiculos());
            System.out.println("Digite a placa do veiculo para saber o valor do imposto ");
            placa = teclado.nextLine();
            Car.obeterValorImposto(placa);

            break;
            case 6:
            System.out.println(Car.listarVeiculos());
            System.out.println("Digite o tipo de combustivel que deseja filtrar ");
            combustivel = teclado.nextLine();
            Car.listarVeiculoPorCombustivel(combustivel);
            break;

            case 7:
            break;

            default:
            System.out.println("Opção inválida.\n");
            break;
            }

        } while (menu != 7);

        teclado.close();
    }
}

        
    
    

