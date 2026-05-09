package bg.tu_varna.sit.f24621698.commands;

import bg.tu_varna.sit.f24621698.cmdlintf.Context;

public class HelpCommand implements Command {
    @Override
    public String getName() { return "help"; }

    @Override
    public void execute(String[] args, Context context) {
        System.out.println("The following commands are supported:");
        System.out.println("open <file>    opens <file>");
        System.out.println("close          closes currently opened file");
        System.out.println("save           saves the currently open file");
        System.out.println("saveas <file>  saves the currently open file in <file>");
        System.out.println("print          prints all figures");
        System.out.println("create <fig>   creates a new figure");
        System.out.println("erase <n>      erases figure by number");
        System.out.println("translate      translates figures");
        System.out.println("within <opt>   shows figures within a region");
        System.out.println("help           prints this information");
        System.out.println("exit           exists the program");
    }
}