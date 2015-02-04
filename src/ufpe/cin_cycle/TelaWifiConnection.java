package ufpe.cin_cycle;

import javax.crypto.CipherInputStream;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class TelaWifiConnection extends Activity{

	WebView webview;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_wifi_connection);
		
//		String customHtml = "<html><body><h2>Greetings from JavaCodeGeeks</h2></body></html>";		       
//		webview.loadData(customHtml, "text/html", "UTF-8");

		
//		webview.setWebViewClient(new WebViewClient() {
//            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
//                webview.loadUrl("msgErro.html");
//
//            }
//        });
		
		//WifiManager wifiMgr = (WifiManager) getActivity().getSystemService(Context.WIFI_SERVICE);
		//WifiInfo wifiInfo = wifiMgr.getConnectionInfo();
		//String name = wifiInfo.getSSID();
		
//		Intent it = new Intent(TelaWifiConnection.this, TelaWebView.class);
//		Log.d("DEBUG", "c");
//
//		startActivity(it);
//		finish();

	}
}
