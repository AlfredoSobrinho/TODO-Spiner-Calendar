package com.generation.todo.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Switch
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.generation.todo.R
import com.generation.todo.model.Tarefa

//Configurar a classe para ser um Adapter
class TarefaAdapter : RecyclerView.Adapter<TarefaAdapter.TarefaViewHolder>(){

    private var listTarefas = emptyList<Tarefa>()

    class TarefaViewHolder (view: View) : RecyclerView.ViewHolder(view){

        val textNome = view.findViewById<TextView>(R.id.textNome)
        val textDescricao = view.findViewById<TextView>(R.id.textDescricao)
        val textResponsavel = view.findViewById<TextView>(R.id.textResponsavel)
        val textData = view.findViewById<TextView>(R.id.textData)
        val switchCardAtivo = view.findViewById<Switch>(R.id.switchCardAtivo)
        val textCategoria = view.findViewById<TextView>(R.id.textCategoria)
        val buttonDeletar = view.findViewById<Button>(R.id.buttonDeletar)

    }

    //Onde vamos dizer qual layout usaremos para os itens
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TarefaViewHolder {

        val layout = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_layout_tarefa, parent, false)

        return TarefaViewHolder(layout)
    }

    //Onde vamos processar todos os dados da lista
    override fun onBindViewHolder(holder: TarefaViewHolder, position: Int) {

        val tarefa = listTarefas[position]

        holder.textNome.text = tarefa.nome
        holder.textDescricao.text = tarefa.descricao
        holder.textResponsavel.text = tarefa.responsavel
        holder.textData.text = tarefa.data
        holder.switchCardAtivo.isChecked = tarefa.status
        holder.textCategoria.text = tarefa.categoria.descricao

    }

    //Onde vamos dizer para o Adapter quantos itens temos na lista
    override fun getItemCount(): Int {
        return listTarefas.size
    }

    fun setLista(lista: List<Tarefa>){
        listTarefas = lista
        notifyDataSetChanged()
    }

}