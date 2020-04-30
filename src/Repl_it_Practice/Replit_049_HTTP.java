package Repl_it_Practice;
/*
    HTTP is the protocol that governs communications between web servers and web clients (i.e. browsers).
    Part of the protocol includes a status code returned by the server to tell the browser the status of
    its most recent page request. Some of the codes and their meanings are listed below:


STATUS CODES
200, OK
201, Created
202, Accepted
301, Moved Permanently
303, See Other
304, Not Modified
307, Temporary Redirect
400, Bad Request
401, Unauthorized
403, Forbidden
404, Not Found
410, Gone
500, Internal Server Error
503, Service Unavailable

Given an int variable status, write a switch statement that prints out, on a line by itself,
the appropriate label from the above list based on status. Otherwise, print warning message:
"Invalid status code!".

Example:
Display message: "Enter status code:"
input: 200
Display message: "OK"
 */

import java.util.Scanner;

public class Replit_049_HTTP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputStatusCode = scanner.nextInt();

        String srt1 = "";

        switch (inputStatusCode){
            case 200:
                srt1 = "OK";
                break;
            case 201:
                srt1 = "Created";
                break;
            case 202:
                srt1 = "Accepted";
                break;
            case 301:
                srt1 = "Moved Permanently";
                break;
            case 303:
                srt1 = "See Other";
                break;
            case 304:
                srt1 = "Not Modified";
                break;
            case 307:
                srt1 = "Temporary Redirect";
                break;
            case 400:
                srt1 = "Bad Request";
                break;
            case 401:
                srt1 = "Unauthorized";
                break;
            case 403:
                srt1 = "Forbidden";
                break;
            case 404:
                srt1 = "Not Faund";
                break;
            case 410:
                srt1 = "Gone";
                break;
            case 500:
                srt1 = "Internal Server Error";
                break;
            case 503:
                srt1 = "Service Unavailable";
                break;

                default:
                    srt1 = "Invalid status code!";
                    break;



        }
        System.out.println(srt1);


    }
}
