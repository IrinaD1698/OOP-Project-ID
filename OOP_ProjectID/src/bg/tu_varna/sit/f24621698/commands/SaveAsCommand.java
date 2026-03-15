package bg.tu_varna.sit.f24621698.commands;

import bg.tu_varna.sit.f24621698.cli.Context;
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
            writer.write(context.content.toString());
            context.currentFile = newFile;
            System.out.println("File saved as: " + newFile);
        } catch(Exception e) {
            System.out.println("Error saving file: " + e.getMessage());
        }
    }
}
