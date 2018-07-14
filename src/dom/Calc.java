/*
 * Created on 2018/05/23
 * Copyright (C) 2018 Koga Laboratory. All rights reserved.
 *
 */
package dom;

import java.util.List;


public class Calc {

  Summoner summoner = new Summoner();
  private int hp;

  public Calc() {
    hp = 3;
  }

  public int calcHp(List eqList) {
    if (eqList.contains("shield")) hp = hp + 3;
    if (eqList.contains("armor")) hp = hp + 5;
    return hp;
  }

  public int calcDamage(int monNum, int vsNum, List eqList) {
    int damage = 0;

    if (monNum == 1) {
      if (eqList.contains("torch")) {
        System.out.println("torchで撃退しました、0ダメージ");
      } else if (vsNum == 1) {
        System.out.println("vorpalSwordで撃退しました、0ダメージ");
      } else {
        damage = damage + monNum;
        System.out.println(monNum + "ダメージ受けました");
      }

    } else if (monNum == 2) {
      if (eqList.contains("torch")) {
        System.out.println("torchで撃退しました");
      } else if (eqList.contains("holyGrail")) {
        System.out.println("holyGrailで撃退しました");
      } else if (vsNum == 2) {
        System.out.println("vorpalSwordで倒しました、0ダメージ");
      } else {
        damage = damage + monNum;
        System.out.println(monNum + "ダメージ受けました");
      }

    } else if (monNum == 3) {
      if (eqList.contains("torch")) {
        System.out.println("torchで撃退しました、0ダメージ");
      } else if (vsNum == 3) {
        System.out.println("vorpalSwordで倒しました、0ダメージ");
      } else {
        damage = damage + monNum;
        System.out.println(monNum + "ダメージ受けました");
      }

    } else if (monNum == 4) {
      if (eqList.contains("holyGrail")) {
        System.out.println("holyGrailで撃退しました、0ダメージ");
      } else if (vsNum == 4) {
        System.out.println("vorpalSwordで倒しました、0ダメージ");
      } else {
        damage = damage + monNum;
        System.out.println(monNum + "ダメージ受けました");
      }

    } else if (monNum == 5) {
      if (vsNum == 5) {
        System.out.println("vorpalSwordで倒しました、0ダメージ");
      } else {
        damage = damage + monNum;
        System.out.println(monNum + "ダメージ受けました");
      }

    } else if (monNum == 6) {
      if (eqList.contains("holyGrail")) {
        System.out.println("holyGrailで撃退しました、0ダメージ");
      } else if (vsNum == 6) {
        System.out.println("vorpalSwordで倒しました、0ダメージ");
      } else {
        damage = damage + monNum;
        System.out.println(monNum + "ダメージ受けました");
      }

    } else if (monNum == 7) {
      if (vsNum == 7) {
        System.out.println("vorpalSwordで倒しました、0ダメージ");
      } else {
        damage = damage + monNum;
        System.out.println(monNum + "ダメージ受けました");
      }

    } else if (monNum == 9) {
      if (eqList.contains("dragonLance")) {
        System.out.println("dragonLanceで撃退しました、0ダメージ");
      } else if (vsNum == 9) {
        System.out.println("vorpalSwordで倒しました、0ダメージ");
      } else {
        damage = damage + monNum;
        System.out.println(monNum + "ダメージ受けました");
      }
    }

    return damage;
  }

}
