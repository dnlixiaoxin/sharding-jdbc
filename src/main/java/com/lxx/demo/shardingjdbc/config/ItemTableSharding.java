package com.lxx.demo.shardingjdbc.config;

import io.shardingsphere.api.algorithm.sharding.PreciseShardingValue;
import io.shardingsphere.api.algorithm.sharding.standard.PreciseShardingAlgorithm;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * @author lixiaoxin
 * @serial
 * @since 2019-05-05 15:14
 */
@Service
@SuppressWarnings("all")
public class ItemTableSharding implements PreciseShardingAlgorithm<Integer> {

    @Override
    public String doSharding(Collection<String> collection, PreciseShardingValue<Integer> preciseShardingValue) {
        for (String each : collection) {
            if (each.endsWith(String.valueOf(preciseShardingValue.getValue() % 4))) {
                return each;
            }
        }
        throw new UnsupportedOperationException();
    }
}
