package cin_cycle;

import com.example.cycle_project.R;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterViewAnimator;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.net.wifi.p2p.*;


public class Tela_buscarWifi_vejasempre extends Activity{

	ImageView iv_veja_sempre;
	Spinner buscarWifi; 

	public void OnCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		
		Intent intent = new Intent();
		setContentView(R.layout.activity_buscar_wifi);

		iv_veja_sempre = (ImageView) findViewById(R.id.iv_logo_vejasempre);
		//iv_veja_sempre.setImageResource(R.drawable.logo_cycle_vejasempre);
		
		buscarWifi = (Spinner) findViewById(R.id.sp_buscar_wifi);
		
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.id.sp_buscar_wifi, android.R.layout.simple_spinner_dropdown_item);
		
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		buscarWifi.setAdapter(adapter);
	
		
		WifiManager wifi = (WifiManager) getSystemService(Context.WIFI_SERVICE);
		wifi.setWifiEnabled(true);
		
		buscarWifi.setOnClickListener((OnClickListener) this);
		
		
		

	}
	
	public void onclick(Spinner sp){
		

		
	}
	


}

