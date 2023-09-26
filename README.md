From Scratch

1. Create new project from Empty View Activity

2. Setting app/build.gradle.kts for navigation + viewBinding project

update compileSdk and targetSdk to 34

buildFeatures {
viewBinding = true
}

implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.6.2")
implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2")
implementation("androidx.navigation:navigation-fragment-ktx:2.7.3")
implementation("androidx.navigation:navigation-ui-ktx:2.7.3")

3. Create app bar layout, ex : app_bar_main.xml
   to show the main app bar and main content

4. Create a drawer layout, ex : activity_main.xml
   to show the main activity layout, include the app_bar_main and the drawer, you can also include others like settings or bottom bar

5. Add some theme for AppBarOverlay and PopupOverlay to themes.xml
   for styling purposes

6. Add page for main content, ex : content_main.xml
   declare the defaultNavHost and navGraph here for the main content

7. Add navigation file on res/navigation folder, ex : navigation.xml
   the navigation core file

8. Add the destination fragment for navigation, ex : DashboardFragment.kt
   the fragments we wants to navigate, of course we need to create that first

9. Add some string needed for the header and navigation bar to res/values/strings.xml and create dimens.xml for dimention
   add nav_header_main.xml for the header of navigation bar
   for cleaning code

10. Add icon for dashboard menu to res/drawable add > new > vector asset
    to show the image on navigation drawer

11. Add file menu activity_main_drawer for the drawer menu res/menu
    add the menu's needed to show

12. Update MainActivity.kt