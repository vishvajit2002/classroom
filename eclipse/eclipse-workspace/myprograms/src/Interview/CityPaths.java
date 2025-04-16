package Interview;

import java.util.Scanner;

public class CityPaths
{
	static String[] cities;
	static int[][] distances;
	static boolean[] visited;
	static int cityCount;

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		cityCount = scanner.nextInt();
		scanner.nextLine();

		cities = new String[cityCount];
		distances = new int[cityCount][cityCount];

		for (int i = 0; i < cityCount; i++)
		{
			cities[i] = scanner.nextLine().trim();
		}

		int numRoads = scanner.nextInt();
		scanner.nextLine();

		for (int i = 0; i < numRoads; i++)
		{
			String[] roadInfo = scanner.nextLine().trim().split(" ");
			int city1 = getCityIndex(roadInfo[0]);
			int city2 = getCityIndex(roadInfo[1]);
			int distance = Integer.parseInt(roadInfo[2]);
			distances[city1][city2] = distance;
			distances[city2][city1] = distance;
		}

		String[] query = scanner.nextLine().trim().split(" ");
		visited = new boolean[cityCount];
		findPaths(getCityIndex(query[0]), getCityIndex(query[1]), cities[0] + "", 0);

		scanner.close();
	}
	
	static int getCityIndex(String city)
	{
		for (int i = 0; i < cityCount; i++)
		{
			if (cities[i].equals(city))
			{
				return i;
			}
		}
		return -1;
	}

	static void findPaths(int start, int end, String path, int totalDistance)
	{
		if (start == end)
		{
			System.out.println(path + " " + totalDistance);
			return;
		}

		visited[start] = true;

		for (int i = 0; i < cityCount; i++)
		{
			if (distances[start][i] > 0 && !visited[i])
			{
				findPaths(i, end, path + " " + cities[i], totalDistance + distances[start][i]);
			}
		}

		visited[start] = false;
	}

	
}
