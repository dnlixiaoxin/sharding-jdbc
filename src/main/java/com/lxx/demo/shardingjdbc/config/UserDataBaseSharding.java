package com.lxx.demo.shardingjdbc.config;

import io.shardingsphere.api.algorithm.sharding.PreciseShardingValue;
import io.shardingsphere.api.algorithm.sharding.standard.PreciseShardingAlgorithm;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * @author lixiaoxin@guazi.com
 * @serial
 * @since 2019-05-05 15:36
 */
@Service
@SuppressWarnings("all")
@Slf4j
public class UserDataBaseSharding implements PreciseShardingAlgorithm<Long> {

    @Override
    public String doSharding(Collection<String> collection, PreciseShardingValue<Long> preciseShardingValue) {
        for (String each : collection) {
            if (each.endsWith(String.valueOf(preciseShardingValue.getValue() % 4))){
                return each;
            }
        }
        throw new UnsupportedOperationException();
    }
}
