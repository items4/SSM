package cn.gov.jseport.mapper;

import cn.gov.jseport.entity.Userinforole;
import cn.gov.jseport.entity.UserinforoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserinforoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinforole
     *
     * @mbggenerated Sun Apr 28 19:17:59 CST 2019
     */
    int countByExample(UserinforoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinforole
     *
     * @mbggenerated Sun Apr 28 19:17:59 CST 2019
     */
    int deleteByExample(UserinforoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinforole
     *
     * @mbggenerated Sun Apr 28 19:17:59 CST 2019
     */
    int insert(Userinforole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinforole
     *
     * @mbggenerated Sun Apr 28 19:17:59 CST 2019
     */
    int insertSelective(Userinforole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinforole
     *
     * @mbggenerated Sun Apr 28 19:17:59 CST 2019
     */
    List<Userinforole> selectByExample(UserinforoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinforole
     *
     * @mbggenerated Sun Apr 28 19:17:59 CST 2019
     */
    int updateByExampleSelective(@Param("record") Userinforole record, @Param("example") UserinforoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinforole
     *
     * @mbggenerated Sun Apr 28 19:17:59 CST 2019
     */
    int updateByExample(@Param("record") Userinforole record, @Param("example") UserinforoleExample example);
}