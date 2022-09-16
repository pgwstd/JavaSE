package com.pgwstr.java14;

/**
 * @author pgwstr
 * @date 2022/9/16 22:39
 */

public class EnumTest {
    public static void main(String[] args) {
        Season summer = Season.SUMMER;
        System.out.println(summer);
        System.out.println("***************");
        for (Season value : Season.values()) {
            System.out.println(value);
        }
        System.out.println("****************");
        Season of = Season.valueOf("WINTER");
        System.out.println(of);

    }

    enum Season{
        SUMMER("夏天"),
        WINTER("冬天");
        private final String seasonName;

        private Season(String seasonName) {
            this.seasonName = seasonName;
        }

        public String getSeasonName() {
            return seasonName;
        }

        @Override
        public String toString() {
            return "Season{" +
                    "seasonName='" + seasonName + '\'' +
                    '}';
        }
    }

}
