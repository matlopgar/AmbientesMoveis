package br.com.cotemig.trabalhofinal.ui.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import br.com.cotemig.trabalhofinal.R
import br.com.cotemig.trabalhofinal.models.Escola
import com.bumptech.glide.Glide

class EscolaAdapter(var context: Context, var list: List<Escola>) :
BaseAdapter() {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?):
            View {
        var view = LayoutInflater.from(context).inflate(
            R.layout.item_escola,
            null)

        var nome = view.findViewById<TextView>(R.id.valor_nome_escola)
        nome.text = list[position].NOM_OFIC_ESCL


        return view
    }
    override fun getItem(position: Int): Any {
        return ""
    }
    override fun getItemId(position: Int): Long {
        return 0
    }
    override fun getCount(): Int {
        return list.size
    }
}