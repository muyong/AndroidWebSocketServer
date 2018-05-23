package com.element.androidwebsocketserver;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Scanner;
import javax.websocket.DeploymentException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        org.glassfish.tyrus.server.Server server =
                new org.glassfish.tyrus.server.Server("localhost", 8025, "/ws", null, MyServerEndpoint.class);
        try {
            server.start();

            //System.out.println("Press any key to stop the server..");
            //new Scanner(System.in).nextLine();
        } catch (DeploymentException e) {
            throw new RuntimeException(e);
        } /*finally {
            server.stop();
        }*/
        setContentView(R.layout.activity_main);
        TextView textView = (TextView)findViewById(R.id.textView);
        textView.setText("Web Socket Server Started.");
    }
}
