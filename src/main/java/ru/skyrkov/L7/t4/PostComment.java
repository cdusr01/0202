package ru.skyrkov.L7.t4;

import java.util.Arrays;

public class PostComment {
    private String text; // содержание комментария
    private String[] whoLiked; // кто поддержал

    public void setText(String text) {
        this.text = text;
    }

    public void setWhoLiked(String[] whoLiked) {
        this.whoLiked = whoLiked;
    }

    @Override
    public String toString() {
        return "PostComment{" +
                "whoLiked=" + Arrays.toString(whoLiked) +
                '}';
    }
}