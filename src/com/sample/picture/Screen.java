package com.sample.picture;


import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.graphics.*;
import android.view.MotionEvent;

public class Screen extends View {
	
	float x, y;
	Paint p = new Paint();
	Bitmap img0, img1, img2;
	
	public Screen(Context context) {
		super(context);
		Resources res = this.getContext().getResources();
		img0 = BitmapFactory.decodeResource(res, R.drawable.himawari);
		img1 = BitmapFactory.decodeResource(res, R.drawable.tomato);
		img2 = BitmapFactory.decodeResource(res, R.drawable.cat);
	}
	
	public boolean onTouchEvent(MotionEvent ev) {
		if(ev.getAction() == MotionEvent.ACTION_DOWN) {
			x = ev.getX();
			y = ev.getY();
			Screen.this.invalidate();
		}
		return true;
	}
	
	@Override
	protected void onDraw(Canvas c) {
		super.onDraw(c);
		
		c.drawColor(Color.BLACK);
		c.drawBitmap(img0,0,0,p);
		c.drawBitmap(img1,200,0,p);
		c.drawBitmap(img2,x,y,p);
		
		
		/*Paint p = new Paint();
		Bitmap img0,img1,img2;
		
		Resources res = this.getContext().getResources();
		img0 = BitmapFactory.decodeResource(res, R.drawable.tomato);
		img1 = BitmapFactory.decodeResource(res, R.drawable.himawari);
		img2 = BitmapFactory.decodeResource(res, R.drawable.cat);
		
		c.drawBitmap(img0,0,0,p);
		c.drawBitmap(img1,0,0,p);
		c.drawBitmap(img2,0,0,p);*/
		
		/*c.drawColor(Color.WHITE);
		p.setARGB(255,255,153,153);
		p.setTextSize(64);
		p.setAntiAlias(true);
		c.drawText("image picture",50,300,p);*/
	}

}
