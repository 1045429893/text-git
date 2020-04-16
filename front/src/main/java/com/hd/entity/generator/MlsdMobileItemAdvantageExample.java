package com.hd.entity.generator;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import java.math.BigInteger;


/**
@author Robot
*/
public class MlsdMobileItemAdvantageExample implements Serializable
{

    private static final long serialVersionUID = 1L;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Integer limitStart = -1;

    public Integer limitEnd = -1;

	public ColumnName columnName=null;
	
    public MlsdMobileItemAdvantageExample()
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
         public Criteria andText1IsNull()
         {
              addCriterion("text_1 is null");
              return (Criteria) this;
         }

         public Criteria andText1IsNotNull()
         {
              addCriterion("text_1  is not null");
              return (Criteria) this;
         }

         public Criteria andText1EqualTo(String value)
         {
              addCriterion("text_1  = ", value, "text_1 ");
              return (Criteria) this;
         }

         public Criteria andText1NotEqualTo(String value)
         {
              addCriterion("text_1  <> ", value, "text_1 ");
              return (Criteria) this;
         }

         public Criteria andText1GreaterThan(String value)
         {
              addCriterion("text_1  > ", value, "text_1 ");
              return (Criteria) this;
         }

         public Criteria andText1GreaterThanOrEqualTo(String value)
         {
              addCriterion("text_1  >= ", value, "text_1 ");
              return (Criteria) this;
         }

         public Criteria andText1LessThan(String value)
         {
              addCriterion("text_1  < ", value, "text_1 ");
              return (Criteria) this;
         }

         public Criteria andText1LessThanOrEqualTo(String value)
         {
              addCriterion("text_1  <= ", value, "text_1 ");
              return (Criteria) this;
         }

         public Criteria andText1Like(String value)
         {
              addCriterion("text_1  like ", value, "text_1 ");
              return (Criteria) this;
         }

         public Criteria andText1NotLike(String value)
         {
              addCriterion("text_1  not like ", value, "text_1 ");
              return (Criteria) this;
         }

         public Criteria andText1In(List<String> values)
         {
              addCriterion("text_1  in ", values, "text_1 ");
              return (Criteria) this;
         }

         public Criteria andText1NotIn(List<String> values)
         {
              addCriterion("text_1  not in ", values, "text_1 ");
              return (Criteria) this;
         }

         public Criteria andText1Between(String value1, String value2)
         {
              addCriterion("text_1  between ", value1,value2, "text_1 ");
              return (Criteria) this;
         }

         public Criteria andText1NotBetween(String value1, String value2)
         {
              addCriterion("text_1  not between ", value1,value2, "text_1 ");
              return (Criteria) this;
         }
         public Criteria andText2IsNull()
         {
              addCriterion("text_2 is null");
              return (Criteria) this;
         }

         public Criteria andText2IsNotNull()
         {
              addCriterion("text_2  is not null");
              return (Criteria) this;
         }

         public Criteria andText2EqualTo(String value)
         {
              addCriterion("text_2  = ", value, "text_2 ");
              return (Criteria) this;
         }

         public Criteria andText2NotEqualTo(String value)
         {
              addCriterion("text_2  <> ", value, "text_2 ");
              return (Criteria) this;
         }

         public Criteria andText2GreaterThan(String value)
         {
              addCriterion("text_2  > ", value, "text_2 ");
              return (Criteria) this;
         }

         public Criteria andText2GreaterThanOrEqualTo(String value)
         {
              addCriterion("text_2  >= ", value, "text_2 ");
              return (Criteria) this;
         }

         public Criteria andText2LessThan(String value)
         {
              addCriterion("text_2  < ", value, "text_2 ");
              return (Criteria) this;
         }

         public Criteria andText2LessThanOrEqualTo(String value)
         {
              addCriterion("text_2  <= ", value, "text_2 ");
              return (Criteria) this;
         }

         public Criteria andText2Like(String value)
         {
              addCriterion("text_2  like ", value, "text_2 ");
              return (Criteria) this;
         }

         public Criteria andText2NotLike(String value)
         {
              addCriterion("text_2  not like ", value, "text_2 ");
              return (Criteria) this;
         }

         public Criteria andText2In(List<String> values)
         {
              addCriterion("text_2  in ", values, "text_2 ");
              return (Criteria) this;
         }

         public Criteria andText2NotIn(List<String> values)
         {
              addCriterion("text_2  not in ", values, "text_2 ");
              return (Criteria) this;
         }

         public Criteria andText2Between(String value1, String value2)
         {
              addCriterion("text_2  between ", value1,value2, "text_2 ");
              return (Criteria) this;
         }

         public Criteria andText2NotBetween(String value1, String value2)
         {
              addCriterion("text_2  not between ", value1,value2, "text_2 ");
              return (Criteria) this;
         }
         public Criteria andShowImage1IsNull()
         {
              addCriterion("show_image_1 is null");
              return (Criteria) this;
         }

