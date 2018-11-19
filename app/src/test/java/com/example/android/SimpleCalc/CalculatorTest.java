/*
 * Copyright 2018, Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.SimpleCalc;

import android.test.suitebuilder.annotation.SmallTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * JUnit4 unit tests for the calculator logic. These are local unit tests; no device needed
 */
@RunWith(JUnit4.class)
@SmallTest
public class CalculatorTest {
    private Math example;
    private Calculator mCalculator;

    /**
     * Set up the environment for testing
     */
    @Before
    public void setUp() {
        mCalculator = new Calculator();
    }

    @Before
    public void set() {
        example = new Math();
    }

    /**
     * Test for simple addition
     */
    @Test
    public void addTwoNumbers() {
        double resultAdd = mCalculator.add(1d, 1d);
        assertThat(resultAdd, is(equalTo(2d)));
    }

    @Test
    public void subtraction() {
        assertEquals(5, 1 + 4);
        assertEquals(10, 12 - 2);
        assertEquals("do not match", 10, 10);

    }

    @Test
    public void is_correct() {
        Assert.assertFalse(example.number(2, 1) == 2);
        Assert.assertEquals(10, 5 + 5);
        Assert.assertFalse(5 > 10);

    }

    @Test
    public void check_double() {
        //Assert.assertEquals(.3, .1+.2, 0);
        Assert.assertEquals(.30, .10 + .20, .005);
        //delta is where you adjust the level of accuracy.
    }

    @Test
    public void add_two_number_negative() {
        double resultAdd = mCalculator.add(-1d, 2d);
        assertThat(resultAdd, is(equalTo(1d)));

    }

    @Test
    public void add_two_number_floats() {
        double resultAdd = mCalculator.add(1.111f, 1.11d);
        //closeTo tests for equality within a specific delta.
        assertThat(resultAdd, is(closeTo(2.22, 0.01)));

    }

    @Test
    public void sub_two_numbers() {
        double resultSub = mCalculator.sub(1d, 1d);
        assertThat(resultSub, is(equalTo(0d)));
    }

    @Test
    public void sub_works_with_negative_results() {
        double resultSub = mCalculator.sub(10d, 13d);
        assertThat(resultSub, is(equalTo(-3d)));
    }

    @Test
    public void mul_two_numbers() {
        double resultMul = mCalculator.mul(3d, 2d);
        assertThat(resultMul, is(equalTo(6d)));
    }

    @Test
    public void mul_two_numbers_zero() {
        double resultMul = mCalculator.mul(0d, 0d);
        assertThat(resultMul, is(equalTo(0d)));
    }

    @Test
    public void div_two_numbers() {
        double resultDiv = mCalculator.div(10d, 2d);
        assertThat(resultDiv, is(equalTo(5d)));
    }
}
////
////    @Test
////    public void div_by_zero_throws() {
////        double resultDiv = mCalculator.div(2d,0d);
////        assertThat(resultDiv, is(equalTo()));
////    }
//}