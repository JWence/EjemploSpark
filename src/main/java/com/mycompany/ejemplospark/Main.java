/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejemplospark;
import com.google.gson.Gson;
import com.todo.controllers.TaskController;
import com.todo.routes.TaskRoute;
import static spark.Spark.*;
/**
 *
 * @author JCVW
 */
public class Main {

   public static void main(String[] args) {
        port(5555); 
        new TaskRoute(new TaskController());
    }
}


/*

 get("/", (req, res) -> "Soy otra ruta");
        get("/saludo", (req, res) -> "Hola jóvenes");
        
        Gson gson = new Gson();
        String [] tasks = {"Revisar pendientes", "dasda", "Checar listas"};
        get("/tasks", (req, res) -> gson.toJson(tasks));
*/
