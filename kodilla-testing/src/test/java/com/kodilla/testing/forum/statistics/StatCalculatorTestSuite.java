package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatCalculatorTestSuite {
public void testStatCalcWithNoPosts(){
@Test
    //given
    StatCalculator statCalculator = new StatCalculator();
    Statistics statisticsMock = mock(Statistics.class);

    when(statisticsMock.getPostsCount()).thenReturn(postsCount());

    //given
    int postsCount = 0;

    //when
    StatCalculator.calculateAdvStatistics(statisticsMock);

    //then
    Assert.assertEquals(0, statCalculator.getPostsNumber());