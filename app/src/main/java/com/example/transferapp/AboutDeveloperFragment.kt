import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CircleCrop
import com.example.transferapp.R
import com.example.transferapp.databinding.FragmentAboutDeveloperBinding

class AboutDeveloperFragment : Fragment() {

    private var _binding: FragmentAboutDeveloperBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAboutDeveloperBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Load the image into the ImageView with circular transformation using Glide
        Glide.with(this)
            .load(R.drawable.mypicture) // Replace with your image resource or URL
            .transform(CircleCrop())
            .into(binding.profilePicture)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
