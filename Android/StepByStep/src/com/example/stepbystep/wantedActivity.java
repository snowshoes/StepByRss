package com.example.stepbystep;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class wantedActivity extends Activity{
	
    //������ҳ
	private Intent mainintent;	
	//���;���ҳ��
	private EditText themeName;//������
	private EditText EXcontent;//��Ҫ����
	private EditText wantedEX_num;//����EX��Ŀ
	private Button want_btn;//���Ͱ�ť
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.wanted);
		
		// ��ʼ���ؼ�
        initeViews();
	}
	private void initeViews()
	{
		
		themeName = (EditText)findViewById(R.id.themeName);
		EXcontent = (EditText)findViewById(R.id.EXcontent);
		wantedEX_num = (EditText)findViewById(R.id.wantedEX_num);
		want_btn = (Button)findViewById(R.id.want_btn);
		//�����ύ��ť����
		want_btn.setOnClickListener(new Button.OnClickListener(){  
			    	public void onClick(View v) { 
			    				
			    		
			    	}
			    });
	}
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		  if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
			//ʵ����intent
	    		mainintent =new Intent();
	    		//������ת�Ľ���
	    		mainintent.setClass(wantedActivity.this,SBSMainActivity.class);
	    		//����Activity
	    		startActivity(mainintent);
	    		wantedActivity.this.finish();
	    			  
		  }
		  return false;
		 }

}