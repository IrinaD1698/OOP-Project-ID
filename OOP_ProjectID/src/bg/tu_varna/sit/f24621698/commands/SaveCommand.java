package bg.tu_varna.sit.f24621698.commands;

import bg.tu_varna.sit.f24621698.Shape;
import bg.tu_varna.sit.f24621698.cmdlintf.Context;
import java.io.*;

public class SaveCommand implements Command {

    @Override
    public String getName() {
        return "save";
    }

    @Override
    public void execute(String[] args, Context context) {
        if (context.currentFile == null) {
            System.out.println("No file is currently open.");
            return;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(context.currentFile))) {
            writer.write("<?xml version=\"1.0\" standalone=\"no\"?>\n");
            writer.write("<!DOCTYPE svg PUBLIC \"-//W3C//DTD SVG 1.1//EN\" \"http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd\">\n");
            writer.write("<svg>\n");

            for (Shape s : context.getShapeManager().getShapes()) {
                writer.write("  " + s.toSvgTag() + "\n");
            }

            writer.write("</svg>");
            System.out.println("Successfully saved " + context.currentFile);
        } catch (IOException e) {
            System.out.println("Error saving file: " + e.getMessage());
        }
    }
}