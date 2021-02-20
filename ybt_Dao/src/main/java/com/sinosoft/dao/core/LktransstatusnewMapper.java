package com.sinosoft.dao.core;

import com.sinosoft.coreentity.Lktransstatusnew;
import com.sinosoft.coreentity.LktransstatusnewExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface LktransstatusnewMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LKTransStatusNew
     *
     * @mbggenerated Sat Feb 20 13:34:07 CST 2021
     */
    int countByExample(LktransstatusnewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LKTransStatusNew
     *
     * @mbggenerated Sat Feb 20 13:34:07 CST 2021
     */
    int deleteByExample(LktransstatusnewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LKTransStatusNew
     *
     * @mbggenerated Sat Feb 20 13:34:07 CST 2021
     */
    int insert(Lktransstatusnew record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LKTransStatusNew
     *
     * @mbggenerated Sat Feb 20 13:34:07 CST 2021
     */
    int insertSelective(Lktransstatusnew record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LKTransStatusNew
     *
     * @mbggenerated Sat Feb 20 13:34:07 CST 2021
     */
    List<Lktransstatusnew> selectByExample(LktransstatusnewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LKTransStatusNew
     *
     * @mbggenerated Sat Feb 20 13:34:07 CST 2021
     */
    int updateByExampleSelective(@Param("record") Lktransstatusnew record, @Param("example") LktransstatusnewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LKTransStatusNew
     *
     * @mbggenerated Sat Feb 20 13:34:07 CST 2021
     */
    int updateByExample(@Param("record") Lktransstatusnew record, @Param("example") LktransstatusnewExample example);
}