import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 作者 : iechenyb<br>
 * 类描述: 说点啥 apachelog 配合log4j使用<br>
 * 创建时间: 2017年11月28日
 */
public class Main {
	public static Log log = LogFactory.getLog(Main.class);

	/**
	 * @创建时间： 2016年2月22日 
	 * @相关参数：
	 *  @功能描述： 定义一个输出日志的方法
	 * <p>
	 * trace→debug→info→warn→error→fatal→off 级别依次升高，
	 * 级别高的level会屏蔽级别低的level。
	 * </p>
	 */
	public static void main(String[] args) {
		log.trace("trace级别的日志输出");
		log.info("info级别的日志输出");
		log.debug("debug级别的日志输出");
		log.warn("warn级别的日志输出");
		log.error("error级别的日志输出");
		log.fatal("fatal级别的日志输出");
	}
}
