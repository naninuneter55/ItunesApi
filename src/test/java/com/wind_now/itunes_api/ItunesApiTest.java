package com.wind_now.itunes_api;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.wind_now.itunes_api.beans.SearchResponse;

/**
 *
 * @author ono
 */
public class ItunesApiTest {

    public ItunesApiTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void search() throws Exception{
        String term = "シエナ・ウィンド";
        Search search = new Search();
        SearchResponse res = search.search(term);
        Integer actual = res.getResultCount();
        Integer expected = 50;
        assertThat(actual, is(expected));
    }

}
