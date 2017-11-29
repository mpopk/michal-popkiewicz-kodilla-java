package com.kodilla.testing.statistics;

import com.kodilla.testing.forum.statistics.StatCalculator;
import com.kodilla.testing.forum.statistics.Statistics;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatCalculatorTestSuite {


@Test
public void testStatCalcWithNoPosts() {

//given
Statistics statisticsMock = mock(Statistics.class);
StatCalculator statCalculator = new StatCalculator();
int postsCount = 0;
when(statisticsMock.postsCount()).thenReturn(postsCount);

//when
statCalculator.calculateAdvStatistics(statisticsMock);

//then
Assert.assertEquals(0, statCalculator.getAvrPostsPerUser(), 0.0);
Assert.assertEquals(0, statCalculator.getAvrCommentsPerUser(), 0.0);
Assert.assertEquals(0, statCalculator.getAvrCommentsPerUser(), 0.0);
}
@Test

public void testStatCalculatorPcEquals1000(){

    //given
    Statistics statisticsMock = mock(Statistics.class);
    int postsCount = 1000;
    when(statisticsMock.postsCount()).thenReturn(postsCount);

    //when
    StatCalculator statCalculator = new StatCalculator();
    statCalculator.calculateAdvStatistics(statisticsMock);

    //then
    Assert.assertEquals(0.0, statCalculator.getAvrPostsPerUser(), 0.0);
    Assert.assertEquals(0.0, statCalculator.getAvrCommentsPerUser(), 0.0);
    Assert.assertEquals(0.0, statCalculator.getAvrCommentsPerPost(), 0.0);
}

@Test

public void testWhenCommentsEqualZero(){

    //given
    int commentsCount = 0;
    Statistics statisticsMock = mock(Statistics.class);
    when(statisticsMock.commentsCount()).thenReturn(commentsCount);

    //when
    StatCalculator statCalculator = new StatCalculator();
    statCalculator.calculateAdvStatistics(statisticsMock);


    Assert.assertEquals(0.0, statCalculator.getAvrPostsPerUser(), 0.0);
    Assert.assertEquals(0.0, statCalculator.getAvrCommentsPerUser(), 0.0);
    Assert.assertEquals(0.0, statCalculator.getAvrCommentsPerPost(), 0.0);
}


@Test public void testWhenFewerCommentsThanPosts(){
    //given
    int postsCount = 100;
    int commentsCount = 50;
    StatCalculator statCalculator = new StatCalculator();
    Statistics statisticsMock = mock(Statistics.class);
    when(statisticsMock.postsCount()).thenReturn(postsCount);
    when(statisticsMock.commentsCount()).thenReturn(commentsCount);

    //when
    statCalculator.calculateAdvStatistics(statisticsMock);


    //then
    Assert.assertEquals(0.0, statCalculator.getAvrPostsPerUser(), 0.0);
    Assert.assertEquals(0.0, statCalculator.getAvrCommentsPerUser(), 0.0);
    Assert.assertEquals(2.0, statCalculator.getAvrCommentsPerPost(), 0.0);
}
@Test
    public void testWhenFewerPostsThanComments() {

        //given
int postsCount = 50;
int commentsCount = 500;
        Statistics statisticsMock = mock(Statistics.class);
        StatCalculator statCalculator = new StatCalculator();
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.postsCount()).thenReturn(postsCount);

        //when
        statCalculator.calculateAdvStatistics(statisticsMock);


        //then
        Assert.assertEquals(0.0, statCalculator.getAvrPostsPerUser(), 0.0);
        Assert.assertEquals(0.0, statCalculator.getAvrCommentsPerUser(), 0.0);
        Assert.assertEquals(0.0, statCalculator.getAvrCommentsPerPost(), 0.0);
    }
@Test
    public void testWithNoUsers() {
        //given
Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        StatCalculator statCalculator = new StatCalculator();
        when(statisticsMock.usersNames()).thenReturn(usersNames);

//when
        statCalculator.calculateAdvStatistics(statisticsMock);


        //then
        Assert.assertEquals(0.0, statCalculator.getAvrPostsPerUser(), 0.0);
        Assert.assertEquals(0.0, statCalculator.getAvrCommentsPerUser(), 0.0);
        Assert.assertEquals(0.0, statCalculator.getAvrCommentsPerPost(), 0.0);
    }
@Test
    public void testWithHundredUsers() {
    //given
Statistics statisticsMock = mock(Statistics.class);
StatCalculator statCalculator = new StatCalculator();
List<String> usersNames = new ArrayList<>();
when(statisticsMock.usersNames()).thenReturn(usersNames);



//when
statCalculator.calculateAdvStatistics(statisticsMock);
usersNames = new ArrayList<>();
    int i;
    for(i = 0; i < 100; i++){
        usersNames.add("Name"+ i);
}

//then
Assert.assertEquals(0.0, statCalculator.getAvrPostsPerUser(), 0.0);
Assert.assertEquals(0.0, statCalculator.getAvrCommentsPerUser(), 0.0);
Assert.assertEquals(0.0, statCalculator.getAvrCommentsPerPost(), 0.0);
}

}







