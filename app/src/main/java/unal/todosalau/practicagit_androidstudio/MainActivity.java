package unal.todosalau.practicagit_androidstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }

    public void onClickGoToView (Class viewToGo){
        Intent intent = new Intent(MainActivity.this, viewToGo);
        startActivity(intent);
    }

    public void goToDelfinClass (View v) {
        this.onClickGoToView(FormDelfinClassActivity.class);
    }
}