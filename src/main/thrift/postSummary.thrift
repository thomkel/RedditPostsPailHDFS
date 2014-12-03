namespace java edu.uchicago.mpcs53013.RedditReposts

struct PostInfo {
	1: required string reddit_id;
	2: required i16 image_id;
	3: optional string title;
	4: optional string subreddit;
	5: optional i16 number_of_comments;
	6: optional string username;
}
struct Time {
	1: required i16 unixtime;
	2: optional string rawtime;
	3: optional i16 localtime;	
}
struct Score {
	1: required i16 score;
}
struct DataUnit {
	1: required Score score;
	2: required Time time;
	3: required PostInfo post_info;
}
struct Pedigree {
	1: required i32 true_as_of_secs;
}
struct Data {
	1: required Pedigree pedigree;
	2: required DataUnit dataunit;
}