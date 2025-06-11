/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recurso;

public class PC extends Recurso {
    private String procesador;
    private int ramGB;

    public PC(int id, String nombre, String ubicacion, String procesador, int ramGB) {
        super(id, nombre, ubicacion);
        this.procesador = procesador;
        this.ramGB = ramGB;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getRamGB() {
        return ramGB;
    }

    public void setRamGB(int ramGB) {
        this.ramGB = ramGB;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("PC - ID: " + id +
                           ", Nombre: " + nombre +
                           ", Ubicación: " + ubicacion +
                           ", Disponible: " + disponible +
                           ", Procesador: " + procesador +
                           ", RAM: " + ramGB + " GB");
    }
}
