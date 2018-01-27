package cn.edu.gdmec.android.openbrowser;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        //找到按钮 并设置点击事件
        Button button = (Button) findViewById ( R.id.main_button );
        button.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                //通过隐式意图来开启意图 浏览器

                Intent intent = new Intent (  );

                //设置开启浏览器动作
                intent.setAction ( "android.intent.action.VIEW" );
                intent.setData ( Uri.parse ( "http://www.baidu.com" ) );

                //开启页面
                startActivity ( intent );

            }
        } );
    }
}
