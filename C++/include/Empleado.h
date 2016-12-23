#ifndef EMPLEADO_H
#define EMPLEADO_H


class Empleado
{
    public:
        Empleado();
        virtual ~Empleado();
        int salarioBruto();
        int retencionEnFuente();
        double salarioNeto();
    protected:

    private:
        int h_trabajadas;
        int v_hora;
        float r_fuente ;
};

#endif // EMPLEADO_H
