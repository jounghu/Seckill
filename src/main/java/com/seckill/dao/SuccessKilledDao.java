package com.seckill.dao;

import com.seckill.entity.SuccessKilled;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Jayson on 2017/5/1.
 * email:1358199510@qq.com
 */
public interface SuccessKilledDao {

    /**
     * 插入SuccessKillId
     * @param kill_id
     * @param phone
     * @return
     */
    int insert(@Param("kill_id")long kill_id,@Param("phone") long phone);

    List<SuccessKilled> loadAll();

    SuccessKilled loadById(@Param("kill_id") long kill_id, @Param("phone") long phone);
}
