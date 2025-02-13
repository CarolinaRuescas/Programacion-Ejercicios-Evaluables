package org.ies.program.components.scanner;

import org.ies.program.components.Reader;
import org.ies.program.model.Program;
import org.ies.program.model.Text;

import java.util.Scanner;

public class ProgramReader implements Reader<Program<Text>> {
    private final Scanner scanner;
    private final Reader<Text> textReader;

    public ProgramReader(Scanner scanner, Reader<Text> textReader) {
        this.scanner = scanner;
        this.textReader = textReader;
    }

    @Override
    public Program<Text> read() {
        System.out.println("Introduce el nombre del programa");
        var name = scanner.nextLine();

        System.out.println("Introduce cuántos archivos quieres que tenga");
        var size = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Introduce los ficheros");
        Text[] files = new Text[size];
        for (int i = 0; i < size; i++) {
            files[i] = textReader.read();
        }
        return new Program<>(
                name,
                files
        );

    }
}
