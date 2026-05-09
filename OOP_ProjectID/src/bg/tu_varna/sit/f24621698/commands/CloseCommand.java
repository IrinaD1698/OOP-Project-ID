package bg.tu_varna.sit.f24621698.commands;

import bg.tu_varna.sit.f24621698.cmdlintf.Context;

public class CloseCommand implements Command {

    @Override
    public String getName() {
        return "close";
    }

    @Override
    public void execute(String[] args, Context context) {
        if (context.currentFile == null) {
            System.out.println("No file is currently open.");
            return;
        }

        String fileName = context.currentFile;
        context.clear();

        System.out.println("Successfully closed " + fileName);
    }
}