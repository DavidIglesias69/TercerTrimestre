package Canciones;

import java.util.ArrayList;

public class Almacen {
    private ArrayList<DispositivoMultimedia> dispositivos;

    public Almacen() {
        dispositivos = new ArrayList<>();
    }

    public void agregarDispositivo(DispositivoMultimedia dispositivo) {
        dispositivos.add(dispositivo);
    }

    public void mostrarDispositivos() {
        System.out.println("Lista de dispositivos:");
        for (DispositivoMultimedia dispositivo : dispositivos) {
            dispositivo.mostrarInformacion();
        }
    }

    // Eliminar dispositivo por índice
    public void eliminarDispositivo(int posiciónAEliminar) {
        if (posiciónAEliminar >= 0 && posiciónAEliminar < dispositivos.size()) {
            dispositivos.remove(posiciónAEliminar);
            System.out.println("Dispositivo eliminado correctamente.");
        } else {
            System.out.println("Índice de dispositivo no válido.");
        }
    }
}
