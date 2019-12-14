package com.example.calculator;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class layout_port extends AppCompatActivity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected( MenuItem item) {
        switch (item.getItemId()){
            case R.id.help:
                Toast.makeText(this,"这是帮助",Toast.LENGTH_SHORT).show();
                break;
            case R.id.exit:
//                 findViewById(R.id.exit).setOnClickListener(new View.OnClickListener() {
//                     @Override
//                     public void onClick(View view) {
//                         AlertDialog alertDialog=new AlertDialog.Builder(layout_port.this).setTitle("退出程序").setMessage("是否退出")
//                                 .setPositiveButton("确定", new DialogInterface.OnClickListener() {
//                                     @Override
//                                     public void onClick(DialogInterface dialogInterface, int i) {
//                                         finish();
//                                     }
//                                 }).setNegativeButton("取消", new DialogInterface.OnClickListener() {
//                                     @Override
//                                     public void onClick(DialogInterface dialogInterface, int i) {
//                                         return;
//                                     }
//                                 }).create();
//                         alertDialog.show();
//
//
//                     }
//                 });
                System.exit(0);
                break;
        }
        return true;
    }

    Button zero_0;
    Button one_1;
    Button two_2;
    Button three_3;
    Button four_4;
    Button five_5;
    Button six_6;
    Button seven_7;
    Button eigth_8;
    Button nine_9;
    /////数字
    Button divede;//除法
    Button multiply;//乘法
    Button minus;//减法
    Button add;//加法

    ////运算符
    EditText number;//显示数
    Button clear;//AC
    Button percent;//%
    Button power;//平方
    Button pie;//π
    Button dot;//点
    Button result;//=
    Button M;//M;
    Button Cm;//Cm
    Button Km;//Kg


    Button G;//G;
    Button Kg;//Kg
    Button Mg;//Mg;

    Button M_2;//M_2
    Button Cm_2;//Cm_2;

    Button chang_2;//二进制
    Button chang_8;//八进制
    Button chang_10;//十进制
    Button chang_16;//十六进制
    String num="";
    String f;
    int flag=0;
    float The_number = 0;
    float all_number=0;


    String  c_2;
    String  c_8;
    int c_10;
    String c_16;
    int chang=0;//
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_port);
//        String [] height=new String[]{"重量","Kg","g","Mg"};
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, height);  //创建一个数组适配器
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);     //设置下拉列表框的下拉选项样式
//
//        Spinner height_spinner = super.findViewById(R.id.height_spinner);
//        height_spinner.setAdapter(adapter);

        // this.getContentResolver();
        zero_0=(Button)findViewById(R.id.zero);
        one_1=(Button)findViewById(R.id.one);
        two_2=(Button)findViewById(R.id.two);
        three_3=(Button)findViewById(R.id.three);
        four_4=(Button)findViewById(R.id.four);
        five_5=(Button)findViewById(R.id.five);
        six_6=(Button)findViewById(R.id.six);
        seven_7=(Button)findViewById(R.id.seven);
        eigth_8=(Button)findViewById(R.id.eight);
        nine_9=(Button)findViewById(R.id.nine);

        divede=(Button)findViewById(R.id.divide);
        multiply=(Button)findViewById(R.id.multip);
        minus=(Button)findViewById(R.id.minus);
        add=(Button)findViewById(R.id.add);

        number=(EditText)findViewById(R.id.number);
        clear=(Button)findViewById(R.id.clear);
        percent=(Button)findViewById(R.id.percent);
        power=(Button)findViewById(R.id.power);
        pie=(Button)findViewById(R.id.pie);
        dot=(Button)findViewById(R.id.dot);
        result=(Button)findViewById(R.id.result);


        M=findViewById(R.id.M);
        Cm=findViewById(R.id.Cm);
        Km=findViewById(R.id.Km);

        G=findViewById(R.id.g);
        Kg=findViewById(R.id.Kg);
        Mg=findViewById(R.id.Mg);

        M_2=findViewById(R.id.m_2);
        Cm_2=findViewById(R.id.cm_2);

        chang_2=findViewById(R.id.chang_2);
        chang_8=findViewById(R.id.chang_8);
        chang_10=findViewById(R.id.chang_10);
        chang_16=findViewById(R.id.chang_16);

        M.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                The_number=Float.parseFloat(num);
                String cm="cm";
                String m="m";
                String km="km";
                number.setText(The_number+m+"="+The_number*100+cm+"="+The_number/1000+km);
            }
        });
        Cm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                The_number=Float.parseFloat(num);
                String cm="cm";
                String m="m";
                String km="km";
                number.setText(The_number+cm+"="+The_number/100+m+"="+The_number/100000+km);
            }
        });
        Km.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                The_number=Float.parseFloat(num);
                String cm="cm";
                String m="m";
                String km="km";
                number.setText(The_number+km+"="+The_number*1000+m+"="+The_number*100000+cm);
            }
        });

        G.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                The_number=Float.parseFloat(num);
                String G="g";
                String kg="kg";
                String mg="mg";
                number.setText(The_number+G+"="+The_number*1000+mg+"="+The_number/100000+kg);
            }
        });
        Kg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                The_number=Float.parseFloat(num);
                String G="g";
                String kg="kg";
                String mg="mg";
                number.setText(The_number+kg+"="+The_number*1000+G+"="+The_number*1000000+mg);
            }
        });
        Mg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                The_number=Float.parseFloat(num);
                String G="g";
                String kg="kg";
                String mg="mg";
                number.setText(The_number+mg+"="+The_number/1000+G+"="+The_number/1000000+kg);
            }
        });

        M_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                The_number=Float.parseFloat(num);
                String m_2="m²";
                String cm_2="cm²";

                number.setText(The_number+m_2+"="+The_number*10000+cm_2);
            }
        });
        Cm_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                The_number=Float.parseFloat(num);
                String m_2="m²";
                String cm_2="cm²";

                number.setText(The_number+cm_2+"="+The_number/10000+m_2);
            }
        });
        chang_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // chang=Integer.parseInt(num);
                c_2=num;
                //c_10=Integer.parseInt(num,2);
                //c_16=Integer.toHexString();
                c_10=Integer.parseInt(num,2);
                c_8=Integer.toOctalString(c_10);
                c_16=Integer.toHexString(c_10);
                number.setText(c_2+"(2)"+"="+c_8+"(8)"+"="+c_10+"(10)"+"="+c_16+"(16)");



            }
        });
        chang_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c_8=num;
                c_10=Integer.parseInt(num,8);
                c_2=Integer.toBinaryString(c_10);
                c_16=Integer.toHexString(c_10);
                number.setText(c_8+"(8)"+"="+c_2+"(2)"+"="+c_10+"(10)"+"="+c_16+"(16)");

            }
        });
        chang_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c_10=Integer.parseInt(num);
                c_2=Integer.toBinaryString(c_10);
                c_8=Integer.toOctalString(c_10);
                c_16=Integer.toHexString(c_10);
                number.setText(c_10+"(10)"+"="+c_2+"(2)"+"="+c_8+"(8)"+"="+c_16+"(16)");


            }
        });
        chang_16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c_16=num;
                c_10=Integer.parseInt(num,16);
                c_8=Integer.toOctalString(c_10);
                c_2=Integer.toBinaryString(c_10);
                number.setText(c_16+"(16)"+"="+c_2+"(2)"+"="+c_8+"(8)"+"="+c_10+"(10)");
            }
        });
        zero_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num=num+"0";
                number.setText(num);

            }
        });

        one_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num=num+"1";
                number.setText(num);

            }
        });
        two_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num=num+"2";
                number.setText(num);

            }
        });

        three_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num=num+"3";
                number.setText(num);

            }
        });

        four_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num=num+"4";
                number.setText(num);

            }
        });

        five_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num=num+"5";
                number.setText(num);

            }
        });

        six_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num=num+"6";
                number.setText(num);

            }
        });

        seven_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num=num+"7";
                number.setText(num);

            }
        });

        eigth_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num=num+"8";
                number.setText(num);

            }
        });

        nine_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num=num+"9";
                number.setText(num);

            }
        });

        pie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num=num+Math.PI;
                number.setText(num);
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num!=""){

                    if(flag==0) {
                        String add = "+";

                        The_number = Float.parseFloat(num);
                        num =num+add;
                        number.setText(num);
                        num="";
                        flag=1;
                        f="+";
                    }
                    else{
                        String add="+";
                        switch(f){
                            case"+":

                                The_number=The_number+Float.parseFloat(num);
                                number.setText(The_number+add);
                                num="";
                                flag=1;
                                f="+";
                                break;
                            case"×":
                                The_number=The_number*Float.parseFloat(num);
                                number.setText(The_number+add);
                                num="";
                                flag=1;
                                f="+";
                                break;
                            case"-":
                                The_number=The_number-Float.parseFloat(num);
                                number.setText(The_number+add);
                                num="";
                                flag=1;
                                f="+";
                                break;
                            case"÷":
                                The_number=The_number/Float.parseFloat(num);
                                number.setText(The_number+add);
                                num="";
                                flag=1;
                                f="+";
                                break;
                        }


//                        The_number=The_number+Float.parseFloat(num);
//                        num=The_number+add;
//                        number.setText(num);
//                        num="";
//                        flag=1;
//                        f="+";
                    }
                }

            }
        });
        //加法
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num!="") {
                    if (flag == 0) {
                        String minus = "-";
                        The_number = Float.parseFloat(num);
                        num = num + minus;
                        number.setText(num);
                        num = "";
                        flag = 1;
                        f = "-";

                    } else {
                        String add="-";
                        switch(f) {
                            case "+":

                                The_number = The_number + Float.parseFloat(num);
                                number.setText(The_number + add);
                                num = "";
                                flag = 1;
                                f = "-";
                                break;
                            case "×":
                                The_number = The_number * Float.parseFloat(num);
                                number.setText(The_number + add);
                                num = "";
                                flag = 1;
                                f = "-";
                                break;
                            case "-":
                                The_number = The_number - Float.parseFloat(num);
                                number.setText(The_number + add);
                                num = "";
                                flag = 1;
                                f = "-";
                                break;
                            case "÷":
                                The_number = The_number / Float.parseFloat(num);
                                number.setText(The_number + add);
                                num = "";
                                flag = 1;
                                f = "-";
                                break;
                        }
                    }
                }
            }
        });
        ////减法

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num!="") {
                    if (flag == 0) {
                        String multiply = "×";
                        The_number = Float.parseFloat(num);
                        num = num + multiply;
                        number.setText(num);
                        num = "";
                        flag = 1;
                        f = "×";

                    } else {
                        String add="×";
                        switch(f){
                            case"+":

                                The_number=The_number+Float.parseFloat(num);
                                number.setText(The_number+add);
                                num="";
                                flag=1;
                                f="×";
                                break;
                            case"×":
                                The_number=The_number*Float.parseFloat(num);
                                number.setText(The_number+add);
                                num="";
                                flag=1;
                                f="×";
                                break;
                            case"-":
                                The_number=The_number-Float.parseFloat(num);
                                number.setText(The_number+add);
                                num="";
                                flag=1;
                                f="×";
                                break;
                            case"÷":
                                The_number=The_number/Float.parseFloat(num);
                                number.setText(The_number+add);
                                num="";
                                flag=1;
                                f="×";
                                break;}
                    }
                }
            }
        });
