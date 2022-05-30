public class Peixe extends Animal{

  private String caracteristicas;

  public Peixe( String nome, float comprimento, int nr_patas, String cor, String ambiente, float velocidade, String caracteristicas){

      this.nome = nome;
      this.comprimento = comprimento;
      this.nr_patas = nr_patas;
      this.cor = cor;
      this.ambiente = ambiente;
      this.velocidade = velocidade;
      this.caracteristicas = caracteristicas;
  
  }

  public String getCaracteristicas(){
    return caracteristicas;
  }
  public void setCaracteristicas(String caracteristicas){
    this.caracteristicas = caracteristicas;
  }

  public void dados(){
  System.ou.println("Dados do Animal| Nome: "+nome+" | Comprimento: "+comprimento+" | Numero de patas: "+nr_patas+" | Cor: "+cor+" | Ambiente: "+ambiente+" | Velocidade: "+velocidade+" | Caracteristicas: "+caracteristicas);
  
}

  
}