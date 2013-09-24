import java.util.*;

public class PolyCube {
	
	Scanner in = new Scanner(System.in);
	ArrayList<Cube> cubes;
	
	class Cube {
		public int x,y,z;
		public Cube(int mx, int my, int mz) {
			x = mx;
			y = my;
			z = mz;
		}
		
		private int temp(int x1, int x2) {
			int diff = Math.abs(x1 - x2);
			if(diff > 1) return -1;
			return diff;
		}
		
		public boolean sharesFace(Cube c) {
			int t1 = temp(x,c.x);
			if(t1 < 0) return false;
			int t2 = temp(y,c.y);
			if(t2 < 0) return false;
			int t3 = temp(z,c.z);
			if(t3 < 0) return false;
			int ans = t1+t2+t3;
			if(ans >= 2) return false;
			return true;
		}
		
		public boolean equals(Cube c) {
			if(x == c.x && y == c.y && z == c.z) return true;
			return false;
		}
		
		public String toString() {
			return "(" + x + "," + y + "," + z + ")";
		}
	}
	
	public int numShared(Cube c) {
		int ans = 0;
		for(Cube c2 : cubes) {
			if(c.sharesFace(c2)) {
				ans++;
			}
		}
		return ans;
	}
	
	public int changeInArea(int faces_shared) {
		switch(faces_shared) {
		case 0: return 6;
		case 1: return 4;
		case 2: return 2;
		case 3: return 0;
		case 4: return -2;
		case 5: return -4;
		default: return -6;
		}
	}
	
	public static void main(String[] args) {
		PolyCube p = new PolyCube();
		p.solve();
	}
	
	public void solve() {
				
		cubes = new ArrayList<Cube>();
		int num_cases = Integer.parseInt(in.nextLine());
		
		for(int case_num = 1; case_num <= num_cases; case_num++) {
			
			int num_cubes = Integer.parseInt(in.nextLine());
			String[] cubes_str = new String[num_cubes];
			int c_index = 0;
			for(int i=0; i<num_cubes; i += 8) {
				String[] line = in.nextLine().split(" ");
				for(String s : line) {
					cubes_str[c_index++] = s;
				}
			}
			cubes.clear();
			int area = 0;
			for(int cube_num = 0; cube_num < num_cubes; cube_num++) {
				String[] p = cubes_str[cube_num].split(",");
				Cube c = new Cube(Integer.parseInt(p[0]),Integer.parseInt(p[1]),Integer.parseInt(p[2]));
				if(cube_num == 0) area += 6;
				else {
					for(Cube c2 : cubes) {
						if(c.equals(c2)) {
							area = -cube_num;
							break;
						}
					}
					int num_common = numShared(c);
					if(num_common == 0) {
						area = -cube_num;
						break;
					}
					area += changeInArea(num_common);
				}
				cubes.add(c);
			}
			
			if(area < 0) System.out.println(case_num + " NO " + (-area + 1));
			else System.out.println(case_num + " " + area);
		}
		
	}
	
}