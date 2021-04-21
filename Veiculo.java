public class Veiculo {


    private String modelo;
    private String marca;
    private int ano;
    private double valor; 
    private String placa;
    private String combustivel;
    public double imposto;

    public Veiculo(String modelo, String marca,int ano,Double valor,String placa,String combustivel) {

   this.modelo=modelo;
   this.marca=marca;
   this.ano=ano;
   this.valor=valor;
   this.placa=placa;
   this.combustivel= combustivel;

   }


   public Veiculo(Veiculo a) {
    }


public String getModelo() {
    return modelo;
    }


public String getMarca () {

    return marca;

}


public int getAno () {

    return ano;

}


public double getValor () {

    return valor;

}

public String getplaca () {

  
    return placa;

}


public String getCombustivel () {

   return combustivel;
         
    }


public void setValor(double valor)

{ this.valor = valor; }



    
    

public void imprimir() {

    System.out.println("Marca: " + marca + " modelo: " + modelo + " ano "+ ano + " valor "+ valor + " placa " + placa + " tipo de combustivel" + combustivel);

  
}




    


public double calcularImposto() {

    System.out.println("Carros com mais de 20 anos é isento de imposto");

    if(ano<=2001){

       return imposto= 0.00;

        


   }else if(combustivel.equals("Gasolina")||combustivel.equals("Diesel")||combustivel.equals("Flex")){

    imposto= (valor*4)/100;
    System.out.println("Imposto de 4% igual a " + imposto);
    
    return imposto;

    

    

   } else{

    imposto= (valor*3)/100;

    System.out.println("Imposto de 3% igual a " + imposto);
       
    return imposto;

   

}


}

public String toString() {
    return "Marca: " + marca + " modelo: " + modelo + " ano: "+ ano + " valor: "+ valor + " placa: " + placa + " tipo de combustivel : " + combustivel;
}




}







   
 