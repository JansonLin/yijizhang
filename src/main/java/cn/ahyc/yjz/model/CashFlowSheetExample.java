package cn.ahyc.yjz.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CashFlowSheetExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cash_flow_sheet
     *
     * @mbggenerated Mon Nov 16 10:09:39 CST 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cash_flow_sheet
     *
     * @mbggenerated Mon Nov 16 10:09:39 CST 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cash_flow_sheet
     *
     * @mbggenerated Mon Nov 16 10:09:39 CST 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cash_flow_sheet
     *
     * @mbggenerated Mon Nov 16 10:09:39 CST 2015
     */
    public CashFlowSheetExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cash_flow_sheet
     *
     * @mbggenerated Mon Nov 16 10:09:39 CST 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cash_flow_sheet
     *
     * @mbggenerated Mon Nov 16 10:09:39 CST 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cash_flow_sheet
     *
     * @mbggenerated Mon Nov 16 10:09:39 CST 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cash_flow_sheet
     *
     * @mbggenerated Mon Nov 16 10:09:39 CST 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cash_flow_sheet
     *
     * @mbggenerated Mon Nov 16 10:09:39 CST 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cash_flow_sheet
     *
     * @mbggenerated Mon Nov 16 10:09:39 CST 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cash_flow_sheet
     *
     * @mbggenerated Mon Nov 16 10:09:39 CST 2015
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cash_flow_sheet
     *
     * @mbggenerated Mon Nov 16 10:09:39 CST 2015
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cash_flow_sheet
     *
     * @mbggenerated Mon Nov 16 10:09:39 CST 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cash_flow_sheet
     *
     * @mbggenerated Mon Nov 16 10:09:39 CST 2015
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table cash_flow_sheet
     *
     * @mbggenerated Mon Nov 16 10:09:39 CST 2015
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andAuxiliaryExpIsNull() {
            addCriterion("auxiliary_exp is null");
            return (Criteria) this;
        }

        public Criteria andAuxiliaryExpIsNotNull() {
            addCriterion("auxiliary_exp is not null");
            return (Criteria) this;
        }

        public Criteria andAuxiliaryExpEqualTo(String value) {
            addCriterion("auxiliary_exp =", value, "auxiliaryExp");
            return (Criteria) this;
        }

        public Criteria andAuxiliaryExpNotEqualTo(String value) {
            addCriterion("auxiliary_exp <>", value, "auxiliaryExp");
            return (Criteria) this;
        }

        public Criteria andAuxiliaryExpGreaterThan(String value) {
            addCriterion("auxiliary_exp >", value, "auxiliaryExp");
            return (Criteria) this;
        }

        public Criteria andAuxiliaryExpGreaterThanOrEqualTo(String value) {
            addCriterion("auxiliary_exp >=", value, "auxiliaryExp");
            return (Criteria) this;
        }

        public Criteria andAuxiliaryExpLessThan(String value) {
            addCriterion("auxiliary_exp <", value, "auxiliaryExp");
            return (Criteria) this;
        }

        public Criteria andAuxiliaryExpLessThanOrEqualTo(String value) {
            addCriterion("auxiliary_exp <=", value, "auxiliaryExp");
            return (Criteria) this;
        }

        public Criteria andAuxiliaryExpLike(String value) {
            addCriterion("auxiliary_exp like", value, "auxiliaryExp");
            return (Criteria) this;
        }

        public Criteria andAuxiliaryExpNotLike(String value) {
            addCriterion("auxiliary_exp not like", value, "auxiliaryExp");
            return (Criteria) this;
        }

        public Criteria andAuxiliaryExpIn(List<String> values) {
            addCriterion("auxiliary_exp in", values, "auxiliaryExp");
            return (Criteria) this;
        }

        public Criteria andAuxiliaryExpNotIn(List<String> values) {
            addCriterion("auxiliary_exp not in", values, "auxiliaryExp");
            return (Criteria) this;
        }

        public Criteria andAuxiliaryExpBetween(String value1, String value2) {
            addCriterion("auxiliary_exp between", value1, value2, "auxiliaryExp");
            return (Criteria) this;
        }

        public Criteria andAuxiliaryExpNotBetween(String value1, String value2) {
            addCriterion("auxiliary_exp not between", value1, value2, "auxiliaryExp");
            return (Criteria) this;
        }

        public Criteria andRealExpIsNull() {
            addCriterion("real_exp is null");
            return (Criteria) this;
        }

        public Criteria andRealExpIsNotNull() {
            addCriterion("real_exp is not null");
            return (Criteria) this;
        }

        public Criteria andRealExpEqualTo(String value) {
            addCriterion("real_exp =", value, "realExp");
            return (Criteria) this;
        }

        public Criteria andRealExpNotEqualTo(String value) {
            addCriterion("real_exp <>", value, "realExp");
            return (Criteria) this;
        }

        public Criteria andRealExpGreaterThan(String value) {
            addCriterion("real_exp >", value, "realExp");
            return (Criteria) this;
        }

        public Criteria andRealExpGreaterThanOrEqualTo(String value) {
            addCriterion("real_exp >=", value, "realExp");
            return (Criteria) this;
        }

        public Criteria andRealExpLessThan(String value) {
            addCriterion("real_exp <", value, "realExp");
            return (Criteria) this;
        }

        public Criteria andRealExpLessThanOrEqualTo(String value) {
            addCriterion("real_exp <=", value, "realExp");
            return (Criteria) this;
        }

        public Criteria andRealExpLike(String value) {
            addCriterion("real_exp like", value, "realExp");
            return (Criteria) this;
        }

        public Criteria andRealExpNotLike(String value) {
            addCriterion("real_exp not like", value, "realExp");
            return (Criteria) this;
        }

        public Criteria andRealExpIn(List<String> values) {
            addCriterion("real_exp in", values, "realExp");
            return (Criteria) this;
        }

        public Criteria andRealExpNotIn(List<String> values) {
            addCriterion("real_exp not in", values, "realExp");
            return (Criteria) this;
        }

        public Criteria andRealExpBetween(String value1, String value2) {
            addCriterion("real_exp between", value1, value2, "realExp");
            return (Criteria) this;
        }

        public Criteria andRealExpNotBetween(String value1, String value2) {
            addCriterion("real_exp not between", value1, value2, "realExp");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("modify_time is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("modify_time =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("modify_time <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("modify_time >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_time >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("modify_time <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("modify_time <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("modify_time in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("modify_time not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("modify_time between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("modify_time not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table cash_flow_sheet
     *
     * @mbggenerated do_not_delete_during_merge Mon Nov 16 10:09:39 CST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table cash_flow_sheet
     *
     * @mbggenerated Mon Nov 16 10:09:39 CST 2015
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}