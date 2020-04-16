package com.hd.entity.generator;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import java.math.BigInteger;


/**
@author Robot
*/
public class MlsdContactUsExample implements Serializable
{

    private static final long serialVersionUID = 1L;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Integer limitStart = -1;

    public Integer limitEnd = -1;

	public ColumnName columnName=null;
	
    public MlsdContactUsExample()
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
         public Criteria andBanner1IsNull()
         {
              addCriterion("banner_1 is null");
              return (Criteria) this;
         }

         public Criteria andBanner1IsNotNull()
         {
              addCriterion("banner_1  is not null");
              return (Criteria) this;
         }

         public Criteria andBanner1EqualTo(String value)
         {
              addCriterion("banner_1  = ", value, "banner_1 ");
              return (Criteria) this;
         }

         public Criteria andBanner1NotEqualTo(String value)
         {
              addCriterion("banner_1  <> ", value, "banner_1 ");
              return (Criteria) this;
         }

         public Criteria andBanner1GreaterThan(String value)
         {
              addCriterion("banner_1  > ", value, "banner_1 ");
              return (Criteria) this;
         }

         public Criteria andBanner1GreaterThanOrEqualTo(String value)
         {
              addCriterion("banner_1  >= ", value, "banner_1 ");
              return (Criteria) this;
         }

         public Criteria andBanner1LessThan(String value)
         {
              addCriterion("banner_1  < ", value, "banner_1 ");
              return (Criteria) this;
         }

         public Criteria andBanner1LessThanOrEqualTo(String value)
         {
              addCriterion("banner_1  <= ", value, "banner_1 ");
              return (Criteria) this;
         }

         public Criteria andBanner1Like(String value)
         {
              addCriterion("banner_1  like ", value, "banner_1 ");
              return (Criteria) this;
         }

         public Criteria andBanner1NotLike(String value)
         {
              addCriterion("banner_1  not like ", value, "banner_1 ");
              return (Criteria) this;
         }

         public Criteria andBanner1In(List<String> values)
         {
              addCriterion("banner_1  in ", values, "banner_1 ");
              return (Criteria) this;
         }

         public Criteria andBanner1NotIn(List<String> values)
         {
              addCriterion("banner_1  not in ", values, "banner_1 ");
              return (Criteria) this;
         }

         public Criteria andBanner1Between(String value1, String value2)
         {
              addCriterion("banner_1  between ", value1,value2, "banner_1 ");
              return (Criteria) this;
         }

         public Criteria andBanner1NotBetween(String value1, String value2)
         {
              addCriterion("banner_1  not between ", value1,value2, "banner_1 ");
              return (Criteria) this;
         }
         public Criteria andContactIconIsNull()
         {
              addCriterion("contact_icon is null");
              return (Criteria) this;
         }

         public Criteria andContactIconIsNotNull()
         {
              addCriterion("contact_icon  is not null");
              return (Criteria) this;
         }

         public Criteria andContactIconEqualTo(String value)
         {
              addCriterion("contact_icon  = ", value, "contact_icon ");
              return (Criteria) this;
         }

         public Criteria andContactIconNotEqualTo(String value)
         {
              addCriterion("contact_icon  <> ", value, "contact_icon ");
              return (Criteria) this;
         }

         public Criteria andContactIconGreaterThan(String value)
         {
              addCriterion("contact_icon  > ", value, "contact_icon ");
              return (Criteria) this;
         }

         public Criteria andContactIconGreaterThanOrEqualTo(String value)
         {
              addCriterion("contact_icon  >= ", value, "contact_icon ");
              return (Criteria) this;
         }

         public Criteria andContactIconLessThan(String value)
         {
              addCriterion("contact_icon  < ", value, "contact_icon ");
              return (Criteria) this;
         }

         public Criteria andContactIconLessThanOrEqualTo(String value)
         {
              addCriterion("contact_icon  <= ", value, "contact_icon ");
              return (Criteria) this;
         }

         public Criteria andContactIconLike(String value)
         {
              addCriterion("contact_icon  like ", value, "contact_icon ");
              return (Criteria) this;
         }

         public Criteria andContactIconNotLike(String value)
         {
              addCriterion("contact_icon  not like ", value, "contact_icon ");
              return (Criteria) this;
         }

         public Criteria andContactIconIn(List<String> values)
         {
              addCriterion("contact_icon  in ", values, "contact_icon ");
              return (Criteria) this;
         }

         public Criteria andContactIconNotIn(List<String> values)
         {
              addCriterion("contact_icon  not in ", values, "contact_icon ");
              return (Criteria) this;
         }

         public Criteria andContactIconBetween(String value1, String value2)
         {
              addCriterion("contact_icon  between ", value1,value2, "contact_icon ");
              return (Criteria) this;
         }

