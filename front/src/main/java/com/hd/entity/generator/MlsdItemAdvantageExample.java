package com.hd.entity.generator;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import java.math.BigInteger;


/**
@author Robot
*/
public class MlsdItemAdvantageExample implements Serializable
{

    private static final long serialVersionUID = 1L;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Integer limitStart = -1;

    public Integer limitEnd = -1;

	public ColumnName columnName=null;
	
    public MlsdItemAdvantageExample()
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
         public Criteria andCompanyShowsTextImgUrlIsNull()
         {
              addCriterion("company_shows_text_img_url is null");
              return (Criteria) this;
         }

         public Criteria andCompanyShowsTextImgUrlIsNotNull()
         {
              addCriterion("company_shows_text_img_url  is not null");
              return (Criteria) this;
         }

         public Criteria andCompanyShowsTextImgUrlEqualTo(String value)
         {
              addCriterion("company_shows_text_img_url  = ", value, "company_shows_text_img_url ");
              return (Criteria) this;
         }

         public Criteria andCompanyShowsTextImgUrlNotEqualTo(String value)
         {
              addCriterion("company_shows_text_img_url  <> ", value, "company_shows_text_img_url ");
              return (Criteria) this;
         }

         public Criteria andCompanyShowsTextImgUrlGreaterThan(String value)
         {
              addCriterion("company_shows_text_img_url  > ", value, "company_shows_text_img_url ");
              return (Criteria) this;
         }

         public Criteria andCompanyShowsTextImgUrlGreaterThanOrEqualTo(String value)
         {
              addCriterion("company_shows_text_img_url  >= ", value, "company_shows_text_img_url ");
              return (Criteria) this;
         }

         public Criteria andCompanyShowsTextImgUrlLessThan(String value)
         {
              addCriterion("company_shows_text_img_url  < ", value, "company_shows_text_img_url ");
              return (Criteria) this;
         }

         public Criteria andCompanyShowsTextImgUrlLessThanOrEqualTo(String value)
         {
              addCriterion("company_shows_text_img_url  <= ", value, "company_shows_text_img_url ");
              return (Criteria) this;
         }

         public Criteria andCompanyShowsTextImgUrlLike(String value)
         {
              addCriterion("company_shows_text_img_url  like ", value, "company_shows_text_img_url ");
              return (Criteria) this;
         }

         public Criteria andCompanyShowsTextImgUrlNotLike(String value)
         {
              addCriterion("company_shows_text_img_url  not like ", value, "company_shows_text_img_url ");
              return (Criteria) this;
         }

         public Criteria andCompanyShowsTextImgUrlIn(List<String> values)
         {
              addCriterion("company_shows_text_img_url  in ", values, "company_shows_text_img_url ");
              return (Criteria) this;
         }

         public Criteria andCompanyShowsTextImgUrlNotIn(List<String> values)
         {
              addCriterion("company_shows_text_img_url  not in ", values, "company_shows_text_img_url ");
              return (Criteria) this;
         }

         public Criteria andCompanyShowsTextImgUrlBetween(String value1, String value2)
         {
              addCriterion("company_shows_text_img_url  between ", value1,value2, "company_shows_text_img_url ");
              return (Criteria) this;
         }

         public Criteria andCompanyShowsTextImgUrlNotBetween(String value1, String value2)
         {
              addCriterion("company_shows_text_img_url  not between ", value1,value2, "company_shows_text_img_url ");
              return (Criteria) this;
         }
         public Criteria andCompanyShowsTitleImgUrlIsNull()
         {
              addCriterion("company_shows_title_img_url is null");
              return (Criteria) this;
         }

         public Criteria andCompanyShowsTitleImgUrlIsNotNull()
         {
              addCriterion("company_shows_title_img_url  is not null");
              return (Criteria) this;
         }

         public Criteria andCompanyShowsTitleImgUrlEqualTo(String value)
         {
              addCriterion("company_shows_title_img_url  = ", value, "company_shows_title_img_url ");
              return (Criteria) this;
         }

