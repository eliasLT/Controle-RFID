package fr.newton.controlrfid.model.bdd;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DBStatic {

        public static  boolean mysql_pooling = false;
        public static  String mysql_host ;
        public static String mysql_db ;
        public static  String mysql_username ;
        public static  String mysql_password;



        public static String getMysql_host() throws IOException {
            if(mysql_host == null){
                initData();
            }
            return mysql_host;
        }

        public static String getMysql_db() throws IOException {
            if(mysql_db == null){
                initData();
            }
            return mysql_db;
        }

        public static String getMysql_username() throws IOException {
            if(mysql_username == null){
                initData();
            }
            return mysql_username;
        }

        public static String getMysql_password() throws IOException {
            if(mysql_password == null){
                initData();
            }
            return mysql_password;
        }
        private static void initData() throws IOException {
            File f = new File("env.json");
            BufferedReader br = new BufferedReader(new FileReader(f));
            StringBuilder content = new StringBuilder();
            String line ;
            while ((line = br.readLine()) != null) {
                content.append(line).append("\n");
            }
//            System.out.println(content.toString());
            Gson gson = new GsonBuilder().create();
            JsonObject res = gson.fromJson(content.toString(), JsonObject.class);
            DBStatic.mysql_host =  res.get("mysql_host").getAsString();
            DBStatic.mysql_db =  res.get("mysql_db").getAsString();
            DBStatic.mysql_username =  res.get("mysql_username").getAsString();
            DBStatic.mysql_password =  res.get("mysql_password").getAsString();

        }



    }





