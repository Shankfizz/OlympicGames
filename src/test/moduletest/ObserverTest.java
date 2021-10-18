package test.moduletest;

import com.team.olympics.game.fieldtrace.RaceGame;
import com.team.olympics.game.gender.Men;
import com.team.olympics.watcher.GameWatcher;

import java.util.concurrent.TimeUnit;

public class ObserverTest {
    public static void testObserver()
    {
        try
        {
            RaceGame game = new RaceGame(new Men(),"100m Race Final");
            GameWatcher watcher1 = new GameWatcher("Charles", game);
            GameWatcher watcher2 = new GameWatcher("Schweitzer",game);
            game.notifyAllWatchers(); // this is not necessary in formal Observer test, I add this to keep the test logical
            TimeUnit.SECONDS.sleep(2);
            game.nextState();
            TimeUnit.SECONDS.sleep(2);
            game.nextState();
            TimeUnit.SECONDS.sleep(2);
            game.nextState();
            System.out.println("----------------------- End of Observer Pattern testing------------------------");
        }
        catch (InterruptedException ie)
        {
            System.out.println("Unknown interruption! Ending main test...");
        }
    }

    public static void main(String[] args)
    {
        System.out.println("--------------------------- Observer ---------------------------------");
        System.out.println("RaceGame(): Another game type for Observer Pattern");
        System.out.println("GameState(): Enumerate class for state changing");
        System.out.println("GameWatcher(): the observers for the game");
        System.out.println("update(): output the state of the game");
        System.out.println("attach(): add an observer of the game");
        System.out.println("notifyAllWatcher(): notify the state changing of game to all watchers");
        System.out.println("----------------------------------------------------------------------");
        testObserver();
    }
}