         public Criteria andShowImage1IsNotNull()
         {
              addCriterion("show_image_1  is not null");
              return (Criteria) this;
         }

         public Criteria andShowImage1EqualTo(String value)
         {
              addCriterion("show_image_1  = ", value, "show_image_1 ");
              return (Criteria) this;
         }

         public Criteria andShowImage1NotEqualTo(String value)
         {
              addCriterion("show_image_1  <> ", value, "show_image_1 ");
              return (Criteria) this;
         }

         public Criteria andShowImage1GreaterThan(String value)
         {
              addCriterion("show_image_1  > ", value, "show_image_1 ");
              return (Criteria) this;
         }

         public Criteria andShowImage1GreaterThanOrEqualTo(String value)
         {
              addCriterion("show_image_1  >= ", value, "show_image_1 ");
              return (Criteria) this;
         }

         public Criteria andShowImage1LessThan(String value)
         {
              addCriterion("show_image_1  < ", value, "show_image_1 ");
              return (Criteria) this;
         }

         public Criteria andShowImage1LessThanOrEqualTo(String value)
         {
              addCriterion("show_image_1  <= ", value, "show_image_1 ");
              return (Criteria) this;
         }

         public Criteria andShowImage1Like(String value)
         {
              addCriterion("show_image_1  like ", value, "show_image_1 ");
              return (Criteria) this;
         }

         public Criteria andShowImage1NotLike(String value)
         {
              addCriterion("show_image_1  not like ", value, "show_image_1 ");
              return (Criteria) this;
         }

         public Criteria andShowImage1In(List<String> values)
         {
              addCriterion("show_image_1  in ", values, "show_image_1 ");
              return (Criteria) this;
         }

         public Criteria andShowImage1NotIn(List<String> values)
         {
              addCriterion("show_image_1  not in ", values, "show_image_1 ");
              return (Criteria) this;
         }

         public Criteria andShowImage1Between(String value1, String value2)
         {
              addCriterion("show_image_1  between ", value1,value2, "show_image_1 ");
              return (Criteria) this;
         }

         public Criteria andShowImage1NotBetween(String value1, String value2)
         {
              addCriterion("show_image_1  not between ", value1,value2, "show_image_1 ");
              return (Criteria) this;
         }
         public Criteria andShowImage2IsNull()
         {
              addCriterion("show_image_2 is null");
              return (Criteria) this;
         }

         public Criteria andShowImage2IsNotNull()
         {
              addCriterion("show_image_2  is not null");
              return (Criteria) this;
         }

         public Criteria andShowImage2EqualTo(String value)
         {
              addCriterion("show_image_2  = ", value, "show_image_2 ");
              return (Criteria) this;
         }

         public Criteria andShowImage2NotEqualTo(String value)
         {
              addCriterion("show_image_2  <> ", value, "show_image_2 ");
              return (Criteria) this;
         }

         public Criteria andShowImage2GreaterThan(String value)
         {
              addCriterion("show_image_2  > ", value, "show_image_2 ");
              return (Criteria) this;
         }

         public Criteria andShowImage2GreaterThanOrEqualTo(String value)
         {
              addCriterion("show_image_2  >= ", value, "show_image_2 ");
              return (Criteria) this;
         }

         public Criteria andShowImage2LessThan(String value)
         {
              addCriterion("show_image_2  < ", value, "show_image_2 ");
              return (Criteria) this;
         }

         public Criteria andShowImage2LessThanOrEqualTo(String value)
         {
              addCriterion("show_image_2  <= ", value, "show_image_2 ");
              return (Criteria) this;
         }

         public Criteria andShowImage2Like(String value)
         {
              addCriterion("show_image_2  like ", value, "show_image_2 ");
              return (Criteria) this;
         }

         public Criteria andShowImage2NotLike(String value)
         {
              addCriterion("show_image_2  not like ", value, "show_image_2 ");
              return (Criteria) this;
         }

         public Criteria andShowImage2In(List<String> values)
         {
              addCriterion("show_image_2  in ", values, "show_image_2 ");
              return (Criteria) this;
         }

         public Criteria andShowImage2NotIn(List<String> values)
         {
              addCriterion("show_image_2  not in ", values, "show_image_2 ");
              return (Criteria) this;
         }

         public Criteria andShowImage2Between(String value1, String value2)
         {
              addCriterion("show_image_2  between ", value1,value2, "show_image_2 ");
              return (Criteria) this;
         }

         public Criteria andShowImage2NotBetween(String value1, String value2)
         {
              addCriterion("show_image_2  not between ", value1,value2, "show_image_2 ");
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

		public ColumnName addText1Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="text_1";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",text_1";
            }
            return this;
        }

		public ColumnName addText2Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="text_2";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",text_2";
            }
            return this;
        }

		public ColumnName addShowImage1Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="show_image_1";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",show_image_1";
            }
            return this;
        }

		public ColumnName addShowImage2Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="show_image_2";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",show_image_2";
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
