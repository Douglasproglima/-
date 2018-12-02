package com.projetos.douglasproglima.aisingroup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText txt_search_code;
    private TextView txt_result;
    private Button button_search;
    private Button button_clear;
    private AutoCompleteTextView auto_complete_others;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_search_code = (EditText) findViewById(R.id.txt_search_code);
        txt_result = (TextView) findViewById(R.id.txt_result);
        button_search = (Button) findViewById(R.id.button_search);
        button_clear = (Button) findViewById(R.id.button_clear);
        auto_complete_others = (AutoCompleteTextView)findViewById(R.id.autoCompleteOthers);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, OTHRES);
        auto_complete_others.setAdapter(adapter);

        button_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txt_search_code.getText().toString().isEmpty() ||
                        txt_search_code.getText() == null ||
                        txt_search_code.getText().toString() == "")
                    txt_result.setText("見つからなかった");
                else {
                    int code = Integer.parseInt(txt_search_code.getText().toString().trim());
                    int result = SearchCode(code);
                    if (result > 0)
                        txt_result.setText(String.valueOf(result));
                    else
                    {
                        if (txt_search_code.getText() != null || txt_search_code.getText().toString() != "")
                            txt_search_code.setText("");
                        txt_result.setText("見つからなかった");
                    }
                }
            }
        });

        button_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Clear();
            }
        });
    }

    private void Clear(){
        if (txt_search_code.getText() != null || txt_search_code.getText().toString() != "")
            txt_search_code.setText("");

        if (txt_result.getText() != null || txt_result.getText().toString() != "")
            txt_result.setText("");

        auto_complete_others.setText("", true);
    }

    private int SearchCode(int code) {

        int result;

        if (code <= 0)
            result = 0;
        else {
            switch (code) {
                case 60671:
                case 64050:
                case 64090:
                    result = 105;
                    break;
                case 60921:
                case 64160:
                    result = 113;
                    break;
                case 61010:
                case 60901:
                case 60990:
                case 64310:
                    result = 119;
                    break;
                case 70212:
                    result = 17;
                    break;
                case 70192:
                    result = 12;
                    break;
                case 70172:
                    result = 43;
                    break;
                case 74020:
                    result = 43;
                    break;
                case 70811:
                    result = 60;
                    break;
                case 70870:
                    result = 118;
                    break;
                case 99715:
                case 74070:
                case 74080:
                case 70280:
                case 70270:
                case 99731:
                    result = 44;
                    break;
                case 70222:
                    result = 0;
                    break;
                case 70151:
                    result = 23;
                    break;
                case 70320:
                    result = 30;
                    break;
                case 70331:
                    result = 31;
                    break;
                case 99202:
                    result = 36;
                    break;
                case 99299:
                    result = 35;
                    break;
                case 99309:
                    result = 33;
                    break;
                case 99508:
                    result = 46;
                    break;
                case 99691:
                    result = 51;
                    break;
                case 70290:
                case 74140:
                    result = 103;
                    break;
                case 99888:
                    result = 53;
                    break;
                case 99531:
                    result = 55;
                    break;
                case 70382:
                    result = 55;
                    break;
                case 99671:
                    result = 58;
                    break;
                case 70441:
                case 71460:
                    result = 60;
                    break;
                case 71190:
                    result = 61;
                    break;
                case 99260:
                    result = 62;
                    break;
                case 71040:
                    result = 66;
                    break;
                case 99447:
                    result = 67;
                    break;
                case 99373:
                    result = 68;
                    break;
                case 99487:
                    result = 69;
                    break;
                case 71150:
                    result = 71;
                    break;
                case 70731:
                    result = 76;
                    break;
                case 36114:
                    result = 79;
                    break;
                case 36122:
                    result = 80;
                    break;
                case 74320:
                    result = 23;
                    break;
                case 71180:
                    result = 85;
                    break;
                case 70531:
                    result = 85;
                    break;
                case 70432:
                    result = 85;
                    break;
                case 71160:
                    result = 86;
                    break;
                case 71200:
                    result = 82;
                    break;
                case 70781:
                    result = 90;
                    break;
                case 70741:
                    result = 91;
                    break;
                case 70791:
                    result = 95;
                    break;
                case 70801:
                    result = 97;
                    break;
                case 80321:
                case 80401:
                case 80411:
                    result = 117;
                    break;
                case 71070:
                case 71092:
                case 74350:
                    result = 9;
                    break;
                case 71012:
                case 71081:
                case 74290:
                case 71051:
                case 71022:
                case 70961:
                case 74220:
                    result = 122;
                    break;
                case 74230:
                case 71031:
                    result = 12;
                    break;
                case 80281:
                case 80220:
                case 84060:
                case 84070:
                case 80340:
                case 80111:
                case 74250:
                case 70860:
                case 71100:
                case 71101:
                    result = 106;
                    break;
                case 70472:
                case 70502:
                case 74170:
                case 74150:
                    result = 108;
                    break;
                case 74270:
                case 70851:
                case 74280:
                case 71280:
                case 71060:
                case 70992:
                case 70902:
                case 74180:
                case 70881:
                case 74160:
                case 70480:
                case 70910:
                    result = 109;
                    break;
                case 60711:
                case 64330:
                    result = 115;
                    break;
                default:
                    result = 0;
            }
        }

        return result;
    }

    private String SearchCodeStr(String code){

        String result = new String();

        if (code.length() <= 0)
            result = "";
        else {
            switch (code.trim().toUpperCase()){
                case "60671":
                case "64050":
                case "64090":
                    result = "105";
                    break;
                case "60921":
                case "64160":
                    result = "113";
                    break;
                case "61010":
                case "60901":
                case "60990":
                case "64310":
                    result = "119";
                    break;
                case "70212":
                    result = "17";
                    break;
                case "70192":
                    result = "12";
                    break;
                case "70172":
                    result = "43";
                    break;
                case "74020":
                    result = "43";
                    break;
                case "70811":
                    result = "60";
                    break;
                case "70870":
                    result = "118";
                    break;
                case "99715":
                case "74070":
                case "74080":
                case "70280":
                case "70270":
                case "99731":
                    result = "44";
                    break;
                case "70222":
                    result = "0";
                    break;
                case "70151":
                    result = "23";
                    break;
                case "70320":
                    result = "30";
                    break;
                case "70331":
                    result = "31";
                    break;
                case "99202":
                    result = "36";
                    break;
                case "99299":
                    result = "35";
                    break;
                case "99309":
                    result = "33";
                    break;
                case "99508":
                    result = "46";
                    break;
                case "99691":
                    result = "51";
                    break;
                case "70290":
                case "74140":
                    result = "103";
                    break;
                case "99888":
                    result = "53";
                    break;
                case "99531":
                    result = "55";
                    break;
                case "70382":
                    result = "55";
                    break;
                case "99671":
                    result = "58";
                    break;
                case "70441":
                case "71460":
                    result = "60";
                    break;
                case "71190":
                    result = "61";
                    break;
                case "99260":
                    result = "62";
                    break;
                case "71040":
                    result = "66";
                    break;
                case "99447":
                    result = "67";
                    break;
                case "99373":
                    result = "68";
                    break;
                case "99487":
                    result = "69";
                    break;
                case "71150":
                    result = "71";
                    break;
                case "70731":
                    result = "76";
                    break;
                case "36114":
                    result = "79";
                    break;
                case "36122":
                    result = "80";
                    break;
                case "74320":
                    result = "23";
                    break;
                case "71180":
                    result = "85";
                    break;
                case "70531":
                    result = "85";
                    break;
                case "70432":
                    result = "85";
                    break;
                case "71160":
                    result = "86";
                    break;
                case "71200":
                    result = "82";
                    break;
                case "70781":
                    result = "90";
                    break;
                case "70741":
                    result = "91";
                    break;
                case "70791":
                    result = "95";
                    break;
                case "70801":
                    result = "97";
                    break;
                case "80321":
                case "80401":
                case "80411":
                    result = "117";
                    break;
                case "71070":
                case "71092":
                case "74350":
                    result = "9";
                    break;
                case "71012":
                case "71081":
                case "74290":
                case "71051":
                case "71022":
                case "70961":
                case "74220":
                    result = "122";
                    break;
                case "74230":
                case "71031":
                    result = "12";
                    break;
                case "80281":
                case "80220":
                case "84060":
                case "84070":
                case "80340":
                case "80111":
                case "74250":
                case "70860":
                case "71100":
                case "71101":
                    result = "106";
                    break;
                case "70472":
                case "70502":
                case "74170":
                case "74150":
                    result = "108";
                    break;
                case "74270":
                case "70851":
                case "74280":
                case "71280":
                case "71060":
                case "70992":
                case "70902":
                case "70881":
                case "74160":
                case "70480":
                case "70910":
                    result = "109";
                    break;
                case "60711":
                case "64330":
                    result = "115";
                case "36D20":
                    result = "25";
                case "36C62":
                    result = "28";
                case "36D72":
                    result = "92";
                case "36C81":
                    result = "89";
                case "9V482":
                    result = "87";
                case "9V481":
                    result = "85";
                default:
                    result = "";
            }
        }

        return result;
    }

    private static final String[] OTHRES = new String[] {
            "36D20 - 25", "36C62 - 28", "36D72 - 92", "36C81 - 89", "9V482 - 87", "9V481 - 85"
    };
}
