package com.xiaoyun.hadoopexl.dao;

import com.xiaoyun.hadoopexl.bean.HadoopData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HadoopDataDAO extends JpaRepository<HadoopData, Integer> {
}
