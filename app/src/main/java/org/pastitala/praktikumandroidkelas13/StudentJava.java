package org.pastitala.praktikumandroidkelas13;

import android.os.Parcel;
import android.os.Parcelable;

public class StudentJava implements Parcelable {
    private String npm, nama, phoneNumber;
    private double ipk;

    public StudentJava(String npm, String nama, String phoneNumber, double ipk) {
        this.npm = npm;
        this.nama = nama;
        this.phoneNumber = phoneNumber;
        this.ipk = ipk;
    }

    protected StudentJava(Parcel in) {
        npm = in.readString();
        nama = in.readString();
        phoneNumber = in.readString();
        ipk = in.readDouble();
    }

    public static final Creator<StudentJava> CREATOR = new Creator<StudentJava>() {
        @Override
        public StudentJava createFromParcel(Parcel in) {
            return new StudentJava(in);
        }

        @Override
        public StudentJava[] newArray(int size) {
            return new StudentJava[size];
        }
    };

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(npm);
        parcel.writeString(nama);
        parcel.writeString(phoneNumber);
        parcel.writeDouble(ipk);
    }
}
