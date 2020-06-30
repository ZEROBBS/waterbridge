package com.wswl.waterbridge.common;

import java.util.Random;
import java.util.UUID;

public class GuidUtil {


    /**
     *
     * 功能描述: <br>
     * 主键生成器32位
     *
     * @return
     */
    public static final synchronized String getUUID() {
        String uuid = UUID.randomUUID().toString();
        StringBuilder sb = new StringBuilder(32);
        sb.append(uuid.substring(0, 8));
        sb.append(uuid.substring(9, 13));
        sb.append(uuid.substring(14, 18));
        sb.append(uuid.substring(19, 23));
        sb.append(uuid.substring(24, 36));
        return sb.toString();
    }


    /**
     * 获取16进制随机数
     * @param len
     * @return
     */
    public static String randomHexString(int len)  {
        try {
            StringBuffer result = new StringBuffer();
            for(int i=0;i<len;i++) {
                result.append(Integer.toHexString(new Random().nextInt(16)));
            }
            return result.toString().toUpperCase();

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();

        }
        return null;

    }

}
