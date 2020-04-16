package com.hd.entity.generator;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import java.math.BigInteger;


/**
@author Robot
*/
public class MlsdOnlineServiceExample implements Serializable
{

    private static final long serialVersionUID = 1L;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Integer limitStart = -1;

    public Integer limitEnd = -1;

	public ColumnName columnName=null;
	
    public MlsdOnlineServiceExample()
    {
        oredCriteria = new ArrayList<Criteria>();
    }

    public String getOrderByClause()
    {
        return orderByClause;
    }

    public void setOrderByClause(String orderByClause)
    {
        this.orderByClause = orderByClause;
    }

    public boolean getDistinct()
    {
        return distinct;
    }

    public void setDistinct(boolean distinct)
    {
        this.distinct = distinct;
    }

    public List<Criteria> getOredCriteria()
    {
        return oredCriteria;
    }

    public void setLimitStart(Integer limitStart)
    {
        this.limitStart = limitStart;
    }

    public void setLimitEnd(Integer limitEnd)
    {
        this.limitEnd = limitEnd;
    }

    public void or(Criteria criteria)
    {
        oredCriteria.add(criteria);
    }

    public Criteria or()
    {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria()
    {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0)
        {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal()
    {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear()
    {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
        limitStart = -1;
        limitEnd = -1;
    }

    public void setPage(int pageIndex, int pageSize)
    {
        this.setLimitStart((pageIndex - 1) * pageSize);
        this.setLimitEnd(pageSize);
    }

    protected abstract static class GeneratedCriteria  implements Serializable
    {

        private static final long serialVersionUID = 1L;


        protected List<Criterion> criteria;

         protected GeneratedCriteria()
         {
             super();
             this.criteria = new ArrayList<Criterion>();
         }

         public boolean isValid()
         {
             return this.criteria.size() > 0;
         }

         public List<Criterion> getAllCriteria()
         {
             return this.criteria;
         }

         public List<Criterion> getCriteria()
         {
             return this.criteria;
         }

         protected void addCriterion(String condition)
         {
             if (condition == null)
             {
                 throw new RuntimeException("Value for condition cannot be null");
             }
             this.criteria.add(new Criterion(condition));
         }

         protected void addCriterion(String condition, Object value, String property)
         {
             if (value == null)
             {
                 throw new RuntimeException("Value for " + property + " cannot be null");
             }
             this.criteria.add(new Criterion(condition, value));
         }

         protected void addCriterion(String condition, Object value1, Object value2, String property)
         {
             if (value1 == null|| value2 == null)
             {
                 throw new RuntimeException("Between values for " + property + " cannot be null");
             }
             this.criteria.add(new Criterion(condition, value1, value2));
         }
         public Criteria andIdIsNull()
         {
              addCriterion("id is null");
              return (Criteria) this;
         }

         public Criteria andIdIsNotNull()
         {
              addCriterion("id  is not null");
              return (Criteria) this;
         }

         public Criteria andIdEqualTo(String value)
         {
              addCriterion("id  = ", value, "id ");
              return (Criteria) this;
         }

         public Criteria andIdNotEqualTo(String value)
         {
              addCriterion("id  <> ", value, "id ");
              return (Criteria) this;
         }

         public Criteria andIdGreaterThan(String value)
         {
              addCriterion("id  > ", value, "id ");
              return (Criteria) this;
         }

         public Criteria andIdGreaterThanOrEqualTo(String value)
         {
              addCriterion("id  >= ", value, "id ");
              return (Criteria) this;
         }

         public Criteria andIdLessThan(String value)
         {
              addCriterion("id  < ", value, "id ");
              return (Criteria) this;
         }

         public Criteria andIdLessThanOrEqualTo(String value)
         {
              addCriterion("id  <= ", value, "id ");
              return (Criteria) this;
         }

         public Criteria andIdLike(String value)
         {
              addCriterion("id  like ", value, "id ");
              return (Criteria) this;
         }

         public Criteria andIdNotLike(String value)
         {
              addCriterion("id  not like ", value, "id ");
              return (Criteria) this;
         }

         public Criteria andIdIn(List<String> values)
         {
              addCriterion("id  in ", values, "id ");
              return (Criteria) this;
         }

         public Criteria andIdNotIn(List<String> values)
         {
              addCriterion("id  not in ", values, "id ");
              return (Criteria) this;
         }

         public Criteria andIdBetween(String value1, String value2)
         {
              addCriterion("id  between ", value1,value2, "id ");
              return (Criteria) this;
         }

         public Criteria andIdNotBetween(String value1, String value2)
         {
              addCriterion("id  not between ", value1,value2, "id ");
              return (Criteria) this;
         }
         public Criteria andOnlineIconLeftIsNull()
         {
              addCriterion("online_icon_left is null");
              return (Criteria) this;
         }

         public Criteria andOnlineIconLeftIsNotNull()
         {
              addCriterion("online_icon_left  is not null");
              return (Criteria) this;
         }

         public Criteria andOnlineIconLeftEqualTo(String value)
         {
              addCriterion("online_icon_left  = ", value, "online_icon_left ");
              return (Criteria) this;
         }

         public Criteria andOnlineIconLeftNotEqualTo(String value)
         {
              addCriterion("online_icon_left  <> ", value, "online_icon_left ");
              return (Criteria) this;
         }

         public Criteria andOnlineIconLeftGreaterThan(String value)
         {
              addCriterion("online_icon_left  > ", value, "online_icon_left ");
              return (Criteria) this;
         }

         public Criteria andOnlineIconLeftGreaterThanOrEqualTo(String value)
         {
              addCriterion("online_icon_left  >= ", value, "online_icon_left ");
              return (Criteria) this;
         }

         public Criteria andOnlineIconLeftLessThan(String value)
         {
              addCriterion("online_icon_left  < ", value, "online_icon_left ");
              return (Criteria) this;
         }

         public Criteria andOnlineIconLeftLessThanOrEqualTo(String value)
         {
              addCriterion("online_icon_left  <= ", value, "online_icon_left ");
              return (Criteria) this;
         }

         public Criteria andOnlineIconLeftLike(String value)
         {
              addCriterion("online_icon_left  like ", value, "online_icon_left ");
              return (Criteria) this;
         }

         public Criteria andOnlineIconLeftNotLike(String value)
         {
              addCriterion("online_icon_left  not like ", value, "online_icon_left ");
              return (Criteria) this;
         }

         public Criteria andOnlineIconLeftIn(List<String> values)
         {
              addCriterion("online_icon_left  in ", values, "online_icon_left ");
              return (Criteria) this;
         }

         public Criteria andOnlineIconLeftNotIn(List<String> values)
         {
              addCriterion("online_icon_left  not in ", values, "online_icon_left ");
              return (Criteria) this;
         }

         public Criteria andOnlineIconLeftBetween(String value1, String value2)
         {
              addCriterion("online_icon_left  between ", value1,value2, "online_icon_left ");
              return (Criteria) this;
         }

         public Criteria andOnlineIconLeftNotBetween(String value1, String value2)
         {
              addCriterion("online_icon_left  not between ", value1,value2, "online_icon_left ");
              return (Criteria) this;
         }
         public Criteria andOnlineIconRightIsNull()
         {
              addCriterion("online_icon_right is null");
              return (Criteria) this;
         }

         public Criteria andOnlineIconRightIsNotNull()
         {
              addCriterion("online_icon_right  is not null");
              return (Criteria) this;
         }

         public Criteria andOnlineIconRightEqualTo(String value)
         {
              addCriterion("online_icon_right  = ", value, "online_icon_right ");
              return (Criteria) this;
         }

         public Criteria andOnlineIconRightNotEqualTo(String value)
         {
              addCriterion("online_icon_right  <> ", value, "online_icon_right ");
              return (Criteria) this;
         }

         public Criteria andOnlineIconRightGreaterThan(String value)
         {
              addCriterion("online_icon_right  > ", value, "online_icon_right ");
              return (Criteria) this;
         }

         public Criteria andOnlineIconRightGreaterThanOrEqualTo(String value)
         {
              addCriterion("online_icon_right  >= ", value, "online_icon_right ");
              return (Criteria) this;
         }

         public Criteria andOnlineIconRightLessThan(String value)
         {
              addCriterion("online_icon_right  < ", value, "online_icon_right ");
              return (Criteria) this;
         }

         public Criteria andOnlineIconRightLessThanOrEqualTo(String value)
         {
              addCriterion("online_icon_right  <= ", value, "online_icon_right ");
              return (Criteria) this;
         }

         public Criteria andOnlineIconRightLike(String value)
         {
              addCriterion("online_icon_right  like ", value, "online_icon_right ");
              return (Criteria) this;
         }

         public Criteria andOnlineIconRightNotLike(String value)
         {
              addCriterion("online_icon_right  not like ", value, "online_icon_right ");
              return (Criteria) this;
         }

         public Criteria andOnlineIconRightIn(List<String> values)
         {
              addCriterion("online_icon_right  in ", values, "online_icon_right ");
              return (Criteria) this;
         }

         public Criteria andOnlineIconRightNotIn(List<String> values)
         {
              addCriterion("online_icon_right  not in ", values, "online_icon_right ");
              return (Criteria) this;
         }

         public Criteria andOnlineIconRightBetween(String value1, String value2)
         {
              addCriterion("online_icon_right  between ", value1,value2, "online_icon_right ");
              return (Criteria) this;
         }

         public Criteria andOnlineIconRightNotBetween(String value1, String value2)
         {
              addCriterion("online_icon_right  not between ", value1,value2, "online_icon_right ");
              return (Criteria) this;
         }
		public Criteria andCustomSql(String value)
        {
            addCriterion("custom", value, "CUSTOMSQL");
            return (Criteria) this;
        }
    }

	
	
	 public static class ColumnName implements Serializable
    {

        private static final long serialVersionUID = 1L;

        public String quereyColumnNameStr="";		

		public ColumnName addIdColumn()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="id";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",id";
            }
            return this;
        }

		public ColumnName addOnlineIconLeftColumn()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="online_icon_left";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",online_icon_left";
            }
            return this;
        }

