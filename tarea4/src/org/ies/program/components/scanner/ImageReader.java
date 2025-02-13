package org.ies.program.components.scanner;

import org.ies.program.components.Reader;
import org.ies.program.model.Image;

import java.util.Scanner;

public class ImageReader implements Reader<Image> {

    private final Scanner scanner;

    public ImageReader(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public Image read() {
        System.out.println("Introduce los datos");
        System.out.println("Tamaño:");
        int size = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Path (Donde quiera guardarlo):");
        String path = scanner.nextLine();

        System.out.println("Altura de la imagen:");
        int height = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Anchura de la imagen:");
        int width = scanner.nextInt();
        scanner.nextLine();

        return new Image(
                size,
                path,
                height,
                width
        );
    }
}