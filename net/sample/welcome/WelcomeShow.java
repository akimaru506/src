package net.sample.welcome;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;


public class WelcomeShow extends View{
		public WelcomeShow(Context context){
			super(context);
			setBackgroundColor(Color.BLUE);
		}
		protected void onDrow(Canvas canvas){
			Paint paint = new Paint();
			paint.setColor(Color.WHITE);
			//paint.setAlpha(TEXT_ALIGNMENT_CENTER);
			canvas.drawText("Welcome droid World!",0,12,paint);
		}

}
