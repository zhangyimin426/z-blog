package com.zym.blog.model.example;

import java.util.ArrayList;
import java.util.List;

public class PageElementExample {
    protected String pk_name = "page_element_id";

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PageElementExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setPk_name(String pk_name) {
        this.pk_name = pk_name;
    }

    public String getPk_name() {
        return pk_name;
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

        public Criteria andPageElementIdIsNull() {
            addCriterion("page_element_id is null");
            return (Criteria) this;
        }

        public Criteria andPageElementIdIsNotNull() {
            addCriterion("page_element_id is not null");
            return (Criteria) this;
        }

        public Criteria andPageElementIdEqualTo(Integer value) {
            addCriterion("page_element_id =", value, "pageElementId");
            return (Criteria) this;
        }

        public Criteria andPageElementIdNotEqualTo(Integer value) {
            addCriterion("page_element_id <>", value, "pageElementId");
            return (Criteria) this;
        }

        public Criteria andPageElementIdGreaterThan(Integer value) {
            addCriterion("page_element_id >", value, "pageElementId");
            return (Criteria) this;
        }

        public Criteria andPageElementIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("page_element_id >=", value, "pageElementId");
            return (Criteria) this;
        }

        public Criteria andPageElementIdLessThan(Integer value) {
            addCriterion("page_element_id <", value, "pageElementId");
            return (Criteria) this;
        }

        public Criteria andPageElementIdLessThanOrEqualTo(Integer value) {
            addCriterion("page_element_id <=", value, "pageElementId");
            return (Criteria) this;
        }

        public Criteria andPageElementIdIn(List<Integer> values) {
            addCriterion("page_element_id in", values, "pageElementId");
            return (Criteria) this;
        }

        public Criteria andPageElementIdNotIn(List<Integer> values) {
            addCriterion("page_element_id not in", values, "pageElementId");
            return (Criteria) this;
        }

        public Criteria andPageElementIdBetween(Integer value1, Integer value2) {
            addCriterion("page_element_id between", value1, value2, "pageElementId");
            return (Criteria) this;
        }

        public Criteria andPageElementIdNotBetween(Integer value1, Integer value2) {
            addCriterion("page_element_id not between", value1, value2, "pageElementId");
            return (Criteria) this;
        }

        public Criteria andPageElementCodeIsNull() {
            addCriterion("page_element_code is null");
            return (Criteria) this;
        }

        public Criteria andPageElementCodeIsNotNull() {
            addCriterion("page_element_code is not null");
            return (Criteria) this;
        }

        public Criteria andPageElementCodeEqualTo(String value) {
            addCriterion("page_element_code =", value, "pageElementCode");
            return (Criteria) this;
        }

        public Criteria andPageElementCodeNotEqualTo(String value) {
            addCriterion("page_element_code <>", value, "pageElementCode");
            return (Criteria) this;
        }

        public Criteria andPageElementCodeGreaterThan(String value) {
            addCriterion("page_element_code >", value, "pageElementCode");
            return (Criteria) this;
        }

        public Criteria andPageElementCodeGreaterThanOrEqualTo(String value) {
            addCriterion("page_element_code >=", value, "pageElementCode");
            return (Criteria) this;
        }

        public Criteria andPageElementCodeLessThan(String value) {
            addCriterion("page_element_code <", value, "pageElementCode");
            return (Criteria) this;
        }

        public Criteria andPageElementCodeLessThanOrEqualTo(String value) {
            addCriterion("page_element_code <=", value, "pageElementCode");
            return (Criteria) this;
        }

        public Criteria andPageElementCodeLike(String value) {
            addCriterion("page_element_code like", value, "pageElementCode");
            return (Criteria) this;
        }

        public Criteria andPageElementCodeNotLike(String value) {
            addCriterion("page_element_code not like", value, "pageElementCode");
            return (Criteria) this;
        }

        public Criteria andPageElementCodeIn(List<String> values) {
            addCriterion("page_element_code in", values, "pageElementCode");
            return (Criteria) this;
        }

        public Criteria andPageElementCodeNotIn(List<String> values) {
            addCriterion("page_element_code not in", values, "pageElementCode");
            return (Criteria) this;
        }

        public Criteria andPageElementCodeBetween(String value1, String value2) {
            addCriterion("page_element_code between", value1, value2, "pageElementCode");
            return (Criteria) this;
        }

        public Criteria andPageElementCodeNotBetween(String value1, String value2) {
            addCriterion("page_element_code not between", value1, value2, "pageElementCode");
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