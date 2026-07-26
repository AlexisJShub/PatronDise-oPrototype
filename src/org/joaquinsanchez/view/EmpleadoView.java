package org.joaquinsanchez.view;

import org.joaquinsanchez.model.Empleado;
import java.util.List;

public class EmpleadoView {

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarEmpleado(Empleado empleado) {
        System.out.println(">> " + empleado.toString());
    }

    public void mostrarListaEmpleados(List<Empleado> empleados) {
        System.out.println("\n=== Lista de empleados ===");
        for (Empleado e : empleados) {
            mostrarEmpleado(e);
        }
    }
}