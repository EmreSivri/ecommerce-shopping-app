package com.ecommerce.shoppingapp.filestore.service;

import com.ecommerce.shoppingapp.filestore.service.s3.FileService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.io.InputStream;

@Slf4j
@Service
@RequiredArgsConstructor
public class FileStoreService {

    private final FileService fileService;

    public Mono<byte[]> getImage(String id) {
        return Mono.just(fileService.get(id));
    }

    public void saveImage(String id, InputStream ieFile) {
        fileService.save(id, MediaType.IMAGE_JPEG_VALUE, ieFile);
    }

    public void deleteImage(String id) {
        fileService.delete(id);
    }
}
