package com.francis.a36kr.ui.activity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import com.francis.a36kr.R;
import com.francis.a36kr.ui.activity.base.BaseActivity;
import com.francis.a36kr.ui.widget.CustomVideoView;

/**
 * @author taoc @ Zhihu Inc.
 * @since 09-07-2016
 *
 *
 * 启动欢迎界面
 */
public class WelcomeActivity extends BaseActivity {

	private Button btnWelcome;
	private CustomVideoView vvWelcome;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcome);
		btnWelcome = (Button) this.findViewById(R.id.btn_welcome);
		vvWelcome = (CustomVideoView) this.findViewById(R.id.vv_welcome);
		vvWelcome.setVideoURI(Uri.parse("android.resource://" + this.getPackageName() + "/" + R.raw.kr36));
		vvWelcome.start();
		vvWelcome.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

			@Override
			public void onCompletion(MediaPlayer mediaPlayer) {
				vvWelcome.start();
			}
		});

		btnWelcome.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				if(vvWelcome.isPlaying()){
					vvWelcome.stopPlayback();
					vvWelcome = null;
				}
				openActivity(MainActivity.class);
				WelcomeActivity.this.finish();
			}
		});
	}
}
