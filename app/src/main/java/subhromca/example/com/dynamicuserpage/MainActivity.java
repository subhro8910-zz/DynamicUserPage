package subhromca.example.com.dynamicuserpage;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private LinearLayout facebooklay,githublay,linkelnlay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        facebooklay=(LinearLayout)findViewById(R.id.facebook);
        githublay=(LinearLayout)findViewById(R.id.github);
        linkelnlay=(LinearLayout)findViewById(R.id.linkedln);

        // Give your Profile address after domain of Facebook github and linkedin followed by /
        facebooklay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://facebook.com")));
            }
        });
        githublay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://github.com")));
            }
        });
        linkelnlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://linkedin.com")));
            }
        });
    }
}

