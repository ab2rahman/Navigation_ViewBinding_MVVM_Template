package id.teknografer.navigationviewbindingtemplate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.navigation.NavigationView
import id.teknografer.navigationviewbindingtemplate.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // create late init var for appBarConfiguration and binding with activity_main.xml
    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // inflate the view and set the content view to activity_main.xml
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // add the toolbar if needed ex : if you have search / menu / some settings
        setSupportActionBar(binding.appBarMain.toolbar)

        // initiate the drawer layout and navigation view
        val drawerLayout: DrawerLayout = binding.drawerLayout
        val navView: NavigationView = binding.navView
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        // Passing each menu ID as a set of Ids because each menu should be considered as top level destinations.
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_dashboard,
                R.id.nav_skills,
            ), drawerLayout
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        // navigation function
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }
}