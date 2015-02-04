package ufpe.cin_cycle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class TelaWebView extends Activity{

	private final String URLbase = "http://www.google.com.br"; 
	//private final String URLbase = "http://192.168.42.1"; 
	private WebView wv;
	private Button bt;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_teste_wifi);
		wv = (WebView) findViewById(R.id.wv_exibindo_imagens_da_placa);
		Log.d("DEBUG", "deu o find");

//		bt = (Button)findViewById(R.id.bt_button);
//		bt.setOnClickListener(wv.loadUrl(URLbase));
		
//
//		wv.setWebViewClient(new WebViewClient() {
//            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
//                wv.loadUrl("msgErro.html");
//
//            }
//        });
//		

//
//		wv.setWebViewClient(new WebViewClient(){
//
//			@Override
//			public boolean shouldOverrideUrlLoading(WebView view, String url){
//				view.loadUrl(url);
//				return true;
//			}
//		});
		Log.d("DEBUG", "onresume");
		wv.loadUrl(URLbase);

	}
	

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		

		Log.d("DEBUG", "onresume");
		wv.loadUrl(URLbase);


	}

}