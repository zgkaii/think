package org.zgkaii.collection;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @Author: Mr.Z
 * @DateTime: 2021/05/26 17:09
 * @Description: 斗地主小游戏
 **/
public class Poker {
    public static void main(String[] args) {
        // 牌盒存储牌面
        ArrayList<String> pokerBox = new ArrayList<>();
        // 花色
        ArrayList<String> colors = new ArrayList<>();
        // 数字
        ArrayList<String> numbers = new ArrayList<>();

        // 添加花色
        colors.add("♥");
        colors.add("♦");
        colors.add("♠");
        colors.add("♣");

        // 添加数字
        for (int i = 2; i <= 10; i++) {
            numbers.add(i + "");
        }
        numbers.add("J");
        numbers.add("Q");
        numbers.add("K");
        numbers.add("A");

        // 拼接牌
        for (String color : colors) {
            for (String number : numbers) {
                String card = color + number;
                pokerBox.add(card);
            }
        }
        pokerBox.add("小☠");
        pokerBox.add("大☠");

        // 洗牌
        Collections.shuffle(pokerBox);
        // 发牌
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        // 底牌
        ArrayList<String> extraCards = new ArrayList<>();

        for (int i = 0; i < pokerBox.size(); i++) {
            String card = pokerBox.get(i);
            if (i >= 51) {
                extraCards.add(card);
            } else {
                if (i % 3 == 0) {
                    player1.add(card);
                } else if (i % 3 == 1) {
                    player2.add(card);
                } else {
                    player3.add(card);
                }
            }
        }

        // 查看玩家手牌
        System.out.println("张三：" + player1 + "\n"
                + "李四：" + player2 + "\n"
                + "王五：" + player3 + "\n"
                + "底牌：" + extraCards);
    }
}
