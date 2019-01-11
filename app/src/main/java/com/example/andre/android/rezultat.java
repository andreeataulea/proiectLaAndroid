package com.example.andre.android;

import android.app.Activity;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import android.widget.LinearLayout;
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

    //LinearLayout layout;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rezultat);

        txt = (TextView) findViewById(R.id.txt1);
        parseXML();
    }

        //layout = (LinearLayout)findViewById(R.id.layout);

        //XmlResourceParser parser = getResources().getXml(R.xml.xmlrezultate);
//        try {
//            processData(parser);
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (XmlPullParserException e) {
//            e.printStackTrace();
//        }


//    private void processData(XmlResourceParser parser) throws IOException, XmlPullParserException {
//
//        int evenType  =-1;
//        while (evenType != XmlResourceParser.END_DOCUMENT){
//            if(evenType == XmlResourceParser.START_TAG){
//                String rezultatValue = parser.getName();
//                if(rezultatValue.equals("rezultat")){
//                    String cod = parser.getAttributeValue(null,"codTest");
//                    String materie = parser.getAttributeValue(null,"materie");
//                    String nume = parser.getAttributeValue(null,"numeProfesor");
//                    String punctaj = parser.getAttributeValue(null, "punctaj");
//
//                    printValues(cod, materie, nume,punctaj);
//
//                }
//            }
//
//            evenType=parser.next();
//        }
//    }
//
//    private void printValues(String cod, String materie, String nume, String punctaj) {
//        LinearLayout layoutRezultat = new LinearLayout(this);
//        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(0,ViewGroup.LayoutParams.WRAP_CONTENT);
//        params.weight=1;
//        layoutRezultat.setOrientation(LinearLayout.HORIZONTAL);
//
//        TextView codText = new TextView(this);
//        TextView materieText = new TextView(this);
//        TextView profesorText = new TextView(this);
//        TextView punctajText = new TextView(this);
//
//        codText.setLayoutParams(params);
//        materieText.setLayoutParams(params);
//        profesorText.setLayoutParams(params);
//        punctajText.setLayoutParams(params);
//
//        codText.setText(cod);
//        materieText.setText(materie);
//        profesorText.setText(nume);
//        punctajText.setText(punctaj);
//
//        layoutRezultat.addView(codText);
//        layoutRezultat.addView(materieText);
//        layoutRezultat.addView(profesorText);
//        layoutRezultat.addView(punctajText);
//    }

        private void parseXML () {
            XmlPullParserFactory parserFactory;
            try {
                parserFactory = XmlPullParserFactory.newInstance();
                XmlPullParser parser = parserFactory.newPullParser();
                InputStream is = getAssets().open("xmlrezultate.xml");
                parser.setFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES, false);
                parser.setInput(is, null);
                processParsing(parser);

            } catch (XmlPullParserException e) {

            } catch (IOException e) {

            }
        }

        private void processParsing (XmlPullParser parser) throws
        XmlPullParserException, IOException {
            ArrayList<Rezultate> rezultate = new ArrayList<>();
            int eventType = parser.getEventType();
            Rezultate rezultatCurent = null;

            while (eventType != XmlPullParser.END_DOCUMENT) {

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
        private void printRez (ArrayList < Rezultate > rezultate) {
            StringBuilder builder = new StringBuilder();

            for (Rezultate rezultat : rezultate) {
                builder.append(rezultat.codTest).append("\n").
                        append(rezultat.materie).append("\n").
                        append(rezultat.numeProfesor).append("\n").
                        append(rezultat.punctaj).append("\n\n");
            }
            txt.setText(builder.toString());
        }

}
