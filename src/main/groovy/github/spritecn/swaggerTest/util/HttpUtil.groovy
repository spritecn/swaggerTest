package github.spritecn.swaggerTest.util

import okhttp3.ConnectionPool
import okhttp3.OkHttpClient

import java.util.concurrent.TimeUnit

/**
 * @author: spriteCn*
 * @Date: 2020/11/19
 * @Description: HttpUtil with okhttp
 */
class HttpUtil {
    def TIME_OUT = 5
    private ConnectionPool pool = new ConnectionPool(10, 10, TimeUnit.MINUTES);
    private OkHttpClient httpClient = new OkHttpClient.Builder()
            .connectTimeout(TIME_OUT, TimeUnit.MINUTES)
            .readTimeout(TIME_OUT, TimeUnit.MINUTES)
            .connectionPool(pool).build()

    String post(String url,headers = [:]){

    }
}