		public ColumnName addOnlineIconRightColumn()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="online_icon_right";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",online_icon_right";
            }
            return this;
        }
	}
	
    public static class Criteria extends GeneratedCriteria implements Serializable
    {

        private static final long serialVersionUID = 1L;

        protected Criteria()
        {
            super();
        }
    }
    public static class Criterion implements Serializable
    {

        private static final long serialVersionUID = 1L;

        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;
		//�Զ���SQL
		private boolean customValue;

        public boolean isCustomValue()
        {
            return this.customValue;
        }
        public String getCondition()
        {
            return this.condition;
        }

        public Object getValue()
        {
            return this.value;
        }

        public Object getSecondValue()
        {
            return this.secondValue;
        }

        public boolean isNoValue()
        {
            return this.noValue;
        }

        public boolean isSingleValue()
        {
            return this.singleValue;
        }

        public boolean isBetweenValue()
        {
            return this.betweenValue;
        }

        public boolean isListValue()
        {
            return this.listValue;
        }

        public String getTypeHandler()
        {
            return this.typeHandler;
        }

        protected Criterion(String condition)
        {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler)
        {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
			if ("custom".equals(condition))
            {
                this.customValue = true;
            }
            else if (value instanceof List<?>)
            {
                this.listValue = true;
            }
            else
            {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value)
        {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler)
        {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue)
        {
            this(condition, value, secondValue, null);
        }
    }
	 public ColumnName createColumnName()
    {
        if (this.columnName == null)
        {
            return this.columnName = new ColumnName();
        }
        return this.columnName;
    }
}
