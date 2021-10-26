package ru.iteco.cources.queue.search;

public class SearchUser {
    private long userId;
    private short age;
    private boolean sex;

    public SearchUser(long userId, short age, boolean sex) {
        this.userId = userId;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "SearchUser{" +
                "userId=" + userId +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }
}
