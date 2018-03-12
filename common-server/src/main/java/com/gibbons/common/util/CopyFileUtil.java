package com.gibbons.common.util;

import ch.qos.logback.core.util.FileUtil;
import org.apache.log4j.Logger;
import org.springframework.util.Assert;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public abstract class CopyFileUtil {

    private static final Logger logger = Logger.getLogger(FileUtil.class);

    public static final int BUFFER_SIZE = 4096;

    /**
     * Copy the contents of the given InputStream to the given OutputStream.
     * Closes both streams when done.
     *
     * @param in  the stream to copy from
     * @param out the stream to copy to
     * @return the number of bytes copied
     * @throws IOException in case of I/O errors
     */
    public static int copy(InputStream in, OutputStream out) throws IOException {
        Assert.notNull(in, "No InputStream specified");
        Assert.notNull(out, "No OutputStream specified");
        try {
            int byteCount = 0;
            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead = -1;
            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
                byteCount += bytesRead;
            }
            out.flush();
            return byteCount;
        } finally {
            try {
                in.close();
            } catch (IOException ex) {
                logger.warn("Could not close InputStream", ex);
            }
            try {
                out.close();
            } catch (IOException ex) {
                logger.warn("Could not close OutputStream", ex);
            }
        }
    }
}