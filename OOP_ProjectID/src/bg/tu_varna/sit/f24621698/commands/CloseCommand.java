package bg.tu_varna.sit.f24621698.commands;

import bg.tu_varna.sit.f24621698.cli.Context;

public class CloseCommand implements Command {

    @Override
    public String getName() {
        return "close";
    }

    @Override
    public void execute(String[] args, Context context) {
        context.currentFile = null;
        context.content.setLength(0);
        System.out.println("File closed.");
    }
}

