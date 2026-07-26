package org.joaquinsanchez.controller;

import org.joaquinsanchez.model.Empleado;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoController {

    private List<Empleado> empleados;

    public EmpleadoController() {
        this.empleados = new ArrayList<>();
    }

    // Creamos un empleado original y lo agregamos a la lista
    public Empleado crearEmpleado(int id, String nombre, String puesto, double salario) {
        Empleado emp = new Empleado(id, nombre, puesto, salario);
        empleados.add(emp);
        return emp;
    }

    // Aqui ya utilizamos el patron para clonar a empleado
    public Empleado clonarEmpleado(Empleado original, int nuevoId) {
        Empleado copia = (Empleado) original.clonar();
        copia.setId(nuevoId); // se ajusta el id para que no se dupliquen
        empleados.add(copia);
        return copia;
    }

    public List<Empleado> obtenerEmpleados() {
        return empleados;
    }
}
