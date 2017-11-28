package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatCalculatorTestSuite {

    Statistics statisticsMock = mock(Statistics.class);

@Test
public void testStatCalcWithNoPosts() {

    //given
    Statistics statisticsMock = mock(Statistics.class);
    StatCalculator statCalculator = new StatCalculator();
    when(statisticsMock.getPostsCount()).thenReturn(postsCount());

    //when
    StatCalculator.calculateAdvStatistics(statisticsMock);
    int postsCount = 0;

    //then
    Assert.assertEquals(0, statCalculator.getAvrPostsPerUser(), 0.0);
    Assert.assertEquals(0, statCalculator.getAvrCommentsPerUser(), 0.0);
    Assert.assertEquals(0, statCalculator.getAvrCommentsPerUser(), 0.0);
}
    @Test

    public void testStatCalculatorPcEquals1000(){

        //given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.getPostsCount()).thenReturn(postsCount);

        //when
        int postsCount = 1000;
        StatCalculator.calculateAdvStatistics(statisticsMock);

        //then
        Assert.assertEquals(0.0, statCalculator.getAvrPostsPerUser(), 0.0);
        Assert.assertEquals(0.0, statCalculator.getAvrCommentsPerUser(), 0.0);
        Assert.assertEquals(0.0, statCalculator.getAvrCommentsPerPost(), 0.0);
    }

    @Test

    public void testWhenCommentsEqualZero(){

        //given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.getCommentsCount()).thenReturn(commentsCount);

        //when
        StatCalculator statCalculator = new StatCalculator();
        StatCalculator.calculateAdvStatistics(statisticsMock);
        int commentsCount = 0;

        Assert.assertEquals(0.0, statCalculator.getAvrPostsPerUser(), 0.0);
        Assert.assertEquals(0.0, statCalculator.getAvrCommentsPerUser(), 0.0);
        Assert.assertEquals(0.0, statCalculator.getAvrCommentsPerPost(), 0.0);
    }


    @Test public void testWhenFewerCommentsThanPosts(){
        //given
        StatCalculator statCalculator = new StatCalculator();
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.getCommentsCount()).thenReturn(commentsCount);

        //when
        StatCalculator.calculateAdvStatistics(statisticsMock);
        int postCount = 100;
        int commentsCount = 50;

        //then
        Assert.assertEquals(0.0, statCalculator.getAvrPostsPerUser(), 0.0);
        Assert.assertEquals(0.0, statCalculator.getAvrCommentsPerUser(), 0.0);
        Assert.assertEquals(2.0, statCalculator.getAvrCommentsPerPost(), 0.0);
    }
@Test
        public void testWhenFewerPostsThanComments() {

            //given
            Statistics statisticsMock = mock(Statistics.class);
            StatCalculator statCalculator = new StatCalculator();
            when(statisticsMock.getCommentsCount()).thenReturn(commentsCount);
            when(statisticsMock.getPostsCount()).thenReturn(postsCount);

            //when
            StatCalculator.calculateAdvStatistics(statisticsMock);
            int postsCount = 50;
            int commentsCount = 500;

            //then
            Assert.assertEquals(0.0, statCalculator.getAvrPostsPerUser(), 0.0);
            Assert.assertEquals(0.0, statCalculator.getAvrCommentsPerUser(), 0.0);
            Assert.assertEquals(0.1, statCalculator.getAvrCommentsPerPost(), 0.0);
        }
@Test
        public void testWithNoUsers() {
            //given
            StatCalculator statCalculator = new StatCalculator();
            when(statisticsMock.getUsersNames.size()).thenReturn(usersNames.size());

            //when
            StatCalculator.calculateAdvStatistics(statisticsMock);
            List<String> usersNames ( ); usersNames.size() = 0;

            //then
            Assert.assertEquals(0.0, statCalculator.getAvrPostsPerUser(), 0.0);
            Assert.assertEquals(0.0, statCalculator.getAvrCommentsPerUser(), 0.0);
            Assert.assertEquals(0.0, statCalculator.getAvrCommentsPerPost(), 0.0);
        }
@Test
        public void testWithHundredUsers(){
            StatCalculator statCalculator = new StatCalculator();
            when(statisticsMock.getUsersNames.size()).thenReturn(usersNames.size());

            //when
            StatCalculator.calculateAdvStatistics(statisticsMock);
            List<String> usersNames = new ArrayList<>();
            String[] users = { "User1","User2","User3" };
            for(int i =  0; i < users.length; i++){
                usersNames.add(users[100]);}

          //then
                Assert.assertEquals(0.0, statCalculator.getAvrPostsPerUser(), 0.0);
                Assert.assertEquals(0.0, statCalculator.getAvrCommentsPerUser(), 0.0);
                Assert.assertEquals(0.0, statCalculator.getAvrCommentsPerPost(), 0.0);
            }
            public void testShowStatistics(){
                StatCalculator.showStatistics();
    }
    }






