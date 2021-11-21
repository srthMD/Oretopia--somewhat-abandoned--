THIS MOD IS INCOMPLETE, EXPECT MANY BUGS AND MISSING FEATURES
made by @srth_md on twitter
i suck at texturing so @Rockblend1 on twitter will be texturing

ore generation has not been added yet as that is somewhat complex to me right now

i am not the best at java as this is more of a test project to see how far i can go as i have recently started java and github in general, so if you have some java knowledge and you encounter a problem feel free to introduce your own fix and submit it


please be aware that this mod does not use the official mappings but instead the version 20210309-1.16.5, and the mod id and display name when hovering over a item from the mod are different aswell. the hold shift for more info tooltip is also one tooltip is shared, meaning editing the tooltip that has the value "default" will change all items using the tooltip, if you want to change this, go to ModItems.java and in the else statment in the tooltip.add line of any item and change the default value to whatever you please, make sure to change the en-us json file (soon adding romanian json file) aswell when adding new tooltips

this is probably common with other mods, but if you are editing the en_us json file do not delete the § symbol or the first letter that comes after it unless you want to change the color/format, good luck reading formating like the romium info tooltip lmao

mod was made in intelij idea community edition, heres some steps that were put in by the default read me if you want to edit this mod similar to how i develop
1. Open IDEA, and import project.
2. Select your build.gradle file and have it import.
3. Run the following command: `gradlew genIntellijRuns` (`./gradlew genIntellijRuns` if you are on Mac/Linux)
4. Refresh the Gradle Project in IDEA if required.

some more preset text from the default read me page

If at any point you are missing libraries in your IDE, or you've run into problems you can 
run `gradlew --refresh-dependencies` to refresh the local cache. `gradlew clean` to reset everything 
{this does not affect your code} and then start the process again.

