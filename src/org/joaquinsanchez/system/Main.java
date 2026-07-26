package org.joaquinsanchez.system;

import org.joaquinsanchez.controller.EmpleadoController;
import org.joaquinsanchez.model.Empleado;
import org.joaquinsanchez.view.EmpleadoView;

public class Main {

    public static void main(String[] args) {
        EmpleadoController controller = new EmpleadoController();
        EmpleadoView view = new EmpleadoView();

        // Aca lo que hicimos fue crear un empleado original"(nuestro prototipo base)
        Empleado original = controller.crearEmpleado(1, "Ana Pérez", "Desarrolladora", 8500.00);
        view.mostrarMensaje("Empleado original:");
        view.mostrarEmpleado(original);

        // Aca clonamos el prototipo para crear un nuevo empleado parecido
        Empleado clon = controller.clonarEmpleado(original, 2);
        clon.setNombre("Carlos Ruiz");
        clon.setSalario(9000.00);

        view.mostrarMensaje("\nEmpleado clonado y modificado...:");
        view.mostrarEmpleado(clon);

        // Mostramos todos los empleados registrados
        view.mostrarListaEmpleados(controller.obtenerEmpleados());
    }
}