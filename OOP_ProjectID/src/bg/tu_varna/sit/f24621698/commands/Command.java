package bg.tu_varna.sit.f24621698.commands;

import bg.tu_varna.sit.f24621698.cli.Context;

public interface Command {
    String getName();
    void execute(String[] args, Context context);
}

