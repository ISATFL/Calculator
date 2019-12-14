package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class layout_land extends AppCompatActivity {
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
    Button sin_2;//sin;
    Button cos_2;//cos;
    Button tan_2;//tan;
    Button change_2;//二进制
    Button change_8;//八进制
    Button change_16;//十六进制
    Button bracket_left;//左括号
    Button bracket_right;//右括号
    String num="";
    String f;
    int flag=0;
    float The_number = 0;
    float num_all=0;
    int chang_number;
    double inum;
    int flag_braker=0;
    String bracket_flag="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_land);
        // this.getContentResolver();
        zero_0=(Button)findViewById(R.id.zero_2);
        one_1=(Button)findViewById(R.id.one_2);
        two_2=(Button)findViewById(R.id.two_2);
        three_3=(Button)findViewById(R.id.three_2);
        four_4=(Button)findViewById(R.id.four_2);
        five_5=(Button)findViewById(R.id.five_2);
        six_6=(Button)findViewById(R.id.six_2);
        seven_7=(Button)findViewById(R.id.seven_2);
        eigth_8=(Button)findViewById(R.id.eight_2);
        nine_9=(Button)findViewById(R.id.nine_2);

        divede=(Button)findViewById(R.id.divide_2);
        multiply=(Button)findViewById(R.id.multip_2);
        minus=(Button)findViewById(R.id.minus_2);
        add=(Button)findViewById(R.id.add_2);

        number=(EditText)findViewById(R.id.number_2);
        clear=(Button)findViewById(R.id.clear_2);
        percent=(Button)findViewById(R.id.percent_2);
        power=(Button)findViewById(R.id.power_2);
        pie=(Button)findViewById(R.id.pie_2);
        dot=(Button)findViewById(R.id.dot_2);
        result=(Button)findViewById(R.id.result_2);


        sin_2=(Button)findViewById(R.id.sin_2);
        cos_2=(Button)findViewById(R.id.cos_2);
        tan_2=(Button)findViewById(R.id.tan_2);


        change_2=(Button)findViewById(R.id.chang_2);
        change_8=(Button)findViewById(R.id.chang_8);
        change_16=(Button)findViewById(R.id.chang_16);

        bracket_left=(Button)findViewById(R.id.bracket_left);
        bracket_right=(Button)findViewById(R.id.bracket_right);


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
                        if(flag_braker==1){
                            num_all=The_number;


                        }
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
//                        if(flag_braker==1){
//                            num_all=The_number;
//                        }
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
//                        if(flag_braker==1){
//                            num_all=The_number;
//                        }

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
//                        if(flag_braker==1){
//                            num_all=The_number;
//                        }
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
//                        if(flag_braker==1){
//                            num_all=The_number;
//                        }

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
//                        if(flag_braker==1){
//                            num_all=The_number;
//                        }
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
//                        if(flag_braker==1){
//                            num_all=The_number;
//                        }

                    } else {
                        //String divide = "÷";
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
//                            if(flag_braker==1){
//                                num_all=The_number;
//                            }
                        } else {
                            number.setText("除数不能为0!!");
                        }
                    }
                }
            }
        });
        //除法
        bracket_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String bracket_left="(";
                number.setText(bracket_left);
                flag_braker=1;
                bracket_flag=f;
                num_all=The_number;
                num="";
                The_number=0;
                f="";
                flag=0;


            }
        });
        bracket_right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (f) {
                    case "+":
                        The_number = The_number + Float.parseFloat(num);
                        //System.out.println(The_number+"aaaaaaaaaa");
                        num = "";
                        number.setText(num + The_number);
                        //The_number = 0;
                        flag = 0;
                        break;
                    case "-":
                        The_number = The_number - Float.parseFloat(num);
                        num = "";
                        number.setText(num + The_number);
                        //The_number = 0;
                        flag = 0;
                        break;
                    case "×":
                        The_number = The_number * Float.parseFloat(num);
                        num = "";
                        number.setText(num + The_number);
                       // The_number = 0;
                        flag = 0;
                        break;
                    case "÷":
                        The_number = The_number / Float.parseFloat(num);
                        num = "";
                        number.setText(num + The_number);
                       // The_number = 0;
                        flag = 0;
                        break;}
                flag_braker=2;
            }

        });
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
        sin_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                The_number=Float.parseFloat(num);
                inum=(double)The_number;
                inum=Math.sin(inum);
               number.setText(String.valueOf(inum));
               num="";
               The_number=0;
            }
        });
        cos_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                The_number=Float.parseFloat(num);
                inum=(double)The_number;
                inum=Math.cos(inum);
                number.setText(String.valueOf(inum));
                num="";
                The_number=0;
            }
        });
        tan_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                The_number=Float.parseFloat(num);
                inum=(double)The_number;
                inum=Math.tan(inum);
                number.setText(String.valueOf(inum));
                num="";
                The_number=0;
            }
        });


        change_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chang_number=Integer.parseInt(num);
                num="";
                number.setText(num+Integer.toBinaryString(chang_number));
            }
        });

        change_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chang_number=Integer.parseInt(num);
                num="";
                number.setText(num+Integer.toOctalString(chang_number));
            }
        });
        change_16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chang_number=Integer.parseInt(num);
                num="";
                number.setText(num+Integer.toHexString(chang_number));
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
                            //System.out.println("lalallallallalalal");
                            The_number = The_number * The_number;
                            num = "";
                            number.setText(num+The_number);
                            The_number = 0;
                            flag = 0;
                            break;
                        case "3":
                            The_number = The_number * The_number * The_number;
                            num = "";
                            number.setText(num + The_number);
                            The_number = 0;
                            flag = 0;
                            break;
//                        case "sin":
//                            The_number=Float.parseFloat(num);
//                            inum=(double)The_number;
//                            inum=Math.sin(inum);
//                            number.setText(String.valueOf(inum));
//                            The_number=0;
//                            flag=0;
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
                if(flag_braker==2){
                    switch (bracket_flag){
                        case "+":
                            The_number = The_number + num_all;
                            //System.out.println(The_number+"aaaaaaaaaa");
                            num = "";
                            number.setText(num + The_number);
                            The_number = 0;
                            flag = 0;
                            break;
                        case "-":
                            The_number = num_all-The_number;
                            num = "";
                            number.setText(num + The_number);
                            The_number = 0;
                            flag = 0;
                            break;
                        case "×":
                            The_number = The_number * num_all;
                            num = "";
                            number.setText(num + The_number);
                            The_number = 0;
                            flag = 0;
                            break;
                        case "÷":
                            The_number = The_number / num_all;
                            num = "";
                            number.setText(num + The_number);
                            The_number = 0;
                            flag = 0;
                            break;
                    }
                }
            }
        });
        if(getResources().getConfiguration().orientation== Configuration.ORIENTATION_PORTRAIT){
            Intent intent=new Intent();
            intent.setClass(layout_land.this,layout_port.class);
            startActivity(intent);
            layout_land.this.finish();
        }
    }
}
