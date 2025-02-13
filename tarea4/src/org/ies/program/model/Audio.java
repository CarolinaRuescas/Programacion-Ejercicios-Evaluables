package org.ies.program.model;

import java.util.Objects;

public class Audio extends File{
    private int duration;

    public Audio(int size, String path, int duration) {
        super(size, path);
        this.duration = duration;
    }

    @Override
    public void open() {
        System.out.println("ABRIENDO ARCHIVO DE AUDIO");
        System.out.println("El tamaño del archivo es: " + size);
        System.out.println("Su path es: " + path);
        System.out.println("La duración del audio es: " + duration);
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Audio audio = (Audio) o;
        return duration == audio.duration;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), duration);
    }

    @Override
    public String toString() {
        return "Audio{" +
                "duration=" + duration +
                ", size=" + size +
                ", path='" + path + '\'' +
                '}';
    }
}