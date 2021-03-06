package cn.qian.chain;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by 千里明月 on 2019/1/8.
 */
//负责处理域名
public class HostHandler extends Handler {

    @Override
    public void handleRequest(URLEntity urlEntity, String url) throws MalformedURLException {
        URL urlInstance = new URL(url);
        String host = urlInstance.getHost();
        urlEntity.setHost(host);
        if (getHandler() != null) {
            getHandler().handleRequest(urlEntity, url);
        }
    }
}
