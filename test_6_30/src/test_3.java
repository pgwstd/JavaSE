
class IllegalAgeException extends Exception {
    public String getMessage() {
        return "Error age";
    }
}

class UserTrial {
    int age; //在下行划线处填上声明抛弃IllegalAgeException 异常的语句

    void setAge(int a) throws IllegalAgeException {
        if (a > 60) //在下行划线处填上抛出 IllegalAgeException 异常的语句
            throw new IllegalAgeException();
        age = a;
    }

}


class ThrowExample {

    public static void main(String args[]) {
        UserTrial values = new UserTrial();
        try {
            values.setAge(75);
        } //在下行空白处填上捕获 IllegalAgeException 异常的语句
        catch (IllegalAgeException e) {
            System.out.println(e.getMessage());

        }

    }

}