//乘法
        divede.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num!="") {
                    if (flag == 0) {
                        String divide = "÷";
                        The_number = Float.parseFloat(num);
                        num = num + divide;
                        number.setText(num);
                        num = "";
                        flag = 1;
                        f = "÷";

                    } else {
                       // String divide = "÷";
                        if (Float.parseFloat(num) != 0) {
                            String add="÷";
                            switch(f) {
                                case "+":

                                    The_number = The_number + Float.parseFloat(num);
                                    number.setText(The_number + add);
                                    num = "";
                                    flag = 1;
                                    f = "÷";
                                    break;
                                case "×":
                                    The_number = The_number * Float.parseFloat(num);
                                    number.setText(The_number + add);
                                    num = "";
                                    flag = 1;
                                    f = "÷";
                                    break;
                                case "-":
                                    The_number = The_number - Float.parseFloat(num);
                                    number.setText(The_number + add);
                                    num = "";
                                    flag = 1;
                                    f = "÷";
                                    break;
                                case "÷":
                                    The_number = The_number / Float.parseFloat(num);
                                    number.setText(The_number + add);
                                    num = "";
                                    flag = 1;
                                    f = "÷";
                                    break;
                            }
                        } else {
                            number.setText("除数不能为0!!");
                        }
                    }
                }
            }
        });
        //除法

        power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num!="") {
                    if (flag == 0) {
                        String power = "²";
                        The_number = Float.parseFloat(num);
                        num = num + power;
                        number.setText(num);
                        // num = "";
                        flag = 1;
                        f = "2";

                    } else {
                        String power = "²";

                        The_number = The_number * The_number;
                        num = The_number + power;
                        number.setText(num);
                        num = "";
                        flag = 1;
                        f = "2";
                    }
                }

            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num!="") {
                    num = num + ".";
                    number.setText(num);
                }

            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num="";
                The_number=0;
                flag=0;
                number.setText(num);

            }
        });
        percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //String percent="%";
                if(num!="") {
                    number.setText(num + "%");
                    The_number = Float.parseFloat(num);
                    The_number = The_number / 100;
                    num = String.valueOf(The_number);
                    //f="%";

                }

            }

        });
        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num!="") {
                    switch (f) {
                        case "+":
                            The_number = The_number + Float.parseFloat(num);
                            //System.out.println(The_number+"aaaaaaaaaa");
                            num = "";
                            number.setText(num + The_number);
                            The_number = 0;
                            flag = 0;
                            break;
                        case "-":
                            The_number = The_number - Float.parseFloat(num);
                            num = "";
                            number.setText(num + The_number);
                            The_number = 0;
                            flag = 0;
                            break;
                        case "×":
                            The_number = The_number * Float.parseFloat(num);
                            num = "";
                            number.setText(num + The_number);
                            The_number = 0;
                            flag = 0;
                            break;
                        case "÷":
                            The_number = The_number / Float.parseFloat(num);
                            num = "";
                            number.setText(num + The_number);
                            The_number = 0;
                            flag = 0;
                            break;
                        case "2":
                            The_number = The_number * The_number;
                            num = "";
                            number.setText(num+The_number);
                            The_number = 0;
                            flag = 0;
                            break;
//                    case "%":
//                        if(flag==0) {
//                            num = "";
//                            number.setText(num + The_number);
//                            The_number = 0;
//                            flag = 0;
//                        }
//
//                        break;


                    }
                }
            }
        });
        if(getResources().getConfiguration().orientation== Configuration.ORIENTATION_LANDSCAPE){
            Intent intent=new Intent();
            intent.setClass(layout_port.this,layout_land.class);
            startActivity(intent);
            layout_port.this.finish();
        }
    }
}
