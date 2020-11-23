package org.abondar.experimental.guicedemo.basics.command;


import org.abondar.experimental.guicedemo.basics.fortune.command.FortuneCommand;
import org.abondar.experimental.guicedemo.basics.gum.GumCommand;
import org.abondar.experimental.guicedemo.basics.generictype.GenericTypeCommand;
import org.abondar.experimental.guicedemo.basics.properties.PropertiesCommand;

public class CommandSwitcher {

    private final CommandExecutor executor;

    public CommandSwitcher() {
        this.executor = new CommandExecutor();
    }


    public void executeCommand(String cmd){
        try {
            switch (Commands.valueOf(cmd)){

                case GC:
                    GumCommand gc = new GumCommand();
                    executor.executeCommand(gc);
                    break;

                case GTC:
                    GenericTypeCommand gtc = new GenericTypeCommand();
                    executor.executeCommand(gtc);
                    break;

                case FC:
                    FortuneCommand fc = new FortuneCommand();
                    executor.executeCommand(fc);
                    break;

                case PC:
                    PropertiesCommand pc = new PropertiesCommand();
                    executor.executeCommand(pc);
                    break;
            }

        } catch (IllegalArgumentException ex){
            System.out.println("Check documentation for command list");
            System.exit(1);
        }

    }
}
