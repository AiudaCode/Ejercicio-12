public class Empleado
{
    // se definen los atributos privados
    private int h_trabajadas;// horas trabajadas por el empleado de tipo entero
    private int v_hora;// valor de la hora de tipo entero
    private double r_fuente;// retención en la fuente de tipo double
    
    // Se le asignan los siguientes valores al constructor de la clase Empleado
    public Empleado()
    {
        h_trabajadas = 48;// numero de horas trabajadas (48)
        v_hora = 5000;// valor de la hora (5000)
        r_fuente = 0.125;// porcentaje de la retención en la fuente (12.5%)
    }
    
    // implementacion del metodo salarioBruto()
    public int salarioBruto()
    {
        // el salario bruto es igual al número de horas trabajadas por el
        //valor de la hora.
        return h_trabajadas * v_hora;// se retorna el resultado
    }
    
    // implementacion del metodo retencionEnFuente()
    public double retencionEnFuente()
    {
        // la retención en la fuente es igual al salario bruto por el porcentaje
        //de retención en la fuente.
        return salarioBruto() * r_fuente; // se retorna el resultado
    }

    // implementacion del metodo salarioNeto()
    public double salarioNeto()
    {
        // el salario neto es igual al salario bruto menos la retencion en la fuente
        return salarioBruto() - retencionEnFuente(); // se retorna el resultado
    }
}