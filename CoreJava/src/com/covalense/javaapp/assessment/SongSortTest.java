package com.covalense.javaapp.assessment;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import lombok.extern.java.Log;
@Log
/*
 * 23)	WAP to sort the songs based on the date and time.
 */
public class SongSortTest {

	public static void main(String[] args) {
		
		final Song s1 = new Song();
		s1.setSongId(1);
		s1.setSongName("abc");
		s1.setDate(new Date(System.currentTimeMillis()-50000000));
		final Song s2 = new Song();
		s2.setSongId(1);
		s2.setSongName("abc");
		s2.setDate(new Date(System.currentTimeMillis()-10000000));
		final Song s3 = new Song();
		s3.setSongId(1);
		s3.setSongName("abc");
		s3.setDate(new Date(System.currentTimeMillis()-1000000000));
		final Song s4 = new Song();
		s4.setSongId(1);
		s4.setSongName("abc");
		s4.setDate(new Date(System.currentTimeMillis()-2000000));
		
		final List<Song> songList = new ArrayList<Song>();
		songList.add(s1);
		songList.add(s2);
		songList.add(s3);
		songList.add(s4);
		
		log.info("before sorting by date");
		log.info(songList.toString());
		SortSongByDate(songList);
		
		log.info( "after sorting by date");
		log.info(""+ songList.toString());
	}
	
	/**
	 * 
	 * sort song based on date.
	 * 
	 * @param songList the list
	 * @return list, the list
	 */
	private static List<Song> SortSongByDate(final List<Song> songList){
		
		songList.sort(new SongByDate());
		
		return songList;
	}
}
