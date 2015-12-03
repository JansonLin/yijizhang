package cn.ahyc.yjz.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class AccountSubjectTextNameDto implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_subject.id
     *
     * @mbggenerated Mon Sep 28 15:49:31 CST 2015
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_subject.subject_code
     *
     * @mbggenerated Mon Sep 28 15:49:31 CST 2015
     */
    private Long subjectCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_subject.subject_name
     *
     * @mbggenerated Mon Sep 28 15:49:31 CST 2015
     */
    private String subjectName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_subject.parent_subject_code
     *
     * @mbggenerated Mon Sep 28 15:49:31 CST 2015
     */
    private Long parentSubjectCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_subject.level
     *
     * @mbggenerated Mon Sep 28 15:49:31 CST 2015
     */
    private Integer level;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_subject.tip_info
     *
     * @mbggenerated Mon Sep 28 15:49:31 CST 2015
     */
    private String tipInfo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_subject.direction
     *
     * @mbggenerated Mon Sep 28 15:49:31 CST 2015
     */
    private Integer direction;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_subject.book_id
     *
     * @mbggenerated Mon Sep 28 15:49:31 CST 2015
     */
    private Long bookId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_subject.total_debit
     *
     * @mbggenerated Mon Sep 28 15:49:31 CST 2015
     */
    private BigDecimal totalDebit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_subject.total_credit
     *
     * @mbggenerated Mon Sep 28 15:49:31 CST 2015
     */
    private BigDecimal totalCredit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_subject.initial_left
     *
     * @mbggenerated Mon Sep 28 15:49:31 CST 2015
     */
    private BigDecimal initialLeft;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_subject.year_occur_amount
     *
     * @mbggenerated Mon Sep 28 15:49:31 CST 2015
     */
    private BigDecimal yearOccurAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_subject.end_flag
     *
     * @mbggenerated Mon Sep 28 15:49:31 CST 2015
     */
    private Integer endFlag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_subject.base_flag
     *
     * @mbggenerated Mon Sep 28 15:49:31 CST 2015
     */
    private Integer baseFlag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_subject.company_id
     *
     * @mbggenerated Mon Sep 28 15:49:31 CST 2015
     */
    private String companyId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_subject.create_time
     *
     * @mbggenerated Mon Sep 28 15:49:31 CST 2015
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_subject.modify_time
     *
     * @mbggenerated Mon Sep 28 15:49:31 CST 2015
     */
    private Date modifyTime;

    private String subjectTextname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table account_subject
     *
     * @mbggenerated Mon Sep 28 15:49:31 CST 2015
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_subject
     *
     * @mbggenerated Mon Sep 28 15:49:31 CST 2015
     */
    public AccountSubjectTextNameDto(Long id, Long subjectCode, String subjectName, Long parentSubjectCode,
            Integer level, String tipInfo, Integer direction, Long bookId, BigDecimal totalDebit,
            BigDecimal totalCredit, BigDecimal initialLeft, BigDecimal yearOccurAmount, Integer endFlag,
            Integer baseFlag, String companyId, Date createTime, Date modifyTime) {
        this.id = id;
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
        this.parentSubjectCode = parentSubjectCode;
        this.level = level;
        this.tipInfo = tipInfo;
        this.direction = direction;
        this.bookId = bookId;
        this.totalDebit = totalDebit;
        this.totalCredit = totalCredit;
        this.initialLeft = initialLeft;
        this.yearOccurAmount = yearOccurAmount;
        this.endFlag = endFlag;
        this.baseFlag = baseFlag;
        this.companyId = companyId;
        this.createTime = createTime;
        this.modifyTime = modifyTime;
    }

    public AccountSubjectTextNameDto(Long id, Long subjectCode, String subjectName, Long parentSubjectCode,
            Integer level, String tipInfo, Integer direction, Long bookId, BigDecimal totalDebit,
            BigDecimal totalCredit, BigDecimal initialLeft, BigDecimal yearOccurAmount, Integer endFlag,
            Integer baseFlag, String companyId, Date createTime, Date modifyTime, String subjectTextname) {
        this.id = id;
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
        this.parentSubjectCode = parentSubjectCode;
        this.level = level;
        this.tipInfo = tipInfo;
        this.direction = direction;
        this.bookId = bookId;
        this.totalDebit = totalDebit;
        this.totalCredit = totalCredit;
        this.initialLeft = initialLeft;
        this.yearOccurAmount = yearOccurAmount;
        this.endFlag = endFlag;
        this.baseFlag = baseFlag;
        this.companyId = companyId;
        this.createTime = createTime;
        this.modifyTime = modifyTime;
        this.subjectTextname = subjectTextname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_subject
     *
     * @mbggenerated Mon Sep 28 15:49:31 CST 2015
     */
    public AccountSubjectTextNameDto() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_subject.id
     *
     * @return the value of account_subject.id
     *
     * @mbggenerated Mon Sep 28 15:49:31 CST 2015
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_subject.id
     *
     * @param id the value for account_subject.id
     *
     * @mbggenerated Mon Sep 28 15:49:31 CST 2015
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_subject.subject_code
     *
     * @return the value of account_subject.subject_code
     *
     * @mbggenerated Mon Sep 28 15:49:31 CST 2015
     */
    public Long getSubjectCode() {
        return subjectCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_subject.subject_code
     *
     * @param subjectCode the value for account_subject.subject_code
     *
     * @mbggenerated Mon Sep 28 15:49:31 CST 2015
     */
    public void setSubjectCode(Long subjectCode) {
        this.subjectCode = subjectCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_subject.subject_name
     *
     * @return the value of account_subject.subject_name
     *
     * @mbggenerated Mon Sep 28 15:49:31 CST 2015
     */
    public String getSubjectName() {
        return subjectName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_subject.subject_name
     *
     * @param subjectName the value for account_subject.subject_name
     *
     * @mbggenerated Mon Sep 28 15:49:31 CST 2015
     */
    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName == null ? null : subjectName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_subject.parent_subject_code
     *
     * @return the value of account_subject.parent_subject_code
     *
     * @mbggenerated Mon Sep 28 15:49:31 CST 2015
     */
    public Long getParentSubjectCode() {
        return parentSubjectCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_subject.parent_subject_code
     *
     * @param parentSubjectCode the value for account_subject.parent_subject_code
     *
     * @mbggenerated Mon Sep 28 15:49:31 CST 2015
     */
    public void setParentSubjectCode(Long parentSubjectCode) {
        this.parentSubjectCode = parentSubjectCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_subject.level
     *
     * @return the value of account_subject.level
     *
     * @mbggenerated Mon Sep 28 15:49:31 CST 2015
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_subject.level
     *
     * @param level the value for account_subject.level
     *
     * @mbggenerated Mon Sep 28 15:49:31 CST 2015
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_subject.tip_info
     *
     * @return the value of account_subject.tip_info
     *
     * @mbggenerated Mon Sep 28 15:49:31 CST 2015
     */
    public String getTipInfo() {
        return tipInfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_subject.tip_info
     *
     * @param tipInfo the value for account_subject.tip_info
     *
     * @mbggenerated Mon Sep 28 15:49:31 CST 2015
     */
    public void setTipInfo(String tipInfo) {
        this.tipInfo = tipInfo == null ? null : tipInfo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_subject.direction
     *
     * @return the value of account_subject.direction
     *
     * @mbggenerated Mon Sep 28 15:49:31 CST 2015
     */
    public Integer getDirection() {
        return direction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_subject.direction
     *
     * @param direction the value for account_subject.direction
     *
     * @mbggenerated Mon Sep 28 15:49:31 CST 2015
     */
    public void setDirection(Integer direction) {
        this.direction = direction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_subject.book_id
     *
     * @return the value of account_subject.book_id
     *
     * @mbggenerated Mon Sep 28 15:49:31 CST 2015
     */
    public Long getBookId() {
        return bookId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_subject.book_id
     *
     * @param bookId the value for account_subject.book_id
     *
     * @mbggenerated Mon Sep 28 15:49:31 CST 2015
     */
    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_subject.total_debit
     *
     * @return the value of account_subject.total_debit
     *
     * @mbggenerated Mon Sep 28 15:49:31 CST 2015
     */
    public BigDecimal getTotalDebit() {
        return totalDebit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_subject.total_debit
     *
     * @param totalDebit the value for account_subject.total_debit
     *
     * @mbggenerated Mon Sep 28 15:49:31 CST 2015
     */
    public void setTotalDebit(BigDecimal totalDebit) {
        this.totalDebit = totalDebit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_subject.total_credit
     *
     * @return the value of account_subject.total_credit
     *
     * @mbggenerated Mon Sep 28 15:49:31 CST 2015
     */
    public BigDecimal getTotalCredit() {
        return totalCredit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_subject.total_credit
     *
     * @param totalCredit the value for account_subject.total_credit
     *
     * @mbggenerated Mon Sep 28 15:49:31 CST 2015
     */
    public void setTotalCredit(BigDecimal totalCredit) {
        this.totalCredit = totalCredit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_subject.initial_left
     *
     * @return the value of account_subject.initial_left
     *
     * @mbggenerated Mon Sep 28 15:49:31 CST 2015
     */
    public BigDecimal getInitialLeft() {
        return initialLeft;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_subject.initial_left
     *
     * @param initialLeft the value for account_subject.initial_left
     *
     * @mbggenerated Mon Sep 28 15:49:31 CST 2015
     */
    public void setInitialLeft(BigDecimal initialLeft) {
        this.initialLeft = initialLeft;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_subject.year_occur_amount
     *
     * @return the value of account_subject.year_occur_amount
     *
     * @mbggenerated Mon Sep 28 15:49:31 CST 2015
     */
    public BigDecimal getYearOccurAmount() {
        return yearOccurAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_subject.year_occur_amount
     *
     * @param yearOccurAmount the value for account_subject.year_occur_amount
     *
     * @mbggenerated Mon Sep 28 15:49:31 CST 2015
     */
    public void setYearOccurAmount(BigDecimal yearOccurAmount) {
        this.yearOccurAmount = yearOccurAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_subject.end_flag
     *
     * @return the value of account_subject.end_flag
     *
     * @mbggenerated Mon Sep 28 15:49:31 CST 2015
     */
    public Integer getEndFlag() {
        return endFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_subject.end_flag
     *
     * @param endFlag the value for account_subject.end_flag
     *
     * @mbggenerated Mon Sep 28 15:49:31 CST 2015
     */
    public void setEndFlag(Integer endFlag) {
        this.endFlag = endFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_subject.base_flag
     *
     * @return the value of account_subject.base_flag
     *
     * @mbggenerated Mon Sep 28 15:49:31 CST 2015
     */
    public Integer getBaseFlag() {
        return baseFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_subject.base_flag
     *
     * @param baseFlag the value for account_subject.base_flag
     *
     * @mbggenerated Mon Sep 28 15:49:31 CST 2015
     */
    public void setBaseFlag(Integer baseFlag) {
        this.baseFlag = baseFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_subject.company_id
     *
     * @return the value of account_subject.company_id
     *
     * @mbggenerated Mon Sep 28 15:49:31 CST 2015
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_subject.company_id
     *
     * @param companyId the value for account_subject.company_id
     *
     * @mbggenerated Mon Sep 28 15:49:31 CST 2015
     */
    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_subject.create_time
     *
     * @return the value of account_subject.create_time
     *
     * @mbggenerated Mon Sep 28 15:49:31 CST 2015
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_subject.create_time
     *
     * @param createTime the value for account_subject.create_time
     *
     * @mbggenerated Mon Sep 28 15:49:31 CST 2015
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_subject.modify_time
     *
     * @return the value of account_subject.modify_time
     *
     * @mbggenerated Mon Sep 28 15:49:31 CST 2015
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_subject.modify_time
     *
     * @param modifyTime the value for account_subject.modify_time
     *
     * @mbggenerated Mon Sep 28 15:49:31 CST 2015
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getSubjectTextName() {
        return subjectTextname;
    }

    public void setSubjectTextName(String subjectTextName) {
        this.subjectTextname = subjectTextName;
    }
}