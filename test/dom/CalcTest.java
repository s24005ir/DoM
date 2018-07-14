/*
 * Created on 2018/05/23
 * Copyright (C) 2018 Koga Laboratory. All rights reserved.
 *
 */
package dom;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CalcTest {

  Calc calc = new Calc();
  Summoner summoner = new Summoner();
  CardList cardList=new CardList();

  @Test
  void testCalcHp() {
    
    assertThat(calc.calcHp(cardList.eqList), is(11));
  }

  @Test
  void testCalcDamage() {
    List<String> eqList = cardList.equipmentSet1();
    assertThat(calc.calcDamage(9, 0, eqList), is(9));
  }

}
