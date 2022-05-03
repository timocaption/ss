import com.alibaba.druid.pool.DruidDataSource;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class druiddemo {
public static DruidDataSource dataSource;
static {
        Properties properties =new Properties();
    try {
        properties.load(new FileInputStream("src/db.properties"));
    } catch (IOException e) {
        e.printStackTrace();
    }

}
public static void query(){

}

}
