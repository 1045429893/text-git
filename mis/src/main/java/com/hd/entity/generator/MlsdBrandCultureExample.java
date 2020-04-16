package com.hd.entity.generator;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import java.math.BigInteger;


/**
@author Robot
*/
public class MlsdBrandCultureExample implements Serializable
{

    private static final long serialVersionUID = 1L;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Integer limitStart = -1;

    public Integer limitEnd = -1;

	public ColumnName columnName=null;
	
    public MlsdBrandCultureExample()
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
         public Criteria andIntroduceTextImgUrlIsNull()
         {
              addCriterion("introduce_text_img_url is null");
              return (Criteria) this;
         }

         public Criteria andIntroduceTextImgUrlIsNotNull()
         {
              addCriterion("introduce_text_img_url  is not null");
              return (Criteria) this;
         }

         public Criteria andIntroduceTextImgUrlEqualTo(String value)
         {
              addCriterion("introduce_text_img_url  = ", value, "introduce_text_img_url ");
              return (Criteria) this;
         }

         public Criteria andIntroduceTextImgUrlNotEqualTo(String value)
         {
              addCriterion("introduce_text_img_url  <> ", value, "introduce_text_img_url ");
              return (Criteria) this;
         }

         public Criteria andIntroduceTextImgUrlGreaterThan(String value)
         {
              addCriterion("introduce_text_img_url  > ", value, "introduce_text_img_url ");
              return (Criteria) this;
         }

         public Criteria andIntroduceTextImgUrlGreaterThanOrEqualTo(String value)
         {
              addCriterion("introduce_text_img_url  >= ", value, "introduce_text_img_url ");
              return (Criteria) this;
         }

         public Criteria andIntroduceTextImgUrlLessThan(String value)
         {
              addCriterion("introduce_text_img_url  < ", value, "introduce_text_img_url ");
              return (Criteria) this;
         }

         public Criteria andIntroduceTextImgUrlLessThanOrEqualTo(String value)
         {
              addCriterion("introduce_text_img_url  <= ", value, "introduce_text_img_url ");
              return (Criteria) this;
         }

         public Criteria andIntroduceTextImgUrlLike(String value)
         {
              addCriterion("introduce_text_img_url  like ", value, "introduce_text_img_url ");
              return (Criteria) this;
         }

         public Criteria andIntroduceTextImgUrlNotLike(String value)
         {
              addCriterion("introduce_text_img_url  not like ", value, "introduce_text_img_url ");
              return (Criteria) this;
         }

         public Criteria andIntroduceTextImgUrlIn(List<String> values)
         {
              addCriterion("introduce_text_img_url  in ", values, "introduce_text_img_url ");
              return (Criteria) this;
         }

         public Criteria andIntroduceTextImgUrlNotIn(List<String> values)
         {
              addCriterion("introduce_text_img_url  not in ", values, "introduce_text_img_url ");
              return (Criteria) this;
         }

         public Criteria andIntroduceTextImgUrlBetween(String value1, String value2)
         {
              addCriterion("introduce_text_img_url  between ", value1,value2, "introduce_text_img_url ");
              return (Criteria) this;
         }

         public Criteria andIntroduceTextImgUrlNotBetween(String value1, String value2)
         {
              addCriterion("introduce_text_img_url  not between ", value1,value2, "introduce_text_img_url ");
              return (Criteria) this;
         }
         public Criteria andIntroduceProductImgUrlIsNull()
         {
              addCriterion("introduce_product_img_url is null");
              return (Criteria) this;
         }

         public Criteria andIntroduceProductImgUrlIsNotNull()
         {
              addCriterion("introduce_product_img_url  is not null");
              return (Criteria) this;
         }

         public Criteria andIntroduceProductImgUrlEqualTo(String value)
         {
              addCriterion("introduce_product_img_url  = ", value, "introduce_product_img_url ");
              return (Criteria) this;
         }

         public Criteria andIntroduceProductImgUrlNotEqualTo(String value)
         {
              addCriterion("introduce_product_img_url  <> ", value, "introduce_product_img_url ");
              return (Criteria) this;
         }

         public Criteria andIntroduceProductImgUrlGreaterThan(String value)
         {
              addCriterion("introduce_product_img_url  > ", value, "introduce_product_img_url ");
              return (Criteria) this;
         }

         public Criteria andIntroduceProductImgUrlGreaterThanOrEqualTo(String value)
         {
              addCriterion("introduce_product_img_url  >= ", value, "introduce_product_img_url ");
              return (Criteria) this;
         }

         public Criteria andIntroduceProductImgUrlLessThan(String value)
         {
              addCriterion("introduce_product_img_url  < ", value, "introduce_product_img_url ");
              return (Criteria) this;
         }

