package bg.tu_varna.sit.f24621698.commands;

import bg.tu_varna.sit.f24621698.cli.Context;
import bg.tu_varna.sit.f24621698.cli.CLI;

public class ExitCommand implements Command {

    private CLI cli;

    public ExitCommand(CLI cli) {
        this.cli = cli;
    }

    @Override
    public String getName() {
        return "exit";
    }

    @Override
    public void execute(String[] args, Context context) {
        System.out.println("Exiting program.");
        cli.stop();
    }
}
