/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recurso;

public class Tablet extends Recurso {
    private String marca;
    private int pulgadas;

    public Tablet(int id, String nombre, String ubicacion, String marca, int pulgadas) {
        super(id, nombre, ubicacion);
        this.marca = marca;
        this.pulgadas = pulgadas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Tablet - ID: " + id +
                           ", Nombre: " + nombre +
                           ", Ubicación: " + ubicacion +
                           ", Disponible: " + disponible +
                           ", Marca: " + marca +
                           ", Pulgadas: " + pulgadas);
    }
}





