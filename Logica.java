/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio;


public class Logica {
    // Arreglo fijo de 5 elementos para almacenar los datos
    private String[] elementos = new String[5]; // arreglo fijo de 5
    // Contador para llevar el control de cuántos elementos hay en el arreglo
    private int contador = 0;
    
// Método para agregar un nuevo elemento al arreglo
    public String agregarElemento(String nuevo) {
        // Verifica si aún hay espacio en el arreglo
        if (contador < elementos.length) {
            elementos[contador] = nuevo; // Asigna el nuevo valor en la posición actual del contador
            contador++; // Incrementa el contador para la próxima inserción
            // Retorna mensaje de éxito
            return "Elemento agregado correctamente.";
        } else {
            return "La lista está llena."; // Si el arreglo está lleno, retorna mensaje de error
        }
    }
    
// Método para editar un elemento existente en el arreglo
    public String editarElemento(int indice, String nuevoValor) {
        // Verifica que el índice esté dentro del rango válido
        if (indice >= 0 && indice < contador) {
            // Reemplaza el valor en la posición indicada
            elementos[indice] = nuevoValor;
            return "Elemento editado correctamente."; // Reemplaza el valor en la posición indicada
        } else {
            return "Índice inválido."; // Si el índice es inválido, retorna mensaje de error
        }
    }
    
// Método para eliminar un elemento del arreglo
    public String eliminarElemento(int indice) {
        // Verifica que el índice esté dentro del rango válido
        if (indice >= 0 && indice < contador) {
            // Recorre los elementos desde el índice hasta el final, desplazando hacia la izquierda
            for (int i = indice; i < contador - 1; i++) {
                elementos[i] = elementos[i + 1];
            }
            elementos[contador - 1] = null;  // Elimina el último elemento duplicado
            contador--; // Decrementa el contador porque hay un elemento menos
            return "Elemento eliminado correctamente."; // Retorna mensaje de éxito
        } else {
            return "Índice inválido."; // Si el índice es inválido, retorna mensaje de error
        }
    }

    // Método para mostrar todos los elementos actuales del arreglo
    public String mostrarElementos() {
        // Verifica si la lista está vacía
        if (contador == 0) {
            return "La lista está vacía.";
        }
         // Usa StringBuilder para construir la cadena de salida
        StringBuilder sb = new StringBuilder();
        // Recorre los elementos existentes y los agrega al StringBuilder
        for (int i = 0; i < contador; i++) {
            sb.append(i).append(" -> ").append(elementos[i]).append("\n");
        }
        return sb.toString(); // Retorna la lista formateada como cadena
    }
}
