package com.cfzd.article.dao;

import com.cfzd.article.bean.AccountLog;

public interface AccountLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_log
     *
     * @mbggenerated Tue Jul 19 07:10:25 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_log
     *
     * @mbggenerated Tue Jul 19 07:10:25 CST 2016
     */
    int insert(AccountLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_log
     *
     * @mbggenerated Tue Jul 19 07:10:25 CST 2016
     */
    int insertSelective(AccountLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_log
     *
     * @mbggenerated Tue Jul 19 07:10:25 CST 2016
     */
    AccountLog selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_log
     *
     * @mbggenerated Tue Jul 19 07:10:25 CST 2016
     */
    int updateByPrimaryKeySelective(AccountLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_log
     *
     * @mbggenerated Tue Jul 19 07:10:25 CST 2016
     */
    int updateByPrimaryKey(AccountLog record);
}