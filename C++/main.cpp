#include <iostream>
#include "Empleado.h"

using namespace std;

int main()
{
    Empleado* obj = new Empleado();
    cout << "Salario bruto: $" << obj->salarioBruto() << endl;
    cout << "Retencion en Fuente: $" << obj->retencionEnFuente() << endl;
    cout << "Salario neto: $" << obj->salarioNeto() << endl;
    return 0;
}
