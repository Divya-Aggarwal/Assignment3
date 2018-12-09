# VideoView

## Introduction

VideoView class is a visual component which provides many display options by loading images from various sources and by taking care of computing images measurement from the video. In other words, whenever we want to play a video file in any Android Activity, the very first thing that we consider is ‘Android VideoView’ class. When we add this component to the layout of an activity, a surface to play a video is provided. However, this component does not save the current play state and position. To do that, two major components used are onSaveInstanceState(Bundle) and onRestoreInstanceState(Bundle). 


## History

VideoView is only available in Android 4.0 and later. It is not supported before Android 3.0 version. Following is the list of video formats supported by Android:

#### H.263 (optional in Android 7.0+ and supports MPEG-4 and 3GPP file types.)

#### H.264 AVC (Android 3.0+ and Android 6.0+ encoders are supported; the decoder is requires but encoder on the same side is preferred.)

#### H.265 HEVC (Android 5.0+ decoder which for mobile devices has main profile Level 3 and on the other hand, for Android TV has main profile Level 4.1. This supports MPEG-4 file types.)

#### MPEG-4 SP (This supports 3GPP file types only.)

#### VP8 (Encoder is Android 4.3+ whereas Decoder is Android 2.3.3+ and is able to be transmitted or received only in Android 4.0 and above. This supports WebM and Matroska file types.)

#### VP9 (Decoder Android 4.4+, it supports WebM and Matroska file types only.)


## Major methods and attributes

### setVideoPath(String path) 
#### Path(in the form of string) of the video media (either in MPEG-4 OR 3GPP file types) to be played is specified in this method. This path can be used for any videos irrespective of its location; i.e., this path can be the URL of either a local video file or a remote video file.

### setVideoUri(Uri uri) 
#### In this method, Uri object is taken as an argument(not a string). Moreover, this method has the same functionality as setVideoPath() method.

### Start() 
#### This is the utmost important method. This method begins video playback.

### stopPlayback() 
#### To stop the video playback, this method is used.

### Pause() 
#### Other than starting and stopping the video playback, we can also pause it by using this method.

### isPlaying() 
#### To check whether a video is in play motion or not, this method is used. Result is returned in a Boolean format corresponding to the video’s motion.

### setOnPreparedListener(MediaPlayer.OnPreparedListener) 
#### This method is used when the video is ready to play. Basically, this method allows a callback method to be called when video is in ready state.

### setOnErrorListener(MediaPlayer.OnErrorListener) 
#### This method is used when the video is stopped due to some error. Basically, this method allows a callback method to be called when video is in error state.

### setOnCompletionListener(MediaPlayer.OnCompletionListener) 
#### This method is used when the video reaches to its end state. Basically, this method allows a callback method to be called when video is in end state.

### getDuration() 
#### This method is used to return the duration of the video. Return value of this method is -1 most of the times except for one condition, i.e., when called from inside the OnPreparedListener() method (which is also a callback method).

### getCurrentPosition() 
#### Return value of this method is an integer value. This value indicates the current location (position) of video.

### setMediaController(MediaController) 
#### This method is used to allow video’s palyback control buttons to be visible to the user. This method basically labels a MediaController instance to bring its functionality in a working position. Without using MediaController instance, the user will not be having any power to control the playback, which means that video once started will be played without any interference till the end. But by using MediaController instance, user will obtain set of controls over the playback.


## References

https://www.youtube.com/watch?v=49zVrWfLNUY

https://www.youtube.com/watch?v=SrPHLj_q_OQ

https://www.youtube.com/watch?v=bHrclc1zUmo

https://google-developer-training.gitbooks.io/android-developer-advanced-course-practicals/content/unit-5-advanced-graphics-and-views/lesson-13-media/13-1-p-playing-video-with-videoview/13-1-p-playing-video-with-videoview.html#codingchallenge

https://developer.android.com/reference/android/widget/VideoView

https://google-developer-training.gitbooks.io/android-developer-advanced-course-practicals/content/unit-5-advanced-graphics-and-views/lesson-13-media/13-1-p-playing-video-with-videoview/13-1-p-playing-video-with-videoview.html#codingchallenge

