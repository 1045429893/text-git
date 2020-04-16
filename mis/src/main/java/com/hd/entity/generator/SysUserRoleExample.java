package com.hd.entity.generator;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import java.math.BigInteger;


/**
@author Robot
*/
public class SysUserRoleExample implements Serializable
{

    private static final long serialVersionUID = 1L;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Integer limitStart = -1;

    public Integer limitEnd = -1;

	public ColumnName columnName=null;
	
    public SysUserRoleExample()
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
         public Criteria andSysUserIdIsNull()
         {
              addCriterion("sys_user_id is null");
              return (Criteria) this;
         }

         public Criteria andSysUserIdIsNotNull()
         {
              addCriterion("sys_user_id  is not null");
              return (Criteria) this;
         }

         public Criteria andSysUserIdEqualTo(String value)
         {
              addCriterion("sys_user_id  = ", value, "sys_user_id ");
              return (Criteria) this;
         }

         public Criteria andSysUserIdNotEqualTo(String value)
         {
              addCriterion("sys_user_id  <> ", value, "sys_user_id ");
              return (Criteria) this;
         }

         public Criteria andSysUserIdGreaterThan(String value)
         {
              addCriterion("sys_user_id  > ", value, "sys_user_id ");
              return (Criteria) this;
         }

         public Criteria andSysUserIdGreaterThanOrEqualTo(String value)
         {
              addCriterion("sys_user_id  >= ", value, "sys_user_id ");
              return (Criteria) this;
         }

         public Criteria andSysUserIdLessThan(String value)
         {
              addCriterion("sys_user_id  < ", value, "sys_user_id ");
              return (Criteria) this;
         }

         public Criteria andSysUserIdLessThanOrEqualTo(String value)
         {
              addCriterion("sys_user_id  <= ", value, "sys_user_id ");
              return (Criteria) this;
         }

         public Criteria andSysUserIdLike(String value)
         {
              addCriterion("sys_user_id  like ", value, "sys_user_id ");
              return (Criteria) this;
         }

         public Criteria andSysUserIdNotLike(String value)
         {
              addCriterion("sys_user_id  not like ", value, "sys_user_id ");
              return (Criteria) this;
         }

         public Criteria andSysUserIdIn(List<String> values)
         {
              addCriterion("sys_user_id  in ", values, "sys_user_id ");
              return (Criteria) this;
         }

         public Criteria andSysUserIdNotIn(List<String> values)
         {
              addCriterion("sys_user_id  not in ", values, "sys_user_id ");
              return (Criteria) this;
         }

         public Criteria andSysUserIdBetween(String value1, String value2)
         {
              addCriterion("sys_user_id  between ", value1,value2, "sys_user_id ");
              return (Criteria) this;
         }

         public Criteria andSysUserIdNotBetween(String value1, String value2)
         {
              addCriterion("sys_user_id  not between ", value1,value2, "sys_user_id ");
              return (Criteria) this;
         }
         public Criteria andSysRoleIdIsNull()
         {
              addCriterion("sys_role_id is null");
              return (Criteria) this;
         }

         public Criteria andSysRoleIdIsNotNull()
         {
              addCriterion("sys_role_id  is not null");
              return (Criteria) this;
         }

         public Criteria andSysRoleIdEqualTo(String value)
         {
              addCriterion("sys_role_id  = ", value, "sys_role_id ");
              return (Criteria) this;
         }

         public Criteria andSysRoleIdNotEqualTo(String value)
         {
              addCriterion("sys_role_id  <> ", value, "sys_role_id ");
              return (Criteria) this;
         }

         public Criteria andSysRoleIdGreaterThan(String value)
         {
              addCriterion("sys_role_id  > ", value, "sys_role_id ");
              return (Criteria) this;
         }

         public Criteria andSysRoleIdGreaterThanOrEqualTo(String value)
         {
              addCriterion("sys_role_id  >= ", value, "sys_role_id ");
              return (Criteria) this;
         }

