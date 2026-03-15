package bg.tu_varna.sit.f24621698.commands;

import bg.tu_varna.sit.f24621698.cli.Context;
import java.io.*;

public class SaveCommand implements Command {

    @Override
    public String getName() {
        return "save";
    }

    @Override
    public void execute(String[] args, Context context) {
        if(context.currentFile == null) {
            System.out.println("No file is open.");
            return;
        }

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(context.currentFile))) {
            writer.write(context.content.toString());
            System.out.println("File saved: " + context.currentFile);
        } catch(Exception e) {
            System.out.println("Error saving file: " + e.getMessage());
        }
    }
}
