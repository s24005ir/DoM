/*
 * Created on 2018/05/18
 * Copyright (C) 2018 Koga Laboratory. All rights reserved.
 *
 */
package dom;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class PlayerTest {

  @BeforeEach
  void setUp() throws Exception {}

  @Test
  void testDraw() throws IOException {
    Player player = new Player();
    assertThat(player.draw(0), is(true));
    assertThat(player.draw(1), is(false));
  }

  @Test
  void testMakeDungeon() throws IOException {
    Player player = new Player();
    assertThat(player.makeDungeon(0), is(true));
    assertThat(player.makeDungeon(1), is(false));
  }
}
