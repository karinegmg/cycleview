package cin_cycle;


import com.example.cycle_project.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;


public class Tela_inicial_logo extends Activity implements OnClickListener{

	TextView tv_vejasempre;
	ImageView iv_logo_cycle;

	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_inicial_logo);
		
		
		iv_logo_cycle = (ImageView) findViewById(R.id.iv_logo);
		iv_logo_cycle.setImageResource(R.drawable.logo_equipecycle_cinza);
		
		iv_logo_cycle.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {

		Intent it = new Intent (this,Tela_buscarWifi_vejasempre.class);
		startActivity(it);
		finish();
	}


}
