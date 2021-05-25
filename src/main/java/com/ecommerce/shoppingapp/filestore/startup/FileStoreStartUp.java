package com.ecommerce.shoppingapp.filestore.startup;

import com.ecommerce.shoppingapp.filestore.config.S3ConfigProperties;
import io.minio.BucketExistsArgs;
import io.minio.MakeBucketArgs;
import io.minio.MinioClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class FileStoreStartUp {

    private final MinioClient minioClient;
    private final S3ConfigProperties s3ConfigProperties;

    @EventListener(ApplicationStartedEvent.class)
    public void init() throws Exception {
        boolean bucketExist = minioClient.bucketExists(BucketExistsArgs.builder()
                .bucket(s3ConfigProperties.getBucket())
                .build());
        if (!bucketExist) {
            minioClient.makeBucket(MakeBucketArgs.builder().bucket(s3ConfigProperties.getBucket()).build());
        }
    }
}