         public Criteria andContactIconNotBetween(String value1, String value2)
         {
              addCriterion("contact_icon  not between ", value1,value2, "contact_icon ");
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
         public Criteria andText3IsNull()
         {
              addCriterion("text_3 is null");
              return (Criteria) this;
         }

         public Criteria andText3IsNotNull()
         {
              addCriterion("text_3  is not null");
              return (Criteria) this;
         }

         public Criteria andText3EqualTo(String value)
         {
              addCriterion("text_3  = ", value, "text_3 ");
              return (Criteria) this;
         }

         public Criteria andText3NotEqualTo(String value)
         {
              addCriterion("text_3  <> ", value, "text_3 ");
              return (Criteria) this;
         }

         public Criteria andText3GreaterThan(String value)
         {
              addCriterion("text_3  > ", value, "text_3 ");
              return (Criteria) this;
         }

         public Criteria andText3GreaterThanOrEqualTo(String value)
         {
              addCriterion("text_3  >= ", value, "text_3 ");
              return (Criteria) this;
         }

         public Criteria andText3LessThan(String value)
         {
              addCriterion("text_3  < ", value, "text_3 ");
              return (Criteria) this;
         }

         public Criteria andText3LessThanOrEqualTo(String value)
         {
              addCriterion("text_3  <= ", value, "text_3 ");
              return (Criteria) this;
         }

         public Criteria andText3Like(String value)
         {
              addCriterion("text_3  like ", value, "text_3 ");
              return (Criteria) this;
         }

         public Criteria andText3NotLike(String value)
         {
              addCriterion("text_3  not like ", value, "text_3 ");
              return (Criteria) this;
         }

         public Criteria andText3In(List<String> values)
         {
              addCriterion("text_3  in ", values, "text_3 ");
              return (Criteria) this;
         }

         public Criteria andText3NotIn(List<String> values)
         {
              addCriterion("text_3  not in ", values, "text_3 ");
              return (Criteria) this;
         }

         public Criteria andText3Between(String value1, String value2)
         {
              addCriterion("text_3  between ", value1,value2, "text_3 ");
              return (Criteria) this;
         }

         public Criteria andText3NotBetween(String value1, String value2)
         {
              addCriterion("text_3  not between ", value1,value2, "text_3 ");
              return (Criteria) this;
         }
         public Criteria andImgUrlIsNull()
         {
              addCriterion("img_url is null");
              return (Criteria) this;
         }

         public Criteria andImgUrlIsNotNull()
         {
              addCriterion("img_url  is not null");
              return (Criteria) this;
         }

         public Criteria andImgUrlEqualTo(String value)
         {
              addCriterion("img_url  = ", value, "img_url ");
              return (Criteria) this;
         }

         public Criteria andImgUrlNotEqualTo(String value)
         {
              addCriterion("img_url  <> ", value, "img_url ");
              return (Criteria) this;
         }

         public Criteria andImgUrlGreaterThan(String value)
         {
              addCriterion("img_url  > ", value, "img_url ");
              return (Criteria) this;
         }

         public Criteria andImgUrlGreaterThanOrEqualTo(String value)
         {
              addCriterion("img_url  >= ", value, "img_url ");
              return (Criteria) this;
         }

         public Criteria andImgUrlLessThan(String value)
         {
              addCriterion("img_url  < ", value, "img_url ");
              return (Criteria) this;
         }

         public Criteria andImgUrlLessThanOrEqualTo(String value)
         {
              addCriterion("img_url  <= ", value, "img_url ");
              return (Criteria) this;
         }

         public Criteria andImgUrlLike(String value)
         {
              addCriterion("img_url  like ", value, "img_url ");
              return (Criteria) this;
         }

         public Criteria andImgUrlNotLike(String value)
         {
              addCriterion("img_url  not like ", value, "img_url ");
              return (Criteria) this;
         }

         public Criteria andImgUrlIn(List<String> values)
         {
              addCriterion("img_url  in ", values, "img_url ");
              return (Criteria) this;
         }

         public Criteria andImgUrlNotIn(List<String> values)
         {
              addCriterion("img_url  not in ", values, "img_url ");
              return (Criteria) this;
         }

         public Criteria andImgUrlBetween(String value1, String value2)
         {
              addCriterion("img_url  between ", value1,value2, "img_url ");
              return (Criteria) this;
         }

         public Criteria andImgUrlNotBetween(String value1, String value2)
         {
              addCriterion("img_url  not between ", value1,value2, "img_url ");
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

		public ColumnName addBanner1Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="banner_1";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",banner_1";
            }
            return this;
        }

		public ColumnName addContactIconColumn()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="contact_icon";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",contact_icon";
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

		public ColumnName addText3Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="text_3";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",text_3";
            }
            return this;
        }

		public ColumnName addImgUrlColumn()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="img_url";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",img_url";
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
