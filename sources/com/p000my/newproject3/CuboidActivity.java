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

/* renamed from: com.my.newproject3.CuboidActivity */
public class CuboidActivity extends Activity {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public double f5b = 0.0d;
    private Button button1;
    /* access modifiers changed from: private */
    public EditText edittext2;
    /* access modifiers changed from: private */
    public EditText edittext3;
    /* access modifiers changed from: private */
    public EditText edittext4;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public double f6h = 0.0d;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public double f7l = 0.0d;
    private LinearLayout linear1;
    private LinearLayout linear3;
    private LinearLayout linear4;
    private LinearLayout linear5;
    private LinearLayout linear6;
    private TextView textview1;
    private TextView textview2;
    /* access modifiers changed from: private */
    public TextView textview3;
    private TextView textview4;
    /* access modifiers changed from: private */
    public TextView textview5;
    private TextView textview6;
    /* access modifiers changed from: private */
    public TextView textview7;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0011R.layout.cuboid);
        initialize(bundle);
        initializeLogic();
    }

    private void initialize(Bundle bundle) {
        this.linear1 = (LinearLayout) findViewById(C0011R.C0012id.linear1);
        this.linear3 = (LinearLayout) findViewById(C0011R.C0012id.linear3);
        this.textview1 = (TextView) findViewById(C0011R.C0012id.textview1);
        this.edittext2 = (EditText) findViewById(C0011R.C0012id.edittext2);
        this.edittext3 = (EditText) findViewById(C0011R.C0012id.edittext3);
        this.edittext4 = (EditText) findViewById(C0011R.C0012id.edittext4);
        this.button1 = (Button) findViewById(C0011R.C0012id.button1);
        this.linear4 = (LinearLayout) findViewById(C0011R.C0012id.linear4);
        this.linear5 = (LinearLayout) findViewById(C0011R.C0012id.linear5);
        this.linear6 = (LinearLayout) findViewById(C0011R.C0012id.linear6);
        this.textview2 = (TextView) findViewById(C0011R.C0012id.textview2);
        this.textview3 = (TextView) findViewById(C0011R.C0012id.textview3);
        this.textview4 = (TextView) findViewById(C0011R.C0012id.textview4);
        this.textview5 = (TextView) findViewById(C0011R.C0012id.textview5);
        this.textview6 = (TextView) findViewById(C0011R.C0012id.textview6);
        this.textview7 = (TextView) findViewById(C0011R.C0012id.textview7);
        this.button1.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (CuboidActivity.this.edittext2.getText().toString().equals("") || CuboidActivity.this.edittext3.getText().toString().equals("") || CuboidActivity.this.edittext4.getText().toString().equals("")) {
                    SketchwareUtil.showMessage(CuboidActivity.this.getApplicationContext(), "Please enter correct value");
                    return;
                }
                CuboidActivity.this.f7l = Double.parseDouble(CuboidActivity.this.edittext2.getText().toString());
                CuboidActivity.this.f5b = Double.parseDouble(CuboidActivity.this.edittext3.getText().toString());
                CuboidActivity.this.f6h = Double.parseDouble(CuboidActivity.this.edittext4.getText().toString());
                CuboidActivity.this.textview3.setText(String.valueOf(CuboidActivity.this.f6h * 2.0d * (CuboidActivity.this.f7l + CuboidActivity.this.f5b)));
                CuboidActivity.this.textview5.setText(String.valueOf(((CuboidActivity.this.f7l * CuboidActivity.this.f5b) + (CuboidActivity.this.f5b * CuboidActivity.this.f6h) + (CuboidActivity.this.f6h * CuboidActivity.this.f7l)) * 2.0d));
                CuboidActivity.this.textview7.setText(String.valueOf(CuboidActivity.this.f7l * CuboidActivity.this.f5b * CuboidActivity.this.f6h));
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
