package Discos;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.io.*;
import java.util.List;
public class Cancion {
	private String titulo;
    private double duracion;

    public Cancion(String titulo, double duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getDuracion() {
        return duracion;
    }
}

   

