package com.muj.android.oneiros.backend;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by Siddharth on 30-08-2017.
 */

public class AddData {
    static Clubs newClub;
    static Event newEvent;
    public static DatabaseReference mDatabase;
    static String description[] = ("Aperture is here to provide a platform for the constructive hobby and give the students of the University a platform to showcase their artwork in the form of Photography, Videography, Graphic and Motion Graphic Design on offline and online medium." +
                                    "#Be the Cinematographer, Writer, Actor and Director. Be the Artist in you. Think, write, direct, produce, edit, shoot, stage and perform. Here, at Cinefilia, the Dramatics and Film-making society of Manipal University Jaipur, we aim for an experience and creativity larger than life. Be it the zeal for videos, stage plays or street plays, this is the place where imagination turns into reality." +
                                    "#A family of dancers and platform of talent, Coreografia is the official dance society of the university that keeps the streets and stages of MUJ filled with exuberance.\nWe stand to entertain, enchant and enthrall!" +
                                    "#Litmus is the Literary Club of MUJ, and in that capacity hosts an array of literary events ranging from public speaking and writing to quizzing, through the year. Under Litmus, we have a Debating and a Writing Society where we teach and hone the public speaking and writing skills of our members in every form. Being the only English Literary Club in MUJ, Litmus members constantly participate and win accolades in numerous literary festivals, debates and MUNs throughout the nation." +
                                    "#&quot;Art is not what you see, but what you make others see.&quot;- Edgar Degas\nScribbles, the Art club of Manipal University Jaipur came in to existence 2 years ago. Since then in all the fests conducted especially the cultural fest, we have a major role to play as we form the design team and every tiny bit of theme based recreation is done by us. Also a lot of interesting events are conducted every now and then and during the fest. Our club is dedicated towards all those who wish to unleash their talent or learn something new for which workshops will be conducted in the coming year." +
                                    "#The Hindi club of Manipal University Jaipur aims at enhancing an individuals communicative skills in Hindi and teach them Hindi literature. It will also help you to learn more about Indian culture and society." +
                                    "#&quot;No mind is much employed upon the present recollection and anticipation fill up almost all our moments.&quot; - Samuel Johnson\nSophia - the philosophy club of Manipal University Jaipur, started with just a few people in 2015, is now a huge family of creative thinkers and philosophers.\nWith philosophy, we are able to keep a heuristic point of view.\nIt is all too easy as one ages to mentally ‘wander off’ into a stream of memories, dreams, and reflections unrelated to the moment, yet which insist on dominating consciousness as they flit across the screen of the mind." +
                                    "#The Music Club is the music society of Manipal University Jaipur. The club aims to nurture the talent in every member and provide a conducive environment for mutual learning. We believe that each individual has something to offer and through mentorships, jams, competitions and events we strive to polish skills, share knowledge and spread happiness.").split("#");
    static String clubs[]="Aperture#Cinefilia#Coreographia#Litmus#Scribbles#Shabd#Sophia#The Music Club".split("#");
    static String clubUniqueIds[]="-KtNY1ZLdhpVMvj_sFMx#-KtNY1ZTH2f8oV9miI28#-KtNY1ZTH2f8oV9miI29#-KtNY1ZTH2f8oV9miI2A#-KtNY1ZTH2f8oV9miI2B#-KtNY1ZU0kplfYYgVEOf#-KtNY1ZU0kplfYYgVEOg#-KtNY1ZU0kplfYYgVEOh".split("#");
    public static void commit(){
//        mDatabase = FirebaseDatabase.getInstance().getReference().child("Clubs");
//        DatabaseReference clubData;
//        for(int i=0;i<clubs.length;i++){
//            clubData=mDatabase.push();
//            newClub= new Clubs(clubs[i],description[i]);
//            try {clubData.setValue(newClub);
//            }catch (Exception e){}
//        }
        mDatabase = FirebaseDatabase.getInstance().getReference().child("Events");
        DatabaseReference eventDate;
        for(int i=0;i<clubs.length;i++){
            eventDate=mDatabase.push();
            try {eventDate.setValue(newClub);
            }catch (Exception e){}
        }

    }
}
