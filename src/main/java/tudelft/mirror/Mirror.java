package tudelft.mirror;

public class Mirror {

    public String mirrorEnds(String string) {
        String mirror = "";

        int begin = 0;
        int end = string.length() - 1;
        for (; begin < end; begin++, end--) {
            System.out.println("begin:"+begin+" end:"+end);
            if (string.charAt(begin) == string.charAt(end)) {
                mirror += String.valueOf(string.charAt(end));
            }
            else {
                break;
            }
        }


        if(string.length()%2==0 && begin==string.length()/2)
            return string;
        else if(string.length()%2==1 && begin==end)
            return string;
        else
            return mirror;


        //return begin == end ? string : mirror;
    }
}
