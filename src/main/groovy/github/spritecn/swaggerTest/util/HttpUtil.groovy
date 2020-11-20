package github.spritecn.swaggerTest.util

import groovy.util.logging.Slf4j
import io.itit.itf.okhttp.HttpClient
import io.itit.itf.okhttp.callback.StringCallback
import okhttp3.Call
import okhttp3.ConnectionPool
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response

import java.util.concurrent.TimeUnit

/**
 * @author: spriteCn*
 * @Date: 2020/11/19
 * @Description: HttpUtil with okhttp
 */
class HttpUtil {
    static def TIME_OUT = 5
    private static ConnectionPool pool = new ConnectionPool(20, 5, TimeUnit.MINUTES)
    private static   HttpClient httpClient = new HttpClient(new OkHttpClient().newBuilder()
            .addNetworkInterceptor(new NetWorkInterceptor())
            .connectTimeout(TIME_OUT, TimeUnit.MINUTES)
            .readTimeout(TIME_OUT, TimeUnit.MINUTES)
            .retryOnConnectionFailure(false)
            .connectionPool(pool).build())

    //simple get
    static String get(String url,params = [:],headers = [:]){
        httpClient.get().url(url).addHeaders(headers).addParams(params).build().execute().string()
    }

    //simple post
    static String post(String url,params = [:],headers = [:]){
        httpClient.post().url(url).addHeaders(headers).addParams(params).build().execute().string()
    }

    //simple postJson
    static String postJson(String url,String json = "",params = [:],headers = [:]){
        headers.put("Content-Type","application/json")
        //if json is empty use params
        def body = json ?: GsonUtil.gson.toJson(params)
        httpClient.post().url(url).addHeaders(headers).body(body).build().execute().string()
    }
    /**
     *
     * @param url
     * @param requestId  gen requestId to request Tag for Interceptor
     * @param headers
     * @param params
     * @param call Closure to callback when access  {log.info(it)}
     * @Description  call example:HttpUtil.asyncGet("http://www.qq.com",{log.info(it)})
     */
    static void asyncGet(String url,int requestId = UUID.randomUUID().hashCode().abs(), headers = [:],params = [:],Closure callback){
        httpClient.get().url(url).addHeaders(headers).tag(requestId).id(requestId).addParams(params).build()
                .executeAsync(new StringCallback() {
                    @Override
                    void onFailure(Call call, Exception e, int id) {
                        throw e
                    }
                    void onSuccess(Call call,String response,int id) {
                        callback(response,id)
                    }
                }
            )
    }

}

/**
 * @author: spriteCn*
 * @Date: 2020/11/20
 * @Description:
 */
@Slf4j
class NetWorkInterceptor implements Interceptor {
    @Override
    Response intercept(Interceptor.Chain chain) throws IOException {
        Request request = chain.request()
        //log.info(request.toString())
        Response response = chain.proceed(request)
        //log.info(response.toString())
        return response;
    }
}
