import com.alibaba.excel.EasyExcel;
import model.Information;

import javax.sound.sampled.Line;
import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<Information> informationArrayList = new ArrayList<Information>();
        Information information =
                new Information("1","1","1","1","1","1","1","1");
        informationArrayList.add(information);
        String fileName = "D:/01.xlsx";
        EasyExcel.write(fileName,Information.class).sheet("模板").doWrite(informationArrayList);


    }
}
