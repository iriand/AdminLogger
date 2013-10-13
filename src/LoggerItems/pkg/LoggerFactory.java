package LoggerItems.pkg;

import org.jetbrains.annotations.NotNull;

/**
 * Created with IntelliJ IDEA.
 * User:IgalYadid
 * Date: 10/10/13
 * Time: 10:22 AM
 * To change this template use File | Settings | File Templates.
 */
public class LoggerFactory {

    private static Logger logger = null;

    @NotNull
    public static Logger getLogger(String type) {

        if(type.equals("consolePrint"))
            logger = new LoggerImpl() ;

//        if (logger.getClass().equals(LoggerImpl.class)) {
//                // logger.print();
//
//        }
//        else if(logger.getClass().equals(ChangeOpidItem.class)){
//           // logger = new ChangeOpidItem(logger.)
//        }


        return LoggerFactory.logger;
    }

}
