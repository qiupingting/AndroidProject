package com.example.myapplication.ui.activity;

import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Main2Activity extends AppCompatActivity {

    @BindView(R.id.button)
    Button button;
    @BindView(R.id.edit_View)
    EditText editView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.button)
    public void onViewClicked() {
        XmlResourceParser xrp=getResources().getXml(R.xml.person_list);
        StringBuilder sb=new StringBuilder();
        while(true){
            try {
                if (!(xrp.getEventType() !=XmlResourceParser.END_DOCUMENT)) {
                    if(xrp.getEventType()==XmlResourceParser.START_DOCUMENT){
                        String tagName=xrp.getName();
                        if(tagName.equals("person")){
                            String perAge=xrp.getAttributeValue(0);
                            sb.append("年龄：");
                            sb.append(perAge);
                            String perSex=xrp.getAttributeValue(1);
                            sb.append("性别：");
                            sb.append(perSex);
                            sb.append("姓名：");
                            sb.append(xrp.nextText());
                            sb.append("\n");
                        }
                        xrp.next();
                    }
                    editView.setText(sb.toString());
                }
            } catch (XmlPullParserException e) {
                e.printStackTrace();
            }catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
