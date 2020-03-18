// date.java
// 1章 P30～P58
// データ型(date type)の説明
public class date {
    public static void main(String[] args){
        // 整数を格納できる型
        // long(8バイト),int(4バイト,よく使う),short(2バイト),byte(1バイト)
        long worldPeople = 6900000000L; // Lは小数点がない大きな数字(整数)
        System.out.println("世界の総人口(worldPeople)  = " + worldPeople);
        int salary = 180000;
        System.out.println("給料(salary) = " + salary);
        short age = 20;
        System.out.println("年齢(age) = " + age);
        byte glasses = 2;
        System.out.println("ガラス(glasses) = " + glasses);

        // 実数(浮動少数点型)を格納できる型
        // double(floatより厳密な計算を行う),float
        double height = 173.2;
        System.out.println("身長(height) = " + height);
        float weight = 67.5F; // Fは小数点がある数字(精度は低い)
        System.out.println("体重(weight) = " + weight);

        // YES(true)かNO(false)かを格納できる型
        // boolean
        boolean result = true;
        System.out.println("結果(result) = " + result);
        boolean isMarried = false;
        System.out.println("結婚しているか(isMarried) = " + isMarried);

        // 文字を格納できる型
        // char(1文字)、String(0文字以上)
        char gender = '男'; // char(文字)の時は「'」(引用符、シングルクォーテーション)
        System.out.println("性別(gender) = " + gender);
        String name = "はこざき"; // String(文字列)の時は「"」(二重引用符、ダブルクォーテーション)
        System.out.println("名前(name) = " + name);

        // 定数(final)
        // 値を書き換えることができなくなる
        final double TAX = 1.08;
        int fax = 5;
        System.out.println("５万円から４万円に値下げします");
        // TAX = 4; エラーになるのでコメントアウト
        System.out.println("FAXの新価格(税込み)");
        System.out.println(fax * TAX + "万円");
        }
}