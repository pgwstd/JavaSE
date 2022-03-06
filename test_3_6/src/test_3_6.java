public class test_3_6 {
        public static void main (String args[ ]) {
            System.out.println("教活动从教室开始"); //命令行窗口输出"教学活动从教室开始"
            Teacher zhang = new Teacher();
            Student jiang = new Student();
            zhang.introduceSelf();
            jiang.introduceSelf();
        }
    }

    class Teacher {
        void introduceSelf() {
            System.out.println("我是张老师"); //命令行窗口输出"我是张老师"
        }
    }

    class Student {
        void introduceSelf() {
            System.out.println("我是学生，名字是:奖励"); //命令行窗口输出"我是学生,名字是:奖励"
        }
    }

