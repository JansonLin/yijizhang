package cn.ahyc.yjz.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SubjectBalance implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subject_balance.id
     *
     * @mbggenerated Tue Oct 20 10:18:09 CST 2015
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subject_balance.subject_code
     *
     * @mbggenerated Tue Oct 20 10:18:09 CST 2015
     */
    private Long subjectCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subject_balance.initial_debit_balance
     *
     * @mbggenerated Tue Oct 20 10:18:09 CST 2015
     */
    private BigDecimal initialDebitBalance;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subject_balance.initial_credit_balance
     *
     * @mbggenerated Tue Oct 20 10:18:09 CST 2015
     */
    private BigDecimal initialCreditBalance;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subject_balance.period_debit_occur
     *
     * @mbggenerated Tue Oct 20 10:18:09 CST 2015
     */
    private BigDecimal periodDebitOccur;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subject_balance.period_credit_occur
     *
     * @mbggenerated Tue Oct 20 10:18:09 CST 2015
     */
    private BigDecimal periodCreditOccur;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subject_balance.year_debit_occur
     *
     * @mbggenerated Tue Oct 20 10:18:09 CST 2015
     */
    private BigDecimal yearDebitOccur;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subject_balance.year_credit_occur
     *
     * @mbggenerated Tue Oct 20 10:18:09 CST 2015
     */
    private BigDecimal yearCreditOccur;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subject_balance.terminal_debit_balance
     *
     * @mbggenerated Tue Oct 20 10:18:09 CST 2015
     */
    private BigDecimal terminalDebitBalance;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subject_balance.terminal_credit_balance
     *
     * @mbggenerated Tue Oct 20 10:18:09 CST 2015
     */
    private BigDecimal terminalCreditBalance;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subject_balance.profit_loss_occur_amount
     *
     * @mbggenerated Tue Oct 20 10:18:09 CST 2015
     */
    private BigDecimal profitLossOccurAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subject_balance.profit_loss_total_occur_amount
     *
     * @mbggenerated Tue Oct 20 10:18:09 CST 2015
     */
    private BigDecimal profitLossTotalOccurAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subject_balance.book_id
     *
     * @mbggenerated Tue Oct 20 10:18:09 CST 2015
     */
    private Long bookId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subject_balance.period_id
     *
     * @mbggenerated Tue Oct 20 10:18:09 CST 2015
     */
    private Long periodId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subject_balance.create_time
     *
     * @mbggenerated Tue Oct 20 10:18:09 CST 2015
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subject_balance.modify_time
     *
     * @mbggenerated Tue Oct 20 10:18:09 CST 2015
     */
    private Date modifyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table subject_balance
     *
     * @mbggenerated Tue Oct 20 10:18:09 CST 2015
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject_balance
     *
     * @mbggenerated Tue Oct 20 10:18:09 CST 2015
     */
    public SubjectBalance(Long id, Long subjectCode, BigDecimal initialDebitBalance, BigDecimal initialCreditBalance, BigDecimal periodDebitOccur, BigDecimal periodCreditOccur, BigDecimal yearDebitOccur, BigDecimal yearCreditOccur, BigDecimal terminalDebitBalance, BigDecimal terminalCreditBalance, BigDecimal profitLossOccurAmount, BigDecimal profitLossTotalOccurAmount, Long bookId, Long periodId, Date createTime, Date modifyTime) {
        this.id = id;
        this.subjectCode = subjectCode;
        this.initialDebitBalance = initialDebitBalance;
        this.initialCreditBalance = initialCreditBalance;
        this.periodDebitOccur = periodDebitOccur;
        this.periodCreditOccur = periodCreditOccur;
        this.yearDebitOccur = yearDebitOccur;
        this.yearCreditOccur = yearCreditOccur;
        this.terminalDebitBalance = terminalDebitBalance;
        this.terminalCreditBalance = terminalCreditBalance;
        this.profitLossOccurAmount = profitLossOccurAmount;
        this.profitLossTotalOccurAmount = profitLossTotalOccurAmount;
        this.bookId = bookId;
        this.periodId = periodId;
        this.createTime = createTime;
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject_balance
     *
     * @mbggenerated Tue Oct 20 10:18:09 CST 2015
     */
    public SubjectBalance() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject_balance.id
     *
     * @return the value of subject_balance.id
     *
     * @mbggenerated Tue Oct 20 10:18:09 CST 2015
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject_balance.id
     *
     * @param id the value for subject_balance.id
     *
     * @mbggenerated Tue Oct 20 10:18:09 CST 2015
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject_balance.subject_code
     *
     * @return the value of subject_balance.subject_code
     *
     * @mbggenerated Tue Oct 20 10:18:09 CST 2015
     */
    public Long getSubjectCode() {
        return subjectCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject_balance.subject_code
     *
     * @param subjectCode the value for subject_balance.subject_code
     *
     * @mbggenerated Tue Oct 20 10:18:09 CST 2015
     */
    public void setSubjectCode(Long subjectCode) {
        this.subjectCode = subjectCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject_balance.initial_debit_balance
     *
     * @return the value of subject_balance.initial_debit_balance
     *
     * @mbggenerated Tue Oct 20 10:18:09 CST 2015
     */
    public BigDecimal getInitialDebitBalance() {
        return initialDebitBalance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject_balance.initial_debit_balance
     *
     * @param initialDebitBalance the value for subject_balance.initial_debit_balance
     *
     * @mbggenerated Tue Oct 20 10:18:09 CST 2015
     */
    public void setInitialDebitBalance(BigDecimal initialDebitBalance) {
        this.initialDebitBalance = initialDebitBalance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject_balance.initial_credit_balance
     *
     * @return the value of subject_balance.initial_credit_balance
     *
     * @mbggenerated Tue Oct 20 10:18:09 CST 2015
     */
    public BigDecimal getInitialCreditBalance() {
        return initialCreditBalance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject_balance.initial_credit_balance
     *
     * @param initialCreditBalance the value for subject_balance.initial_credit_balance
     *
     * @mbggenerated Tue Oct 20 10:18:09 CST 2015
     */
    public void setInitialCreditBalance(BigDecimal initialCreditBalance) {
        this.initialCreditBalance = initialCreditBalance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject_balance.period_debit_occur
     *
     * @return the value of subject_balance.period_debit_occur
     *
     * @mbggenerated Tue Oct 20 10:18:09 CST 2015
     */
    public BigDecimal getPeriodDebitOccur() {
        return periodDebitOccur;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject_balance.period_debit_occur
     *
     * @param periodDebitOccur the value for subject_balance.period_debit_occur
     *
     * @mbggenerated Tue Oct 20 10:18:09 CST 2015
     */
    public void setPeriodDebitOccur(BigDecimal periodDebitOccur) {
        this.periodDebitOccur = periodDebitOccur;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject_balance.period_credit_occur
     *
     * @return the value of subject_balance.period_credit_occur
     *
     * @mbggenerated Tue Oct 20 10:18:09 CST 2015
     */
    public BigDecimal getPeriodCreditOccur() {
        return periodCreditOccur;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject_balance.period_credit_occur
     *
     * @param periodCreditOccur the value for subject_balance.period_credit_occur
     *
     * @mbggenerated Tue Oct 20 10:18:09 CST 2015
     */
    public void setPeriodCreditOccur(BigDecimal periodCreditOccur) {
        this.periodCreditOccur = periodCreditOccur;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject_balance.year_debit_occur
     *
     * @return the value of subject_balance.year_debit_occur
     *
     * @mbggenerated Tue Oct 20 10:18:09 CST 2015
     */
    public BigDecimal getYearDebitOccur() {
        return yearDebitOccur;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject_balance.year_debit_occur
     *
     * @param yearDebitOccur the value for subject_balance.year_debit_occur
     *
     * @mbggenerated Tue Oct 20 10:18:09 CST 2015
     */
    public void setYearDebitOccur(BigDecimal yearDebitOccur) {
        this.yearDebitOccur = yearDebitOccur;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject_balance.year_credit_occur
     *
     * @return the value of subject_balance.year_credit_occur
     *
     * @mbggenerated Tue Oct 20 10:18:09 CST 2015
     */
    public BigDecimal getYearCreditOccur() {
        return yearCreditOccur;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject_balance.year_credit_occur
     *
     * @param yearCreditOccur the value for subject_balance.year_credit_occur
     *
     * @mbggenerated Tue Oct 20 10:18:09 CST 2015
     */
    public void setYearCreditOccur(BigDecimal yearCreditOccur) {
        this.yearCreditOccur = yearCreditOccur;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject_balance.terminal_debit_balance
     *
     * @return the value of subject_balance.terminal_debit_balance
     *
     * @mbggenerated Tue Oct 20 10:18:09 CST 2015
     */
    public BigDecimal getTerminalDebitBalance() {
        return terminalDebitBalance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject_balance.terminal_debit_balance
     *
     * @param terminalDebitBalance the value for subject_balance.terminal_debit_balance
     *
     * @mbggenerated Tue Oct 20 10:18:09 CST 2015
     */
    public void setTerminalDebitBalance(BigDecimal terminalDebitBalance) {
        this.terminalDebitBalance = terminalDebitBalance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject_balance.terminal_credit_balance
     *
     * @return the value of subject_balance.terminal_credit_balance
     *
     * @mbggenerated Tue Oct 20 10:18:09 CST 2015
     */
    public BigDecimal getTerminalCreditBalance() {
        return terminalCreditBalance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject_balance.terminal_credit_balance
     *
     * @param terminalCreditBalance the value for subject_balance.terminal_credit_balance
     *
     * @mbggenerated Tue Oct 20 10:18:09 CST 2015
     */
    public void setTerminalCreditBalance(BigDecimal terminalCreditBalance) {
        this.terminalCreditBalance = terminalCreditBalance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject_balance.profit_loss_occur_amount
     *
     * @return the value of subject_balance.profit_loss_occur_amount
     *
     * @mbggenerated Tue Oct 20 10:18:09 CST 2015
     */
    public BigDecimal getProfitLossOccurAmount() {
        return profitLossOccurAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject_balance.profit_loss_occur_amount
     *
     * @param profitLossOccurAmount the value for subject_balance.profit_loss_occur_amount
     *
     * @mbggenerated Tue Oct 20 10:18:09 CST 2015
     */
    public void setProfitLossOccurAmount(BigDecimal profitLossOccurAmount) {
        this.profitLossOccurAmount = profitLossOccurAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject_balance.profit_loss_total_occur_amount
     *
     * @return the value of subject_balance.profit_loss_total_occur_amount
     *
     * @mbggenerated Tue Oct 20 10:18:09 CST 2015
     */
    public BigDecimal getProfitLossTotalOccurAmount() {
        return profitLossTotalOccurAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject_balance.profit_loss_total_occur_amount
     *
     * @param profitLossTotalOccurAmount the value for subject_balance.profit_loss_total_occur_amount
     *
     * @mbggenerated Tue Oct 20 10:18:09 CST 2015
     */
    public void setProfitLossTotalOccurAmount(BigDecimal profitLossTotalOccurAmount) {
        this.profitLossTotalOccurAmount = profitLossTotalOccurAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject_balance.book_id
     *
     * @return the value of subject_balance.book_id
     *
     * @mbggenerated Tue Oct 20 10:18:09 CST 2015
     */
    public Long getBookId() {
        return bookId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject_balance.book_id
     *
     * @param bookId the value for subject_balance.book_id
     *
     * @mbggenerated Tue Oct 20 10:18:09 CST 2015
     */
    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject_balance.period_id
     *
     * @return the value of subject_balance.period_id
     *
     * @mbggenerated Tue Oct 20 10:18:09 CST 2015
     */
    public Long getPeriodId() {
        return periodId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject_balance.period_id
     *
     * @param periodId the value for subject_balance.period_id
     *
     * @mbggenerated Tue Oct 20 10:18:09 CST 2015
     */
    public void setPeriodId(Long periodId) {
        this.periodId = periodId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject_balance.create_time
     *
     * @return the value of subject_balance.create_time
     *
     * @mbggenerated Tue Oct 20 10:18:09 CST 2015
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject_balance.create_time
     *
     * @param createTime the value for subject_balance.create_time
     *
     * @mbggenerated Tue Oct 20 10:18:09 CST 2015
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject_balance.modify_time
     *
     * @return the value of subject_balance.modify_time
     *
     * @mbggenerated Tue Oct 20 10:18:09 CST 2015
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject_balance.modify_time
     *
     * @param modifyTime the value for subject_balance.modify_time
     *
     * @mbggenerated Tue Oct 20 10:18:09 CST 2015
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}