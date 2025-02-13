package org.ies.program.components.scanner;

import org.ies.program.components.Reader;
import org.ies.program.model.Audio;
import org.ies.program.model.File;
import org.ies.program.model.Image;
import org.ies.program.model.Text;

import java.util.Scanner;

public class FileReader implements Reader<File> {
    private final Scanner scanner;
    private final Reader<Audio> audioReader;
    private final Reader<Image> imageReader;
    private final Reader<Text> textReader;

    public FileReader(Scanner scanner, Reader<Audio> audioReader, Reader<Image> imageReader, Reader<Text> textReader) {
        this.scanner = scanner;
        this.audioReader = audioReader;
        this.imageReader = imageReader;
        this.textReader = textReader;
    }

    @Override
    public File read() {
        int option;
        do{
            System.out.println("ELIGE EL TIPO DE ARCHIVO QUE QUIERES ABRIR");
            System.out.println("1. Archivo de Audio");
            System.out.println("2. Archivo de Imagen");
            System.out.println("3. Archivo de Texto");
            option = scanner.nextInt();
            scanner.nextLine();
        }while (option <1 || option > 3);

        if(option == 1){
            return audioReader.read();
        }else if (option == 2){
            return imageReader.read();
        }else {
            return textReader.read();
        }
    }
}