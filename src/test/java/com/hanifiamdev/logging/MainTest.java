package com.hanifiamdev.logging;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainTest {

    private static final Logger log = LoggerFactory.getLogger(MainTest.class);

    @Test
    void testLog() {
        log.info("Hello Logger");
        log.info("Selamat Belajar Jva Logging");
    }
}
