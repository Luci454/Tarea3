public class ObjetosDeAve {
    public static void main(String[] args) {
        //Herencia: se instancian objetos que heredan de la clase ave sus atributos y métodos.
        Ave pajarito1 = new Ave("Azulejo", "Azul");
        Ave pajarito2 = new Ave("Petirrojo", "Rojo",  "Lombrices");
        Ave pajarito3 = new Ave("Carpintero", "Gris");
        Ave pajarito4 = new Ave("Golondrina", "Negro",  "Insectos");
        Ave pajarito5 = new Ave("Garza","Gris", "Pescado");

        //Polimorfismo evidenciado en las mismas funciones que se emplean de forma diferente en cada objeto.
        pajarito1.comer();
        pajarito2.comer();
        pajarito3.comer();
        pajarito4.volar();
        pajarito5.volar();
    }
}