/*

 */
package eva2_8_super;


public class EVA2_8_SUPER {


    public static void main(String[] args) {
     Animal animal = new Animal("Britxie",35);
     Mamífero mam = new Mamífero("Gris", "no se", 27);
     Canes can = new Canes();
    }
    
}


class Animal{
   public Animal(){
    System.out.println("It´s alive!!");    
   }
//------------------------------------------------------------------------------   
   
  private String nombre; 
  private int peso; 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
//------------------------------------------------------------------------------   
    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
 //------------------------------------------------------------------------------    

    public Animal(String nombre, int peso) {
        this.nombre = nombre;
        this.peso = peso;
        System.out.println("It's alive!! (constructor 2)");
    }
//------------------------------------------------------------------------------   
   public void respirar(){
       System.out.println("Estoy respirando.");
   }
   
   
}


class Mamífero extends Animal{
    
  public Mamífero(){
    super(); // <---- llamada a constructor default
   System.out.println("Soy un mamífero.");
  }
//------------------------------------------------------------------------------   
  private String colorPelo;

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }
//------------------------------------------------------------------------------   

    public Mamífero(String colorPelo) {
        this.colorPelo = colorPelo;
    }
//------------------------------------------------------------------------------   
    
    public Mamífero(String colorPelo, String nombre, int peso) {
        super(nombre, peso);
        this.colorPelo = colorPelo;
        System.out.println("Soy un mamífero (constructor 2)");
    }

    
}


class Canes extends Animal{
 
  public Canes(){
    super();
      System.out.println("Soy un can.");   
  } 
  
}



