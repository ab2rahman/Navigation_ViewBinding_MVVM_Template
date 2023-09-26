package id.teknografer.navigationviewbindingtemplate.ui.skill

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import id.teknografer.navigationviewbindingtemplate.databinding.ItemSkillsBinding

class SkillsAdapter(val listener: (string: String) -> Unit) : RecyclerView.Adapter<SkillsAdapter.ViewHolder>() {

    inner class ViewHolder(private val binding: ItemSkillsBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(text: String) {
            binding.tvItemSkills.text = text
            binding.root.setOnClickListener {
                listener(text)
            }
        }
    }

    private val skills = listOf(
        "Pemrograman dart (Flutter)",
        "Pemrograman java (Android)",
        "Pemrograman kotlin (Android)",
        "Pemrograman c (Desktop)",
        "Pemrograman swift (iOS)",
        "Pemrograman dart (Flutter)",
        "Pemrograman java (Android)",
        "Pemrograman kotlin (Android)",
        "Pemrograman c (Desktop)",
        "Pemrograman swift (iOS)",
        "Pemrograman dart (Flutter)",
        "Pemrograman java (Android)",
        "Pemrograman kotlin (Android)",
        "Pemrograman c (Desktop)",
        "Pemrograman swift (iOS)"
    )

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val view = ItemSkillsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(skills[position])
    }

    override fun getItemCount(): Int = skills.size
}

