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

/* renamed from: com.my.newproject3.CylinderActivity */
public class CylinderActivity extends Activity {
    private Button button2;
    /* access modifiers changed from: private */
    public EditText edittext3;
    /* access modifiers changed from: private */
    public EditText edittext4;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public double f8h = 0.0d;
    private LinearLayout linear1;
    private LinearLayout linear5;
    private LinearLayout linear6;
    private LinearLayout linear7;
    private LinearLayout linear8;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public double f9r = 0.0d;
    private TextView textview1;
    private TextView textview3;
    /* access modifiers changed from: private */
    public TextView textview4;
    private TextView textview5;
    /* access modifiers changed from: private */
    public TextView textview6;
    private TextView textview7;
    /* access modifiers changed from: private */
    public TextView textview8;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0011R.layout.cylinder);
        initialize(bundle);
        initializeLogic();
    }

    private void initialize(Bundle bundle) {
        this.linear1 = (LinearLayout) findViewById(C0011R.C0012id.linear1);
        this.linear5 = (LinearLayout) findViewById(C0011R.C0012id.linear5);
        this.textview1 = (TextView) findViewById(C0011R.C0012id.textview1);
        this.edittext3 = (EditText) findViewById(C0011R.C0012id.edittext3);
        this.edittext4 = (EditText) findViewById(C0011R.C0012id.edittext4);
        this.button2 = (Button) findViewById(C0011R.C0012id.button2);
        this.linear6 = (LinearLayout) findViewById(C0011R.C0012id.linear6);
        this.linear7 = (LinearLayout) findViewById(C0011R.C0012id.linear7);
        this.linear8 = (LinearLayout) findViewById(C0011R.C0012id.linear8);
        this.textview3 = (TextView) findViewById(C0011R.C0012id.textview3);
        this.textview4 = (TextView) findViewById(C0011R.C0012id.textview4);
        this.textview5 = (TextView) findViewById(C0011R.C0012id.textview5);
        this.textview6 = (TextView) findViewById(C0011R.C0012id.textview6);
        this.textview7 = (TextView) findViewById(C0011R.C0012id.textview7);
        this.textview8 = (TextView) findViewById(C0011R.C0012id.textview8);
        this.button2.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (CylinderActivity.this.edittext3.getText().toString().equals("") || CylinderActivity.this.edittext4.getText().toString().equals("")) {
                    SketchwareUtil.showMessage(CylinderActivity.this.getApplicationContext(), "Please enter correct value");
                    return;
                }
                CylinderActivity.this.f9r = Double.parseDouble(CylinderActivity.this.edittext3.getText().toString());
                CylinderActivity.this.f8h = Double.parseDouble(CylinderActivity.this.edittext4.getText().toString());
                CylinderActivity.this.textview4.setText(String.valueOf(6.283185307179586d * CylinderActivity.this.f9r * CylinderActivity.this.f8h));
                CylinderActivity.this.textview6.setText(String.valueOf(2.0d * CylinderActivity.this.f9r * 3.141592653589793d * (CylinderActivity.this.f9r + CylinderActivity.this.f8h)));
                CylinderActivity.this.textview8.setText(String.valueOf(CylinderActivity.this.f9r * CylinderActivity.this.f9r * 3.141592653589793d * CylinderActivity.this.f8h));
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
