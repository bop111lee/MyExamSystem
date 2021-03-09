import model.Information;

import javax.sound.sampled.Line;

public class test {
    public static void main(String[] args) {
        String message = "收货人: 周素丽,联系电话:15220231453,收货地址:黑龙江深圳市龙岗区南湾街道南湾街道下李朗社区大坑肚2号门口";
        String replace = message.replace(" ", "");
        String[] message_split = replace.split(",");
        Information information = new Information();
        //录入姓名
        String[] name = message_split[0].split(":");
        information.setName(name[1]);
        //录入电话
        String[] phone = message_split[1].split(":");
        information.setPhone(phone[1]);
        //录入省份
        String[] addr = message_split[2].split(":");
        String provice_maybe = addr[1].substring(0, 3);
        int begin_num = 0;
        if(provice_maybe.equals("黑龙江") || provice_maybe.equals("内蒙古")){
            provice_maybe = provice_maybe + "省";
            information.setProvince(provice_maybe);
            begin_num = 3;
        }else {
            String provice = addr[1].substring(0, 2) + "省";
            information.setProvince(provice);
            begin_num = 2;
        }
        //录入市级
        int city_index = addr[1].indexOf("市");
        String city = addr[1].substring(begin_num, city_index + 1);
        information.setCity(city);
        System.out.println(information.toString());
        //录入省级
        //无
    }
}
