package com.example.lj.weatherplay;





import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ButtonActivity extends Activity
{
    private Button button01 = null;
    private Button button02 = null;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

        button01 = (Button)findViewById(R.id.button_first);
        button02 = (Button)findViewById(R.id.button_second);

        //绑定事件源和监听器对象
        button02.setOnClickListener(new MyButtonListener());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.activity_button, menu);
        return true;
    }

    //按钮1的点击事件
    public void changeButtonColor(View view)
    {
        button01.setBackgroundColor(getResources().getColor(R.color.red));

    }

    //内部类，实现OnClickListener接口
    //作为第二个按钮的监听器类
    class MyButtonListener implements OnClickListener
    {

        public void onClick(View v)
        {
            button02.setBackgroundColor(getResources().getColor(R.color.blue));

        }


    }


}
