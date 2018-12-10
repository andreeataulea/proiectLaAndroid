package com.example.andre.android;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.andre.android.model.Rezultate;

import org.w3c.dom.Text;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class rezultat extends AppCompatActivity {

    private TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rezultat);

        txt=(TextView)findViewById(R.id.txt);

        parseXML();
    }

    private void parseXML(){
        XmlPullParserFactory parserFactory;
        try {
            parserFactory=XmlPullParserFactory.newInstance();
            XmlPullParser parser=parserFactory.newPullParser();
            InputStream is= getAssets().open("date_intrebari.xml");
            parser.setFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES,false);
            parser.setInput(is,null);
            processParsing(parser);

        } catch (XmlPullParserException e) {

        } catch (IOException e) {

        }
    }

    private void processParsing(XmlPullParser parser) throws XmlPullParserException, IOException {
        ArrayList<Rezultate> rezultate=new ArrayList<>();
        int eventType = parser.getEventType();
        Rezultate rezultatCurent=null;

        while(eventType!=XmlPullParser.END_DOCUMENT) {

            String eltName = null;

            switch (eventType) {
                case XmlPullParser.START_TAG:
                    eltName = parser.getName();

                if ("rezultat".equals(eltName)) {
                    rezultatCurent = new Rezultate();
                    rezultate.add(rezultatCurent);
                } else if (rezultatCurent != null) {
                    if ("codTest".equals(eltName)) {
                        rezultatCurent.codTest = parser.nextText();
                    } else if ("materie".equals(eltName)) {
                        rezultatCurent.materie = parser.nextText();
                    } else if ("numeProfesor".equals(eltName)) {
                        rezultatCurent.numeProfesor = parser.nextText();
                    } else if ("punctaj".equals(eltName)) {
                        rezultatCurent.punctaj = parser.nextText();
                    }
                }

                break;
            }
            eventType = parser.next();
        }

        printRez(rezultate);
    }
    private void printRez(ArrayList<Rezultate> rezultate){
        StringBuilder builder=new StringBuilder();

        for(Rezultate rezultat : rezultate){
            builder.append(rezultat.codTest).append("\n").
                    append(rezultat.materie).append("\n").
                    append(rezultat.numeProfesor).append("\n").
                    append(rezultat.punctaj).append("\n\n");
        }
        txt.setText(builder.toString());
    }
}
