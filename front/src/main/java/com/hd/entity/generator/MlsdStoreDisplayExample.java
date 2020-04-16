package com.hd.entity.generator;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import java.math.BigInteger;


/**
@author Robot
*/
public class MlsdStoreDisplayExample implements Serializable
{

    private static final long serialVersionUID = 1L;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Integer limitStart = -1;

    public Integer limitEnd = -1;

	public ColumnName columnName=null;
	
    public MlsdStoreDisplayExample()
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
         public Criteria andStoreDisplayImgUrl1IsNull()
         {
              addCriterion("store_display_img_url_1 is null");
              return (Criteria) this;
         }

         public Criteria andStoreDisplayImgUrl1IsNotNull()
         {
              addCriterion("store_display_img_url_1  is not null");
              return (Criteria) this;
         }

         public Criteria andStoreDisplayImgUrl1EqualTo(String value)
         {
              addCriterion("store_display_img_url_1  = ", value, "store_display_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andStoreDisplayImgUrl1NotEqualTo(String value)
         {
              addCriterion("store_display_img_url_1  <> ", value, "store_display_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andStoreDisplayImgUrl1GreaterThan(String value)
         {
              addCriterion("store_display_img_url_1  > ", value, "store_display_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andStoreDisplayImgUrl1GreaterThanOrEqualTo(String value)
         {
              addCriterion("store_display_img_url_1  >= ", value, "store_display_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andStoreDisplayImgUrl1LessThan(String value)
         {
              addCriterion("store_display_img_url_1  < ", value, "store_display_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andStoreDisplayImgUrl1LessThanOrEqualTo(String value)
         {
              addCriterion("store_display_img_url_1  <= ", value, "store_display_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andStoreDisplayImgUrl1Like(String value)
         {
              addCriterion("store_display_img_url_1  like ", value, "store_display_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andStoreDisplayImgUrl1NotLike(String value)
         {
              addCriterion("store_display_img_url_1  not like ", value, "store_display_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andStoreDisplayImgUrl1In(List<String> values)
         {
              addCriterion("store_display_img_url_1  in ", values, "store_display_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andStoreDisplayImgUrl1NotIn(List<String> values)
         {
              addCriterion("store_display_img_url_1  not in ", values, "store_display_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andStoreDisplayImgUrl1Between(String value1, String value2)
         {
              addCriterion("store_display_img_url_1  between ", value1,value2, "store_display_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andStoreDisplayImgUrl1NotBetween(String value1, String value2)
         {
              addCriterion("store_display_img_url_1  not between ", value1,value2, "store_display_img_url_1 ");
              return (Criteria) this;
         }
         public Criteria andStoreDisplayImgUrl2IsNull()
         {
              addCriterion("store_display_img_url_2 is null");
              return (Criteria) this;
         }

         public Criteria andStoreDisplayImgUrl2IsNotNull()
         {
              addCriterion("store_display_img_url_2  is not null");
              return (Criteria) this;
         }

         public Criteria andStoreDisplayImgUrl2EqualTo(String value)
         {
              addCriterion("store_display_img_url_2  = ", value, "store_display_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andStoreDisplayImgUrl2NotEqualTo(String value)
         {
              addCriterion("store_display_img_url_2  <> ", value, "store_display_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andStoreDisplayImgUrl2GreaterThan(String value)
         {
              addCriterion("store_display_img_url_2  > ", value, "store_display_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andStoreDisplayImgUrl2GreaterThanOrEqualTo(String value)
         {
              addCriterion("store_display_img_url_2  >= ", value, "store_display_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andStoreDisplayImgUrl2LessThan(String value)
         {
              addCriterion("store_display_img_url_2  < ", value, "store_display_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andStoreDisplayImgUrl2LessThanOrEqualTo(String value)
         {
              addCriterion("store_display_img_url_2  <= ", value, "store_display_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andStoreDisplayImgUrl2Like(String value)
         {
              addCriterion("store_display_img_url_2  like ", value, "store_display_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andStoreDisplayImgUrl2NotLike(String value)
         {
              addCriterion("store_display_img_url_2  not like ", value, "store_display_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andStoreDisplayImgUrl2In(List<String> values)
         {
              addCriterion("store_display_img_url_2  in ", values, "store_display_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andStoreDisplayImgUrl2NotIn(List<String> values)
         {
              addCriterion("store_display_img_url_2  not in ", values, "store_display_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andStoreDisplayImgUrl2Between(String value1, String value2)
         {
              addCriterion("store_display_img_url_2  between ", value1,value2, "store_display_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andStoreDisplayImgUrl2NotBetween(String value1, String value2)
         {
              addCriterion("store_display_img_url_2  not between ", value1,value2, "store_display_img_url_2 ");
              return (Criteria) this;
         }
         public Criteria andStoreDisplayImgUrl3IsNull()
         {
              addCriterion("store_display_img_url_3 is null");
              return (Criteria) this;
         }

         public Criteria andStoreDisplayImgUrl3IsNotNull()
         {
              addCriterion("store_display_img_url_3  is not null");
              return (Criteria) this;
         }

         public Criteria andStoreDisplayImgUrl3EqualTo(String value)
         {
              addCriterion("store_display_img_url_3  = ", value, "store_display_img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andStoreDisplayImgUrl3NotEqualTo(String value)
         {
              addCriterion("store_display_img_url_3  <> ", value, "store_display_img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andStoreDisplayImgUrl3GreaterThan(String value)
         {
              addCriterion("store_display_img_url_3  > ", value, "store_display_img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andStoreDisplayImgUrl3GreaterThanOrEqualTo(String value)
         {
              addCriterion("store_display_img_url_3  >= ", value, "store_display_img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andStoreDisplayImgUrl3LessThan(String value)
         {
              addCriterion("store_display_img_url_3  < ", value, "store_display_img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andStoreDisplayImgUrl3LessThanOrEqualTo(String value)
         {
              addCriterion("store_display_img_url_3  <= ", value, "store_display_img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andStoreDisplayImgUrl3Like(String value)
         {
              addCriterion("store_display_img_url_3  like ", value, "store_display_img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andStoreDisplayImgUrl3NotLike(String value)
         {
              addCriterion("store_display_img_url_3  not like ", value, "store_display_img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andStoreDisplayImgUrl3In(List<String> values)
         {
              addCriterion("store_display_img_url_3  in ", values, "store_display_img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andStoreDisplayImgUrl3NotIn(List<String> values)
         {
              addCriterion("store_display_img_url_3  not in ", values, "store_display_img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andStoreDisplayImgUrl3Between(String value1, String value2)
         {
              addCriterion("store_display_img_url_3  between ", value1,value2, "store_display_img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andStoreDisplayImgUrl3NotBetween(String value1, String value2)
         {
              addCriterion("store_display_img_url_3  not between ", value1,value2, "store_display_img_url_3 ");
              return (Criteria) this;
         }
         public Criteria andStoreDisplayImgUrl4IsNull()
         {
              addCriterion("store_display_img_url_4 is null");
              return (Criteria) this;
         }

         public Criteria andStoreDisplayImgUrl4IsNotNull()
         {
              addCriterion("store_display_img_url_4  is not null");
              return (Criteria) this;
         }

         public Criteria andStoreDisplayImgUrl4EqualTo(String value)
         {
              addCriterion("store_display_img_url_4  = ", value, "store_display_img_url_4 ");
              return (Criteria) this;
         }

         public Criteria andStoreDisplayImgUrl4NotEqualTo(String value)
         {
              addCriterion("store_display_img_url_4  <> ", value, "store_display_img_url_4 ");
              return (Criteria) this;
         }

         public Criteria andStoreDisplayImgUrl4GreaterThan(String value)
         {
              addCriterion("store_display_img_url_4  > ", value, "store_display_img_url_4 ");
              return (Criteria) this;
         }

         public Criteria andStoreDisplayImgUrl4GreaterThanOrEqualTo(String value)
         {
              addCriterion("store_display_img_url_4  >= ", value, "store_display_img_url_4 ");
              return (Criteria) this;
         }

         public Criteria andStoreDisplayImgUrl4LessThan(String value)
         {
              addCriterion("store_display_img_url_4  < ", value, "store_display_img_url_4 ");
              return (Criteria) this;
         }

         public Criteria andStoreDisplayImgUrl4LessThanOrEqualTo(String value)
         {
              addCriterion("store_display_img_url_4  <= ", value, "store_display_img_url_4 ");
              return (Criteria) this;
         }

         public Criteria andStoreDisplayImgUrl4Like(String value)
         {
              addCriterion("store_display_img_url_4  like ", value, "store_display_img_url_4 ");
              return (Criteria) this;
         }

         public Criteria andStoreDisplayImgUrl4NotLike(String value)
         {
              addCriterion("store_display_img_url_4  not like ", value, "store_display_img_url_4 ");
              return (Criteria) this;
         }

         public Criteria andStoreDisplayImgUrl4In(List<String> values)
         {
              addCriterion("store_display_img_url_4  in ", values, "store_display_img_url_4 ");
              return (Criteria) this;
         }

         public Criteria andStoreDisplayImgUrl4NotIn(List<String> values)
         {
              addCriterion("store_display_img_url_4  not in ", values, "store_display_img_url_4 ");
              return (Criteria) this;
         }

         public Criteria andStoreDisplayImgUrl4Between(String value1, String value2)
         {
              addCriterion("store_display_img_url_4  between ", value1,value2, "store_display_img_url_4 ");
              return (Criteria) this;
         }

         public Criteria andStoreDisplayImgUrl4NotBetween(String value1, String value2)
         {
              addCriterion("store_display_img_url_4  not between ", value1,value2, "store_display_img_url_4 ");
              return (Criteria) this;
         }
         public Criteria andMakeShowTitleImgUrlIsNull()
         {
              addCriterion("make_show_title_img_url is null");
              return (Criteria) this;
         }

         public Criteria andMakeShowTitleImgUrlIsNotNull()
         {
              addCriterion("make_show_title_img_url  is not null");
              return (Criteria) this;
         }

         public Criteria andMakeShowTitleImgUrlEqualTo(String value)
         {
              addCriterion("make_show_title_img_url  = ", value, "make_show_title_img_url ");
              return (Criteria) this;
         }

         public Criteria andMakeShowTitleImgUrlNotEqualTo(String value)
         {
              addCriterion("make_show_title_img_url  <> ", value, "make_show_title_img_url ");
              return (Criteria) this;
         }

         public Criteria andMakeShowTitleImgUrlGreaterThan(String value)
         {
              addCriterion("make_show_title_img_url  > ", value, "make_show_title_img_url ");
              return (Criteria) this;
         }

         public Criteria andMakeShowTitleImgUrlGreaterThanOrEqualTo(String value)
         {
              addCriterion("make_show_title_img_url  >= ", value, "make_show_title_img_url ");
              return (Criteria) this;
         }

         public Criteria andMakeShowTitleImgUrlLessThan(String value)
         {
              addCriterion("make_show_title_img_url  < ", value, "make_show_title_img_url ");
              return (Criteria) this;
         }

         public Criteria andMakeShowTitleImgUrlLessThanOrEqualTo(String value)
         {
              addCriterion("make_show_title_img_url  <= ", value, "make_show_title_img_url ");
              return (Criteria) this;
         }

         public Criteria andMakeShowTitleImgUrlLike(String value)
         {
              addCriterion("make_show_title_img_url  like ", value, "make_show_title_img_url ");
              return (Criteria) this;
         }

         public Criteria andMakeShowTitleImgUrlNotLike(String value)
         {
              addCriterion("make_show_title_img_url  not like ", value, "make_show_title_img_url ");
              return (Criteria) this;
         }

         public Criteria andMakeShowTitleImgUrlIn(List<String> values)
         {
              addCriterion("make_show_title_img_url  in ", values, "make_show_title_img_url ");
              return (Criteria) this;
         }

         public Criteria andMakeShowTitleImgUrlNotIn(List<String> values)
         {
              addCriterion("make_show_title_img_url  not in ", values, "make_show_title_img_url ");
              return (Criteria) this;
         }

         public Criteria andMakeShowTitleImgUrlBetween(String value1, String value2)
         {
              addCriterion("make_show_title_img_url  between ", value1,value2, "make_show_title_img_url ");
              return (Criteria) this;
         }

         public Criteria andMakeShowTitleImgUrlNotBetween(String value1, String value2)
         {
              addCriterion("make_show_title_img_url  not between ", value1,value2, "make_show_title_img_url ");
              return (Criteria) this;
         }
         public Criteria andMakeShowImgUrl1IsNull()
         {
              addCriterion("make_show_img_url_1 is null");
              return (Criteria) this;
         }

         public Criteria andMakeShowImgUrl1IsNotNull()
         {
              addCriterion("make_show_img_url_1  is not null");
              return (Criteria) this;
         }

         public Criteria andMakeShowImgUrl1EqualTo(String value)
         {
              addCriterion("make_show_img_url_1  = ", value, "make_show_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andMakeShowImgUrl1NotEqualTo(String value)
         {
              addCriterion("make_show_img_url_1  <> ", value, "make_show_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andMakeShowImgUrl1GreaterThan(String value)
         {
              addCriterion("make_show_img_url_1  > ", value, "make_show_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andMakeShowImgUrl1GreaterThanOrEqualTo(String value)
         {
              addCriterion("make_show_img_url_1  >= ", value, "make_show_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andMakeShowImgUrl1LessThan(String value)
         {
              addCriterion("make_show_img_url_1  < ", value, "make_show_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andMakeShowImgUrl1LessThanOrEqualTo(String value)
         {
              addCriterion("make_show_img_url_1  <= ", value, "make_show_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andMakeShowImgUrl1Like(String value)
         {
              addCriterion("make_show_img_url_1  like ", value, "make_show_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andMakeShowImgUrl1NotLike(String value)
         {
              addCriterion("make_show_img_url_1  not like ", value, "make_show_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andMakeShowImgUrl1In(List<String> values)
         {
              addCriterion("make_show_img_url_1  in ", values, "make_show_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andMakeShowImgUrl1NotIn(List<String> values)
         {
              addCriterion("make_show_img_url_1  not in ", values, "make_show_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andMakeShowImgUrl1Between(String value1, String value2)
         {
              addCriterion("make_show_img_url_1  between ", value1,value2, "make_show_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andMakeShowImgUrl1NotBetween(String value1, String value2)
         {
              addCriterion("make_show_img_url_1  not between ", value1,value2, "make_show_img_url_1 ");
              return (Criteria) this;
         }
         public Criteria andMakeShowImgUrl2IsNull()
         {
              addCriterion("make_show_img_url_2 is null");
              return (Criteria) this;
         }

         public Criteria andMakeShowImgUrl2IsNotNull()
         {
              addCriterion("make_show_img_url_2  is not null");
              return (Criteria) this;
         }

         public Criteria andMakeShowImgUrl2EqualTo(String value)
         {
              addCriterion("make_show_img_url_2  = ", value, "make_show_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andMakeShowImgUrl2NotEqualTo(String value)
         {
              addCriterion("make_show_img_url_2  <> ", value, "make_show_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andMakeShowImgUrl2GreaterThan(String value)
         {
              addCriterion("make_show_img_url_2  > ", value, "make_show_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andMakeShowImgUrl2GreaterThanOrEqualTo(String value)
         {
              addCriterion("make_show_img_url_2  >= ", value, "make_show_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andMakeShowImgUrl2LessThan(String value)
         {
              addCriterion("make_show_img_url_2  < ", value, "make_show_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andMakeShowImgUrl2LessThanOrEqualTo(String value)
         {
              addCriterion("make_show_img_url_2  <= ", value, "make_show_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andMakeShowImgUrl2Like(String value)
         {
              addCriterion("make_show_img_url_2  like ", value, "make_show_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andMakeShowImgUrl2NotLike(String value)
         {
              addCriterion("make_show_img_url_2  not like ", value, "make_show_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andMakeShowImgUrl2In(List<String> values)
         {
              addCriterion("make_show_img_url_2  in ", values, "make_show_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andMakeShowImgUrl2NotIn(List<String> values)
         {
              addCriterion("make_show_img_url_2  not in ", values, "make_show_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andMakeShowImgUrl2Between(String value1, String value2)
         {
              addCriterion("make_show_img_url_2  between ", value1,value2, "make_show_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andMakeShowImgUrl2NotBetween(String value1, String value2)
         {
              addCriterion("make_show_img_url_2  not between ", value1,value2, "make_show_img_url_2 ");
              return (Criteria) this;
         }
         public Criteria andMakeShowImgUrl3IsNull()
         {
              addCriterion("make_show_img_url_3 is null");
              return (Criteria) this;
         }

         public Criteria andMakeShowImgUrl3IsNotNull()
         {
              addCriterion("make_show_img_url_3  is not null");
              return (Criteria) this;
         }

         public Criteria andMakeShowImgUrl3EqualTo(String value)
         {
              addCriterion("make_show_img_url_3  = ", value, "make_show_img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andMakeShowImgUrl3NotEqualTo(String value)
         {
              addCriterion("make_show_img_url_3  <> ", value, "make_show_img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andMakeShowImgUrl3GreaterThan(String value)
         {
              addCriterion("make_show_img_url_3  > ", value, "make_show_img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andMakeShowImgUrl3GreaterThanOrEqualTo(String value)
         {
              addCriterion("make_show_img_url_3  >= ", value, "make_show_img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andMakeShowImgUrl3LessThan(String value)
         {
              addCriterion("make_show_img_url_3  < ", value, "make_show_img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andMakeShowImgUrl3LessThanOrEqualTo(String value)
         {
              addCriterion("make_show_img_url_3  <= ", value, "make_show_img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andMakeShowImgUrl3Like(String value)
         {
              addCriterion("make_show_img_url_3  like ", value, "make_show_img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andMakeShowImgUrl3NotLike(String value)
         {
              addCriterion("make_show_img_url_3  not like ", value, "make_show_img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andMakeShowImgUrl3In(List<String> values)
         {
              addCriterion("make_show_img_url_3  in ", values, "make_show_img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andMakeShowImgUrl3NotIn(List<String> values)
         {
              addCriterion("make_show_img_url_3  not in ", values, "make_show_img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andMakeShowImgUrl3Between(String value1, String value2)
         {
              addCriterion("make_show_img_url_3  between ", value1,value2, "make_show_img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andMakeShowImgUrl3NotBetween(String value1, String value2)
         {
              addCriterion("make_show_img_url_3  not between ", value1,value2, "make_show_img_url_3 ");
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

		public ColumnName addStoreDisplayImgUrl1Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="store_display_img_url_1";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",store_display_img_url_1";
            }
            return this;
        }

		public ColumnName addStoreDisplayImgUrl2Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="store_display_img_url_2";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",store_display_img_url_2";
            }
            return this;
        }

		public ColumnName addStoreDisplayImgUrl3Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="store_display_img_url_3";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",store_display_img_url_3";
            }
            return this;
        }

		public ColumnName addStoreDisplayImgUrl4Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="store_display_img_url_4";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",store_display_img_url_4";
            }
            return this;
        }

		public ColumnName addMakeShowTitleImgUrlColumn()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="make_show_title_img_url";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",make_show_title_img_url";
            }
            return this;
        }

		public ColumnName addMakeShowImgUrl1Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="make_show_img_url_1";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",make_show_img_url_1";
            }
            return this;
        }

		public ColumnName addMakeShowImgUrl2Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="make_show_img_url_2";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",make_show_img_url_2";
            }
            return this;
        }

		public ColumnName addMakeShowImgUrl3Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="make_show_img_url_3";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",make_show_img_url_3";
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
