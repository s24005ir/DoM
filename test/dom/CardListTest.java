/*
 * Created on 2018/05/29
 * Copyright (C) 2018 Koga Laboratory. All rights reserved.
 *
 */
package dom;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;


class CardListTest {
  
  CardList cardList=new CardList();

  @Test
  void testMonsterList1() {
    List<Integer> expected=new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5,6,7,9));

    assertIterableEquals(expected,cardList.monsterSet1());
  }
  
  @Test
  void testEqList1() {
    List<String> expected=new ArrayList<>(Arrays.asList("shield","armor","torch","holyGrail","vorpalSword","dragonLance"));
    
    assertIterableEquals(expected,cardList.equipmentSet1());
  }

}
