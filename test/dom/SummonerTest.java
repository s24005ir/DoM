/*
 * Created on 2018/05/22
 * Copyright (C) 2018 Koga Laboratory. All rights reserved.
 *
 */
package dom;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class SummonerTest {

  Summoner summoner = new Summoner();

  @Test
  void testSummonGoblin() {
    assertThat(summoner.summon(1), is("goblin"));
  }

  @Test
  void testSummonSkeleton() {
    assertThat(summoner.summon(2), is("skeleton"));
  }

  @Test
  void testSummonOrk() {
    assertThat(summoner.summon(3), is("ork"));
  }

  @Test
  void testSummonVampire() {
    assertThat(summoner.summon(4), is("vampire"));
  }

  @Test
  void testSummonGolem() {
    assertThat(summoner.summon(5), is("golem"));
  }

  @Test
  void testSummonRich() {
    assertThat(summoner.summon(6), is("rich"));
  }

  @Test
  void testSummonDaemon() {
    assertThat(summoner.summon(7), is("daemon"));
  }

  @Test
  void testSummonDragon() {
    assertThat(summoner.summon(9), is("dragon"));
  }

  @Test
  void testSummonList() {
    assertThat(13, is(summoner.summonList.size()));
  }
}
