package unal.todosalau.practicagit_androidstudio;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class DelfinCLass {

    // Atributos De la clase Delfin
    private String nombre;
    private String fechaAdopcion;
    private String color;
    private double tamaño;
    private double peso;
    private String especie;

    //Metodo Constructor
    public DelfinCLass(String nombre, String fechaAdopcion, String color, double tamaño, double peso, String especie){
        this.nombre = nombre;
        this.fechaAdopcion = fechaAdopcion;
        this.color = color;
        this.tamaño = tamaño;
        this.peso = peso;
        this.especie = especie;
    }

    //Metodos de la clase
    public String cantidadDeMesesDeAdopcion(){
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaAdopcion = LocalDate.parse(this.fechaAdopcion);

        Period diferenciaDeFechas = Period.between(fechaActual, fechaAdopcion);

        return "La Cantidad de meses de adopcion es de: " + diferenciaDeFechas.getMonths();

    }



    //Setters y Getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaAdopcion() {
        return fechaAdopcion;
    }

    public void setFechaAdopcion(String fechaAdopcion) {
        this.fechaAdopcion = fechaAdopcion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
}
