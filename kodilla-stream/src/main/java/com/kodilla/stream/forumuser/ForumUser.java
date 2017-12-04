package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userId;
    private final String userName;
    private final char sex;
    private final LocalDate birthDate;
    private final int postsCount;

    public ForumUser(final int userId, final String userName, final char sex, final LocalDate birthDate, final int postsCount){
        this.userId = userId;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = birthDate;
        this.postsCount = postsCount;
    }

    public int getUserId() {
    return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPostsCount() {
        return postsCount;
    }

    @Override
    public String toString() {
        return "Forum User{" +
                "user Id'" + userId + '\'' +
                ", user sex='" + sex + '\'' +
                ", user name='" + userName + '\'' +
                ", year of birth =" + birthDate +
                ", posts count='" + postsCount + '\'' +
                '}';
    }

}

