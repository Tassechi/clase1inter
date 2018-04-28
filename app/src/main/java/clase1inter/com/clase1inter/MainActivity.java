package clase1inter.com.clase1inter;

import android.content.Intent;
import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntro2;
import com.github.paolorotolo.appintro.AppIntroFragment;

public class MainActivity extends AppIntro2 {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addSlide(AppIntroFragment.newInstance( "Hola", "Prueba numero #1", R.drawable.gatito, Color.parseColor("#27AE60")));
        addSlide(AppIntroFragment.newInstance( "Hola", "Prueba numero #1", R.drawable.gatito, Color.parseColor("#27AE60")));

    }
    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);

        Intent intent1 = new Intent(this, Main2Activity.class);
        startActivity(intent1);
        finish();
    }
    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        Intent intent1 = new Intent(this, Main2Activity.class);
        startActivity(intent1);
        finish();

    }
}

