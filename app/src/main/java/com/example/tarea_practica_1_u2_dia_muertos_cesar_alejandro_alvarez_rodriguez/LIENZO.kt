package com.example.tarea_practica_1_u2_dia_muertos_cesar_alejandro_alvarez_rodriguez

import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.os.CountDownTimer
import android.view.MotionEvent
import android.view.View

class LIENZO(p:MainActivity): View(p){
    var xToucht1 = 700f
    var yToucht1 = 1240f

    var xCatri=200f
    var yCatri=1200f
    var incrementoX=10
    var trabajando=false;
    val timer = object : CountDownTimer(2000,100){
        override fun onFinish() {
            start()
        }

        override fun onTick(millisUntilFinished: Long) {
            xCatri+=incrementoX
            if(xCatri<=-100 || xCatri>=1000){
                incrementoX*=-1
            }
            invalidate()
        }

    }
    override fun onDraw(c: Canvas) {
        super.onDraw(c)
        val p = Paint()
        c.drawARGB(255,35,34,34)
        p.setColor(Color.WHITE)
        c.drawCircle(540f,200f,100f,p)
        p.setARGB(255,99,137,78)
        c.drawCircle(540f,2000f,1000f,p)
        val tumba2 = BitmapFactory.decodeResource(resources,R.drawable.tumba2)
        c.drawBitmap(tumba2, (xToucht1-tumba2.width/1.5f),(yToucht1-tumba2.height/8),p)
        p.setARGB(255,135,112,82)
        c.drawRect(78f,700f,200f,1200f,p)
        p.setARGB(255,39,102,44)
        c.drawCircle(100f,500f,300f,p)
        val catrina = BitmapFactory.decodeResource(resources,R.drawable.catrina)
        c.drawBitmap(catrina, (xCatri-catrina.width),(yCatri-catrina.height),p)
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        if(event.action==MotionEvent.ACTION_MOVE){
            if(trabajando==false){
                timer.start()
                trabajando=true
            }
        }
        invalidate()
        return true
    }
}