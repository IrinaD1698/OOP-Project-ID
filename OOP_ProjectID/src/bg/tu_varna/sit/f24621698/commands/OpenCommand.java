package bg.tu_varna.sit.f24621698.commands;
import bg.tu_varna.sit.f24621698.cli.Context;
import java.io.*;

public class OpenCommand implements Command {

    @Override
    public String getName() {
        return "open";
    }

    @Override
    public void execute(String[] args, Context context) {
        if(args.length < 2) {
            System.out.println("Please write a file name after open.");
            return;
        }

        String fileName = args[1];
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            context.content.setLength(0);
            String line;
            while((line = reader.readLine()) != null) {
                context.content.append(line).append("\n");
            }
            context.currentFile = fileName;
            System.out.println("File has been opened: " + fileName);
        } catch(Exception e) {
            System.out.println("There has been an error in opening the file: " + e.getMessage());
        }
    }
}
