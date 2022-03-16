package com.company.file;

public class FileInfo {
    private String fileName;
    private String  FileSize;
    private FileType fileType;

    public FileInfo() {}

    public FileInfo(String fileName, String  fileSize, FileType fileType) {
        this.fileName = fileName;
        FileSize = fileSize;
        this.fileType = fileType;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String  getFileSize() {
        return FileSize;
    }

    public void setFileSize(String  fileSize) {
        FileSize = fileSize;
    }

    public FileType getFileType() {
        return fileType;
    }

    public void setFileType(FileType fileType) {
        this.fileType = fileType;
    }

    @Override
    public String toString() {
        return "FileInfo{" +
                "fileName='" + fileName + '\'' +
                ", FileSize=" + FileSize +
                ", fileType=" + fileType +
                '}';
    }
}
