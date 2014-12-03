package edu.uchicago.mpcs53013.RedditPosts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Collections ;
import java.util.Map;
import java.lang.RuntimeException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import com.backtype.hadoop.pail.Pail;
import com.backtype.hadoop.pail.Pail.TypedRecordOutputStream;
import com.backtype.hadoop.pail.PailStructure;

public class PostPailPartitionedSerialize {
	public static class PostData {
		
    	int imageId;
    	int unixTime;
    	String rawTime;
    	String title;
    	int totalVotes;
    	String redditId;
    	int upvotes;
    	String subreddit;
    	int downvotes;
    	int localtime;
    	int score;
    	int comments;
    	String username;

		public PostData(int imageId,int unixTime,String rawTime,String title,int totalVotes,
				String redditId,int upvotes,String subreddit,int downvotes,int localtime,int score,int comments,String username) {
	    	this.imageId = imageId;
	    	this.unixTime = unixTime;
	    	this.rawTime = rawTime;
	    	this.title = title;
	    	this.totalVotes = totalVotes;
	    	this.redditId = redditId;
	    	this.upvotes = upvotes;
	    	this.subreddit = subreddit;
	    	this.downvotes = downvotes;
	    	this.localtime = localtime;
	    	this.score = score;
	    	this.comments = comments;
	    	this.username = username;
		}
	} 
	public static class PostDataPailStructure implements PailStructure<PostData>{
		public Class<PostData> getType() {
			return PostData.class;
		}
		public byte[] serialize(PostData postData) {
			ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
			DataOutputStream dataOut = new DataOutputStream(byteOut);
			//byte[] userBytes = login.userName.getBytes();
			byte[] rawTimeBytes = postData.rawTime.getBytes();
			byte[] titleBytes = postData.title.getBytes();
			byte[] redditIdBytes = postData.redditId.getBytes();
			byte[] subredditBytes = postData.subreddit.getBytes();
			byte[] usernameBytes = postData.username.getBytes();

			try {
//					dataOut.writeInt(userBytes.length);
//					dataOut.write(userBytes);
//					dataOut.writeLong(login.loginUnixTime);
				dataOut.writeInt(postData.imageId);
				dataOut.writeInt(postData.unixTime);
				
				dataOut.writeInt(rawTimeBytes.length);
				dataOut.write(rawTimeBytes);
				
				dataOut.writeInt(titleBytes.length);
				dataOut.write(titleBytes);
				
				dataOut.writeInt(postData.totalVotes);
				
				dataOut.writeInt(redditIdBytes.length);
				dataOut.write(redditIdBytes);
				
				dataOut.writeInt(postData.upvotes);
				
				dataOut.writeInt(subredditBytes.length);
				dataOut.write(subredditBytes);
				
				dataOut.writeInt(postData.downvotes);
				dataOut.writeInt(postData.localtime);
				dataOut.writeInt(postData.score);
				dataOut.writeInt(postData.comments);
				
				dataOut.writeInt(usernameBytes.length);
				dataOut.write(usernameBytes);
				
				dataOut.close();
			} catch(IOException e) {
				throw new RuntimeException(e);
			}
			return byteOut.toByteArray();
		}

