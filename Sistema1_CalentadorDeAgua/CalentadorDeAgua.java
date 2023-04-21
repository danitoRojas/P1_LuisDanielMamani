public class CalentadorDeAgua
{
    private int min_temperaruta;
    private int max_temperaruta;
    private int temp;
    private int increment;
    private int val = 0;
    public CalentadorDeAgua(int min_temperaruta, int max_temperaruta, int increment, int tem_inicio)
    {
        this.min_temperaruta = min_temperaruta;
        this.max_temperaruta = max_temperaruta;
        this.temp = tem_inicio;
        this.increment = increment;
        this.val = val;
    }
    
    public int getMin_temp()
    {
        return this.min_temperaruta; 
    }
    
    public void setMin_temp(int min_temp){
        this.min_temperaruta = min_temperaruta;
    }
    
    public int getMax_temp()
    {
        return this.max_temperaruta; 
    }
    
    public void setMax_temp(int max_temp){
        this.max_temperaruta = max_temperaruta;
    }
    
    public int getIncrement()
    {
        return this.increment; 
    }
    
    public void setIncrement(int increment){
        this.increment = increment;
    }
    
    public int getVal()
    {
        return this.val; 
    }
    
    public void setVal(int val){
        this.val = val;
    }
    
    
      public void calentar(){
        if ((this.temp + this.increment) < this.max_temperaruta){
          this.val = this.temp += this.increment;
          
          System.out.println("La temperatura es: "+this.val);
        }else{
          System.out.println("ALERTA: se ha alcanzado la temperatura máxima: "+this.max_temperaruta);
          System.out.println("La temperatura es: "+(this.temp += this.increment));
    }
  }
  
  public void enfriar(){
    if ((this.temp - this.increment) > this.min_temperaruta){
      this.val = this.temp -= this.increment;
      System.out.println("La temperatura es: "+this.val);
    }else{
      System.out.println("ALERTA: se ha alcanzado la temperatura mínima: "+this.min_temperaruta);
      System.out.println("La temperatura es: "+(this.temp -= this.increment));
    }
  }
}
