/*
 * Created on 2018/05/22
 * Copyright (C) 2018 Koga Laboratory. All rights reserved.
 *
 */
package dom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class Summoner {

  Monster monster = new Monster();
  ArrayList<Integer> summonList = new ArrayList<Integer>();


  public String summon(int i) {
    if (i == 1) return monster.getGoblin();
    else if (i == 2) return monster.getSkeleton();
    else if (i == 3) return monster.getOrk();
    else if (i == 4) return monster.getVampire();
    else if (i == 5) return monster.getGolem();
    else if (i == 6) return monster.getRich();
    else if (i == 7) return monster.getDaemon();
    else if (i == 9) return monster.getDragon();
    else return "fail";
  }

}