         public Criteria andCompanyShowsTitleImgUrlNotEqualTo(String value)
         {
              addCriterion("company_shows_title_img_url  <> ", value, "company_shows_title_img_url ");
              return (Criteria) this;
         }

         public Criteria andCompanyShowsTitleImgUrlGreaterThan(String value)
         {
              addCriterion("company_shows_title_img_url  > ", value, "company_shows_title_img_url ");
              return (Criteria) this;
         }

         public Criteria andCompanyShowsTitleImgUrlGreaterThanOrEqualTo(String value)
         {
              addCriterion("company_shows_title_img_url  >= ", value, "company_shows_title_img_url ");
              return (Criteria) this;
         }

         public Criteria andCompanyShowsTitleImgUrlLessThan(String value)
         {
              addCriterion("company_shows_title_img_url  < ", value, "company_shows_title_img_url ");
              return (Criteria) this;
         }

         public Criteria andCompanyShowsTitleImgUrlLessThanOrEqualTo(String value)
         {
              addCriterion("company_shows_title_img_url  <= ", value, "company_shows_title_img_url ");
              return (Criteria) this;
         }

         public Criteria andCompanyShowsTitleImgUrlLike(String value)
         {
              addCriterion("company_shows_title_img_url  like ", value, "company_shows_title_img_url ");
              return (Criteria) this;
         }

         public Criteria andCompanyShowsTitleImgUrlNotLike(String value)
         {
              addCriterion("company_shows_title_img_url  not like ", value, "company_shows_title_img_url ");
              return (Criteria) this;
         }

         public Criteria andCompanyShowsTitleImgUrlIn(List<String> values)
         {
              addCriterion("company_shows_title_img_url  in ", values, "company_shows_title_img_url ");
              return (Criteria) this;
         }

         public Criteria andCompanyShowsTitleImgUrlNotIn(List<String> values)
         {
              addCriterion("company_shows_title_img_url  not in ", values, "company_shows_title_img_url ");
              return (Criteria) this;
         }

         public Criteria andCompanyShowsTitleImgUrlBetween(String value1, String value2)
         {
              addCriterion("company_shows_title_img_url  between ", value1,value2, "company_shows_title_img_url ");
              return (Criteria) this;
         }

         public Criteria andCompanyShowsTitleImgUrlNotBetween(String value1, String value2)
         {
              addCriterion("company_shows_title_img_url  not between ", value1,value2, "company_shows_title_img_url ");
              return (Criteria) this;
         }
         public Criteria andCompanyShowsImgUrlIsNull()
         {
              addCriterion("company_shows_img_url is null");
              return (Criteria) this;
         }

         public Criteria andCompanyShowsImgUrlIsNotNull()
         {
              addCriterion("company_shows_img_url  is not null");
              return (Criteria) this;
         }

         public Criteria andCompanyShowsImgUrlEqualTo(String value)
         {
              addCriterion("company_shows_img_url  = ", value, "company_shows_img_url ");
              return (Criteria) this;
         }

         public Criteria andCompanyShowsImgUrlNotEqualTo(String value)
         {
              addCriterion("company_shows_img_url  <> ", value, "company_shows_img_url ");
              return (Criteria) this;
         }

         public Criteria andCompanyShowsImgUrlGreaterThan(String value)
         {
              addCriterion("company_shows_img_url  > ", value, "company_shows_img_url ");
              return (Criteria) this;
         }

         public Criteria andCompanyShowsImgUrlGreaterThanOrEqualTo(String value)
         {
              addCriterion("company_shows_img_url  >= ", value, "company_shows_img_url ");
              return (Criteria) this;
         }

         public Criteria andCompanyShowsImgUrlLessThan(String value)
         {
              addCriterion("company_shows_img_url  < ", value, "company_shows_img_url ");
              return (Criteria) this;
         }

