package unal.todosalau.practicagit_androidstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FormDelfinClassActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_delfin_class);
    }

    public void onClickGoToView (Class viewToGo){
        Intent intent = new Intent(FormDelfinClassActivity.this, viewToGo);
        startActivity(intent);
    }

    public void goToHome (View v) {
        this.onClickGoToView(MainActivity.class);
    }
}