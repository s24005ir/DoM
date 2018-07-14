/*
 * Created on 2018/05/18
 * Copyright (C) 2018 Koga Laboratory. All rights reserved.
 *
 */
package dom;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class MonsterTest {

  Monster monster = new Monster();

  @Test
  void testGetGoblin() {
    assertThat(monster.getGoblin(), is("goblin"));
  }

  @Test
  void testGetSkeleton() {
    assertThat(monster.getSkeleton(), is("skeleton"));
  }

  @Test
  void testGetOrk() {
    assertThat(monster.getOrk(), is("ork"));
  }

  @Test
  void testGetVampire() {
    assertThat(monster.getVampire(), is("vampire"));
  }

  @Test
  void testGetGolem() {
    assertThat(monster.getGolem(), is("golem"));
  }

  @Test
  void testGetRich() {
    assertThat(monster.getRich(), is("rich"));
  }

  @Test
  void testGetDaemon() {
    assertThat(monster.getDaemon(), is("daemon"));
  }

  @Test
  void testGetDragon() {
    assertThat(monster.getDragon(), is("dragon"));
  }

}
