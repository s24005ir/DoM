/*
 * Created on 2018/05/29
 * Copyright (C) 2018 Koga Laboratory. All rights reserved.
 *
 */
package dom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author s2400
 * @version $Revision$, 2018/05/29
 */
public class CardList {
  List<Integer> monsterList;
  List<String> eqList;
  
  /**
   * @return モンスターセット1
   */
  public List<Integer> monsterSet1() {
    this.monsterList= new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5,6,7,9));
    return this.monsterList;    
  }

  /**
   * @return 装備セット1
   */
  public List<String> equipmentSet1() {
    this.eqList=new ArrayList<>(Arrays.asList("shield","armor","torch","holyGrail","vorpalSword","dragonLance")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$
    return this.eqList;
  }
  
  /**
   * @param list 受け取るリスト
   * @return シャッフルされたリスト
   */
  public List<Integer> suffleList(List<Integer> list){
    Collections.shuffle(list);
    return list;
  }
  
  
  /**
   * @param list 表示するリスト
   * リストを表示
   */
  public void printList(List<?> list) {
    for (int i = 0; i < list.size(); i++) {
      System.out.println(i + " : " + list.get(i)); //$NON-NLS-1$
    }
  }
  
  /**
   * @param list 与えられたリスト
   * @param i 指定された番号
   * listからi番目の要素を削除
   */
  public void removeList(List<?> list,int i) {
    list.remove(i);
  }
}
