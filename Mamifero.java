public class Mamifero extends Animal{

  private String alimento;

  public Mamifero( String nome, float comprimento, int nr_patas, String cor, String ambiente, float velocidade, String alimento){

      this.nome = nome;
      this.comprimento = comprimento;
      this.nr_patas = nr_patas;
      this.cor = cor;
      this.ambiente = ambiente;
      this.velocidade = velocidade;
      this.alimento = alimento;
  
  }

  public String getAlimento(){
    return alimento;
  }
  public void setAlimento(String alimento){
    this.alimento = alimento;
  }

  public void dados(){
  System.ou.println("Dados do Animal| Nome: "+nome+" | Comprimento: "+comprimento+" | Numero de patas: "+nr_patas+" | Cor: "+cor+" | Ambiente: "+ambiente+" | Velocidade: "+velocidade+" | Alimento: "+alimento);
  
}

  
}