         public Criteria andIntroduceProductImgUrlLessThanOrEqualTo(String value)
         {
              addCriterion("introduce_product_img_url  <= ", value, "introduce_product_img_url ");
              return (Criteria) this;
         }

         public Criteria andIntroduceProductImgUrlLike(String value)
         {
              addCriterion("introduce_product_img_url  like ", value, "introduce_product_img_url ");
              return (Criteria) this;
         }

         public Criteria andIntroduceProductImgUrlNotLike(String value)
         {
              addCriterion("introduce_product_img_url  not like ", value, "introduce_product_img_url ");
              return (Criteria) this;
         }

         public Criteria andIntroduceProductImgUrlIn(List<String> values)
         {
              addCriterion("introduce_product_img_url  in ", values, "introduce_product_img_url ");
              return (Criteria) this;
         }

         public Criteria andIntroduceProductImgUrlNotIn(List<String> values)
         {
              addCriterion("introduce_product_img_url  not in ", values, "introduce_product_img_url ");
              return (Criteria) this;
         }

         public Criteria andIntroduceProductImgUrlBetween(String value1, String value2)
         {
              addCriterion("introduce_product_img_url  between ", value1,value2, "introduce_product_img_url ");
              return (Criteria) this;
         }

         public Criteria andIntroduceProductImgUrlNotBetween(String value1, String value2)
         {
              addCriterion("introduce_product_img_url  not between ", value1,value2, "introduce_product_img_url ");
              return (Criteria) this;
         }
         public Criteria andIntroduceIntroImgUrlIsNull()
         {
              addCriterion("introduce_intro_img_url is null");
              return (Criteria) this;
         }

         public Criteria andIntroduceIntroImgUrlIsNotNull()
         {
              addCriterion("introduce_intro_img_url  is not null");
              return (Criteria) this;
         }

         public Criteria andIntroduceIntroImgUrlEqualTo(String value)
         {
              addCriterion("introduce_intro_img_url  = ", value, "introduce_intro_img_url ");
              return (Criteria) this;
         }

         public Criteria andIntroduceIntroImgUrlNotEqualTo(String value)
         {
              addCriterion("introduce_intro_img_url  <> ", value, "introduce_intro_img_url ");
              return (Criteria) this;
         }

         public Criteria andIntroduceIntroImgUrlGreaterThan(String value)
         {
              addCriterion("introduce_intro_img_url  > ", value, "introduce_intro_img_url ");
              return (Criteria) this;
         }

         public Criteria andIntroduceIntroImgUrlGreaterThanOrEqualTo(String value)
         {
              addCriterion("introduce_intro_img_url  >= ", value, "introduce_intro_img_url ");
              return (Criteria) this;
         }

         public Criteria andIntroduceIntroImgUrlLessThan(String value)
         {
              addCriterion("introduce_intro_img_url  < ", value, "introduce_intro_img_url ");
              return (Criteria) this;
         }

         public Criteria andIntroduceIntroImgUrlLessThanOrEqualTo(String value)
         {
              addCriterion("introduce_intro_img_url  <= ", value, "introduce_intro_img_url ");
              return (Criteria) this;
         }

         public Criteria andIntroduceIntroImgUrlLike(String value)
         {
              addCriterion("introduce_intro_img_url  like ", value, "introduce_intro_img_url ");
              return (Criteria) this;
         }

         public Criteria andIntroduceIntroImgUrlNotLike(String value)
         {
              addCriterion("introduce_intro_img_url  not like ", value, "introduce_intro_img_url ");
              return (Criteria) this;
         }

         public Criteria andIntroduceIntroImgUrlIn(List<String> values)
         {
              addCriterion("introduce_intro_img_url  in ", values, "introduce_intro_img_url ");
              return (Criteria) this;
         }

         public Criteria andIntroduceIntroImgUrlNotIn(List<String> values)
         {
              addCriterion("introduce_intro_img_url  not in ", values, "introduce_intro_img_url ");
              return (Criteria) this;
         }

         public Criteria andIntroduceIntroImgUrlBetween(String value1, String value2)
         {
              addCriterion("introduce_intro_img_url  between ", value1,value2, "introduce_intro_img_url ");
              return (Criteria) this;
         }

         public Criteria andIntroduceIntroImgUrlNotBetween(String value1, String value2)
         {
              addCriterion("introduce_intro_img_url  not between ", value1,value2, "introduce_intro_img_url ");
              return (Criteria) this;
         }
         public Criteria andProductPositioningTextImgUrlIsNull()
         {
              addCriterion("product_positioning_text_img_url is null");
              return (Criteria) this;
         }

