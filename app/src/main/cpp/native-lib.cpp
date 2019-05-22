#include <jni.h>
#include <string>
#include "com_github_ulez_vad_2_PcmSplite.h"

extern "C" JNIEXPORT jstring JNICALL
Java_com_github_ulez_vad_12_MainActivity_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}