         public Criteria andCompanyShowsImgUrlLessThanOrEqualTo(String value)
         {
              addCriterion("company_shows_img_url  <= ", value, "company_shows_img_url ");
              return (Criteria) this;
         }

         public Criteria andCompanyShowsImgUrlLike(String value)
         {
              addCriterion("company_shows_img_url  like ", value, "company_shows_img_url ");
              return (Criteria) this;
         }

         public Criteria andCompanyShowsImgUrlNotLike(String value)
         {
              addCriterion("company_shows_img_url  not like ", value, "company_shows_img_url ");
              return (Criteria) this;
         }

         public Criteria andCompanyShowsImgUrlIn(List<String> values)
         {
              addCriterion("company_shows_img_url  in ", values, "company_shows_img_url ");
              return (Criteria) this;
         }

         public Criteria andCompanyShowsImgUrlNotIn(List<String> values)
         {
              addCriterion("company_shows_img_url  not in ", values, "company_shows_img_url ");
              return (Criteria) this;
         }

         public Criteria andCompanyShowsImgUrlBetween(String value1, String value2)
         {
              addCriterion("company_shows_img_url  between ", value1,value2, "company_shows_img_url ");
              return (Criteria) this;
         }

         public Criteria andCompanyShowsImgUrlNotBetween(String value1, String value2)
         {
              addCriterion("company_shows_img_url  not between ", value1,value2, "company_shows_img_url ");
              return (Criteria) this;
         }
         public Criteria andCompanyShowsAdvantageImgUrlIsNull()
         {
              addCriterion("company_shows_advantage_img_url is null");
              return (Criteria) this;
         }

         public Criteria andCompanyShowsAdvantageImgUrlIsNotNull()
         {
              addCriterion("company_shows_advantage_img_url  is not null");
              return (Criteria) this;
         }

         public Criteria andCompanyShowsAdvantageImgUrlEqualTo(String value)
         {
              addCriterion("company_shows_advantage_img_url  = ", value, "company_shows_advantage_img_url ");
              return (Criteria) this;
         }

         public Criteria andCompanyShowsAdvantageImgUrlNotEqualTo(String value)
         {
              addCriterion("company_shows_advantage_img_url  <> ", value, "company_shows_advantage_img_url ");
              return (Criteria) this;
         }

         public Criteria andCompanyShowsAdvantageImgUrlGreaterThan(String value)
         {
              addCriterion("company_shows_advantage_img_url  > ", value, "company_shows_advantage_img_url ");
              return (Criteria) this;
         }

         public Criteria andCompanyShowsAdvantageImgUrlGreaterThanOrEqualTo(String value)
         {
              addCriterion("company_shows_advantage_img_url  >= ", value, "company_shows_advantage_img_url ");
              return (Criteria) this;
         }

         public Criteria andCompanyShowsAdvantageImgUrlLessThan(String value)
         {
              addCriterion("company_shows_advantage_img_url  < ", value, "company_shows_advantage_img_url ");
              return (Criteria) this;
         }

         public Criteria andCompanyShowsAdvantageImgUrlLessThanOrEqualTo(String value)
         {
              addCriterion("company_shows_advantage_img_url  <= ", value, "company_shows_advantage_img_url ");
              return (Criteria) this;
         }

         public Criteria andCompanyShowsAdvantageImgUrlLike(String value)
         {
              addCriterion("company_shows_advantage_img_url  like ", value, "company_shows_advantage_img_url ");
              return (Criteria) this;
         }

         public Criteria andCompanyShowsAdvantageImgUrlNotLike(String value)
         {
              addCriterion("company_shows_advantage_img_url  not like ", value, "company_shows_advantage_img_url ");
              return (Criteria) this;
         }

         public Criteria andCompanyShowsAdvantageImgUrlIn(List<String> values)
         {
              addCriterion("company_shows_advantage_img_url  in ", values, "company_shows_advantage_img_url ");
              return (Criteria) this;
         }

