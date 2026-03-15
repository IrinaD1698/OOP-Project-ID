package bg.tu_varna.sit.f24621698.cli;

import bg.tu_varna.sit.f24621698.commands.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CLI {

    private boolean running = true;
    private Context context = new Context();
    private List<Command> commands = new ArrayList<>();

    public CLI() {
        commands.add(new OpenCommand());
        commands.add(new SaveCommand());
        commands.add(new SaveAsCommand());
        commands.add(new CloseCommand());
        commands.add(new ExitCommand(this));
    }

    public void start() {
        Scanner sc = new Scanner(System.in);

        while(running) {
            System.out.print("> ");
            String input = sc.nextLine().trim();
            if(input.isEmpty()) continue;

            String[] parts = input.split(" ");
            String name = parts[0];

            boolean found = false;
            for(Command c : commands) {
                if(c.getName().equals(name)) {
                    c.execute(parts, context);
                    found = true;
                    break;
                }
            }

            if(!found) {
                System.out.println("Unknown command: " + name);
            }
        }

        sc.close();
    }

    public void stop() {
        running = false;
    }
}
