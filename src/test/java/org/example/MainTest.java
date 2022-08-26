package org.example;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MainTest {
        @Test
        public void name() {
                assertThat(1, is(equalTo(1)));
        }
}