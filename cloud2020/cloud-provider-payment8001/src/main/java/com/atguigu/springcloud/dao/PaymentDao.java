package com.atguigu.springcloud.dao;

        import com.atguigu.springcloud.entities.Payment;
        import org.apache.ibatis.annotations.Mapper;
        import org.apache.ibatis.annotations.Param;

/**
 * @author lk
 */
@Mapper
public interface PaymentDao {

    /**
     * 插入
     * @param payment 实体对象
     * @return
     */
    public int create(Payment payment);


    /**
     * 按id查找
     * @param id id
     * @return
     */
    public Payment getPaymentById(@Param("id")Long id);
}
