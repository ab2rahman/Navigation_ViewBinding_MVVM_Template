package id.teknografer.navigationviewbindingtemplate.ui.skill

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment.Companion.findNavController
import id.teknografer.navigationviewbindingtemplate.R
import id.teknografer.navigationviewbindingtemplate.databinding.FragmentSkillsBinding

class SkillsFragment: Fragment() {

    private var _binding: FragmentSkillsBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSkillsBinding.inflate(inflater, container, false)
        val root: View = binding.root
        val recyclerView = binding.rvSkills
        val adapter = SkillsAdapter{
            navigateToDetail(it)
        }
        recyclerView.adapter = adapter
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun navigateToDetail(extraName: String){
        val bundle = Bundle()
        bundle.putString("extra_name", extraName)
        findNavController(this).navigate(R.id.action_nav_skills_to_skill_detail, bundle)
        //findNavController().navigate(TransformFragmentDirections.actionNavTransformToTransformDetail(extraName))
    }
}