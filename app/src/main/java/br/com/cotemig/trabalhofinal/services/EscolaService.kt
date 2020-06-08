import br.com.cotemig.trabalhofinal.models.Escola
import retrofit2.Call
import retrofit2.http.GET
interface EscolaService {
    @GET("escola")
    fun getEscolas() : Call<Escola>;

}