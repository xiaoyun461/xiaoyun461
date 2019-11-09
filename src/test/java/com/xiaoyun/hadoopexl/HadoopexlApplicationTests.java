package com.xiaoyun.hadoopexl;

import com.alibaba.excel.EasyExcel;
import com.xiaoyun.hadoopexl.bean.HadoopData;
import com.xiaoyun.hadoopexl.dao.HadoopDataDAO;
import com.xiaoyun.hadoopexl.listener.HadoopDataListener;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HadoopexlApplicationTests {
    @Autowired
    private HadoopDataDAO hadoopDataDAO;

    @Test
    void contextLoads() {
        String fileName = "D://ho.xlsx";
        String fileName2 = "D://ho1.xlsx";
        // 这里 需要指定读用哪个class去读，然后读取第一个sheet 文件流会自动关闭
//        EasyExcel.read(fileName, HadoopData.class, new HadoopDataListener(hadoopDataDAO)).sheet().doRead();

        EasyExcel.write(fileName2, HadoopData.class).sheet().doWrite(hadoopDataDAO.findAll());
    }

}
