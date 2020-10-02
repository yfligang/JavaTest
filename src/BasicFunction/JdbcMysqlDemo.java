package BasicFunction;

import java.sql.*;

public class JdbcMysqlDemo {

    // MySQL 8.0 以下版本 - JDBC 驱动名及数据库 URL​
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_Url = "jdbc:mysql://localhost:3306/Hello?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";

    //数据库的用户名和密码，需要根据自己的设置
    static final String USER = "root";
    static final String PASS = "123456";

    public static void main(String[] args){
        Connection conn = null;
        Statement stmt = null;

        try {
            //注册JDBC驱动
            Class.forName(JDBC_DRIVER);

            //打开链接
            System.out.println("连接数据库...");
            conn = DriverManager.getConnection(DB_Url,USER,PASS);

            //执行查询
            System.out.println("实例化Statement对象...");
            stmt = conn.createStatement();
            //数据库
            String sql;
            sql = "select * from cool";
            ResultSet rs = stmt.executeQuery(sql);

            //展开结果集数据库
            while(rs.next()){
                //通过字段检索
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int score = rs.getInt("score");

                //输入数据
                System.out.println("ID: " + id);
                System.out.println("NAME: " + name);
                System.out.println("SCORE: " + score);

                //完成后关闭

            }
            rs.close();
            stmt.close();
            conn.close();

        }catch (SQLException se){
            //处理JDBC的错误
            se.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        } finally{
            //关闭资源
            try{
                if (stmt != null) {
                    stmt.close();
                }

            }catch (Exception se2){

            }//什么都不做
            try{
                if (conn != null) {
                    conn.close();
                }

            }catch (Exception se){
                se.printStackTrace();
            }
        }

    System.out.println("Goodbye!");


    }

}
