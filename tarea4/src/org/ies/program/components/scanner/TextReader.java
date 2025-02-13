package org.ies.program.components.scanner;

import org.ies.program.components.Reader;
import org.ies.program.model.Text;

import java.util.Scanner;

public class TextReader implements Reader<Text> {

    private final Scanner scanner;

    public TextReader(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public Text read() {
        System.out.println("Introduce los datos");
        System.out.println("Tamaño del archivo:");
        int size = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Path (Donde quiera guardarlo):");
        String path = scanner.nextLine();

        System.out.println("Introduce el texto que quieres que contenga");
        String text = scanner.nextLine();

        return new Text(
                size,
                path,
                text
        );
    }
}