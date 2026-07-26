package org.joaquinsanchez.model;

public class Empleado implements Prototype, Cloneable {

    private int id;
    private String nombre;
    private String puesto;
    private double salario;

    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    // Aca implementamos el metodo clonar con object.clone()
    @Override
    public Prototype clonar() {
        try {
            return (Empleado) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Error al clonar el empleado", e);
        }
    }

    // Nuestros getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{id=" + id + ", nombre='" + nombre + "', puesto='"
                + puesto + "', salario=" + salario + "}";
    }
}