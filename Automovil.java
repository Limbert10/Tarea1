

public class Automovil
{
   String modelo;
   String color;
   int asientos;
   String placa;
   
   public Automovil(String modelo, String color,int asientos,String placa){
      this.modelo = modelo;
      this.color= color;
      this.asientos= asientos;
      this.placa=placa;
    
    
    
   }
   public void setColor(String color){
    this.color=color;
    
   }
   public String getColor(){
    return color;
   }
   
   public String presentar(){
    
     String presentar;
     
    presentar="Mi automovil es de color "+ color;
    
    return presentar;
   }
}
