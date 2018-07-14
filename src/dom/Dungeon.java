/*
 * Created on 2018/05/23
 * Copyright (C) 2018 Koga Laboratory. All rights reserved.
 *
 */
package dom;

import java.util.ArrayList;
import java.util.List;


public class Dungeon {

  List<Integer> dungeonList;

  public Dungeon() {
    dungeonList = new ArrayList<>();
  }

  public void addDungeonList(int i) {
    dungeonList.add(i);
  }
}
