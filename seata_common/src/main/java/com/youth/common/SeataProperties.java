package com.youth.common;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("spring.cloud.alibaba.seata")
public class SeataProperties {
    private String txServiceGroup;

    public SeataProperties() {
    }

    public String getTxServiceGroup() {
        return this.txServiceGroup;
    }

    public void setTxServiceGroup(String txServiceGroup) {
        this.txServiceGroup = txServiceGroup;
    }
}
