/**
 * FileName: PDFToDOCXUtil
 * Author:   xiangjunzhong
 * Date:     2018/3/6 14:17
 * Description: PDF转DOCX工具类
 */
package com.gibbons.common.util;

import org.apache.http.HttpEntity;
import org.apache.http.ParseException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.util.CharsetUtils;
import org.apache.http.util.EntityUtils;

import java.io.*;

/**
 * 〈一句话功能简述〉<br>
 * 〈PDF转DOCX工具类〉
 *
 * @author xiangjunzhong
 * @create 2018/3/6 14:17
 * @since 1.0.0
 */
public class PDFToDOCXUtil {

    private static CloseableHttpClient httpClient;

    private static final String URL = "http://221.122.93.167:51006/v1/convert/upload";

    static {
        PoolingHttpClientConnectionManager cm = new PoolingHttpClientConnectionManager();
        cm.setMaxTotal(100);
        cm.setDefaultMaxPerRoute(20);
        cm.setDefaultMaxPerRoute(50);
        httpClient = HttpClients.custom().setConnectionManager(cm).build();
    }

    /**
     * PDF TO DOCX
     *
     * @throws ParseException
     * @throws IOException
     */
    public static void postFile(String path) throws ParseException, IOException {
        try {
            String filePath = new String(path);
            HttpPost httpPost = new HttpPost(URL);
            File file = new File(filePath);
            FileBody bin = new FileBody(file);
            HttpEntity reqEntity = MultipartEntityBuilder.create().setMode(HttpMultipartMode.BROWSER_COMPATIBLE)
                    .addPart("data", bin)
                    .setCharset(CharsetUtils.get("UTF-8")).build();
            httpPost.setEntity(reqEntity);

            // 发起请求 并返回请求的响应
            CloseableHttpResponse response = httpClient.execute(httpPost);
            try {
                // 打印响应状态
                System.out.println("----------------------------------------:" + response.getStatusLine());
                // 获取响应对象
                HttpEntity resEntity = response.getEntity();
                if (resEntity != null) {
                    // 打印响应长度
                    System.out.println("Response content length: " + resEntity.getContentLength());
                    inputStreamToFile(resEntity.getContent(), new File(filePath.substring(0, filePath.lastIndexOf(".")) + ".docx"));
                }
                // 销毁
                EntityUtils.consume(resEntity);
            } finally {
                response.close();
            }
        } finally {
            httpClient.close();
        }
    }

    public static void inputStreamToFile(InputStream ins, File file) throws IOException {
        OutputStream os = new FileOutputStream(file);
        int bytesRead = 0;
        byte[] buffer = new byte[8192];
        while ((bytesRead = ins.read(buffer, 0, 8192)) != -1) {
            os.write(buffer, 0, bytesRead);
        }
        os.close();
        ins.close();
    }

    public static void main(String[] args) {
        try {
            postFile("C:\\Users\\Administrator\\Desktop\\合同111.pdf");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}