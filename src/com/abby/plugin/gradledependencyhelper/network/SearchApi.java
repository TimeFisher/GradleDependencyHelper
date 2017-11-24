package com.abby.plugin.gradledependencyhelper.network;

import javax.swing.*;
import java.io.ByteArrayOutputStream;


import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class SearchApi {

    private static final String HOST="http://search.maven.org/solrsearch/";
    private static HttpURLConnection mConnection=null;

    public static String getDependency(String dependency,String developer,boolean isGithub){


        initConnection(dependency,developer,isGithub);
        try {
            mConnection.connect();
            if(mConnection.getResponseCode()==200){
                InputStream is=mConnection.getInputStream();
                ByteArrayOutputStream outputStream=new ByteArrayOutputStream();
                byte[] buffer=new byte[1024];
                int len=0;
                while ((len=is.read(buffer))!=-1){
                    outputStream.write(buffer,0,len);
                }

                String jsonString=outputStream.toString();
                outputStream.close();
                is.close();
                mConnection.disconnect();
                return jsonString;
            }else{
                return null;
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    private static void initConnection(String dependency,String developer,boolean isGithub){
        String host="";
        if(developer==null){
            host=HOST+"select?q="+dependency+"&rows=20&wt=json";
        }else{
            host=HOST+"select?q=g%3A%22"+developer+"%22%20AND%20a%3A%22"+dependency+"%22&rows=20&core=gav&wt=json";
        }

        if(isGithub){
            host="https://api.github.com/search/repositories?q="+dependency+"+language:java&sort=stars&order=desc";
        }
        try {
            URL url=new URL(host);
            mConnection=(HttpURLConnection)url.openConnection();
            mConnection.setRequestMethod("GET");
            mConnection.setConnectTimeout(5000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
