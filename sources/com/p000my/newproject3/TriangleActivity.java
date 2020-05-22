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

/* renamed from: com.my.newproject3.TriangleActivity */
public class TriangleActivity extends Activity {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public double f15b = 0.0d;
    private Button button1;
    /* access modifiers changed from: private */
    public EditText edittext1;
    /* access modifiers changed from: private */
    public EditText edittext2;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public double f16h = 0.0d;
    private LinearLayout linear1;
    private LinearLayout linear2;
    private LinearLayout linear3;
    private TextView textview1;
    private TextView textview2;
    /* access modifiers changed from: private */
    public TextView textview3;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0011R.layout.triangle);
        initialize(bundle);
        initializeLogic();
    }

    private void initialize(Bundle bundle) {
        this.linear1 = (LinearLayout) findViewById(C0011R.C0012id.linear1);
        this.linear2 = (LinearLayout) findViewById(C0011R.C0012id.linear2);
        this.textview1 = (TextView) findViewById(C0011R.C0012id.textview1);
        this.edittext1 = (EditText) findViewById(C0011R.C0012id.edittext1);
        this.edittext2 = (EditText) findViewById(C0011R.C0012id.edittext2);
        this.linear3 = (LinearLayout) findViewById(C0011R.C0012id.linear3);
        this.button1 = (Button) findViewById(C0011R.C0012id.button1);
        this.textview2 = (TextView) findViewById(C0011R.C0012id.textview2);
        this.textview3 = (TextView) findViewById(C0011R.C0012id.textview3);
        this.button1.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (TriangleActivity.this.edittext1.getText().toString().equals("") || TriangleActivity.this.edittext2.getText().toString().equals("")) {
                    SketchwareUtil.showMessage(TriangleActivity.this.getApplicationContext(), "Please enter correct value");
                    return;
                }
                TriangleActivity.this.f15b = Double.parseDouble(TriangleActivity.this.edittext1.getText().toString());
                TriangleActivity.this.f16h = Double.parseDouble(TriangleActivity.this.edittext2.getText().toString());
                TriangleActivity.this.textview3.setText(String.valueOf(0.5d * TriangleActivity.this.f15b * TriangleActivity.this.f16h));
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
