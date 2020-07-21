HelpDeskEddy Java Android SDK
==================

This page gives you the basic steps for getting up and running with the Support SDK.

## The SDK has the following requirements:

Minimum Android version: API level 24 (Nougat / 7.0)

## What is the Support SDK?
The Support SDK helps you add the following features to your app:

Show Knowledge Base content<br/>
Show available departments<br/>
Show/create/update:<br/>
tickets<br/>
users<br/>
ticket comments.

You can also use the Support SDK without our UI, and build your own UI on top of our API providers. This takes a little more development time but gives you more control. To find out more, see API providers.

## What you need to get started
You need HelpDeskEddy system account and apiKey for API access. 

## Getting up and running
Add the SDK to your project by including the following snippets in the build.gradle file:
```groovy
repositories {
    maven { url 'https://jitpack.io' }
}
```
```groovy
dependencies {
   implementation 'com.github.JackWhiteGit:HDESDK_Java_proj:1.0.1'
}
```
Create AsyncTask (or other thread's method) and initialize SDK in the AsyncTask method of an Activity where you plan to use the SDK:

```java
    private class RequestTask extends AsyncTask<String, String, String> {

        protected String doInBackground(String... params) {
            Map<String, String> options  = new HashMap<String, String>();
            options.put("title", "Problem with email");
            options.put("description", "Problem with email");
            options.put("sla_date", "17.07.2020 00:00");
            options.put("priority_id", "1");
            options.put("user_email", "example@example.com");
            options.put("create_from_user", "1");

            SDKinit hdesdk = new SDKinit("example@example.com", "api-key", "https://example.helpdeskeddy.com");
            String response = hdesdk.TicketCreate(options);
            return response;
        }

        @Override
        protected void onPostExecute(String response) {
            super.onPostExecute(response);
        }

    }
```

And call AsyncTask with your API requests in onCreate method:

```java
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new RequestTask().execute("");

    }
```   
For more information You can visit [Javadoc SDK Documentation](http://demo3.newsite.lv/HDE_JAVA_SDK/index.html) and official [HelpDeskEddy API Documentation](https://helpdeskeddy.ru/api.html)
