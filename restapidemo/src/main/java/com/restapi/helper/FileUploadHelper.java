package com.restapi.helper;

import org.springframework.stereotype.*;
import org.springframework.web.multipart.*;

import java.io.*;
import java.nio.file.*;

@Component
public class FileUploadHelper {
    public final String UPLOAD_DIR = "/home/yash/Desktop/trainee-java learning/Springboot/restapidemo/src/main/resources/static/images/";

    public boolean uploadFile(MultipartFile f) {
        boolean flag = false;
        try {
//            InputStream is = f.getInputStream();
//            byte[] data = new byte[is.available()];
//            is.read(data);
//            FileOutputStream fos = new FileOutputStream(UPLOAD_DIR + File.pathSeparator + f.getOriginalFilename());
//            fos.write(data);
//            fos.flush();
//            fos.close();
            Files.copy(f.getInputStream(), Paths.get(UPLOAD_DIR+File.separator+f.getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING);
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }
}
