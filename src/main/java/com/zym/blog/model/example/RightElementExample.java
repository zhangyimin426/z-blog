package com.zym.blog.model.example;

import java.util.ArrayList;
import java.util.List;

public class RightElementExample {
    protected String pk_name = "right_element_id";

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RightElementExample() {
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

        public Criteria andRightElementIdIsNull() {
            addCriterion("right_element_id is null");
            return (Criteria) this;
        }

        public Criteria andRightElementIdIsNotNull() {
            addCriterion("right_element_id is not null");
            return (Criteria) this;
        }

        public Criteria andRightElementIdEqualTo(Integer value) {
            addCriterion("right_element_id =", value, "rightElementId");
            return (Criteria) this;
        }

        public Criteria andRightElementIdNotEqualTo(Integer value) {
            addCriterion("right_element_id <>", value, "rightElementId");
            return (Criteria) this;
        }

        public Criteria andRightElementIdGreaterThan(Integer value) {
            addCriterion("right_element_id >", value, "rightElementId");
            return (Criteria) this;
        }

        public Criteria andRightElementIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("right_element_id >=", value, "rightElementId");
            return (Criteria) this;
        }

        public Criteria andRightElementIdLessThan(Integer value) {
            addCriterion("right_element_id <", value, "rightElementId");
            return (Criteria) this;
        }

        public Criteria andRightElementIdLessThanOrEqualTo(Integer value) {
            addCriterion("right_element_id <=", value, "rightElementId");
            return (Criteria) this;
        }

        public Criteria andRightElementIdIn(List<Integer> values) {
            addCriterion("right_element_id in", values, "rightElementId");
            return (Criteria) this;
        }

        public Criteria andRightElementIdNotIn(List<Integer> values) {
            addCriterion("right_element_id not in", values, "rightElementId");
            return (Criteria) this;
        }

        public Criteria andRightElementIdBetween(Integer value1, Integer value2) {
            addCriterion("right_element_id between", value1, value2, "rightElementId");
            return (Criteria) this;
        }

        public Criteria andRightElementIdNotBetween(Integer value1, Integer value2) {
            addCriterion("right_element_id not between", value1, value2, "rightElementId");
            return (Criteria) this;
        }

        public Criteria andRightIdIsNull() {
            addCriterion("right_id is null");
            return (Criteria) this;
        }

        public Criteria andRightIdIsNotNull() {
            addCriterion("right_id is not null");
            return (Criteria) this;
        }

        public Criteria andRightIdEqualTo(Integer value) {
            addCriterion("right_id =", value, "rightId");
            return (Criteria) this;
        }

        public Criteria andRightIdNotEqualTo(Integer value) {
            addCriterion("right_id <>", value, "rightId");
            return (Criteria) this;
        }

        public Criteria andRightIdGreaterThan(Integer value) {
            addCriterion("right_id >", value, "rightId");
            return (Criteria) this;
        }

        public Criteria andRightIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("right_id >=", value, "rightId");
            return (Criteria) this;
        }

        public Criteria andRightIdLessThan(Integer value) {
            addCriterion("right_id <", value, "rightId");
            return (Criteria) this;
        }

        public Criteria andRightIdLessThanOrEqualTo(Integer value) {
            addCriterion("right_id <=", value, "rightId");
            return (Criteria) this;
        }

        public Criteria andRightIdIn(List<Integer> values) {
            addCriterion("right_id in", values, "rightId");
            return (Criteria) this;
        }

        public Criteria andRightIdNotIn(List<Integer> values) {
            addCriterion("right_id not in", values, "rightId");
            return (Criteria) this;
        }

        public Criteria andRightIdBetween(Integer value1, Integer value2) {
            addCriterion("right_id between", value1, value2, "rightId");
            return (Criteria) this;
        }

        public Criteria andRightIdNotBetween(Integer value1, Integer value2) {
            addCriterion("right_id not between", value1, value2, "rightId");
            return (Criteria) this;
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