package esercitazione7.GestioneRubrica;
import java.util.Collection;
/*
@Path("/")
public class ContactRestfulApi {

    static ContactQueries query = new ContactQueries();
    Gson gson = new Gson();

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt(){
        return "Benvenuto nella tua rubrica!";
    }//getIt()

    @GET
    @Path("contact/")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAll(){
        Collection<Contact> ret = query.getAll();
        if (ret != null){
            return Response.ok(gson.toJson(ret)).build();
        }
        return null;
    }//getAll

    @GET
    @Path("contact/byName/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getContactByName(@PathParam("name") String name){
        Collection<Contact> ret = query.getByName(name);
        return Response.ok(gson.toJson(ret)).build();
    }//getContactByName

    @POST
    @Path("contact")
    @Produces(MediaType.APPLICATION_JSON)
    @Consume(MediaType.APPLICATION_JSON)
    public Response createContact(Contact contact){
        query.insertOrUpdate(contact);
        return Response.ok(gson.toJson(contact)).build();
    }//createContact

    @DELETE
    @Path("contact/{id}")
    public Response deleteContact(@PathParam("id") Long id){
        query.delete(id);
        return Response.ok("Contatto cancellato!").build();
    }//deleteContact

}//ContactRestfulApi
*/