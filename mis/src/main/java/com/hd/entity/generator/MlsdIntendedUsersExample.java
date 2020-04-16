package com.hd.entity.generator;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import java.math.BigInteger;


/**
@author Robot
*/
public class MlsdIntendedUsersExample implements Serializable
{

    private static final long serialVersionUID = 1L;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Integer limitStart = -1;

    public Integer limitEnd = -1;

	public ColumnName columnName=null;
	
    public MlsdIntendedUsersExample()
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
         public Criteria andUserNameIsNull()
         {
              addCriterion("user_name is null");
              return (Criteria) this;
         }

         public Criteria andUserNameIsNotNull()
         {
              addCriterion("user_name  is not null");
              return (Criteria) this;
         }

         public Criteria andUserNameEqualTo(String value)
         {
              addCriterion("user_name  = ", value, "user_name ");
              return (Criteria) this;
         }

         public Criteria andUserNameNotEqualTo(String value)
         {
              addCriterion("user_name  <> ", value, "user_name ");
              return (Criteria) this;
         }

         public Criteria andUserNameGreaterThan(String value)
         {
              addCriterion("user_name  > ", value, "user_name ");
              return (Criteria) this;
         }

         public Criteria andUserNameGreaterThanOrEqualTo(String value)
         {
              addCriterion("user_name  >= ", value, "user_name ");
              return (Criteria) this;
         }

         public Criteria andUserNameLessThan(String value)
         {
              addCriterion("user_name  < ", value, "user_name ");
              return (Criteria) this;
         }

         public Criteria andUserNameLessThanOrEqualTo(String value)
         {
              addCriterion("user_name  <= ", value, "user_name ");
              return (Criteria) this;
         }

         public Criteria andUserNameLike(String value)
         {
              addCriterion("user_name  like ", value, "user_name ");
              return (Criteria) this;
         }

         public Criteria andUserNameNotLike(String value)
         {
              addCriterion("user_name  not like ", value, "user_name ");
              return (Criteria) this;
         }

         public Criteria andUserNameIn(List<String> values)
         {
              addCriterion("user_name  in ", values, "user_name ");
              return (Criteria) this;
         }

         public Criteria andUserNameNotIn(List<String> values)
         {
              addCriterion("user_name  not in ", values, "user_name ");
              return (Criteria) this;
         }

         public Criteria andUserNameBetween(String value1, String value2)
         {
              addCriterion("user_name  between ", value1,value2, "user_name ");
              return (Criteria) this;
         }

         public Criteria andUserNameNotBetween(String value1, String value2)
         {
              addCriterion("user_name  not between ", value1,value2, "user_name ");
              return (Criteria) this;
         }
         public Criteria andTelIsNull()
         {
              addCriterion("tel is null");
              return (Criteria) this;
         }

         public Criteria andTelIsNotNull()
         {
              addCriterion("tel  is not null");
              return (Criteria) this;
         }

         public Criteria andTelEqualTo(String value)
         {
              addCriterion("tel  = ", value, "tel ");
              return (Criteria) this;
         }

         public Criteria andTelNotEqualTo(String value)
         {
              addCriterion("tel  <> ", value, "tel ");
              return (Criteria) this;
         }

         public Criteria andTelGreaterThan(String value)
         {
              addCriterion("tel  > ", value, "tel ");
              return (Criteria) this;
         }

         public Criteria andTelGreaterThanOrEqualTo(String value)
         {
              addCriterion("tel  >= ", value, "tel ");
              return (Criteria) this;
         }

         public Criteria andTelLessThan(String value)
         {
              addCriterion("tel  < ", value, "tel ");
              return (Criteria) this;
         }

         public Criteria andTelLessThanOrEqualTo(String value)
         {
              addCriterion("tel  <= ", value, "tel ");
              return (Criteria) this;
         }

         public Criteria andTelLike(String value)
         {
              addCriterion("tel  like ", value, "tel ");
              return (Criteria) this;
         }

         public Criteria andTelNotLike(String value)
         {
              addCriterion("tel  not like ", value, "tel ");
              return (Criteria) this;
         }

         public Criteria andTelIn(List<String> values)
         {
              addCriterion("tel  in ", values, "tel ");
              return (Criteria) this;
         }

         public Criteria andTelNotIn(List<String> values)
         {
              addCriterion("tel  not in ", values, "tel ");
              return (Criteria) this;
         }

         public Criteria andTelBetween(String value1, String value2)
         {
              addCriterion("tel  between ", value1,value2, "tel ");
              return (Criteria) this;
         }

         public Criteria andTelNotBetween(String value1, String value2)
         {
              addCriterion("tel  not between ", value1,value2, "tel ");
              return (Criteria) this;
         }
         public Criteria andCreateTimeIsNull()
         {
              addCriterion("create_time is null");
              return (Criteria) this;
         }

         public Criteria andCreateTimeIsNotNull()
         {
              addCriterion("create_time  is not null");
              return (Criteria) this;
         }

		 public Criteria andCreateTimeEqualTo(Date value)
         {
              addCriterion("create_time  = ", value, "create_time ");
              return (Criteria) this;
         }

         public Criteria andCreateTimeNotEqualTo(Date value)
         {
              addCriterion("create_time  <> ", value, "create_time ");
              return (Criteria) this;
         }

         public Criteria andCreateTimeGreaterThan(Date value)
         {
              addCriterion("create_time  > ", value, "create_time ");
              return (Criteria) this;
         }

         public Criteria andCreateTimeGreaterThanOrEqualTo(Date value)
         {
              addCriterion("create_time  >= ", value, "create_time ");
              return (Criteria) this;
         }

         public Criteria andCreateTimeLessThan(Date value)
         {
              addCriterion("create_time  < ", value, "create_time ");
              return (Criteria) this;
         }

         public Criteria andCreateTimeLessThanOrEqualTo(Date value)
         {
              addCriterion("create_time  <= ", value, "create_time ");
              return (Criteria) this;
         }

         public Criteria andCreateTimeLike(Date value)
         {
              addCriterion("create_time  like ", value, "create_time ");
              return (Criteria) this;
         }

         public Criteria andCreateTimeNotLike(Date value)
         {
              addCriterion("create_time  not like ", value, "create_time ");
              return (Criteria) this;
         }

         public Criteria andCreateTimeIn(List<Date> values)
         {
              addCriterion("create_time  in ", values, "create_time ");
              return (Criteria) this;
         }

         public Criteria andCreateTimeNotIn(List<Date> values)
         {
              addCriterion("create_time  not in ", values, "create_time ");
              return (Criteria) this;
         }

         public Criteria andCreateTimeBetween(Date value1, Date value2)
         {
              addCriterion("create_time  between ", value1,value2, "create_time ");
              return (Criteria) this;
         }

         public Criteria andCreateTimeNotBetween(Date value1, Date value2)
         {
              addCriterion("create_time  not between ", value1,value2, "create_time ");
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

		public ColumnName addUserNameColumn()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="user_name";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",user_name";
            }
            return this;
        }

		public ColumnName addTelColumn()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="tel";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",tel";
            }
            return this;
        }

		public ColumnName addCreateTimeColumn()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="create_time";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",create_time";
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
