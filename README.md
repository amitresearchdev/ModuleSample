# ModuleSample

## Setup


Add this to your project build.gradle
``` gradle
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
```
Add this to your module build.gradle

```gradle
   dependencies {
        implementation 'com.github.Droidhelios:ModuleSample:1.0'
    }

```
### Usage
In your <b>activity</b> class:
```java 
    Intent intent = new Intent(MainActivity.this, CounterActivity.class);
    startActivityForResult(intent, REQ_CODE);
```

Reciving result
```java
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == CounterActivity.REQUEST_CODE){
            int counter = data.getIntExtra("counter", 0); 
        } 
    }
```
