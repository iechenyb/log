import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 作者 : iechenyb<br>
 * 类描述: 说点啥<br>
 * 创建时间: 2017年11月28日
 */
public class Main {
	private final static Logger logger = LoggerFactory.getLogger(Main.class);
	public static void main(String[] args) {
		logger.warn("logback 成功了");
		logger.info("logback 成功了");
		logger.error("logback 成功了");
		logger.debug("logback 成功了");
	}
}
