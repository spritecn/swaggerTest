package github.spritecn.swaggerTest.util

import io.itit.itf.okhttp.FastHttpClient
import io.itit.itf.okhttp.HttpClient
import io.itit.itf.okhttp.callback.StringCallback
import okhttp3.Call
import okhttp3.ConnectionPool
import okhttp3.OkHttpClient
import spark.Service

import java.util.concurrent.TimeUnit

/**
 * @author: spriteCn*
 * @Date: 2020/11/19
 * @Description: HttpUtil with okhttp
 */
class HttpUtil {
    static def TIME_OUT = 5
    private static ConnectionPool pool = new ConnectionPool(10, 10, TimeUnit.MINUTES)
    private static   HttpClient httpClient = new HttpClient(new OkHttpClient().newBuilder()
            .connectTimeout(TIME_OUT, TimeUnit.MINUTES)
            .readTimeout(TIME_OUT, TimeUnit.MINUTES)
            .retryOnConnectionFailure(false)
            .connectionPool(pool).build())

    static String get(String url,headers = [:],parama = [:]){
        httpClient.get().url(url).addHeaders(headers).addParams(parama).build().execute().string()
    }
    /**
     *
     * @param url
     * @param headers
     * @param parama
     * @param a Closure to callback when access  {log.info(it)}
     */
    static void asyncGet(String url,headers = [:],parama = [:],Closure callback){
        httpClient.get().url(url).addHeaders(headers).addParams(parama).build().executeAsync(new StringCallback() {
            @Override
            void onFailure(Call call, Exception e, int id) {
                throw e
            }
            @Override
            void onSuccess(Call call, String response, int id) {
                callback(response)
            }
        })
    }

}
