import java.util.Random;

public class Pokemon {
    private String nombre;
    private int vida;
    
    public Pokemon(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void atacar(Pokemon enemigo){
        Random azar = new Random();

        int danio = azar.nextInt(16) + 10;
        int nuevaVida =  enemigo.getVida() - danio;

        if (nuevaVida < 0) {
            nuevaVida = 0;
        }

        enemigo.setVida(nuevaVida);

        System.out.println(this.nombre + " ataco a " + enemigo.getNombre() + " quitandole " + danio + " de vida");
    }
}
