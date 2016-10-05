/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: F:\\RssReader\\src\\qzw\\android\\rssreader\\IRssReaderServiceCallback.aidl
 */
package qzw.android.rssreader;
/**
 * Example of a callback interface used by IRemoteService to send
 * synchronous notifications back to its clients.  Note that this is a
 * one-way interface so the server does not block waiting for the client.
 */
public interface IRssReaderServiceCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements qzw.android.rssreader.IRssReaderServiceCallback
{
private static final java.lang.String DESCRIPTOR = "qzw.android.rssreader.IRssReaderServiceCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an qzw.android.rssreader.IRssReaderServiceCallback interface,
 * generating a proxy if needed.
 */
public static qzw.android.rssreader.IRssReaderServiceCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof qzw.android.rssreader.IRssReaderServiceCallback))) {
return ((qzw.android.rssreader.IRssReaderServiceCallback)iin);
}
return new qzw.android.rssreader.IRssReaderServiceCallback.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_valueChanged:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
long _arg1;
_arg1 = data.readLong();
this.valueChanged(_arg0, _arg1);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements qzw.android.rssreader.IRssReaderServiceCallback
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
@Override public void valueChanged(int msg, long value) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(msg);
_data.writeLong(value);
mRemote.transact(Stub.TRANSACTION_valueChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_valueChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public void valueChanged(int msg, long value) throws android.os.RemoteException;
}
