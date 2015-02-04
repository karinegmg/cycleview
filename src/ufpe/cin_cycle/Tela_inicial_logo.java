package ufpe.cin_cycle;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

public class Tela_inicial_logo extends Activity{

	private static int timeout = 2000;

	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_inicial_logo);

		new Handler().postDelayed(new Runnable() {

			@Override
			public void run() {
				//Log.d("DEBUG", "onclick");

				Intent it = new Intent(Tela_inicial_logo.this, TelaWebView.class);
				Log.d("DEBUG", "c");

				startActivity(it);
				finish();
			}
		}, timeout);
	}
}
