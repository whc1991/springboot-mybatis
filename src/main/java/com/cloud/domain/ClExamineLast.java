package com.cloud.domain;

import java.math.BigDecimal;
import java.util.Date;

public class ClExamineLast {
    private Integer examineSeq;

    private String orderCde;

    private String examineResult;

    private BigDecimal crdtextAmt;

    private Date lastExmineTime;

    private Date lastWithdrawalTime;

    private Date crtDt;

    private Date mdfDt;

    public Integer getExamineSeq() {
        return examineSeq;
    }

    public void setExamineSeq(Integer examineSeq) {
        this.examineSeq = examineSeq;
    }

    public String getOrderCde() {
        return orderCde;
    }

    public void setOrderCde(String orderCde) {
        this.orderCde = orderCde == null ? null : orderCde.trim();
    }

    public String getExamineResult() {
        return examineResult;
    }

    public void setExamineResult(String examineResult) {
        this.examineResult = examineResult == null ? null : examineResult.trim();
    }

    public BigDecimal getCrdtextAmt() {
        return crdtextAmt;
    }

    public void setCrdtextAmt(BigDecimal crdtextAmt) {
        this.crdtextAmt = crdtextAmt;
    }

    public Date getLastExmineTime() {
        return lastExmineTime;
    }

    public void setLastExmineTime(Date lastExmineTime) {
        this.lastExmineTime = lastExmineTime;
    }

    public Date getLastWithdrawalTime() {
        return lastWithdrawalTime;
    }

    public void setLastWithdrawalTime(Date lastWithdrawalTime) {
        this.lastWithdrawalTime = lastWithdrawalTime;
    }

    public Date getCrtDt() {
        return crtDt;
    }

    public void setCrtDt(Date crtDt) {
        this.crtDt = crtDt;
    }

    public Date getMdfDt() {
        return mdfDt;
    }

    public void setMdfDt(Date mdfDt) {
        this.mdfDt = mdfDt;
    }
}