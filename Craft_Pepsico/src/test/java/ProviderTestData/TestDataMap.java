package ProviderTestData;

import java.util.HashMap;
import java.util.Map;

public class TestDataMap
{
    private static Map<String, String> map = new HashMap<String, String>();

    public static Map<String, String> orderMap()
    {
        for(int i=0; i<30; i++)
        {
            StringBuilder smp = new StringBuilder();
            String s = (java.time.LocalDateTime.now().toString());
            //System.out.println(s);
            String str[] = s.split("T");
            String sdy[] = str[0].split("-");
            smp.append(sdy[0]).append(sdy[1]).append(sdy[2]);
            String sdy2[] = str[1].split(":");
            smp.append(sdy2[0]).append(sdy2[1]);
            smp.append(sdy2[2]);
            String valueTs = smp.toString();
            map.put("orderId" + i, "B2B.CO001." + valueTs + "000" + i);
        }
        map.put("orderId10", "");
        return map;
    }

    public static Map<String, String> waorderMap()
    {
        for(int i=0; i<12; i++)
        {
            StringBuilder smp = new StringBuilder();
            String s = (java.time.LocalDateTime.now().toString());
            //System.out.println(s);
            String str[] = s.split("T");
            String sdy[] = str[0].split("-");
            smp.append(sdy[0]).append(sdy[1]).append(sdy[2]);
            String sdy2[] = str[1].split(":");
            smp.append(sdy2[0]).append(sdy2[1]);
            smp.append(sdy2[2]);
            String valueTs = smp.toString();
            map.put("orderWAId" + i, "WA.MX121." + valueTs + "000" + i);
        }
        map.put("orderWAId10", "");
        return map;
    }

    public static Map<String, String> pO1orderMap()
    {
        for(int i=0; i<30; i++)
        {
            StringBuilder smp = new StringBuilder();
            String s = (java.time.LocalDateTime.now().toString());
            //System.out.println(s);
            String str[] = s.split("T");
            String sdy[] = str[0].split("-");
            smp.append(sdy[0]).append(sdy[1]).append(sdy[2]);
            String sdy2[] = str[1].split(":");
            smp.append(sdy2[0]).append(sdy2[1]);
            smp.append(sdy2[2]);
            String valueTs = smp.toString();
            map.put("pO1orderId" + i, "PO1.INTRNL." + valueTs + "000" + i);
        }
        return map;
    }


}
