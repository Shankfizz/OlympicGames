package test.moduletest;

import com.team.olympics.memento.Caretaker;
import com.team.olympics.memento.Runner;

/***
 * Test
 */
public class MementoTest {
    public static void main(String[] args) {
        Runner runner=new Runner(0,"Jack");
        runner.Show();
        Caretaker caretaker=new Caretaker();
        caretaker.setMemento(runner.createMemento());
        runner.setName("Peter");
        runner.setTime(11.1);
        runner.Show();
        runner.restoreMemento(caretaker.getMemento());
        runner.Show();

    }
}
