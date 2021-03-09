package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Information {

    private String name;

    private String province;

    private String city;

    private String region;

    private String detailAddr;

    private String phone;

    private String message;

    private String commodities;

    @Override
    public String toString() {
        return  name  + ", " +
                province + ", " +
                city + ", " +
                region + ", " +
                detailAddr + ", " +
                phone + ", " +
                message + ", " +
                commodities;
    }
}
