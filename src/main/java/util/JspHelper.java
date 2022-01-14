package util;

import lombok.experimental.UtilityClass;

@UtilityClass
public class JspHelper {

    public static final String PREFIX = "/WEB-INF/include/";
    public static final String SUFFIX = ".jsp";

    public static String getPath(String pageName) {
        return PREFIX + pageName + SUFFIX;
    }

}
