package bg.tu_varna.sit.f24621698.commands;

import bg.tu_varna.sit.f24621698.cmdlintf.Context;
import bg.tu_varna.sit.f24621698.Shape;
import java.io.*;

public class SaveAsCommand implements Command {

    @Override
    public String getName() {
        return "saveas";
    }

    @Override
    public void execute(String[] args, Context context) {
        if(args.length < 2) {
            System.out.println("Please write a new file name after saveas.");
            return;
        }

        String newFile = args[1];

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(newFile))) {
            writer.write("<?xml version=\"1.0\" standalone=\"no\"?>\n");
            writer.write("<!DOCTYPE svg PUBLIC \"-//W3C//DTD SVG 1.1//EN\" \"http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd\">\n");
            writer.write("<svg>\n");

            for (Shape s : context.getShapeManager().getShapes()) {
                writer.write("  " + s.toSvgTag() + "\n");
            }

            writer.write("</svg>");

            context.currentFile = newFile;
            System.out.println("Successfully saved " + newFile); // [cite: 102]

        } catch(IOException e) {
            System.out.println("Error saving file: " + e.getMessage()); // [cite: 81]
        }
    }
}