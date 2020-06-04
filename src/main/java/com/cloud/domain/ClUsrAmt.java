package com.cloud.domain;

import java.math.BigDecimal;
import java.util.Date;

public class ClUsrAmt {
    private Integer crdtextSeq;

    private String orderCde;

    private String loanContractCde;

    private BigDecimal applyAmt;

    private String applyTnr;

    private BigDecimal totalCoverage;

    private BigDecimal totalCoverageFee;

    private BigDecimal tnrCoverageFee;

    private BigDecimal totalInterest;

    private String policyNo;

    private Date policySignDt;

    private String lendStatus;

    private String smsSendStatus;

    private String flowId;

    private String acceptTime;

    private Date crtDt;

    private Date mdfDt;

    public Integer getCrdtextSeq() {
        return crdtextSeq;
    }

    public void setCrdtextSeq(Integer crdtextSeq) {
        this.crdtextSeq = crdtextSeq;
    }

    public String getOrderCde() {
        return orderCde;
    }

    public void setOrderCde(String orderCde) {
        this.orderCde = orderCde == null ? null : orderCde.trim();
    }

    public String getLoanContractCde() {
        return loanContractCde;
    }

    public void setLoanContractCde(String loanContractCde) {
        this.loanContractCde = loanContractCde == null ? null : loanContractCde.trim();
    }

    public BigDecimal getApplyAmt() {
        return applyAmt;
    }

    public void setApplyAmt(BigDecimal applyAmt) {
        this.applyAmt = applyAmt;
    }

    public String getApplyTnr() {
        return applyTnr;
    }

    public void setApplyTnr(String applyTnr) {
        this.applyTnr = applyTnr == null ? null : applyTnr.trim();
    }

    public BigDecimal getTotalCoverage() {
        return totalCoverage;
    }

    public void setTotalCoverage(BigDecimal totalCoverage) {
        this.totalCoverage = totalCoverage;
    }

    public BigDecimal getTotalCoverageFee() {
        return totalCoverageFee;
    }

    public void setTotalCoverageFee(BigDecimal totalCoverageFee) {
        this.totalCoverageFee = totalCoverageFee;
    }

    public BigDecimal getTnrCoverageFee() {
        return tnrCoverageFee;
    }

    public void setTnrCoverageFee(BigDecimal tnrCoverageFee) {
        this.tnrCoverageFee = tnrCoverageFee;
    }

    public BigDecimal getTotalInterest() {
        return totalInterest;
    }

    public void setTotalInterest(BigDecimal totalInterest) {
        this.totalInterest = totalInterest;
    }

    public String getPolicyNo() {
        return policyNo;
    }

    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo == null ? null : policyNo.trim();
    }

    public Date getPolicySignDt() {
        return policySignDt;
    }

    public void setPolicySignDt(Date policySignDt) {
        this.policySignDt = policySignDt;
    }

    public String getLendStatus() {
        return lendStatus;
    }

    public void setLendStatus(String lendStatus) {
        this.lendStatus = lendStatus == null ? null : lendStatus.trim();
    }

    public String getSmsSendStatus() {
        return smsSendStatus;
    }

    public void setSmsSendStatus(String smsSendStatus) {
        this.smsSendStatus = smsSendStatus == null ? null : smsSendStatus.trim();
    }

    public String getFlowId() {
        return flowId;
    }

    public void setFlowId(String flowId) {
        this.flowId = flowId == null ? null : flowId.trim();
    }

    public String getAcceptTime() {
        return acceptTime;
    }

    public void setAcceptTime(String acceptTime) {
        this.acceptTime = acceptTime == null ? null : acceptTime.trim();
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