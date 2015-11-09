package com.spentas.javad.securechat.network.websocket;

/**
 * Created by javad on 11/6/2015.
 */
public class NetworkConfig {
    public static final String REST_USERNAME_PARAM = "username";
    public static final String REST_PASSWORD_PARAM = "password";
    public static final String REST_PUBLIC_KEY_PARAM = "pbk";
    public static final String BASE = "http://10.24.3.249:";
    public static final String REST_PORT="8080";
    public static final String WS_BASE = "ws://10.24.15.124:";
    public static final String WS_ENDPOINT = "/SecureMessagingSystemServer/chat?name=";
    public static final int WS_PORT = 8080;
    public static final String WS_URL = WS_BASE+WS_PORT+WS_ENDPOINT;
    public static final String REST_LOGIN_ENDPOINT = "/SecureChatServer/login";
    public static final String REST_REGISTER_ENDPOINT = "/SecureChatServer/register";

}
