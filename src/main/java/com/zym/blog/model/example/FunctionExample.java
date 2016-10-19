package com.zym.blog.model.example;

import java.util.ArrayList;
import java.util.List;

public class FunctionExample {
    protected String pk_name = "function_id";

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FunctionExample() {
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

        public Criteria andFunctionIdIsNull() {
            addCriterion("function_id is null");
            return (Criteria) this;
        }

        public Criteria andFunctionIdIsNotNull() {
            addCriterion("function_id is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionIdEqualTo(Integer value) {
            addCriterion("function_id =", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdNotEqualTo(Integer value) {
            addCriterion("function_id <>", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdGreaterThan(Integer value) {
            addCriterion("function_id >", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("function_id >=", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdLessThan(Integer value) {
            addCriterion("function_id <", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdLessThanOrEqualTo(Integer value) {
            addCriterion("function_id <=", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdIn(List<Integer> values) {
            addCriterion("function_id in", values, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdNotIn(List<Integer> values) {
            addCriterion("function_id not in", values, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdBetween(Integer value1, Integer value2) {
            addCriterion("function_id between", value1, value2, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("function_id not between", value1, value2, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionNameIsNull() {
            addCriterion("function_name is null");
            return (Criteria) this;
        }

        public Criteria andFunctionNameIsNotNull() {
            addCriterion("function_name is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionNameEqualTo(String value) {
            addCriterion("function_name =", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameNotEqualTo(String value) {
            addCriterion("function_name <>", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameGreaterThan(String value) {
            addCriterion("function_name >", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameGreaterThanOrEqualTo(String value) {
            addCriterion("function_name >=", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameLessThan(String value) {
            addCriterion("function_name <", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameLessThanOrEqualTo(String value) {
            addCriterion("function_name <=", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameLike(String value) {
            addCriterion("function_name like", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameNotLike(String value) {
            addCriterion("function_name not like", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameIn(List<String> values) {
            addCriterion("function_name in", values, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameNotIn(List<String> values) {
            addCriterion("function_name not in", values, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameBetween(String value1, String value2) {
            addCriterion("function_name between", value1, value2, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameNotBetween(String value1, String value2) {
            addCriterion("function_name not between", value1, value2, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeIsNull() {
            addCriterion("function_code is null");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeIsNotNull() {
            addCriterion("function_code is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeEqualTo(String value) {
            addCriterion("function_code =", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeNotEqualTo(String value) {
            addCriterion("function_code <>", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeGreaterThan(String value) {
            addCriterion("function_code >", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("function_code >=", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeLessThan(String value) {
            addCriterion("function_code <", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeLessThanOrEqualTo(String value) {
            addCriterion("function_code <=", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeLike(String value) {
            addCriterion("function_code like", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeNotLike(String value) {
            addCriterion("function_code not like", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeIn(List<String> values) {
            addCriterion("function_code in", values, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeNotIn(List<String> values) {
            addCriterion("function_code not in", values, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeBetween(String value1, String value2) {
            addCriterion("function_code between", value1, value2, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeNotBetween(String value1, String value2) {
            addCriterion("function_code not between", value1, value2, "functionCode");
            return (Criteria) this;
        }

        public Criteria andInterceptUrlSuffixIsNull() {
            addCriterion("intercept_url_suffix is null");
            return (Criteria) this;
        }

        public Criteria andInterceptUrlSuffixIsNotNull() {
            addCriterion("intercept_url_suffix is not null");
            return (Criteria) this;
        }

        public Criteria andInterceptUrlSuffixEqualTo(String value) {
            addCriterion("intercept_url_suffix =", value, "interceptUrlSuffix");
            return (Criteria) this;
        }

        public Criteria andInterceptUrlSuffixNotEqualTo(String value) {
            addCriterion("intercept_url_suffix <>", value, "interceptUrlSuffix");
            return (Criteria) this;
        }

        public Criteria andInterceptUrlSuffixGreaterThan(String value) {
            addCriterion("intercept_url_suffix >", value, "interceptUrlSuffix");
            return (Criteria) this;
        }

        public Criteria andInterceptUrlSuffixGreaterThanOrEqualTo(String value) {
            addCriterion("intercept_url_suffix >=", value, "interceptUrlSuffix");
            return (Criteria) this;
        }

        public Criteria andInterceptUrlSuffixLessThan(String value) {
            addCriterion("intercept_url_suffix <", value, "interceptUrlSuffix");
            return (Criteria) this;
        }

        public Criteria andInterceptUrlSuffixLessThanOrEqualTo(String value) {
            addCriterion("intercept_url_suffix <=", value, "interceptUrlSuffix");
            return (Criteria) this;
        }

        public Criteria andInterceptUrlSuffixLike(String value) {
            addCriterion("intercept_url_suffix like", value, "interceptUrlSuffix");
            return (Criteria) this;
        }

        public Criteria andInterceptUrlSuffixNotLike(String value) {
            addCriterion("intercept_url_suffix not like", value, "interceptUrlSuffix");
            return (Criteria) this;
        }

        public Criteria andInterceptUrlSuffixIn(List<String> values) {
            addCriterion("intercept_url_suffix in", values, "interceptUrlSuffix");
            return (Criteria) this;
        }

        public Criteria andInterceptUrlSuffixNotIn(List<String> values) {
            addCriterion("intercept_url_suffix not in", values, "interceptUrlSuffix");
            return (Criteria) this;
        }

        public Criteria andInterceptUrlSuffixBetween(String value1, String value2) {
            addCriterion("intercept_url_suffix between", value1, value2, "interceptUrlSuffix");
            return (Criteria) this;
        }

        public Criteria andInterceptUrlSuffixNotBetween(String value1, String value2) {
            addCriterion("intercept_url_suffix not between", value1, value2, "interceptUrlSuffix");
            return (Criteria) this;
        }

        public Criteria andParentFunctionIdIsNull() {
            addCriterion("parent_function_id is null");
            return (Criteria) this;
        }

        public Criteria andParentFunctionIdIsNotNull() {
            addCriterion("parent_function_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentFunctionIdEqualTo(Integer value) {
            addCriterion("parent_function_id =", value, "parentFunctionId");
            return (Criteria) this;
        }

        public Criteria andParentFunctionIdNotEqualTo(Integer value) {
            addCriterion("parent_function_id <>", value, "parentFunctionId");
            return (Criteria) this;
        }

        public Criteria andParentFunctionIdGreaterThan(Integer value) {
            addCriterion("parent_function_id >", value, "parentFunctionId");
            return (Criteria) this;
        }

        public Criteria andParentFunctionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_function_id >=", value, "parentFunctionId");
            return (Criteria) this;
        }

        public Criteria andParentFunctionIdLessThan(Integer value) {
            addCriterion("parent_function_id <", value, "parentFunctionId");
            return (Criteria) this;
        }

        public Criteria andParentFunctionIdLessThanOrEqualTo(Integer value) {
            addCriterion("parent_function_id <=", value, "parentFunctionId");
            return (Criteria) this;
        }

        public Criteria andParentFunctionIdIn(List<Integer> values) {
            addCriterion("parent_function_id in", values, "parentFunctionId");
            return (Criteria) this;
        }

        public Criteria andParentFunctionIdNotIn(List<Integer> values) {
            addCriterion("parent_function_id not in", values, "parentFunctionId");
            return (Criteria) this;
        }

        public Criteria andParentFunctionIdBetween(Integer value1, Integer value2) {
            addCriterion("parent_function_id between", value1, value2, "parentFunctionId");
            return (Criteria) this;
        }

        public Criteria andParentFunctionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_function_id not between", value1, value2, "parentFunctionId");
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