package com.p000my.newproject3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Random;

/* renamed from: com.my.newproject3.MainActivity */
public class MainActivity extends Activity {
    /* access modifiers changed from: private */
    public CheckBox checkbox1;
    /* access modifiers changed from: private */
    public CheckBox checkbox2;
    /* access modifiers changed from: private */
    public ArrayList<String> fig = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Intent f10i = new Intent();
    private LinearLayout linear1;
    private LinearLayout linear3;
    private LinearLayout linear4;
    private LinearLayout linear5;
    /* access modifiers changed from: private */
    public Spinner spinner1;
    private TextView textview1;
    /* access modifiers changed from: private */
    public ArrayList<String> threed = new ArrayList<>();

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0011R.layout.main);
        initialize(bundle);
        initializeLogic();
    }

    private void initialize(Bundle bundle) {
        this.linear1 = (LinearLayout) findViewById(C0011R.C0012id.linear1);
        this.linear3 = (LinearLayout) findViewById(C0011R.C0012id.linear3);
        this.linear5 = (LinearLayout) findViewById(C0011R.C0012id.linear5);
        this.linear4 = (LinearLayout) findViewById(C0011R.C0012id.linear4);
        this.textview1 = (TextView) findViewById(C0011R.C0012id.textview1);
        this.checkbox1 = (CheckBox) findViewById(C0011R.C0012id.checkbox1);
        this.checkbox2 = (CheckBox) findViewById(C0011R.C0012id.checkbox2);
        this.spinner1 = (Spinner) findViewById(C0011R.C0012id.spinner1);
        this.checkbox1.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
            }
        });
        this.checkbox1.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                MainActivity.this.spinner1.setAdapter(new ArrayAdapter(MainActivity.this.getBaseContext(), 17367049, MainActivity.this.fig));
                MainActivity.this.checkbox2.setChecked(false);
                ((ArrayAdapter) MainActivity.this.spinner1.getAdapter()).notifyDataSetChanged();
            }
        });
        this.checkbox2.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                MainActivity.this.spinner1.setAdapter(new ArrayAdapter(MainActivity.this.getBaseContext(), 17367049, MainActivity.this.threed));
                MainActivity.this.checkbox1.setChecked(false);
                ((ArrayAdapter) MainActivity.this.spinner1.getAdapter()).notifyDataSetChanged();
            }
        });
        this.spinner1.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                if (MainActivity.this.checkbox1.isChecked()) {
                    if (i == 3) {
                        MainActivity.this.f10i.setClass(MainActivity.this.getApplicationContext(), CircleActivity.class);
                        MainActivity.this.startActivity(MainActivity.this.f10i);
                    } else if (i == 1) {
                        MainActivity.this.f10i.setClass(MainActivity.this.getApplicationContext(), SquareActivity.class);
                        MainActivity.this.startActivity(MainActivity.this.f10i);
                    } else if (i == 2) {
                        MainActivity.this.f10i.setClass(MainActivity.this.getApplicationContext(), RectangleActivity.class);
                        MainActivity.this.startActivity(MainActivity.this.f10i);
                    } else if (i == 4) {
                        MainActivity.this.f10i.setClass(MainActivity.this.getApplicationContext(), TriangleActivity.class);
                        MainActivity.this.startActivity(MainActivity.this.f10i);
                    }
                } else if (!MainActivity.this.checkbox2.isChecked()) {
                } else {
                    if (i == 3) {
                        MainActivity.this.f10i.setClass(MainActivity.this.getApplicationContext(), ConeActivity.class);
                        MainActivity.this.startActivity(MainActivity.this.f10i);
                    } else if (i == 1) {
                        MainActivity.this.f10i.setClass(MainActivity.this.getApplicationContext(), SphereActivity.class);
                        MainActivity.this.startActivity(MainActivity.this.f10i);
                    } else if (i == 2) {
                        MainActivity.this.f10i.setClass(MainActivity.this.getApplicationContext(), CylinderActivity.class);
                        MainActivity.this.startActivity(MainActivity.this.f10i);
                    } else if (i == 4) {
                        MainActivity.this.f10i.setClass(MainActivity.this.getApplicationContext(), CubeActivity.class);
                        MainActivity.this.startActivity(MainActivity.this.f10i);
                    } else if (i == 5) {
                        MainActivity.this.f10i.setClass(MainActivity.this.getApplicationContext(), CuboidActivity.class);
                        MainActivity.this.startActivity(MainActivity.this.f10i);
                    }
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    private void initializeLogic() {
        this.fig.add("select figure");
        this.fig.add("Square");
        this.fig.add("Rectangle");
        this.fig.add("Circle");
        this.fig.add("Triangle");
        this.threed.add("select figure");
        this.threed.add("Sphere");
        this.threed.add("Cylinder");
        this.threed.add("Cone");
        this.threed.add("Cube");
        this.threed.add("Cuboid");
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
