/*
 * Created on 2018/05/23
 * Copyright (C) 2018 Koga Laboratory. All rights reserved.
 *
 */
package dom;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import org.junit.jupiter.api.Test;


class DungeonTest {

  Dungeon dungeon = new Dungeon();

  @Test
  void testDungeonList() {

    final StringBuffer expectedList = new StringBuffer();
    expectedList.append(1);
    expectedList.append(System.getProperty("line.separator"));
    expectedList.append(1);
    expectedList.append(System.getProperty("line.separator"));
    expectedList.append(3);
    expectedList.append(System.getProperty("line.separator"));

    final StringBuffer actualList = new StringBuffer();

    dungeon.addDungeonList(1);
    dungeon.addDungeonList(1);
    dungeon.addDungeonList(3);
    for (int i = 0; i < dungeon.dungeonList.size(); i++) {
      actualList.append(dungeon.dungeonList.get(i)); //$NON-NLS-1$
      actualList.append(System.getProperty("line.separator")); //$NON-NLS-1$
    }

    String expected = expectedList.toString();

    String actual = actualList.toString();
    assertThat(actual, is(expected));
  }

}
