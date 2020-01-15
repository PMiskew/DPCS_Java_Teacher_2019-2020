/*
 * @author:         Carlo Fontanos
 * @author_url:     carlofontanos.com
 *
 * A simple code snippet for parsing JSON data from a URL
 */

               
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonParser {
   
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();

        try {        
            URL oracle = new URL("https://carlofontanos.com/api/tutorials.php?data=all"); // URL to Parse
            URLConnection yc = oracle.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
           
            String inputLine;
            while ((inputLine = in.readLine()) != null) {              
                JSONArray a = (JSONArray) parser.parse(inputLine);
               
                // Loop through each item
                for (Object o : a) {
                    JSONObject tutorials = (JSONObject) o;

                    Long id = (Long) tutorials.get("ID");
                    System.out.println("Post ID : " + id);

                    String title = (String) tutorials.get("post_title");
                    System.out.println("Post Title : " + title);

                    System.out.println("\n");
                }
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }  
    }  
}
Contents of tutorials.php:

1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
<?php
header("Access-Control-Allow-Origin: *");
header("Content-Type: application/json; charset=UTF-8");

require_once( '../wp-load.php' );

if( isset( $_GET['data'] ) && $_GET['data'] == 'all' ) {
    $all_tutorials = array(
        'post_type' => 'post',
        'post_status' => 'publish',
        'posts_per_page' => -1, // all
        'orderby' => 'title',
        'order' => 'ASC'
    );
     
    $tutorials_data = get_posts( $all_tutorials );
    echo json_encode( $tutorials_data );
}