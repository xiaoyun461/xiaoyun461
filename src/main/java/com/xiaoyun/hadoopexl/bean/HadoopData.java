package com.xiaoyun.hadoopexl.bean;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.ContentRowHeight;
import com.alibaba.excel.annotation.write.style.HeadRowHeight;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Table(name = "Hadoop_data")
@Entity
public class HadoopData implements Serializable {
    @ExcelProperty("总序号")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ColumnWidth(6)
    private Integer totalNumber;

    @ExcelProperty("群号")
    @ColumnWidth(8)
    private String groupNo;

    @ExcelProperty("小序号")
    @ColumnWidth(6)
    private String smallNumber;

    @ColumnWidth(15)
    @ExcelProperty("姓名")
    private String name;

    @ColumnWidth(4)
    @ExcelProperty("性别")
    private String gender;

    @ColumnWidth(4)
    @ExcelProperty("年龄")
    private String age;

    @ColumnWidth(8)
    @ExcelProperty("学历")
    private String education;

    @ColumnWidth(8)
    @ExcelProperty("政治面貌")
    private String politicsStatus;

    @ColumnWidth(8)
    @ExcelProperty("籍贯")
    private String nativePlace;

    @ColumnWidth(8)
    @ExcelProperty("民族")
    private String nation;

    @ColumnWidth(12)
    @ExcelProperty("手机号码")
    private String phoneNumber;

    @ColumnWidth(25)
    @ExcelProperty("身份证号码")
    private String IDCard;

    @ColumnWidth(14)
    @ExcelProperty("农行卡号码")
    private String bankCardNumber;
    @ColumnWidth(35)
    @ExcelProperty("开户行地址")
    private String bankAddress;
    @ColumnWidth(38)
    @ExcelProperty("身份证地址")
    private String idCardAddress;
    @ColumnWidth(38)
    @ExcelProperty("现住址")
    private String presentAddress;
    @ColumnWidth(25)
    @ExcelProperty("邮箱号码")
    private String email;
    @ColumnWidth(8)
    @ExcelProperty("是否退役军人")
    private String exServicemen;
    @ColumnWidth(12)
    @ExcelProperty("服役时间")
    private String attendedTime;
    @ColumnWidth(12)
    @ExcelProperty("退役时间")
    private String retiredTime;
    @ColumnWidth(18)
    @ExcelProperty("残疾人号码")
    private String disabilityNumber;
    @ColumnWidth(6)
    @ExcelProperty("推荐人姓名")
    private String NameOfReferee;
    @ColumnWidth(13)
    @ExcelProperty("推荐人手机号")
    private String phoneOfReferrer;
    @ColumnWidth(12)
    @ExcelProperty("所属大区")
    private String regional;

}
