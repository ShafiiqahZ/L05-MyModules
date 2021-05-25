package sg.edu.rp.c346.id20037987.l05_mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView viewMod;
    TextView viewModName;
    TextView viewYear;
    TextView viewSem;
    TextView viewModCredit;
    TextView viewVenue;
    Button backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        backBtn = findViewById(R.id.backBtn);

        Intent intentReceived = getIntent();
        String mod1 = intentReceived.getStringExtra("module1");
        String mod2 = intentReceived.getStringExtra("module2");

        if (intentReceived.getStringExtra("module1").equals(mod1)) {
            viewMod = findViewById(R.id.viewModule);
            viewModName = findViewById(R.id.viewName);
            viewYear = findViewById(R.id.viewYear);
            viewSem = findViewById(R.id.viewSem);
            viewModCredit = findViewById(R.id.viewModCredit);
            viewVenue = findViewById(R.id.viewVenue);

            viewMod.setText(mod1);
            viewModName.setText(" Web Application Development");
            viewYear.setText(" 2021");
            viewSem.setText(" 1");
            viewModCredit.setText(" 4");
            viewVenue.setText(" W67N");
        } else if (intentReceived.getStringExtra("module2").equals(mod2)){
            viewMod = findViewById(R.id.viewModule);
            viewModName = findViewById(R.id.viewName);
            viewYear = findViewById(R.id.viewYear);
            viewSem = findViewById(R.id.viewSem);
            viewModCredit = findViewById(R.id.viewModCredit);
            viewVenue = findViewById(R.id.viewVenue);

            viewMod.setText(mod2);
            viewModName.setText(" Android Programming");
            viewYear.setText(" 2021");
            viewSem.setText(" 1");
            viewModCredit.setText(" 4");
            viewVenue.setText(" E62E");
        }

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModuleDetailActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}