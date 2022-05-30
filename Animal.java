
Public class Animal {

  protected String nome;
  protected float comprimento;
  protected int nr_patas;
  protected String cor;
  protected String ambiente;
  protected float velocidade;

  public Animal( String nome, float comprimento, int nr_patas, String cor, String ambiente, float velocidade){

      this.nome = nome;
      this.comprimento = comprimento;
      this.nr_patas = nr_patas;
      this.cor = cor;
      this.ambiente = ambiente;
      this.velocidade = velocidade;

  }

  public String getNome(){
    return nome;
  }
  public float getComprimento(){
    return comprimento;
  }
  public String getNr_patas(){
    return nr_patas;
  }
  public String getCor(){
    return cor;
  }
  public String getAmbiente(){
    return ambiente;
  }
  public String getVelocidade(){
    return velocidade;
  }


  public void setNome(String nome){
    this.nome = nome;
  }
  public void setNome(float comprimento){
    this.comprimento = comprimento;
  }
  public void setNome(int nr_patas){
    this.nr_patas = nr_patas;
  }
  public void setNome(String cor){
    this.cor = cor;
  }
  public void setNome(String ambiente){
    this.ambiente = ambiente;
  }
  public void setNome(float velocidade){
    this.velocidade = velocidade;

  }


public void dados(){
  System.ou.println("Dados do Animal| Nome: "+nome+" | Comprimento: "+comprimento+" | Numero de patas: "+nr_patas+" | Cor: "+cor+" | Ambiente: "+ambiente+" | Velocidade: "+velocidade);
  
}

  
}



