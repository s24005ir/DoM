/*
 * Created on 2018/05/23
 * Copyright (C) 2018 Koga Laboratory. All rights reserved.
 *
 */
package dom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class DoM {

  static Calc calc = new Calc();
  static CardList cardList = new CardList();
  static Monster monster = new Monster();
  static Player player = new Player();
  static Summoner summoner = new Summoner();
  static Dungeon dungeon = new Dungeon();

  public static void main(String[] args) throws IOException, InterruptedException {
    System.out.println("dom");

    List<Integer> monsterList = cardList.suffleList(cardList.monsterSet1());
    List<String> eqList = cardList.equipmentSet1();

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    for (int turn = 0; turn <= 13; turn++) {
      System.out.println((turn + 1) + "ターン目：");
      System.out.println("残りデッキ枚数 : " + monsterList.size());
      System.out.println("現在のダンジョン枚数:" + dungeon.dungeonList.size());
      System.out.println("残りの装備");
      cardList.printList(eqList);
      System.out.println("カードを引くかパスを選択してください");
      System.out.println("0:カードを引く");
      System.out.println("1:パスする");

      String firstJudge = reader.readLine();
      int fj = Integer.parseInt(firstJudge);

      if (player.draw(fj)) {
        int monsterCardNum = monsterList.get(0);
        System.out.println(summoner.summon(monsterCardNum) + "(攻撃力:" + monsterCardNum + ")を引きました");
        if (eqList.size() != 0) {
          System.out.println("ダンジョンに加えるか装備を外すか選択してください");
          System.out.println("0:ダンジョンに加える");
          System.out.println("1:装備をはずす");

          String secondJudge = reader.readLine();
          int sj = Integer.parseInt(secondJudge);

          if (player.makeDungeon(sj)) {
            dungeon.addDungeonList(monsterCardNum);
            System.out.println(summoner.summon(monsterCardNum) + "をダンジョンに加えました");
          } else {
            System.out.println("どの装備を外しますか");
            cardList.printList(eqList);
            String choseEq = reader.readLine();
            int cEq = Integer.parseInt(choseEq);
            cardList.removeList(eqList, cEq);
          }
          if (monsterList.size() == 0) {
            break;
          }
        } else {
          dungeon.addDungeonList(monsterCardNum);
          System.out.println(summoner.summon(monsterCardNum) + "をダンジョンに加えました");
        }
        cardList.removeList(monsterList, 0);
      }else {
        break;
      }
    }
    System.out.println("以下の装備でダンジョンへ挑戦します");
    cardList.printList(eqList);
    int hp = calc.calcHp(eqList);
    System.out.println("HPは" + hp + "です");
    int vsNum = 0;
    if (eqList.contains("vorpalSword")) {
      System.out.println("vorpalSwordで防ぐmonsterを選択してください");
      System.out.println("1:goblin\n2:skelton\n3:ork\n4:vampia\n5:golem\n6:rich\n7:daemon\n9:dragon");
      vsNum = Integer.parseInt(reader.readLine());
    }
    for (int i = 0; i < dungeon.dungeonList.size(); i++) {
      TimeUnit.SECONDS.sleep(1);
      System.out.println((i + 1) + "体目 : " + summoner.summon(dungeon.dungeonList.get(i)));
      TimeUnit.SECONDS.sleep(2);
      int damage = calc.calcDamage(dungeon.dungeonList.get(i), vsNum, eqList);
      hp = hp - damage;
      if (hp <= 0) {
        System.out.println("hpが0になりました、挑戦失敗です");
        System.exit(0);
      } else {
        System.out.println("残りHPは" + hp + "です");
      }
    }
    System.out.println("ダンジョンをクリアしました、おめでとうございます");
    System.exit(0);
  }
}