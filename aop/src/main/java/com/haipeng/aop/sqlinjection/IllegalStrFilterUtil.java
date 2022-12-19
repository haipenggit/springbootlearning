package com.haipeng.aop.sqlinjection;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Slf4j
public class IllegalStrFilterUtil {

    private static Logger logger = LoggerFactory.getLogger(IllegalStrFilterUtil.class);

    private static final String REGX = "!|！|@|◎|#|＃|(\\$)|￥|%|％|(\\^)|……|(\\&)|※|(\\*)|×|(\\()|（|(\\))|）|_|——|(\\+)|＋|(\\|)|§ ";

    /**
     * 对常见的sql注入攻击进行拦截
     *
     * @param input
     * @return
     *  true 表示参数不存在SQL注入风险
     *  false 表示参数存在SQL注入风险
     */
    public static Boolean sqlStrFilter(String input) {
        if (input == null || input.trim().length() == 0) {
            return false;
        }
        input = input.toUpperCase();

        if (input.indexOf("DELETE") >= 0 || input.indexOf("ASCII") >= 0 || input.indexOf("UPDATE") >= 0 || input.indexOf("SELECT") >= 0
                || input.indexOf("'") >= 0 || input.indexOf("SUBSTR(") >= 0 || input.indexOf("COUNT(") >= 0 || input.indexOf(" OR ") >= 0
                || input.indexOf(" AND ") >= 0 || input.indexOf("DROP") >= 0 || input.indexOf("EXECUTE") >= 0 || input.indexOf("EXEC") >= 0
                || input.indexOf("TRUNCATE") >= 0 || input.indexOf("INTO") >= 0 || input.indexOf("DECLARE") >= 0 || input.indexOf("MASTER") >= 0) {
            logger.error("该参数怎么SQL注入风险：sInput=" + input);
            return false;
        }
        logger.info("通过sql检测");
        return true;
    }

    /**
     * 对非法字符进行检测
     *
     * @param input
     * @return
     *  true 表示参数不包含非法字符
     *  false 表示参数包含非法字符
     */
    public static Boolean isIllegalStr(String input) {

        if (input == null || input.trim().length() == 0) {
            return false;
        }
        input = input.trim();
        Pattern compile = Pattern.compile(REGX, Pattern.CASE_INSENSITIVE);
        Matcher matcher = compile.matcher(input);
        logger.info("通过字符串检测");
        return matcher.find();
    }
}
