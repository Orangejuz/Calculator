package com.ctgu;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    @Test
    public void solve() {
        String sum = Main.Solve("11+44");
        Assert.assertEquals("11+44=55", sum);
    }
}