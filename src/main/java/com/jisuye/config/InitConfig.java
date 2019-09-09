package com.jisuye.config;

import com.jisuye.MybatisConfig;
import com.jisuye.annotations.Config;
import com.jisuye.core.SquareConfig;

@Config
public class InitConfig implements SquareConfig {
    @Override
    public void config() {
        MybatisConfig.init();
    }

}

