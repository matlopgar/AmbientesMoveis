package br.com.cotemig.trabalhofinal.ui.activities

import RetrofitInitializer
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.cotemig.trabalhofinal.R
import android.widget.Toast
import br.com.cotemig.trabalhofinal.models.Escola
import retrofit2.Call
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        getEscolas()
    }

    fun getEscolas(){
        var s = RetrofitInitializer().serviceEscola()
        var call = s.getEscolas()
        call.enqueue(object : retrofit2.Callback<Escola> {
            override fun onResponse(call: Call<Escola>?, response: Response<Escola>?) {
                response?.let {
                }
            }

            override fun onFailure(call: Call<Escola>?, t: Throwable?) {
                Toast.makeText(this@MainActivity,"Ops",Toast.LENGTH_LONG).show()
            }

        })
    }
}