         public Criteria andProductPositioningTextImgUrlIsNotNull()
         {
              addCriterion("product_positioning_text_img_url  is not null");
              return (Criteria) this;
         }

         public Criteria andProductPositioningTextImgUrlEqualTo(String value)
         {
              addCriterion("product_positioning_text_img_url  = ", value, "product_positioning_text_img_url ");
              return (Criteria) this;
         }

         public Criteria andProductPositioningTextImgUrlNotEqualTo(String value)
         {
              addCriterion("product_positioning_text_img_url  <> ", value, "product_positioning_text_img_url ");
              return (Criteria) this;
         }

         public Criteria andProductPositioningTextImgUrlGreaterThan(String value)
         {
              addCriterion("product_positioning_text_img_url  > ", value, "product_positioning_text_img_url ");
              return (Criteria) this;
         }

         public Criteria andProductPositioningTextImgUrlGreaterThanOrEqualTo(String value)
         {
              addCriterion("product_positioning_text_img_url  >= ", value, "product_positioning_text_img_url ");
              return (Criteria) this;
         }

         public Criteria andProductPositioningTextImgUrlLessThan(String value)
         {
              addCriterion("product_positioning_text_img_url  < ", value, "product_positioning_text_img_url ");
              return (Criteria) this;
         }

         public Criteria andProductPositioningTextImgUrlLessThanOrEqualTo(String value)
         {
              addCriterion("product_positioning_text_img_url  <= ", value, "product_positioning_text_img_url ");
              return (Criteria) this;
         }

         public Criteria andProductPositioningTextImgUrlLike(String value)
         {
              addCriterion("product_positioning_text_img_url  like ", value, "product_positioning_text_img_url ");
              return (Criteria) this;
         }

         public Criteria andProductPositioningTextImgUrlNotLike(String value)
         {
              addCriterion("product_positioning_text_img_url  not like ", value, "product_positioning_text_img_url ");
              return (Criteria) this;
         }

         public Criteria andProductPositioningTextImgUrlIn(List<String> values)
         {
              addCriterion("product_positioning_text_img_url  in ", values, "product_positioning_text_img_url ");
              return (Criteria) this;
         }

         public Criteria andProductPositioningTextImgUrlNotIn(List<String> values)
         {
              addCriterion("product_positioning_text_img_url  not in ", values, "product_positioning_text_img_url ");
              return (Criteria) this;
         }

         public Criteria andProductPositioningTextImgUrlBetween(String value1, String value2)
         {
              addCriterion("product_positioning_text_img_url  between ", value1,value2, "product_positioning_text_img_url ");
              return (Criteria) this;
         }

         public Criteria andProductPositioningTextImgUrlNotBetween(String value1, String value2)
         {
              addCriterion("product_positioning_text_img_url  not between ", value1,value2, "product_positioning_text_img_url ");
              return (Criteria) this;
         }
         public Criteria andProductFeatureImgUrlIsNull()
         {
              addCriterion("product_feature_img_url is null");
              return (Criteria) this;
         }

         public Criteria andProductFeatureImgUrlIsNotNull()
         {
              addCriterion("product_feature_img_url  is not null");
              return (Criteria) this;
         }

         public Criteria andProductFeatureImgUrlEqualTo(String value)
         {
              addCriterion("product_feature_img_url  = ", value, "product_feature_img_url ");
              return (Criteria) this;
         }

         public Criteria andProductFeatureImgUrlNotEqualTo(String value)
         {
              addCriterion("product_feature_img_url  <> ", value, "product_feature_img_url ");
              return (Criteria) this;
         }

         public Criteria andProductFeatureImgUrlGreaterThan(String value)
         {
              addCriterion("product_feature_img_url  > ", value, "product_feature_img_url ");
              return (Criteria) this;
         }

         public Criteria andProductFeatureImgUrlGreaterThanOrEqualTo(String value)
         {
              addCriterion("product_feature_img_url  >= ", value, "product_feature_img_url ");
              return (Criteria) this;
         }

         public Criteria andProductFeatureImgUrlLessThan(String value)
         {
              addCriterion("product_feature_img_url  < ", value, "product_feature_img_url ");
              return (Criteria) this;
         }

         public Criteria andProductFeatureImgUrlLessThanOrEqualTo(String value)
         {
              addCriterion("product_feature_img_url  <= ", value, "product_feature_img_url ");
              return (Criteria) this;
         }

         public Criteria andProductFeatureImgUrlLike(String value)
         {
              addCriterion("product_feature_img_url  like ", value, "product_feature_img_url ");
              return (Criteria) this;
         }

