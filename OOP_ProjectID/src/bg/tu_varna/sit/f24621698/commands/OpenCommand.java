package bg.tu_varna.sit.f24621698.commands;

import bg.tu_varna.sit.f24621698.cmdlintf.Context;
import bg.tu_varna.sit.f24621698.FileProcessor;
import bg.tu_varna.sit.f24621698.Shape;

public class OpenCommand implements Command {

    @Override
    public String getName() {
        return "open";
    }

    @Override
    public void execute(String[] args, Context context) {
        if (args.length < 2) {
            System.out.println("Please write a file name after open.");
            return;
        }

        String fileName = args[1];
        try {
            FileProcessor processor = new FileProcessor();

            Shape[] loadedShapes = processor.load(fileName);

            if (loadedShapes == null) {
                System.out.println("Error: The file " + fileName + " could not be parsed or is invalid.");
                return;
            }

            context.getShapeManager().setShapes(loadedShapes);
            context.currentFile = fileName;

            System.out.println("Successfully opened " + fileName);

        } catch (Exception e) {
            System.out.println("Error: Could not open file " + fileName + ". " + e.getMessage());
        }
    }
}