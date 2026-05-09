package bg.tu_varna.sit.f24621698.commands;

import bg.tu_varna.sit.f24621698.cmdlintf.Context;

public interface Command {
    String getName();
    // getCommandRequiredParamsCount
    // getCommandUsageDescription { return "Usage: create <type> <params... x y radius color>" }
    void execute(String[] args, Context context);
}