package org.abondar.experimental.guicedemo.basics.command;


import org.abondar.experimental.guicedemo.basics.fortune.command.FortuneCommand;

public class CommandSwitcher {

    private final CommandExecutor executor;

    public CommandSwitcher() {
        this.executor = new CommandExecutor();
    }


    public void executeCommand(String cmd){
        try {
            switch (Commands.valueOf(cmd)){

                case FU:
                    FortuneCommand fc = new FortuneCommand();
                    executor.executeCommand(fc);
                    break;

            }
        } catch (IllegalArgumentException ex){
            System.out.println("Check documentation for command list");
            System.exit(1);
        }

    }
}
