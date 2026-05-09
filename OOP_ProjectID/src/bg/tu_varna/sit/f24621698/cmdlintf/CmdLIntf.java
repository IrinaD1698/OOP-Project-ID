package bg.tu_varna.sit.f24621698.cmdlintf;

import bg.tu_varna.sit.f24621698.commands.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CmdLIntf implements Command {

    private boolean running = true;
    private final Context context = new Context();
    private final List<Command> commands = new ArrayList<>();

    public CmdLIntf() {
        commands.add(new OpenCommand());
        commands.add(new SaveCommand());
        commands.add(new SaveAsCommand());
        commands.add(new CloseCommand());
        commands.add(new HelpCommand());
        commands.add(new ExitCommand(this));

        // SVG Specific commands
        commands.add(new PrintCommand());
        commands.add(new CreateCommand());
        commands.add(new EraseCommand());
        commands.add(new TranslateCommand());
        commands.add(new WithinCommand());
    }

    public void start() {
        Scanner sc = new Scanner(System.in);

        while(running) {
            System.out.print("> ");
            String input = sc.nextLine().trim();
            if(input.isEmpty()) continue;

            String[] parts = input.split("\\s+");
            String name = parts[0].toLowerCase();

            boolean found = false;
            for(Command c : commands) {
                if(c.getName().equalsIgnoreCase(name)) {
                    if (!name.equals("open") && !name.equals("exit") && !name.equals("help") && context.currentFile == null) {
                        System.out.println("Please open a file first.");
                    } else {
                        c.execute(parts, context);
                    }
                    found = true;
                    break;
                }
            }

            if(!found) {
                System.out.println("Unknown command: " + name + ". Type 'help' for a list of commands.");
            }
        }
        sc.close();
    }

    public void stop() {
        this.running = false;
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public void execute(String[] args, Context context) {

    }
}