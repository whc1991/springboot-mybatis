package com.cloud.common.constant;

public enum SeasonEnum {

    spring(1),
    summer(2),
    autumn(3),
    winter(4);

    int seq;

    SeasonEnum(int seq) {
        this.seq = seq;
    }

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }
}
