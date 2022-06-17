
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		homescreen
	 *	@date 		1655470354552
	 *	@title 		Page 3
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package exportkit.xd;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class homescreen_activity extends Activity {

	
	private View _bg__homescreen_ek2;
	private Button bclear;
	private TextView txtac;
	private Button bback;
	private TextView txtback;
	private View bmod;
	private TextView txtmod;
	private Button bdiv;
	private TextView txtdiv;
	private Button b7;
	private TextView txt7;
	private Button b8;
	private TextView txt8;
	private Button b9;
	private TextView txt9;
	private Button bmult;
	private Button b4;
	private TextView txt4;
	private Button b5;
	private TextView txt5;
	private Button b6;
	private View bsubtract;
	private TextView txtsub;
	private Button b1;
	private TextView txt1;
	private Button b2;
	private TextView txt2;
	private Button b3;
	private TextView txt3;
	private Button badd;
	private TextView txtadd;
	private View emptyspace;
	private Button b0;
	private TextView txt0;
	private View bdec;
	private TextView txtdec;
	private Button bequal;
	private TextView txteq;
	private TextView txtmul;
	private TextView txt6;
	private View controlbox;
	private View resultbox;
	private TextView calculator;
	private TextView result;
	private TextView control;
	private final char ADDITION='+';
	private final char SUBTRACTION='-';
	private final char MULTIPLICATION = '×';
	private final char DIVISION = '÷';
	private final char MODULUS = '%';
	private final char EQU = 0;
	private double val1 = Double.NaN;
	private double val2;
	private double v1;
	private char ACTION;


	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.homescreen);

		
		_bg__homescreen_ek2 = (View) findViewById(R.id._bg__homescreen_ek2);
		bclear = (Button) findViewById(R.id.bclear);

		bback = (Button) findViewById(R.id.bback);

		bmod = (View) findViewById(R.id.bmod);
		bdiv = (Button) findViewById(R.id.bdiv);
		b7 = (Button) findViewById(R.id.b7);
		b8 = (Button) findViewById(R.id.b8);

		b9 = (Button) findViewById(R.id.b9);

		bmult = (Button) findViewById(R.id.bmult);
		b4 = (Button) findViewById(R.id.b4);

		b5 = (Button) findViewById(R.id.b5);

		b6 = (Button) findViewById(R.id.b6);
		bsubtract = (View) findViewById(R.id.bsubtract);

		b1 = (Button) findViewById(R.id.b1);

		b2 = (Button) findViewById(R.id.b2);

		b3 = (Button) findViewById(R.id.b3);

		badd = (Button) findViewById(R.id.badd);

		emptyspace = (View) findViewById(R.id.emptyspace);
		b0 = (Button) findViewById(R.id.b0);

		bdec = (View) findViewById(R.id.bdec);

		bequal = (Button) findViewById(R.id.bequal);



		controlbox = (View) findViewById(R.id.controlbox);
		resultbox = (View) findViewById(R.id.resultbox);
		calculator = (TextView) findViewById(R.id.calculator);
		result = (TextView) findViewById(R.id.result);
		control = (TextView) findViewById(R.id.control);
	
		
		//custom code goes here

		// ============== NUMBERS =========================

		b0.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				control.setText(control.getText().toString() + "0");
			}
		});

		b1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				control.setText(control.getText().toString()+"1");
			}
		});

		b2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				control.setText(control.getText().toString()+"2");
			}
		});

		b3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				control.setText(control.getText().toString()+"3");
			}
		});

		b4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				control.setText(control.getText().toString()+"4");
			}
		});

		b5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				control.setText(control.getText().toString()+"5");
			}
		});

		b6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				control.setText(control.getText().toString()+"6");
			}
		});

		b7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				control.setText(control.getText().toString()+"7");
			}
		});

		b8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				control.setText(control.getText().toString()+"8");
			}
		});

		b9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				control.setText(control.getText().toString()+"9");
			}
		});

		// -----------------------------------------------------------


		// ===============OPERATORS ===================================

		badd.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				compute();
				ACTION = ADDITION;
				result.setText(String.valueOf(val1));
				control.setText(null);


			}
		});

		bsubtract.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				compute();
				ACTION = SUBTRACTION;
				result.setText(String.valueOf(val1));
				control.setText(null);

			}
		});

		bdiv.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				compute();
				ACTION = DIVISION;
				result.setText(String.valueOf(val1));
				control.setText(null);
			}
		});

		bmult.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				compute();
				ACTION = MULTIPLICATION;
				result.setText(String.valueOf(val1));
				control.setText(null);
			}
		});

		bmod.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				compute();
				ACTION= MODULUS;
				result.setText(String.valueOf(val1));
				control.setText(null);
			}
		});

		// ------------------------------------------------------------

		bclear.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				control.setText(null);
				result.setText(null);
				v1 = Double.NaN;
				val2 = Double.NaN;
				val1 = Double.NaN;
			}
		});

		bequal.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				compute();
				ACTION = EQU;
				result.setText(String.valueOf(val1));
				control.setText(null);
				val2=Double.NaN;
				val1=Double.NaN;
			}
		});

		bback.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				if(control.getText().length() > 0){
					CharSequence name = control.getText().toString();
					control.setText(name.subSequence(0,name.length()-1));
				}
				else{
					val1 = Double.NaN;
					val2 = Double.NaN;
					control.setText(null);
					result.setText(null);
				}
			}
		});
	
	}

	private void compute(){
		if(!Double.isNaN(val1)){
			val2 = Double.parseDouble(control.getText().toString());

			switch (ACTION){
				case ADDITION:
					v1 = val1;
					val1 = val1+val2;
					break;

				case SUBTRACTION:
					val1 = val1-val2;
					break;


				case MULTIPLICATION:
					val1 = val1*val2;
					break;

				case DIVISION:
					val1 = val1/val2;
					break;

				case MODULUS:
					val1 = (val1/100)*val2;
					break;

				case EQU:
					break;

			}
		}
		else{
			val1 = Double.parseDouble(control.getText().toString());
		}
	}
}




	
	