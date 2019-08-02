package shafi.sbf.com.colortoastlibrary;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class SuccessToast extends AppCompatActivity {

    public void s(Context c){

        // The Custom Toast Layout Imported here
        LayoutInflater inflater = (LayoutInflater) getLayoutInflater();

        View layout = inflater.inflate(R.layout.custom_toast_success,
                (ViewGroup) findViewById(R.id.custom_toast_layout_id_success));
        // The actual toast generated here.
        Toast toast = new Toast(c);

        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();


    }

}
