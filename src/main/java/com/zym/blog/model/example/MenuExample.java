package com.zym.blog.model.example;

import java.util.ArrayList;
import java.util.List;

public class MenuExample {
    protected String pk_name = "meun_id";

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MenuExample() {
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

        public Criteria andMeunIdIsNull() {
            addCriterion("meun_id is null");
            return (Criteria) this;
        }

        public Criteria andMeunIdIsNotNull() {
            addCriterion("meun_id is not null");
            return (Criteria) this;
        }

        public Criteria andMeunIdEqualTo(Integer value) {
            addCriterion("meun_id =", value, "meunId");
            return (Criteria) this;
        }

        public Criteria andMeunIdNotEqualTo(Integer value) {
            addCriterion("meun_id <>", value, "meunId");
            return (Criteria) this;
        }

        public Criteria andMeunIdGreaterThan(Integer value) {
            addCriterion("meun_id >", value, "meunId");
            return (Criteria) this;
        }

        public Criteria andMeunIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("meun_id >=", value, "meunId");
            return (Criteria) this;
        }

        public Criteria andMeunIdLessThan(Integer value) {
            addCriterion("meun_id <", value, "meunId");
            return (Criteria) this;
        }

        public Criteria andMeunIdLessThanOrEqualTo(Integer value) {
            addCriterion("meun_id <=", value, "meunId");
            return (Criteria) this;
        }

        public Criteria andMeunIdIn(List<Integer> values) {
            addCriterion("meun_id in", values, "meunId");
            return (Criteria) this;
        }

        public Criteria andMeunIdNotIn(List<Integer> values) {
            addCriterion("meun_id not in", values, "meunId");
            return (Criteria) this;
        }

        public Criteria andMeunIdBetween(Integer value1, Integer value2) {
            addCriterion("meun_id between", value1, value2, "meunId");
            return (Criteria) this;
        }

        public Criteria andMeunIdNotBetween(Integer value1, Integer value2) {
            addCriterion("meun_id not between", value1, value2, "meunId");
            return (Criteria) this;
        }

        public Criteria andMeunNameIsNull() {
            addCriterion("meun_name is null");
            return (Criteria) this;
        }

        public Criteria andMeunNameIsNotNull() {
            addCriterion("meun_name is not null");
            return (Criteria) this;
        }

        public Criteria andMeunNameEqualTo(String value) {
            addCriterion("meun_name =", value, "meunName");
            return (Criteria) this;
        }

        public Criteria andMeunNameNotEqualTo(String value) {
            addCriterion("meun_name <>", value, "meunName");
            return (Criteria) this;
        }

        public Criteria andMeunNameGreaterThan(String value) {
            addCriterion("meun_name >", value, "meunName");
            return (Criteria) this;
        }

        public Criteria andMeunNameGreaterThanOrEqualTo(String value) {
            addCriterion("meun_name >=", value, "meunName");
            return (Criteria) this;
        }

        public Criteria andMeunNameLessThan(String value) {
            addCriterion("meun_name <", value, "meunName");
            return (Criteria) this;
        }

        public Criteria andMeunNameLessThanOrEqualTo(String value) {
            addCriterion("meun_name <=", value, "meunName");
            return (Criteria) this;
        }

        public Criteria andMeunNameLike(String value) {
            addCriterion("meun_name like", value, "meunName");
            return (Criteria) this;
        }

        public Criteria andMeunNameNotLike(String value) {
            addCriterion("meun_name not like", value, "meunName");
            return (Criteria) this;
        }

        public Criteria andMeunNameIn(List<String> values) {
            addCriterion("meun_name in", values, "meunName");
            return (Criteria) this;
        }

        public Criteria andMeunNameNotIn(List<String> values) {
            addCriterion("meun_name not in", values, "meunName");
            return (Criteria) this;
        }

        public Criteria andMeunNameBetween(String value1, String value2) {
            addCriterion("meun_name between", value1, value2, "meunName");
            return (Criteria) this;
        }

        public Criteria andMeunNameNotBetween(String value1, String value2) {
            addCriterion("meun_name not between", value1, value2, "meunName");
            return (Criteria) this;
        }

        public Criteria andMeunUrlIsNull() {
            addCriterion("meun_url is null");
            return (Criteria) this;
        }

        public Criteria andMeunUrlIsNotNull() {
            addCriterion("meun_url is not null");
            return (Criteria) this;
        }

        public Criteria andMeunUrlEqualTo(String value) {
            addCriterion("meun_url =", value, "meunUrl");
            return (Criteria) this;
        }

        public Criteria andMeunUrlNotEqualTo(String value) {
            addCriterion("meun_url <>", value, "meunUrl");
            return (Criteria) this;
        }

        public Criteria andMeunUrlGreaterThan(String value) {
            addCriterion("meun_url >", value, "meunUrl");
            return (Criteria) this;
        }

        public Criteria andMeunUrlGreaterThanOrEqualTo(String value) {
            addCriterion("meun_url >=", value, "meunUrl");
            return (Criteria) this;
        }

        public Criteria andMeunUrlLessThan(String value) {
            addCriterion("meun_url <", value, "meunUrl");
            return (Criteria) this;
        }

        public Criteria andMeunUrlLessThanOrEqualTo(String value) {
            addCriterion("meun_url <=", value, "meunUrl");
            return (Criteria) this;
        }

        public Criteria andMeunUrlLike(String value) {
            addCriterion("meun_url like", value, "meunUrl");
            return (Criteria) this;
        }

        public Criteria andMeunUrlNotLike(String value) {
            addCriterion("meun_url not like", value, "meunUrl");
            return (Criteria) this;
        }

        public Criteria andMeunUrlIn(List<String> values) {
            addCriterion("meun_url in", values, "meunUrl");
            return (Criteria) this;
        }

        public Criteria andMeunUrlNotIn(List<String> values) {
            addCriterion("meun_url not in", values, "meunUrl");
            return (Criteria) this;
        }

        public Criteria andMeunUrlBetween(String value1, String value2) {
            addCriterion("meun_url between", value1, value2, "meunUrl");
            return (Criteria) this;
        }

        public Criteria andMeunUrlNotBetween(String value1, String value2) {
            addCriterion("meun_url not between", value1, value2, "meunUrl");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdIsNull() {
            addCriterion("parent_menu_id is null");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdIsNotNull() {
            addCriterion("parent_menu_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdEqualTo(Integer value) {
            addCriterion("parent_menu_id =", value, "parentMenuId");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdNotEqualTo(Integer value) {
            addCriterion("parent_menu_id <>", value, "parentMenuId");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdGreaterThan(Integer value) {
            addCriterion("parent_menu_id >", value, "parentMenuId");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_menu_id >=", value, "parentMenuId");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdLessThan(Integer value) {
            addCriterion("parent_menu_id <", value, "parentMenuId");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdLessThanOrEqualTo(Integer value) {
            addCriterion("parent_menu_id <=", value, "parentMenuId");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdIn(List<Integer> values) {
            addCriterion("parent_menu_id in", values, "parentMenuId");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdNotIn(List<Integer> values) {
            addCriterion("parent_menu_id not in", values, "parentMenuId");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdBetween(Integer value1, Integer value2) {
            addCriterion("parent_menu_id between", value1, value2, "parentMenuId");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_menu_id not between", value1, value2, "parentMenuId");
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