package com.daniel.tieba;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class WelcomeActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcome);
		new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                Intent intent=new Intent(WelcomeActivity.this,MainActivity.class);
                startActivity(intent);
                int version = Integer.valueOf(android.os.Build.VERSION.SDK);
                if(version  >= 5) {     
                   overridePendingTransition(R.anim.dialog_ani_r2l_enter, R.anim.dialog_ani_r2l_exit); 
                } 
                WelcomeActivity.this.finish();
            }
        }, 3000);  
	}
}
