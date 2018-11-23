package fr.formation.partiel1.controllers;

import java.time.LocalDateTime;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import fr.formation.partiel1.Iban;
import fr.formation.partiel1.Virement;

@Path("virement")
public class VirementControllor {

    @GET
    @Path("/transfer/{last}")
    @Produces(MediaType.APPLICATION_JSON)
    public Virement transfer(@PathParam("last") String last) {
	return buildLastTransfer();
    }

    private static Virement buildLastTransfer() {
	double amount = 14;
	LocalDateTime dateP = LocalDateTime.now();
	LocalDateTime dateS = LocalDateTime.of(2016, 10, 11, 14, 10);
	Virement virement = new Virement(amount, dateP, dateS);
	return virement;
    }

    private static Iban buildIban1() {
	String codeP = "FR";
	int keyC = 33;
	int keyB = 30002;
	int keyG = 00550;
	String numberAcount = "0000638764Z";
	int keyR = 34;
	Iban numero = new Iban(codeP, keyC, keyB, keyG, numberAcount, keyR);
	return numero;
    }
}
