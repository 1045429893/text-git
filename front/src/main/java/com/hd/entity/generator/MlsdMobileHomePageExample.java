package com.hd.entity.generator;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import java.math.BigInteger;


/**
@author Robot
*/
public class MlsdMobileHomePageExample implements Serializable
{

    private static final long serialVersionUID = 1L;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Integer limitStart = -1;

    public Integer limitEnd = -1;

	public ColumnName columnName=null;
	
    public MlsdMobileHomePageExample()
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
         public Criteria andBannerIsNull()
         {
              addCriterion("banner is null");
              return (Criteria) this;
         }

         public Criteria andBannerIsNotNull()
         {
              addCriterion("banner  is not null");
              return (Criteria) this;
         }

         public Criteria andBannerEqualTo(String value)
         {
              addCriterion("banner  = ", value, "banner ");
              return (Criteria) this;
         }

         public Criteria andBannerNotEqualTo(String value)
         {
              addCriterion("banner  <> ", value, "banner ");
              return (Criteria) this;
         }

         public Criteria andBannerGreaterThan(String value)
         {
              addCriterion("banner  > ", value, "banner ");
              return (Criteria) this;
         }

         public Criteria andBannerGreaterThanOrEqualTo(String value)
         {
              addCriterion("banner  >= ", value, "banner ");
              return (Criteria) this;
         }

         public Criteria andBannerLessThan(String value)
         {
              addCriterion("banner  < ", value, "banner ");
              return (Criteria) this;
         }

         public Criteria andBannerLessThanOrEqualTo(String value)
         {
              addCriterion("banner  <= ", value, "banner ");
              return (Criteria) this;
         }

         public Criteria andBannerLike(String value)
         {
              addCriterion("banner  like ", value, "banner ");
              return (Criteria) this;
         }

         public Criteria andBannerNotLike(String value)
         {
              addCriterion("banner  not like ", value, "banner ");
              return (Criteria) this;
         }

         public Criteria andBannerIn(List<String> values)
         {
              addCriterion("banner  in ", values, "banner ");
              return (Criteria) this;
         }

         public Criteria andBannerNotIn(List<String> values)
         {
              addCriterion("banner  not in ", values, "banner ");
              return (Criteria) this;
         }

         public Criteria andBannerBetween(String value1, String value2)
         {
              addCriterion("banner  between ", value1,value2, "banner ");
              return (Criteria) this;
         }

         public Criteria andBannerNotBetween(String value1, String value2)
         {
              addCriterion("banner  not between ", value1,value2, "banner ");
              return (Criteria) this;
         }
         public Criteria andTextIsNull()
         {
              addCriterion("text is null");
              return (Criteria) this;
         }

         public Criteria andTextIsNotNull()
         {
              addCriterion("text  is not null");
              return (Criteria) this;
         }

         public Criteria andTextEqualTo(String value)
         {
              addCriterion("text  = ", value, "text ");
              return (Criteria) this;
         }

         public Criteria andTextNotEqualTo(String value)
         {
              addCriterion("text  <> ", value, "text ");
              return (Criteria) this;
         }

         public Criteria andTextGreaterThan(String value)
         {
              addCriterion("text  > ", value, "text ");
              return (Criteria) this;
         }

         public Criteria andTextGreaterThanOrEqualTo(String value)
         {
              addCriterion("text  >= ", value, "text ");
              return (Criteria) this;
         }

         public Criteria andTextLessThan(String value)
         {
              addCriterion("text  < ", value, "text ");
              return (Criteria) this;
         }

         public Criteria andTextLessThanOrEqualTo(String value)
         {
              addCriterion("text  <= ", value, "text ");
              return (Criteria) this;
         }

         public Criteria andTextLike(String value)
         {
              addCriterion("text  like ", value, "text ");
              return (Criteria) this;
         }

         public Criteria andTextNotLike(String value)
         {
              addCriterion("text  not like ", value, "text ");
              return (Criteria) this;
         }

         public Criteria andTextIn(List<String> values)
         {
              addCriterion("text  in ", values, "text ");
              return (Criteria) this;
         }

         public Criteria andTextNotIn(List<String> values)
         {
              addCriterion("text  not in ", values, "text ");
              return (Criteria) this;
         }

         public Criteria andTextBetween(String value1, String value2)
         {
              addCriterion("text  between ", value1,value2, "text ");
              return (Criteria) this;
         }

         public Criteria andTextNotBetween(String value1, String value2)
         {
              addCriterion("text  not between ", value1,value2, "text ");
              return (Criteria) this;
         }
         public Criteria andShowImageIsNull()
         {
              addCriterion("show_image is null");
              return (Criteria) this;
         }

         public Criteria andShowImageIsNotNull()
         {
              addCriterion("show_image  is not null");
              return (Criteria) this;
         }

         public Criteria andShowImageEqualTo(String value)
         {
              addCriterion("show_image  = ", value, "show_image ");
              return (Criteria) this;
         }

         public Criteria andShowImageNotEqualTo(String value)
         {
              addCriterion("show_image  <> ", value, "show_image ");
              return (Criteria) this;
         }

         public Criteria andShowImageGreaterThan(String value)
         {
              addCriterion("show_image  > ", value, "show_image ");
              return (Criteria) this;
         }

         public Criteria andShowImageGreaterThanOrEqualTo(String value)
         {
              addCriterion("show_image  >= ", value, "show_image ");
              return (Criteria) this;
         }

         public Criteria andShowImageLessThan(String value)
         {
              addCriterion("show_image  < ", value, "show_image ");
              return (Criteria) this;
         }

         public Criteria andShowImageLessThanOrEqualTo(String value)
         {
              addCriterion("show_image  <= ", value, "show_image ");
              return (Criteria) this;
         }

         public Criteria andShowImageLike(String value)
         {
              addCriterion("show_image  like ", value, "show_image ");
              return (Criteria) this;
         }

         public Criteria andShowImageNotLike(String value)
         {
              addCriterion("show_image  not like ", value, "show_image ");
              return (Criteria) this;
         }

         public Criteria andShowImageIn(List<String> values)
         {
              addCriterion("show_image  in ", values, "show_image ");
              return (Criteria) this;
         }

         public Criteria andShowImageNotIn(List<String> values)
         {
              addCriterion("show_image  not in ", values, "show_image ");
              return (Criteria) this;
         }

         public Criteria andShowImageBetween(String value1, String value2)
         {
              addCriterion("show_image  between ", value1,value2, "show_image ");
              return (Criteria) this;
         }

         public Criteria andShowImageNotBetween(String value1, String value2)
         {
              addCriterion("show_image  not between ", value1,value2, "show_image ");
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

		public ColumnName addBannerColumn()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="banner";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",banner";
            }
            return this;
        }

		public ColumnName addTextColumn()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="text";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",text";
            }
            return this;
        }

		public ColumnName addShowImageColumn()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="show_image";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",show_image";
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
