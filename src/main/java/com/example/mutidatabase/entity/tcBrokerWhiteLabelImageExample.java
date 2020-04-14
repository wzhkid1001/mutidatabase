package com.example.mutidatabase.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class tcBrokerWhiteLabelImageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public tcBrokerWhiteLabelImageExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andLabelTypeIsNull() {
            addCriterion("label_type is null");
            return (Criteria) this;
        }

        public Criteria andLabelTypeIsNotNull() {
            addCriterion("label_type is not null");
            return (Criteria) this;
        }

        public Criteria andLabelTypeEqualTo(String value) {
            addCriterion("label_type =", value, "labelType");
            return (Criteria) this;
        }

        public Criteria andLabelTypeNotEqualTo(String value) {
            addCriterion("label_type <>", value, "labelType");
            return (Criteria) this;
        }

        public Criteria andLabelTypeGreaterThan(String value) {
            addCriterion("label_type >", value, "labelType");
            return (Criteria) this;
        }

        public Criteria andLabelTypeGreaterThanOrEqualTo(String value) {
            addCriterion("label_type >=", value, "labelType");
            return (Criteria) this;
        }

        public Criteria andLabelTypeLessThan(String value) {
            addCriterion("label_type <", value, "labelType");
            return (Criteria) this;
        }

        public Criteria andLabelTypeLessThanOrEqualTo(String value) {
            addCriterion("label_type <=", value, "labelType");
            return (Criteria) this;
        }

        public Criteria andLabelTypeLike(String value) {
            addCriterion("label_type like", value, "labelType");
            return (Criteria) this;
        }

        public Criteria andLabelTypeNotLike(String value) {
            addCriterion("label_type not like", value, "labelType");
            return (Criteria) this;
        }

        public Criteria andLabelTypeIn(List<String> values) {
            addCriterion("label_type in", values, "labelType");
            return (Criteria) this;
        }

        public Criteria andLabelTypeNotIn(List<String> values) {
            addCriterion("label_type not in", values, "labelType");
            return (Criteria) this;
        }

        public Criteria andLabelTypeBetween(String value1, String value2) {
            addCriterion("label_type between", value1, value2, "labelType");
            return (Criteria) this;
        }

        public Criteria andLabelTypeNotBetween(String value1, String value2) {
            addCriterion("label_type not between", value1, value2, "labelType");
            return (Criteria) this;
        }

        public Criteria andLabelStatusIsNull() {
            addCriterion("label_status is null");
            return (Criteria) this;
        }

        public Criteria andLabelStatusIsNotNull() {
            addCriterion("label_status is not null");
            return (Criteria) this;
        }

        public Criteria andLabelStatusEqualTo(String value) {
            addCriterion("label_status =", value, "labelStatus");
            return (Criteria) this;
        }

        public Criteria andLabelStatusNotEqualTo(String value) {
            addCriterion("label_status <>", value, "labelStatus");
            return (Criteria) this;
        }

        public Criteria andLabelStatusGreaterThan(String value) {
            addCriterion("label_status >", value, "labelStatus");
            return (Criteria) this;
        }

        public Criteria andLabelStatusGreaterThanOrEqualTo(String value) {
            addCriterion("label_status >=", value, "labelStatus");
            return (Criteria) this;
        }

        public Criteria andLabelStatusLessThan(String value) {
            addCriterion("label_status <", value, "labelStatus");
            return (Criteria) this;
        }

        public Criteria andLabelStatusLessThanOrEqualTo(String value) {
            addCriterion("label_status <=", value, "labelStatus");
            return (Criteria) this;
        }

        public Criteria andLabelStatusLike(String value) {
            addCriterion("label_status like", value, "labelStatus");
            return (Criteria) this;
        }

        public Criteria andLabelStatusNotLike(String value) {
            addCriterion("label_status not like", value, "labelStatus");
            return (Criteria) this;
        }

        public Criteria andLabelStatusIn(List<String> values) {
            addCriterion("label_status in", values, "labelStatus");
            return (Criteria) this;
        }

        public Criteria andLabelStatusNotIn(List<String> values) {
            addCriterion("label_status not in", values, "labelStatus");
            return (Criteria) this;
        }

        public Criteria andLabelStatusBetween(String value1, String value2) {
            addCriterion("label_status between", value1, value2, "labelStatus");
            return (Criteria) this;
        }

        public Criteria andLabelStatusNotBetween(String value1, String value2) {
            addCriterion("label_status not between", value1, value2, "labelStatus");
            return (Criteria) this;
        }

        public Criteria andSysInsertDatetimeIsNull() {
            addCriterion("sys_insert_datetime is null");
            return (Criteria) this;
        }

        public Criteria andSysInsertDatetimeIsNotNull() {
            addCriterion("sys_insert_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andSysInsertDatetimeEqualTo(Date value) {
            addCriterion("sys_insert_datetime =", value, "sysInsertDatetime");
            return (Criteria) this;
        }

        public Criteria andSysInsertDatetimeNotEqualTo(Date value) {
            addCriterion("sys_insert_datetime <>", value, "sysInsertDatetime");
            return (Criteria) this;
        }

        public Criteria andSysInsertDatetimeGreaterThan(Date value) {
            addCriterion("sys_insert_datetime >", value, "sysInsertDatetime");
            return (Criteria) this;
        }

        public Criteria andSysInsertDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sys_insert_datetime >=", value, "sysInsertDatetime");
            return (Criteria) this;
        }

        public Criteria andSysInsertDatetimeLessThan(Date value) {
            addCriterion("sys_insert_datetime <", value, "sysInsertDatetime");
            return (Criteria) this;
        }

        public Criteria andSysInsertDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("sys_insert_datetime <=", value, "sysInsertDatetime");
            return (Criteria) this;
        }

        public Criteria andSysInsertDatetimeIn(List<Date> values) {
            addCriterion("sys_insert_datetime in", values, "sysInsertDatetime");
            return (Criteria) this;
        }

        public Criteria andSysInsertDatetimeNotIn(List<Date> values) {
            addCriterion("sys_insert_datetime not in", values, "sysInsertDatetime");
            return (Criteria) this;
        }

        public Criteria andSysInsertDatetimeBetween(Date value1, Date value2) {
            addCriterion("sys_insert_datetime between", value1, value2, "sysInsertDatetime");
            return (Criteria) this;
        }

        public Criteria andSysInsertDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("sys_insert_datetime not between", value1, value2, "sysInsertDatetime");
            return (Criteria) this;
        }

        public Criteria andSysUpdDatetimeIsNull() {
            addCriterion("sys_upd_datetime is null");
            return (Criteria) this;
        }

        public Criteria andSysUpdDatetimeIsNotNull() {
            addCriterion("sys_upd_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andSysUpdDatetimeEqualTo(Date value) {
            addCriterion("sys_upd_datetime =", value, "sysUpdDatetime");
            return (Criteria) this;
        }

        public Criteria andSysUpdDatetimeNotEqualTo(Date value) {
            addCriterion("sys_upd_datetime <>", value, "sysUpdDatetime");
            return (Criteria) this;
        }

        public Criteria andSysUpdDatetimeGreaterThan(Date value) {
            addCriterion("sys_upd_datetime >", value, "sysUpdDatetime");
            return (Criteria) this;
        }

        public Criteria andSysUpdDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sys_upd_datetime >=", value, "sysUpdDatetime");
            return (Criteria) this;
        }

        public Criteria andSysUpdDatetimeLessThan(Date value) {
            addCriterion("sys_upd_datetime <", value, "sysUpdDatetime");
            return (Criteria) this;
        }

        public Criteria andSysUpdDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("sys_upd_datetime <=", value, "sysUpdDatetime");
            return (Criteria) this;
        }

        public Criteria andSysUpdDatetimeIn(List<Date> values) {
            addCriterion("sys_upd_datetime in", values, "sysUpdDatetime");
            return (Criteria) this;
        }

        public Criteria andSysUpdDatetimeNotIn(List<Date> values) {
            addCriterion("sys_upd_datetime not in", values, "sysUpdDatetime");
            return (Criteria) this;
        }

        public Criteria andSysUpdDatetimeBetween(Date value1, Date value2) {
            addCriterion("sys_upd_datetime between", value1, value2, "sysUpdDatetime");
            return (Criteria) this;
        }

        public Criteria andSysUpdDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("sys_upd_datetime not between", value1, value2, "sysUpdDatetime");
            return (Criteria) this;
        }

        public Criteria andCommentIsNull() {
            addCriterion("comment is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("comment is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(String value) {
            addCriterion("comment =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(String value) {
            addCriterion("comment <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(String value) {
            addCriterion("comment >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(String value) {
            addCriterion("comment >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(String value) {
            addCriterion("comment <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(String value) {
            addCriterion("comment <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLike(String value) {
            addCriterion("comment like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotLike(String value) {
            addCriterion("comment not like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<String> values) {
            addCriterion("comment in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<String> values) {
            addCriterion("comment not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(String value1, String value2) {
            addCriterion("comment between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(String value1, String value2) {
            addCriterion("comment not between", value1, value2, "comment");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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