         public Criteria andCompanyShowsAdvantageImgUrlNotIn(List<String> values)
         {
              addCriterion("company_shows_advantage_img_url  not in ", values, "company_shows_advantage_img_url ");
              return (Criteria) this;
         }

         public Criteria andCompanyShowsAdvantageImgUrlBetween(String value1, String value2)
         {
              addCriterion("company_shows_advantage_img_url  between ", value1,value2, "company_shows_advantage_img_url ");
              return (Criteria) this;
         }

         public Criteria andCompanyShowsAdvantageImgUrlNotBetween(String value1, String value2)
         {
              addCriterion("company_shows_advantage_img_url  not between ", value1,value2, "company_shows_advantage_img_url ");
              return (Criteria) this;
         }
         public Criteria andSupportImgUrlIsNull()
         {
              addCriterion("support_img_url is null");
              return (Criteria) this;
         }

         public Criteria andSupportImgUrlIsNotNull()
         {
              addCriterion("support_img_url  is not null");
              return (Criteria) this;
         }

         public Criteria andSupportImgUrlEqualTo(String value)
         {
              addCriterion("support_img_url  = ", value, "support_img_url ");
              return (Criteria) this;
         }

         public Criteria andSupportImgUrlNotEqualTo(String value)
         {
              addCriterion("support_img_url  <> ", value, "support_img_url ");
              return (Criteria) this;
         }

         public Criteria andSupportImgUrlGreaterThan(String value)
         {
              addCriterion("support_img_url  > ", value, "support_img_url ");
              return (Criteria) this;
         }

         public Criteria andSupportImgUrlGreaterThanOrEqualTo(String value)
         {
              addCriterion("support_img_url  >= ", value, "support_img_url ");
              return (Criteria) this;
         }

         public Criteria andSupportImgUrlLessThan(String value)
         {
              addCriterion("support_img_url  < ", value, "support_img_url ");
              return (Criteria) this;
         }

         public Criteria andSupportImgUrlLessThanOrEqualTo(String value)
         {
              addCriterion("support_img_url  <= ", value, "support_img_url ");
              return (Criteria) this;
         }

         public Criteria andSupportImgUrlLike(String value)
         {
              addCriterion("support_img_url  like ", value, "support_img_url ");
              return (Criteria) this;
         }

         public Criteria andSupportImgUrlNotLike(String value)
         {
              addCriterion("support_img_url  not like ", value, "support_img_url ");
              return (Criteria) this;
         }

         public Criteria andSupportImgUrlIn(List<String> values)
         {
              addCriterion("support_img_url  in ", values, "support_img_url ");
              return (Criteria) this;
         }

         public Criteria andSupportImgUrlNotIn(List<String> values)
         {
              addCriterion("support_img_url  not in ", values, "support_img_url ");
              return (Criteria) this;
         }

         public Criteria andSupportImgUrlBetween(String value1, String value2)
         {
              addCriterion("support_img_url  between ", value1,value2, "support_img_url ");
              return (Criteria) this;
         }

         public Criteria andSupportImgUrlNotBetween(String value1, String value2)
         {
              addCriterion("support_img_url  not between ", value1,value2, "support_img_url ");
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

		public ColumnName addCompanyShowsTextImgUrlColumn()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="company_shows_text_img_url";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",company_shows_text_img_url";
            }
            return this;
        }

		public ColumnName addCompanyShowsTitleImgUrlColumn()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="company_shows_title_img_url";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",company_shows_title_img_url";
            }
            return this;
        }

		public ColumnName addCompanyShowsImgUrlColumn()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="company_shows_img_url";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",company_shows_img_url";
            }
            return this;
        }

		public ColumnName addCompanyShowsAdvantageImgUrlColumn()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="company_shows_advantage_img_url";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",company_shows_advantage_img_url";
            }
            return this;
        }

		public ColumnName addSupportImgUrlColumn()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="support_img_url";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",support_img_url";
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
