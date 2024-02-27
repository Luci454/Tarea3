//Abstraccion: crear una clase a partir de propiedades y métodos de la clase o instancia generada.
public class Ave {
    //Encapsulamiento: Trabajar y manipular los parámetros únicamente al interior de la clase o la instancia.
    private String especie, color, dieta;

    //Constructor
    public Ave(String especie, String color, String dieta){
        this.especie = especie;
        this.color = color;
        this.dieta = dieta;
    }

    public Ave(String especie, String color){
        this.especie = especie;
        this.color = color;
        this.dieta = "Semillas";
    }
    //Acaba de aplicarse el polimorfismo, al aplicarse acciones diferentes haciendo uso del mismo método.

    //Métodos diferentes
    public void comer (){
        System.out.println(this.especie+" ha comido "+this.dieta+".");
    }

    public void volar (){
        System.out.println(this.especie+" ha volado muy alto.");
    }

    //Getters y Setters
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    public String getEspecie() {
        return especie;
    }

    public String getColor() {
        return color;
    }

    public String getDieta() {
        return dieta;
    }
}
