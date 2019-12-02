package com.example.jxxy.mobileshop_luwei.view;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;

public class MyWebView extends WebView {
    private IWebViewScroll mIWebViewScroll;
    public MyWebView(Context context) {
        super(context);
    }
    public MyWebView(Context context, AttributeSet attrs) {
        super(context,attrs,0);
    }
    public MyWebView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context,attrs,defStyleAttr);
    }
    public void setOnCustomScrollChanged(IWebViewScroll listener){
        this.mIWebViewScroll=listener;
    }
    public interface IWebViewScroll{
        void onTop();
        void netOnTop();
    }
}
