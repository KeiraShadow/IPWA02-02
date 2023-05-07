package com.myservlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class Servlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Create a Geisternetz object
        Geisternetz geisternetz = new Geisternetz("52.520008, 13.404954", 10.5, "Gemeldet");

        // Create a MeldendePerson object
        MeldendePerson meldendePerson = new MeldendePerson("John Doe", "1234567890");

        // Set the meldendePerson for the geisternetz
        geisternetz.setMeldendePerson(meldendePerson);

        // Create a BergendePerson object
        BergendePerson bergendePerson = new BergendePerson("Jane Smith", "9876543210");

        // Add the geisternetz to the bergendePerson's list of geisternetze
        bergendePerson.addGeisternetz(geisternetz);

        // Perform any additional operations or manipulations as required

        // Set the response content type
        response.setContentType("text/html");

        // Write the output HTML content
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>My Servlet</title></head>");
        out.println("<body>");
        out.println("<h1>Welcome to My Servlet</h1>");
        out.println("<p>Geisternetz Standort: " + geisternetz.getStandort() + "</p>");
        out.println("<p>Geisternetz geschätzte Größe: " + geisternetz.getGeschätzteGröße() + "</p>");
        out.println("<p>Geisternetz Status: " + geisternetz.getStatus() + "</p>");
        out.println("<p>MeldendePerson Name: " + meldendePerson.getName() + "</p>");
        out.println("<p>MeldendePerson Telefonnummer: " + meldendePerson.getTelefonnummer() + "</p>");
        out.println("<p>BergendePerson Name: " + bergendePerson.getName() + "</p>");
        out.println("<p>BergendePerson Telefonnummer: " + bergendePerson.getTelefonnummer() + "</p>");
        out.println("<p>BergendePerson Anzahl der Geisternetze: " + bergendePerson.getGeisternetze().size() + "</p>");
        out.println("</body>");
        out.println("</html>");
    }
}
