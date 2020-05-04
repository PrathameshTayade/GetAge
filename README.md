# GetAge

This library is to calculate years days and months lived on providing current date.
Plz Note: 
1. If you are trying to provide current date from Calender object then its perfect!
    as Calender object starts counting months from 0.
2. But if you are hardcodig the values of month, then make sure to decrease the month value by 1.

* Constructor(Context,birthyear,birthMonth,birthDay,currentYear,currentMonth,currentDay)



Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.PrathameshTayade:GetAge:1.0'
	}
