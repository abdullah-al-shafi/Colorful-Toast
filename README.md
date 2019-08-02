# Colorful-Toast

To get a Git project into your build:

# Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:


	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  
  # Step 2. Add the dependency
  
  
  	dependencies {
	        implementation 'com.github.abdullah-al-shafi:Colorful-Toast:1.0.0'
	  }
  
  
  # Step 3. And your main code you can use it like
  
  
