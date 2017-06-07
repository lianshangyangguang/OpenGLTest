package com.gwell.view.opengltest;

import android.content.Context;
import android.opengl.GLSurfaceView;

/**
 * Created by xiyingzhu on 2017/5/16.
 */
public class Myglsurfaceview extends GLSurfaceView {

    private Myglrender mglrender=null;


    public Myglsurfaceview(Context context) {
        super(context);
        try {


//            setEGLContextClientVersion(2);  //需要指定version

            mglrender=new Myglrender();
            setRenderer(mglrender); //在构建的GLSurfaceView 构造中就绑定一个renderer

            setRenderMode(GLSurfaceView.RENDERMODE_WHEN_DIRTY); //设置上面绑定renderer的绘图模式

        }catch (Exception E)
        {
            E.printStackTrace();
        }


    }
}