         public Criteria andProductFeatureImgUrlNotLike(String value)
         {
              addCriterion("product_feature_img_url  not like ", value, "product_feature_img_url ");
              return (Criteria) this;
         }

         public Criteria andProductFeatureImgUrlIn(List<String> values)
         {
              addCriterion("product_feature_img_url  in ", values, "product_feature_img_url ");
              return (Criteria) this;
         }

         public Criteria andProductFeatureImgUrlNotIn(List<String> values)
         {
              addCriterion("product_feature_img_url  not in ", values, "product_feature_img_url ");
              return (Criteria) this;
         }

         public Criteria andProductFeatureImgUrlBetween(String value1, String value2)
         {
              addCriterion("product_feature_img_url  between ", value1,value2, "product_feature_img_url ");
              return (Criteria) this;
         }

         public Criteria andProductFeatureImgUrlNotBetween(String value1, String value2)
         {
              addCriterion("product_feature_img_url  not between ", value1,value2, "product_feature_img_url ");
              return (Criteria) this;
         }
         public Criteria andProductPositioningImgUrlIsNull()
         {
              addCriterion("product_positioning_img_url is null");
              return (Criteria) this;
         }

         public Criteria andProductPositioningImgUrlIsNotNull()
         {
              addCriterion("product_positioning_img_url  is not null");
              return (Criteria) this;
         }

         public Criteria andProductPositioningImgUrlEqualTo(String value)
         {
              addCriterion("product_positioning_img_url  = ", value, "product_positioning_img_url ");
              return (Criteria) this;
         }

         public Criteria andProductPositioningImgUrlNotEqualTo(String value)
         {
              addCriterion("product_positioning_img_url  <> ", value, "product_positioning_img_url ");
              return (Criteria) this;
         }

         public Criteria andProductPositioningImgUrlGreaterThan(String value)
         {
              addCriterion("product_positioning_img_url  > ", value, "product_positioning_img_url ");
              return (Criteria) this;
         }

         public Criteria andProductPositioningImgUrlGreaterThanOrEqualTo(String value)
         {
              addCriterion("product_positioning_img_url  >= ", value, "product_positioning_img_url ");
              return (Criteria) this;
         }

         public Criteria andProductPositioningImgUrlLessThan(String value)
         {
              addCriterion("product_positioning_img_url  < ", value, "product_positioning_img_url ");
              return (Criteria) this;
         }

         public Criteria andProductPositioningImgUrlLessThanOrEqualTo(String value)
         {
              addCriterion("product_positioning_img_url  <= ", value, "product_positioning_img_url ");
              return (Criteria) this;
         }

         public Criteria andProductPositioningImgUrlLike(String value)
         {
              addCriterion("product_positioning_img_url  like ", value, "product_positioning_img_url ");
              return (Criteria) this;
         }

         public Criteria andProductPositioningImgUrlNotLike(String value)
         {
              addCriterion("product_positioning_img_url  not like ", value, "product_positioning_img_url ");
              return (Criteria) this;
         }

         public Criteria andProductPositioningImgUrlIn(List<String> values)
         {
              addCriterion("product_positioning_img_url  in ", values, "product_positioning_img_url ");
              return (Criteria) this;
         }

         public Criteria andProductPositioningImgUrlNotIn(List<String> values)
         {
              addCriterion("product_positioning_img_url  not in ", values, "product_positioning_img_url ");
              return (Criteria) this;
         }

         public Criteria andProductPositioningImgUrlBetween(String value1, String value2)
         {
              addCriterion("product_positioning_img_url  between ", value1,value2, "product_positioning_img_url ");
              return (Criteria) this;
         }

         public Criteria andProductPositioningImgUrlNotBetween(String value1, String value2)
         {
              addCriterion("product_positioning_img_url  not between ", value1,value2, "product_positioning_img_url ");
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

		public ColumnName addIntroduceTextImgUrlColumn()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="introduce_text_img_url";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",introduce_text_img_url";
            }
            return this;
        }

		public ColumnName addIntroduceProductImgUrlColumn()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="introduce_product_img_url";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",introduce_product_img_url";
            }
            return this;
        }

		public ColumnName addIntroduceIntroImgUrlColumn()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="introduce_intro_img_url";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",introduce_intro_img_url";
            }
            return this;
        }

		public ColumnName addProductPositioningTextImgUrlColumn()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="product_positioning_text_img_url";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",product_positioning_text_img_url";
            }
            return this;
        }

		public ColumnName addProductFeatureImgUrlColumn()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="product_feature_img_url";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",product_feature_img_url";
            }
            return this;
        }

		public ColumnName addProductPositioningImgUrlColumn()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="product_positioning_img_url";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",product_positioning_img_url";
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
