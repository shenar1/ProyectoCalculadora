package proyectocalculadora;

/**
 * MAIN para probar la Calculadora
 * * @author Henar Sanchez Sanchez
 * @version 1.0
 * @since 1.0
 */
public class ProyectoCalculadora {

    /**
     * Metodo principal que crea un obj de la calculadora y prueba sus metodos.
     * * @param args Argumentos pasados por línea de comandos.
     */
    public static void main(String[] args) {
        
        //Crear obj de la class CalculadoraEjemplo con valores 20 y 4
        CalculadoraEjemplo miCalculadora = new CalculadoraEjemplo(20.0, 4.0);
        
        System.out.println("--- PROBANDO CALCULADORA HENAR ---");
        System.out.println("Operando 1: 20.0 | Operando 2: 4.0");
        System.out.println("-------------------------------------");
        
        // Probamos cada uno de los métodos y mostramos el resultado
        System.out.println("Suma: " + miCalculadora.sumar());
        System.out.println("Resta: " + miCalculadora.restar());
        System.out.println("Multiplicacion: " + miCalculadora.multiplicar());
        System.out.println("División: " + miCalculadora.dividir());
    }
}
