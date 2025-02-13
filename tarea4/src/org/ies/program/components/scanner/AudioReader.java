package org.ies.program.components.scanner;

import org.ies.program.components.Reader;
import org.ies.program.model.Audio;

import java.util.Scanner;

public class AudioReader implements Reader<Audio> {

    private final Scanner scanner;

    public AudioReader(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public Audio read() {
        System.out.println("Introduce los datos");
        System.out.println("Tamaño:");
        int size = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Path (Donde quiera guardarlo):");
        String path = scanner.nextLine();

        System.out.println("Duración del audio:");
        int duration = scanner.nextInt();
        scanner.nextLine();

        return new Audio(
                size,
                path,
                duration
        );
    }
}