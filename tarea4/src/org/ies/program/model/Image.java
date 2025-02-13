package org.ies.program.model;

import java.util.Objects;

public class Image extends File{
    private int height;
    private int width;

    public Image(int size, String path, int height, int width) {
        super(size, path);
        this.height = height;
        this.width = width;
    }

    @Override
    public void open() {
        System.out.println("ABRIENDO ARCHIVO DE IMAGEN");
        System.out.println("El tamaño del archivo es: " + size);
        System.out.println("Su path es: " + path);
        System.out.println("La altura es: " + height);
        System.out.println("La anchura es: " + width);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Image image = (Image) o;
        return height == image.height && width == image.width;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), height, width);
    }

    @Override
    public String toString() {
        return "Image{" +
                "height=" + height +
                ", width=" + width +
                ", size=" + size +
                ", path='" + path + '\'' +
                '}';
    }
}