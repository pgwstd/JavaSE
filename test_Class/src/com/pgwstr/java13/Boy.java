package com.pgwstr.java13;

/**
 * @author pgwstr
 * @date 2022/9/11 23:56
 */

public class Boy {
    Girlfriend friend;
    void setGirlfriend(Girlfriend f){
        friend = f;
    }
    void showGirlfriend() {
        friend.speak();
        friend.cooking();
    }

}
