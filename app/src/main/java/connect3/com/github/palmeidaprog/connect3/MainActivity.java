package connect3.com.github.palmeidaprog.connect3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button startBtn;
    private ImageView backImg;
    private TextView title;
    private Game game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initObj();
    }

    // initialize GUI objs
    private void initObj() {
        startBtn = (Button) findViewById(R.id.startBtn);
        backImg = (ImageView) findViewById(R.id.backImg);
        title = (TextView) findViewById(R.id.title);
    }

    // start button click event
    public void startBtnClick(View view) {
        title.animate().alpha(0f).setDuration(250);
        startBtn.animate().alpha(0f).setDuration(250);
        backImg.setTranslationY(-3000f);
        backImg.setVisibility(View.VISIBLE);
        backImg.animate().translationY(0f).setDuration(1000);
        startBtn.setVisibility(View.GONE);
        game = new Game();
    }
}
