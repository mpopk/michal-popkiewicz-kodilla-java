package com.kodilla.testing.forum.statistics;

public class StatCalculator {

    private int usersNumber;
    private int postsNumber;
    private int commentsNumber;
    private double avrPostsPerUser;
    private double avrCommentsPerUser;
    private double avrCommentsPerPost;


    public void calculateAdvStatistics(Statistics statistics){

        usersNumber = statistics.usersNames().size();
        postsNumber = statistics.postsCount();
        commentsNumber = statistics.commentsCount();

if(postsNumber!=0) {
    avrPostsPerUser = usersNumber / postsNumber;
    avrCommentsPerUser = usersNumber/postsNumber;
}else{
    avrPostsPerUser = 0;
 avrCommentsPerUser = 0;
}

if(commentsNumber!=0) {
    avrCommentsPerPost = postsNumber / commentsNumber;
}else{
    avrCommentsPerPost = 0;
}}

    public double getAvrPostsPerUser() {
        return avrPostsPerUser;
    }

    public double getAvrCommentsPerUser() {
        return avrCommentsPerUser;
    }

    public double getAvrCommentsPerPost() {
        return avrCommentsPerPost;
    }

public void showStatistics(){

        System.out.println("Users No: " + usersNumber);
        System.out.println("Posts No: " + postsNumber);
        System.out.println("Comments No: " + commentsNumber);
        System.out.println("Average posts number per user: " + avrPostsPerUser);
        System.out.println("Average comments number per user:" + avrCommentsPerUser);
        System.out.println("Average comments number per post: " + avrCommentsPerPost);
    }
}