         public Criteria andSysRoleIdLessThan(String value)
         {
              addCriterion("sys_role_id  < ", value, "sys_role_id ");
              return (Criteria) this;
         }

         public Criteria andSysRoleIdLessThanOrEqualTo(String value)
         {
              addCriterion("sys_role_id  <= ", value, "sys_role_id ");
              return (Criteria) this;
         }

         public Criteria andSysRoleIdLike(String value)
         {
              addCriterion("sys_role_id  like ", value, "sys_role_id ");
              return (Criteria) this;
         }

         public Criteria andSysRoleIdNotLike(String value)
         {
              addCriterion("sys_role_id  not like ", value, "sys_role_id ");
              return (Criteria) this;
         }

         public Criteria andSysRoleIdIn(List<String> values)
         {
              addCriterion("sys_role_id  in ", values, "sys_role_id ");
              return (Criteria) this;
         }

         public Criteria andSysRoleIdNotIn(List<String> values)
         {
              addCriterion("sys_role_id  not in ", values, "sys_role_id ");
              return (Criteria) this;
         }

         public Criteria andSysRoleIdBetween(String value1, String value2)
         {
              addCriterion("sys_role_id  between ", value1,value2, "sys_role_id ");
              return (Criteria) this;
         }

         public Criteria andSysRoleIdNotBetween(String value1, String value2)
         {
              addCriterion("sys_role_id  not between ", value1,value2, "sys_role_id ");
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
         public Criteria andUpdateTimeIsNull()
         {
              addCriterion("update_time is null");
              return (Criteria) this;
         }

         public Criteria andUpdateTimeIsNotNull()
         {
              addCriterion("update_time  is not null");
              return (Criteria) this;
         }

		 public Criteria andUpdateTimeEqualTo(Date value)
         {
              addCriterion("update_time  = ", value, "update_time ");
              return (Criteria) this;
         }

         public Criteria andUpdateTimeNotEqualTo(Date value)
         {
              addCriterion("update_time  <> ", value, "update_time ");
              return (Criteria) this;
         }

         public Criteria andUpdateTimeGreaterThan(Date value)
         {
              addCriterion("update_time  > ", value, "update_time ");
              return (Criteria) this;
         }

         public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value)
         {
              addCriterion("update_time  >= ", value, "update_time ");
              return (Criteria) this;
         }

         public Criteria andUpdateTimeLessThan(Date value)
         {
              addCriterion("update_time  < ", value, "update_time ");
              return (Criteria) this;
         }

         public Criteria andUpdateTimeLessThanOrEqualTo(Date value)
         {
              addCriterion("update_time  <= ", value, "update_time ");
              return (Criteria) this;
         }

         public Criteria andUpdateTimeLike(Date value)
         {
              addCriterion("update_time  like ", value, "update_time ");
              return (Criteria) this;
         }

         public Criteria andUpdateTimeNotLike(Date value)
         {
              addCriterion("update_time  not like ", value, "update_time ");
              return (Criteria) this;
         }

         public Criteria andUpdateTimeIn(List<Date> values)
         {
              addCriterion("update_time  in ", values, "update_time ");
              return (Criteria) this;
         }

         public Criteria andUpdateTimeNotIn(List<Date> values)
         {
              addCriterion("update_time  not in ", values, "update_time ");
              return (Criteria) this;
         }

         public Criteria andUpdateTimeBetween(Date value1, Date value2)
         {
              addCriterion("update_time  between ", value1,value2, "update_time ");
              return (Criteria) this;
         }

         public Criteria andUpdateTimeNotBetween(Date value1, Date value2)
         {
              addCriterion("update_time  not between ", value1,value2, "update_time ");
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

		public ColumnName addSysUserIdColumn()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="sys_user_id";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",sys_user_id";
            }
            return this;
        }

		public ColumnName addSysRoleIdColumn()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="sys_role_id";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",sys_role_id";
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

		public ColumnName addUpdateTimeColumn()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="update_time";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",update_time";
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
