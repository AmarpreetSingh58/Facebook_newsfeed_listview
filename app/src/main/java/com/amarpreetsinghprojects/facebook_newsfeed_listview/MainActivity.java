package com.amarpreetsinghprojects.facebook_newsfeed_listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calendar c = Calendar.getInstance();
        System.out.println("Current time => " + c.getTime());

        SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy");
        String formattedDate = df.format(c.getTime());


        ArrayList<Feed_elemets> feed_elemetsArrayList = new ArrayList<>();
        feed_elemetsArrayList.add(new Feed_elemets("Amarpreet Singh",formattedDate,"feed\n" +
                "[feed] \n" +
                "Spell  Syllables\n" +
                "Synonyms Examples Word Origin\n" +
                "See more synonyms on Thesaurus.com\n" +
                "verb (used with object), fed, feeding.\n" +
                "1.\n" +
                "to give food to; supply with nourishment:\n" +
                "to feed a child.\n" +
                "2.\n" +
                "to yield or serve as food for:\n" +
                "This land has fed 10 generations."));
        feed_elemetsArrayList.add(new Feed_elemets("Nikka", formattedDate, "A flock of crows is known as a murder."));
        feed_elemetsArrayList.add(new Feed_elemets("Newton", formattedDate, "Gravitational lensing: Light around a massive object, such as a black hole, is bent, causing it to act as a lens for the things that lie behind it. Astronomers routinely use this method to study stars and galaxies behind massive objects.\n" +
                "\n" +
                "Einstein's Cross, a quasar in the Pegasus constellation, is an excellent example of gravitational lensing. The quasar is about 8 billion light-years from Earth, and sits behind a galaxy that is 400 million light-years away. Four images of the quasar appear around the galaxy because the intense gravity of the galaxy bends the light coming from the quasar.\n" +
                "\n" +
                "Gravitational lensing can allow scientists to see some pretty cool things, but until recently, what they spotted around the lens has remained fairly static. However, since the light traveling around the lens takes a different path, each traveling over a different amount of time, scientists were able to observe a supernova occur four different times as it was magnified by a massive galaxy."));
        feed_elemetsArrayList.add(new Feed_elemets("Mirenda", formattedDate, " Happy Birthday"));

        ListView listView = (ListView)findViewById(R.id.listview);
        Feed_Adapter adapter = new Feed_Adapter(feed_elemetsArrayList,this);
        listView.setAdapter(adapter);



    }
}
