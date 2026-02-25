package proyectocalculadora;

/**
 * Clase que implementa calculadora basica con operaciones
 * Realiza sumas, restas, multiplicaciones y divisiones.
 * * @author Henar Sanchez Sanchez
 * @version 1.0
 * @since 1.0
 * @see "Java Documentation"
 */
public class CalculadoraEjemplo {

    /**1º operando para las operaciones */
    private double operando1;
    
    /**2º operando para las operaciones */
    private double operando2;
    
    /** Almacenar resultado de la ultima operacion realizada */
    private double resultado;

    /**
     * Constructor de la clase CalculadoraEjemplo.
     * * @param operando1 1ºoperando.
     * @param operando2 2º operando.
     */
    public CalculadoraEjemplo(double operando1, double operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
        this.resultado = 0.0;
    }

    /**
     *SUMA
     * * @return Resultado de sumar ambos operandos
     */
    public double sumar() {
        this.resultado = this.operando1 + this.operando2;
        return this.resultado;
    }

    /**
     *RESTA
     * * @return Resultado de restar ambos operandos
     */
    public double restar() {
        this.resultado = this.operando1 - this.operando2;
        return this.resultado;
    }

    /**
     *MULTIPLICACION
     * * @return Resultado de multiplicar ambos operandos
     */
    public double multiplicar() {
        this.resultado = this.operando1 * this.operando2;
        return this.resultado;
    }

    /**
     *DIVIDIR
     * * @return Resultado de dividir ambos operandos
     */
    public double dividir() {
        this.resultado = this.operando1 / this.operando2;
        return this.resultado;
    }
}