/*
 * Copyright (c) 2020 L3Harris Technologies
 */
package com.l3harris.swim.outputs;

import com.typesafe.config.Config;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StdoutOutput extends Output {
    private static Logger logger = LoggerFactory.getLogger("stdout");

    public StdoutOutput(Config config) {
        super(config);
    }

    @Override
    public void output(String message) {
        logger.info(this.convert(message));
    }
}
