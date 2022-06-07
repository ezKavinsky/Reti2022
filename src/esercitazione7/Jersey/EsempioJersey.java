package esercitazione7.Jersey;
import esercitazione7.Customer;
import java.util.List;
/*
public class EsempioJersey {

    @GET                                                                   //operazione da effettuare
    @Path("/customer/{id}")                                                //percorso (URI) dove trovare la risorsa voluta
    public String getCustomer(@PathParam("id") final String id){           //mappa il parametro passato nel path con quello passato nel metodo
        return "Customer ID:" + customers.get(id);
    }//getCustomer

    @GET
    @Path("/customer")                                                              //accesso a tutti i clienti
    public List<String> getCustomer(@QueryParam("name") final String name){         //filtra tutti i clienti con nome name
        return customers.findByName(name);
    }//getCustomer

    @POST
    @Path("/customer")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<String> createCustomer(final Customer c){
        customers.add(c);
        return customers;
    }//createCustomer



}//EsempioJersey
*/