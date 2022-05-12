/**
 * Created by 潘光伟 on 2022/5/12 18:55.
 */

    public class Test {
        public static void main(String[] args) {
            A a = new A();
            a.f();

            B b = new B();
            b.f();
            b.g();
        }
    }

    class A {
        public void f() {
            int firstEnglish, lastEnglish;
            char firstE = 'A', lastE = 'Z'; // 获取首字母与末字母的值

            firstEnglish = (int) firstE;
            lastEnglish = (int) lastE;

            System.out.println("英文字母表： ");
            for (int i = firstEnglish; i <= lastEnglish; ++i) {
                char uppercase, lowercase;

                uppercase = (char) i;
                lowercase = (char) (i + 32);

                System.out.print(" " + uppercase + lowercase);
            }

            System.out.println();
        }
    }

    class B extends A {
        public void g() {
            int firstLetter, lastLetter;
            char firstG = 'α', lastG = 'ω'; // 获取首字母与末字母的值

            firstLetter = (int) firstG;
            lastLetter = (int) lastG;

            System.out.println("希腊字母表： ");
            for (int i = firstLetter; i <= lastLetter; ++i) {
                char greekLetter;

                greekLetter = (char) i;

                System.out.print(" " + greekLetter);
            }

            System.out.println();
        }
    }
