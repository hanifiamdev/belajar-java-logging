package com.hanifiamdev.logging;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LevelTest {

    private static final Logger log = LoggerFactory.getLogger(LevelTest.class);

    @Test
    void testLevel() {
        log.trace("Trace"); // defaultnya level debug jadi ini tidak akan muncul
        log.debug("Debug");
        log.info("Info");
        log.warn("Warning");
        log.error("Error");
    }
}
