package com.example.demo;
import java.nio.ByteBuffer;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OrdinaryController {
@GetMapping("/")
public String homePage() throws RecordNotFoundException
{
    return "NewFile";
}
public static String shortUUID() {
    UUID uuid = UUID.randomUUID();
    long l = ByteBuffer.wrap(uuid.toString().getBytes()).getLong();
    return Long.toString(l, Character.MAX_RADIX);
}
}