		public PostData deserialize(byte[] serialized) {
			DataInputStream dataIn =
					new DataInputStream(new ByteArrayInputStream(serialized));
			try {
		    	int imageId = dataIn.readInt();
		    	
		    	int unixTime = dataIn.readInt();
		    	
				byte[] rawTimeBytes = new byte[dataIn.readInt()];
				dataIn.read(rawTimeBytes);
		    	String rawTime = new String(rawTimeBytes);
				
				byte[] titleBytes = new byte[dataIn.readInt()];
				dataIn.read(titleBytes);
		    	String title = new String(titleBytes);
				
		    	int totalVotes = dataIn.readInt();
		    	
				byte[] idBytes = new byte[dataIn.readInt()];
				dataIn.read(idBytes);
		    	String redditId = new String(idBytes);
				
		    	int upvotes = dataIn.readInt();
		    	
				byte[] subredditBytes = new byte[dataIn.readInt()];
				dataIn.read(subredditBytes);
		    	String subreddit = new String(subredditBytes);
				
		    	int downvotes = dataIn.readInt();
		    	int localtime = dataIn.readInt();
		    	int score = dataIn.readInt();
		    	int comments = dataIn.readInt();
		    	
				byte[] usernameBytes = new byte[dataIn.readInt()];
				dataIn.read(usernameBytes);
		    	String username = new String(usernameBytes);
		    	
				return new PostData(imageId, unixTime, rawTime, title, totalVotes, new String(idBytes), upvotes,
						new String(subredditBytes), downvotes, localtime, score, comments, new String(usernameBytes));
				
//					byte[] userBytes = new byte[dataIn.readInt()];
//					dataIn.read(userBytes);
//					return new WeatherData(new String(userBytes), dataIn.readLong());
			} catch(IOException e) {
				throw new RuntimeException(e);
			}
		}
		public List<String> getTarget(PostData object) {
			return Collections.EMPTY_LIST;
		}
		public boolean isValidTarget(String... dirs) {
			return true;
		}
	}
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void writePostData() throws IOException {
		Configuration conf = new Configuration();
		conf.addResource(new Path(hadoopPrefix + "/conf/core-site.xml"));
		FileSystem fs = FileSystem.get(conf);
		Pail<PostData> postDataPail = Pail.create(fs,
				"/tmp/posts",
				new PostDataPailStructure());
		
		// found code https://sites.google.com/site/hadoopandhive/home/how-to-read-all-files-in-a-directory-in-hdfs-using-hadoop-filesystem-api
		FileStatus[] status = fs.listStatus(new Path("/tmp/postData"));
//			System.out.print("test: ");
//			System.out.print(status);
        for (int i=0;i<status.length;i++){
        		TypedRecordOutputStream out = postDataPail.openWrite();
        	
                BufferedReader br=new BufferedReader(new InputStreamReader(fs.open(status[i].getPath())));
                String line;
                line=br.readLine(); // skip first line of file-- header data
                line=br.readLine();
                while (line != null){
//	                        System.out.println(line);
                	// csv file. needs to split on commas
                	String[] stringArray = line.split(","); 
                	int length = stringArray.length;
                	
                	int imageId = Integer.parseInt(stringArray[0]);
                	int unixTime = Integer.parseInt(stringArray[1]);
                	String rawTime = stringArray[2];
                	String title = stringArray[3];
                	int total_votes = Integer.parseInt(stringArray[4]);
                	String redditId = stringArray[5];
                	int upvotes = Integer.parseInt(stringArray[6]);
                	String subreddit = stringArray[7];
                	int downvotes = Integer.parseInt(stringArray[8]);
                	int localtime = Integer.parseInt(stringArray[9]);
                	int score = Integer.parseInt(stringArray[10]);
                	int comments = Integer.parseInt(stringArray[11]);
                	String username;
                	
                	if (length == 13){ 
                		username = stringArray[12];
                	} else {
                		username = "";
                	}
                	
                	System.out.println("redditId: " + redditId + " added");

                	out.writeObject(new PostData(imageId, unixTime, rawTime, title, total_votes,
                			redditId, upvotes, subreddit, downvotes, localtime, score, comments, username));
                        
                	line=br.readLine();
                }
        		out.close();
        }
		
		
//			TypedRecordOutputStream out = weatherDataPail.openWrite();
//			out.writeObject(new Login("alex", 1352679231));
//			out.writeObject(new Login("bob", 1352674216));
//			out.close();
	}
	public static void readPostData() throws IOException {
		Configuration conf = new Configuration();
		conf.addResource(new Path(hadoopPrefix + "/conf/core-site.xml"));
		FileSystem fs = FileSystem.get(conf);
		Pail<PostData> postDataPail = new Pail<PostData>(fs, "/tmp/posts");
		for(PostData l : postDataPail) {
			System.out.println(l.imageId + ", " + l.unixTime + ", " + l.rawTime + ", " + l.title + ", " + l.totalVotes + ", " + l.redditId + ", " + l.upvotes
					+ ", " + l.subreddit + ", " + l.downvotes + ", " + l.localtime + ", " + l.score + ", " + l.comments + ", " + l.username );
		}
	}
	static String hadoopPrefix = System.getenv("HADOOP_PREFIX");
	public static void main(String[] args) {
		if(hadoopPrefix == null) {
			throw new RuntimeException("Please set HADOOP_PREFIX environment variable");
		}
		try {
			if(args[0].equals("s")) {
				writePostData();
			} else {
				readPostData();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
}
