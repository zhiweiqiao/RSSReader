/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: F:\\RssReader\\src\\qzw\\android\\rssreader\\IRssReaderService.aidl
 */
package qzw.android.rssreader;
public interface IRssReaderService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements qzw.android.rssreader.IRssReaderService
{
private static final java.lang.String DESCRIPTOR = "qzw.android.rssreader.IRssReaderService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an qzw.android.rssreader.IRssReaderService interface,
 * generating a proxy if needed.
 */
public static qzw.android.rssreader.IRssReaderService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof qzw.android.rssreader.IRssReaderService))) {
return ((qzw.android.rssreader.IRssReaderService)iin);
}
return new qzw.android.rssreader.IRssReaderService.Stub.Proxy(obj);
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
case TRANSACTION_registerCallback:
{
data.enforceInterface(DESCRIPTOR);
qzw.android.rssreader.IRssReaderServiceCallback _arg0;
_arg0 = qzw.android.rssreader.IRssReaderServiceCallback.Stub.asInterface(data.readStrongBinder());
this.registerCallback(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_unregisterCallback:
{
data.enforceInterface(DESCRIPTOR);
qzw.android.rssreader.IRssReaderServiceCallback _arg0;
_arg0 = qzw.android.rssreader.IRssReaderServiceCallback.Stub.asInterface(data.readStrongBinder());
this.unregisterCallback(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_insertRss:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
this.insertRss(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_downloadRss:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
java.lang.String _arg1;
_arg1 = data.readString();
this.downloadRss(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_downloadRssAll:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.downloadRssAll(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_deleteRss:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
this.deleteRss(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_deleteRssAll:
{
data.enforceInterface(DESCRIPTOR);
this.deleteRssAll();
reply.writeNoException();
return true;
}
case TRANSACTION_deleteRssData:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
long _arg1;
_arg1 = data.readLong();
this.deleteRssData(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_deleteRssDataAll:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
this.deleteRssDataAll(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_markReadedRssData:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
long _arg1;
_arg1 = data.readLong();
this.markReadedRssData(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_markNotReadedRssData:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
long _arg1;
_arg1 = data.readLong();
this.markNotReadedRssData(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_markReadedRssDataAll:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
this.markReadedRssDataAll(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_markNotReadedRssDataAll:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
this.markNotReadedRssDataAll(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_setAutoRefreshForbit:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
int _arg1;
_arg1 = data.readInt();
boolean _arg2;
_arg2 = (0!=data.readInt());
this.setAutoRefreshForbit(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_setAutoRefresh:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
int _arg1;
_arg1 = data.readInt();
boolean _arg2;
_arg2 = (0!=data.readInt());
this.setAutoRefresh(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements qzw.android.rssreader.IRssReaderService
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
@Override public void registerCallback(qzw.android.rssreader.IRssReaderServiceCallback cb) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((cb!=null))?(cb.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerCallback, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void unregisterCallback(qzw.android.rssreader.IRssReaderServiceCallback cb) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((cb!=null))?(cb.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_unregisterCallback, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void insertRss(java.lang.String link, java.lang.String title, java.lang.String pubDate) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(link);
_data.writeString(title);
_data.writeString(pubDate);
mRemote.transact(Stub.TRANSACTION_insertRss, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void downloadRss(long rssId, java.lang.String link) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(rssId);
_data.writeString(link);
mRemote.transact(Stub.TRANSACTION_downloadRss, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void downloadRssAll(int interval) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(interval);
mRemote.transact(Stub.TRANSACTION_downloadRssAll, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void deleteRss(long rssId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(rssId);
mRemote.transact(Stub.TRANSACTION_deleteRss, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void deleteRssAll() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_deleteRssAll, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void deleteRssData(long rssId, long dataId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(rssId);
_data.writeLong(dataId);
mRemote.transact(Stub.TRANSACTION_deleteRssData, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void deleteRssDataAll(long rssId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(rssId);
mRemote.transact(Stub.TRANSACTION_deleteRssDataAll, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void markReadedRssData(long rssId, long dataId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(rssId);
_data.writeLong(dataId);
mRemote.transact(Stub.TRANSACTION_markReadedRssData, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void markNotReadedRssData(long rssId, long dataId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(rssId);
_data.writeLong(dataId);
mRemote.transact(Stub.TRANSACTION_markNotReadedRssData, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void markReadedRssDataAll(long rssId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(rssId);
mRemote.transact(Stub.TRANSACTION_markReadedRssDataAll, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void markNotReadedRssDataAll(long rssId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(rssId);
mRemote.transact(Stub.TRANSACTION_markNotReadedRssDataAll, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setAutoRefreshForbit(boolean isAutoRefresh, int interval, boolean isNotification) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((isAutoRefresh)?(1):(0)));
_data.writeInt(interval);
_data.writeInt(((isNotification)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setAutoRefreshForbit, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setAutoRefresh(boolean isAutoRefresh, int interval, boolean isNotification) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((isAutoRefresh)?(1):(0)));
_data.writeInt(interval);
_data.writeInt(((isNotification)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setAutoRefresh, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_registerCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_unregisterCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_insertRss = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_downloadRss = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_downloadRssAll = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_deleteRss = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_deleteRssAll = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_deleteRssData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_deleteRssDataAll = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_markReadedRssData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_markNotReadedRssData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_markReadedRssDataAll = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_markNotReadedRssDataAll = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_setAutoRefreshForbit = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_setAutoRefresh = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
}
public void registerCallback(qzw.android.rssreader.IRssReaderServiceCallback cb) throws android.os.RemoteException;
public void unregisterCallback(qzw.android.rssreader.IRssReaderServiceCallback cb) throws android.os.RemoteException;
public void insertRss(java.lang.String link, java.lang.String title, java.lang.String pubDate) throws android.os.RemoteException;
public void downloadRss(long rssId, java.lang.String link) throws android.os.RemoteException;
public void downloadRssAll(int interval) throws android.os.RemoteException;
public void deleteRss(long rssId) throws android.os.RemoteException;
public void deleteRssAll() throws android.os.RemoteException;
public void deleteRssData(long rssId, long dataId) throws android.os.RemoteException;
public void deleteRssDataAll(long rssId) throws android.os.RemoteException;
public void markReadedRssData(long rssId, long dataId) throws android.os.RemoteException;
public void markNotReadedRssData(long rssId, long dataId) throws android.os.RemoteException;
public void markReadedRssDataAll(long rssId) throws android.os.RemoteException;
public void markNotReadedRssDataAll(long rssId) throws android.os.RemoteException;
public void setAutoRefreshForbit(boolean isAutoRefresh, int interval, boolean isNotification) throws android.os.RemoteException;
public void setAutoRefresh(boolean isAutoRefresh, int interval, boolean isNotification) throws android.os.RemoteException;
}
