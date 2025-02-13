package org.ies.program.model;

import java.util.Objects;

public class Text  extends File{
    private String text;

    public Text(int size, String path, String text) {
        super(size, path);
        this.text = text;
    }

    @Override
    public void open() {
        System.out.println("ABRIENDO ARCHIVO DE TEXTO");
        System.out.println("El tamaño del archivo es: " + size);
        System.out.println("Su path es: " + path);
        System.out.println("Texto: " + text);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Text text1 = (Text) o;
        return Objects.equals(text, text1.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), text);
    }

    @Override
    public String toString() {
        return "Text{" +
                "text='" + text + '\'' +
                ", size=" + size +
                ", path='" + path + '\'' +
                '}';
    }
}