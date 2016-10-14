package com.zym.blog.model.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LikeExample {
    protected String pk_name = "like_id";

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LikeExample() {
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

        public Criteria andLikeIdIsNull() {
            addCriterion("like_id is null");
            return (Criteria) this;
        }

        public Criteria andLikeIdIsNotNull() {
            addCriterion("like_id is not null");
            return (Criteria) this;
        }

        public Criteria andLikeIdEqualTo(Integer value) {
            addCriterion("like_id =", value, "likeId");
            return (Criteria) this;
        }

        public Criteria andLikeIdNotEqualTo(Integer value) {
            addCriterion("like_id <>", value, "likeId");
            return (Criteria) this;
        }

        public Criteria andLikeIdGreaterThan(Integer value) {
            addCriterion("like_id >", value, "likeId");
            return (Criteria) this;
        }

        public Criteria andLikeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("like_id >=", value, "likeId");
            return (Criteria) this;
        }

        public Criteria andLikeIdLessThan(Integer value) {
            addCriterion("like_id <", value, "likeId");
            return (Criteria) this;
        }

        public Criteria andLikeIdLessThanOrEqualTo(Integer value) {
            addCriterion("like_id <=", value, "likeId");
            return (Criteria) this;
        }

        public Criteria andLikeIdIn(List<Integer> values) {
            addCriterion("like_id in", values, "likeId");
            return (Criteria) this;
        }

        public Criteria andLikeIdNotIn(List<Integer> values) {
            addCriterion("like_id not in", values, "likeId");
            return (Criteria) this;
        }

        public Criteria andLikeIdBetween(Integer value1, Integer value2) {
            addCriterion("like_id between", value1, value2, "likeId");
            return (Criteria) this;
        }

        public Criteria andLikeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("like_id not between", value1, value2, "likeId");
            return (Criteria) this;
        }

        public Criteria andLikeManIsNull() {
            addCriterion("like_man is null");
            return (Criteria) this;
        }

        public Criteria andLikeManIsNotNull() {
            addCriterion("like_man is not null");
            return (Criteria) this;
        }

        public Criteria andLikeManEqualTo(String value) {
            addCriterion("like_man =", value, "likeMan");
            return (Criteria) this;
        }

        public Criteria andLikeManNotEqualTo(String value) {
            addCriterion("like_man <>", value, "likeMan");
            return (Criteria) this;
        }

        public Criteria andLikeManGreaterThan(String value) {
            addCriterion("like_man >", value, "likeMan");
            return (Criteria) this;
        }

        public Criteria andLikeManGreaterThanOrEqualTo(String value) {
            addCriterion("like_man >=", value, "likeMan");
            return (Criteria) this;
        }

        public Criteria andLikeManLessThan(String value) {
            addCriterion("like_man <", value, "likeMan");
            return (Criteria) this;
        }

        public Criteria andLikeManLessThanOrEqualTo(String value) {
            addCriterion("like_man <=", value, "likeMan");
            return (Criteria) this;
        }

        public Criteria andLikeManLike(String value) {
            addCriterion("like_man like", value, "likeMan");
            return (Criteria) this;
        }

        public Criteria andLikeManNotLike(String value) {
            addCriterion("like_man not like", value, "likeMan");
            return (Criteria) this;
        }

        public Criteria andLikeManIn(List<String> values) {
            addCriterion("like_man in", values, "likeMan");
            return (Criteria) this;
        }

        public Criteria andLikeManNotIn(List<String> values) {
            addCriterion("like_man not in", values, "likeMan");
            return (Criteria) this;
        }

        public Criteria andLikeManBetween(String value1, String value2) {
            addCriterion("like_man between", value1, value2, "likeMan");
            return (Criteria) this;
        }

        public Criteria andLikeManNotBetween(String value1, String value2) {
            addCriterion("like_man not between", value1, value2, "likeMan");
            return (Criteria) this;
        }

        public Criteria andLikeTimeIsNull() {
            addCriterion("like_time is null");
            return (Criteria) this;
        }

        public Criteria andLikeTimeIsNotNull() {
            addCriterion("like_time is not null");
            return (Criteria) this;
        }

        public Criteria andLikeTimeEqualTo(Date value) {
            addCriterion("like_time =", value, "likeTime");
            return (Criteria) this;
        }

        public Criteria andLikeTimeNotEqualTo(Date value) {
            addCriterion("like_time <>", value, "likeTime");
            return (Criteria) this;
        }

        public Criteria andLikeTimeGreaterThan(Date value) {
            addCriterion("like_time >", value, "likeTime");
            return (Criteria) this;
        }

        public Criteria andLikeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("like_time >=", value, "likeTime");
            return (Criteria) this;
        }

        public Criteria andLikeTimeLessThan(Date value) {
            addCriterion("like_time <", value, "likeTime");
            return (Criteria) this;
        }

        public Criteria andLikeTimeLessThanOrEqualTo(Date value) {
            addCriterion("like_time <=", value, "likeTime");
            return (Criteria) this;
        }

        public Criteria andLikeTimeIn(List<Date> values) {
            addCriterion("like_time in", values, "likeTime");
            return (Criteria) this;
        }

        public Criteria andLikeTimeNotIn(List<Date> values) {
            addCriterion("like_time not in", values, "likeTime");
            return (Criteria) this;
        }

        public Criteria andLikeTimeBetween(Date value1, Date value2) {
            addCriterion("like_time between", value1, value2, "likeTime");
            return (Criteria) this;
        }

        public Criteria andLikeTimeNotBetween(Date value1, Date value2) {
            addCriterion("like_time not between", value1, value2, "likeTime");
            return (Criteria) this;
        }

        public Criteria andLikeIpIsNull() {
            addCriterion("like_ip is null");
            return (Criteria) this;
        }

        public Criteria andLikeIpIsNotNull() {
            addCriterion("like_ip is not null");
            return (Criteria) this;
        }

        public Criteria andLikeIpEqualTo(String value) {
            addCriterion("like_ip =", value, "likeIp");
            return (Criteria) this;
        }

        public Criteria andLikeIpNotEqualTo(String value) {
            addCriterion("like_ip <>", value, "likeIp");
            return (Criteria) this;
        }

        public Criteria andLikeIpGreaterThan(String value) {
            addCriterion("like_ip >", value, "likeIp");
            return (Criteria) this;
        }

        public Criteria andLikeIpGreaterThanOrEqualTo(String value) {
            addCriterion("like_ip >=", value, "likeIp");
            return (Criteria) this;
        }

        public Criteria andLikeIpLessThan(String value) {
            addCriterion("like_ip <", value, "likeIp");
            return (Criteria) this;
        }

        public Criteria andLikeIpLessThanOrEqualTo(String value) {
            addCriterion("like_ip <=", value, "likeIp");
            return (Criteria) this;
        }

        public Criteria andLikeIpLike(String value) {
            addCriterion("like_ip like", value, "likeIp");
            return (Criteria) this;
        }

        public Criteria andLikeIpNotLike(String value) {
            addCriterion("like_ip not like", value, "likeIp");
            return (Criteria) this;
        }

        public Criteria andLikeIpIn(List<String> values) {
            addCriterion("like_ip in", values, "likeIp");
            return (Criteria) this;
        }

        public Criteria andLikeIpNotIn(List<String> values) {
            addCriterion("like_ip not in", values, "likeIp");
            return (Criteria) this;
        }

        public Criteria andLikeIpBetween(String value1, String value2) {
            addCriterion("like_ip between", value1, value2, "likeIp");
            return (Criteria) this;
        }

        public Criteria andLikeIpNotBetween(String value1, String value2) {
            addCriterion("like_ip not between", value1, value2, "likeIp");
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