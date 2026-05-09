package bg.tu_varna.sit.f24621698.commands;

import bg.tu_varna.sit.f24621698.cmdlintf.Context;
import bg.tu_varna.sit.f24621698.cmdlintf.CmdLIntf;

public class ExitCommand implements Command {

    private CmdLIntf cmdLIntf;

    public ExitCommand(CmdLIntf cli) {
        this.cmdLIntf = cli;
    }

    @Override
    public String getName() {
        return "exit";
    }

    @Override
    public void execute(String[] args, Context context) {
        System.out.println("Exiting program.");
        cmdLIntf.stop();
    }
}
