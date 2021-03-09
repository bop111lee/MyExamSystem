package model;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Information {

    @ExcelProperty(value = "收件人姓名",index = 4)
    private String name;

    @ExcelProperty(value = "省份",index = 5)
    private String province;

    @ExcelProperty(value = "城市",index = 6)
    private String city;

    @ExcelProperty(value = "地区",index = 7)
    private String region;

    @ExcelProperty(value = "地址",index = 8)
    private String detailAddr;

    @ExcelProperty(value = "手机",index = 9)
    private String phone;


    @ExcelProperty(value = "商品和数量",index = 13)
    private String commodities;

    @Override
    public String toString() {
        return  name  + "," +
                province + "," +
                city + "," +
                region + "," +
                detailAddr + "," +
                phone + "," +
                commodities;
    }
}
