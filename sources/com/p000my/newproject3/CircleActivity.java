package com.p000my.newproject3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Random;

/* renamed from: com.my.newproject3.CircleActivity */
public class CircleActivity extends Activity {
    private Button button1;
    /* access modifiers changed from: private */
    public EditText edittext1;
    private LinearLayout linear5;
    private LinearLayout linear8;
    private LinearLayout linear9;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public double f0r = 0.0d;
    private TextView textview1;
    private TextView textview4;
    /* access modifiers changed from: private */
    public TextView textview5;
    private TextView textview6;
    /* access modifiers changed from: private */
    public TextView textview7;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0011R.layout.circle);
        initialize(bundle);
        initializeLogic();
    }

    private void initialize(Bundle bundle) {
        this.linear5 = (LinearLayout) findViewById(C0011R.C0012id.linear5);
        this.textview1 = (TextView) findViewById(C0011R.C0012id.textview1);
        this.edittext1 = (EditText) findViewById(C0011R.C0012id.edittext1);
        this.linear8 = (LinearLayout) findViewById(C0011R.C0012id.linear8);
        this.linear9 = (LinearLayout) findViewById(C0011R.C0012id.linear9);
        this.button1 = (Button) findViewById(C0011R.C0012id.button1);
        this.textview4 = (TextView) findViewById(C0011R.C0012id.textview4);
        this.textview5 = (TextView) findViewById(C0011R.C0012id.textview5);
        this.textview6 = (TextView) findViewById(C0011R.C0012id.textview6);
        this.textview7 = (TextView) findViewById(C0011R.C0012id.textview7);
        this.button1.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (CircleActivity.this.edittext1.getText().toString().equals("")) {
                    SketchwareUtil.showMessage(CircleActivity.this.getApplicationContext(), "Please enter correct value");
                    return;
                }
                CircleActivity.this.f0r = Double.parseDouble(CircleActivity.this.edittext1.getText().toString());
                CircleActivity.this.textview5.setText(String.valueOf(2.0d * CircleActivity.this.f0r * 3.141592653589793d));
                CircleActivity.this.textview7.setText(String.valueOf(CircleActivity.this.f0r * CircleActivity.this.f0r * 3.141592653589793d));
            }
        });
    }

    private void initializeLogic() {
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    @Deprecated
    public void showMessage(String str) {
        Toast.makeText(getApplicationContext(), str, 0).show();
    }

    @Deprecated
    public int getLocationX(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return iArr[0];
    }

    @Deprecated
    public int getLocationY(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return iArr[1];
    }

    @Deprecated
    public int getRandom(int i, int i2) {
        return new Random().nextInt((i2 - i) + 1) + i;
    }

    @Deprecated
    public ArrayList<Double> getCheckedItemPositionsToArray(ListView listView) {
        ArrayList<Double> arrayList = new ArrayList<>();
        SparseBooleanArray checkedItemPositions = listView.getCheckedItemPositions();
        for (int i = 0; i < checkedItemPositions.size(); i++) {
            if (checkedItemPositions.valueAt(i)) {
                arrayList.add(Double.valueOf((double) checkedItemPositions.keyAt(i)));
            }
        }
        return arrayList;
    }

    @Deprecated
    public float getDip(int i) {
        return TypedValue.applyDimension(1, (float) i, getResources().getDisplayMetrics());
    }

    @Deprecated
    public int getDisplayWidthPixels() {
        return getResources().getDisplayMetrics().widthPixels;
    }

    @Deprecated
    public int getDisplayHeightPixels() {
        return getResources().getDisplayMetrics().heightPixels;
    }
}
