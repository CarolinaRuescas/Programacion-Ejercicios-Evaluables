package org.ies.program;

import org.ies.program.components.*;
import org.ies.program.components.scanner.ProgramReader;
import org.ies.program.components.scanner.TextReader;
import org.ies.program.model.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Reader<Text> textReader = new TextReader(scanner);
        Reader<Program<Text>> programReader = new ProgramReader(scanner, textReader);
        var program = programReader.read();
        System.out.println("Introduce un path de salida:");
        var outputPath = scanner.nextLine();
        program.execute(outputPath);

    }
}
