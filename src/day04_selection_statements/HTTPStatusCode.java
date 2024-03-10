package day04_selection_statements;

public class HTTPStatusCode {

    public static void main(String[] args) {

        int statusCode = 700;
        String result = switch (statusCode) {
            case 200 -> "OK";
            case 201 -> "Created";
            case 202 -> "Accepted";
            case 301 -> "Moved Permanently";
            case 303 -> "See Other";
            case 304 -> "Not Modified";
            case 307 -> "Temporary Redirect";
            case 400 -> "Bad Request";
            case 401 -> "Unauthorized";
            case 403 -> "Forbidden";
            case 404 -> "Not Found";
            case 410 -> "Gone";
            case 500 -> "Internal Server Error";
            case 503 -> "Service Unavailable";
            default -> "Invalid status code " + statusCode;
        };

        System.out.println(result);
    }


}
/*
13. Create a class named HttpStatusCode. HTTP is the protocol that governs communications between
Web servers and web clients. Part of the protocol includes a status code returned by the server to
inform the browser of its most recent page request status.

		Here are some of the codes and their meanings:

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

	Given an integer variable named statusCode, write a switch that prints out the appropriate label
	from the above list based on the status.

			Example:
				   if status code = 200

			Output:
				   OK
 */