// ArrayList

import java.util.*;

class Collections2
{
    public static void main(String Arg[])
    {
        ArrayList <String> aobj = new ArrayList<String>();
        System.out.println(aobj);
        aobj.add("PPA");
        aobj.add("LB");
        aobj.add("PYTHON");
        aobj.add("PPA++");
        aobj.add("LB++");

        for(String str : aobj)
        {
            System.out.println(str);
        }
    }
}