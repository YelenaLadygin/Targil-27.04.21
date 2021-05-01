package com.company;
import org.junit.Test;
import java.lang.reflect.Field;
import java.util.ArrayList;
import static junit.framework.TestCase.assertEquals;

public class FootballCoachTest {
        @Test
        public void test_SendPlayerTobench() {

            FootballCoachTest team = new FootballCoachTest();
            FootballCoach players = new FootballCoach();

            try {
                ArrayList<Integer> m_items = null;
                Field privateStringField = null;
                privateStringField = FootballCoachTest.class.
                        getDeclaredField("m_items");
                ((Field) privateStringField).setAccessible(true);
                m_items = (ArrayList<Integer>) privateStringField.get(team);
             //  String expected_result = players.sendPlayerToBench("A");
                assertEquals(players.sendPlayerToBench("A"), "A");
               // assertEquals((int) m_items.get(0), 10);
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
}
