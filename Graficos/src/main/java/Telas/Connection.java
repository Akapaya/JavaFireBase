/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Telas;

import static Telas.QuestionInsert.Tema;
import static Telas.QuestionInsert.ref;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.database.FirebaseDatabase;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author Grego
 */
public class Connection {
    public void Conectar()
    {
        try {
            FileInputStream serviceAccount = new FileInputStream("quizzaria.json");

            FirebaseOptions options = new FirebaseOptions.Builder()
                    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                    .setDatabaseUrl("https://quizzaria-a84d2-default-rtdb.firebaseio.com/")
                    .build();

            FirebaseApp.initializeApp(options);

            
            //ref = FirebaseDatabase.getInstance().getReference("Games");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
