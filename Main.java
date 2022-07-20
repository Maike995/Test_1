/*
1 - Crie uma hierarquia de classes para representar a classe transporte com os atributos placa, ano fabricação e capacidade (número de pessoas): 
A seguir, crie:
- 4 classes filhas (carro, motocicleta, avião e barco) com 3 atributos e 1 método para cada classe;
- crie os métodos construtores/gets/sets;
- crie um método para utilizar o conceito de polimorfismo (vc escolhe: sobreposição ou sobrecarga);
- utilize o método toString para as impressões;
- crie uma classe para testar as classes criadas; adicione em um vetor no mínimo 2 objetos para as 4 classes filhas criadas;
- efetue uma busca no vetor informando a quantidade de transportes fabricados antes de 2020.
*/
import java.util.*;
class Main {
    public static void main(String[] args) {

      System.out.println();

      
      
     String[] placas = {"ADD434","ARD364","AER232","GFD434","CVD265","ANB634","GFS264","AJD876"};
     int[] anoDeFabrica = {2012,2034,2014,2403,2503,2011,2020,2019};
     int[] capacidades = {40,50,6,8,5,4,2,3};
     int[] numeroRodas = {3,3,4,2,3,4,8,2};
     String[] marcas = {"Alabama","Luchanburgo","Crelo","Bradusco","Girabol","Uno"};
     double[] velocidades = {200,100,20,43,54,75,76,124};
     
     
      
     double[] acelerar = {};
     double[] reduzir = {};

      Aviao estacionamentoA[] = new Aviao[2];
      Barco estacionamentoB[] = new Barco[2];
      Carro estacionamentoC[] = new Carro[2];
      Motocicleta estacionamentoD[] = new Motocicleta[2];
      
      for(int i = 0; i<placas.length; i++){
        Aviao a1 = new Aviao(placas[i],anoDeFabrica[i],capacidades[i],numeroRodas[i],marcas[i],velocidades[i]);
        estacionamentoA[i] = a1;
        i++;
        Barco b1 = new Barco(placas[i],anoDeFabrica[i],capacidades[i],numeroRodas[i],marcas[i],velocidades[i]);
        estacionamentoB[i] = b1;
        i++;
        Carro c1 = new Carro(placas[i],anoDeFabrica[i],capacidades[i],numeroRodas[i],marcas[i],velocidades[i]);
        estacionamentoC[i] = c1;
        i++;
        Motocicleta m1 = new Motocicleta(placas[i],anoDeFabrica[i],capacidades[i],numeroRodas[i],marcas[i],velocidades[i]);
        estacionamentoD[i] = m1;
        i++;
        }

}
     

    
  }
}