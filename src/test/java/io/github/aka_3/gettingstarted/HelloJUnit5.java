package io.github.aka_3.gettingstarted;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HelloJUnit5 {
    @Test
    @DisplayName("やったぜ。")
    void iCanUseJUnit5() {
        Assert.assertTrue(true);
    }
}
