import java.util.ArrayList;

public class GerenciarVeiculos {

boolean a,d;
String c,b;

    
private ArrayList<Veiculo> lista;
    
        public GerenciarVeiculos(){
            lista = new ArrayList<>();
        }


public void adicionar (Veiculo j){ 
        lista.add(j); }



public boolean remover (String placa){  


            for (Veiculo carro : lista) {
            if (carro.getplaca().equalsIgnoreCase(placa)) {
                lista.remove(carro); 
                System.out.println("veiculo localizado");
                        
                } else{

                System.out.println( "Placa não localizada");}
                
                a= false;
                
                   
                
                
}
return a;
}



public boolean buscarPorPlaca (String placa){

    for (Veiculo carro : lista) {
        if (carro.getplaca().equalsIgnoreCase(placa)) {
                         
            d=true;} else{
            d=false;

            System.out.println( " Placa não localizada");}
            
         
}
return d;

}

public String listarVeiculos() {

    String V="Veiculo: " + lista +" \n";


    return V;



}



public double obeterValorImposto(String placa){

    for (Veiculo carro : lista) {
        if (carro.getplaca().equalsIgnoreCase(placa)) {

                                     
            return carro.imposto;}
            else{System.out.println(" Placa não localizada");}


   }
    return -1;
            


}



public String listarVeiculoPorCombustivel(String combustivel){

    for (Veiculo carro : lista) {
        if (carro.getCombustivel().equalsIgnoreCase(combustivel)) {

           b = listarVeiculos();          
            } else{System.out.println("Combustivel não localizado");}


        }


            return b;



}

}














//Métodos:● public void adicionar (Veículo a) – adiciona o veículo ao ArrayList;
// public boolean remover (String placa) – busca o automotor que possui a placa dada,
//removendo-o e retornando true. Caso não encontre a placa, retorna false.
//● public Veiculo buscarPorPlaca (String placa) – busca o automotor pela placa, retornando-o caso
//encontre. Se não encontrar retorna null.
// public String listarVeiculos() – lista todos os veículos da lista, colocando os dados em uma
// String e depois retornando-a;
//● public double obeterValorImposto(String placa) – busca um veículo pela placa passada, e então
//retorna o valor do imposto para esse veículo. Se não encontrar a placa, retorna -1;
//● public String listarVeiculoPorCombustivel(String combustivel) – lista todos os carros da que
//sejam movidos pelo combustível dado, colocando os dados em uma String e depois
//retornando-a;
    

