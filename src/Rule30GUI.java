import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Rule30GUI extends JFrame {

	private JPanel[][] panels;
	private static int[][] result;
	
	MouseListener listen = new MouseListener() {

		@Override
		public void mouseClicked(MouseEvent e) {
			JPanel panel = (JPanel)e.getSource();
			panel.setBackground(Color.BLUE);
			
			
			for (int r = 0; r < panels.length; r++) {
				for (int c = 0; c < panels[r].length; c++) {
					if ((JPanel)e.getSource() == panels[r][c]) {
						//System.out.println("FOUND IT");
						System.out.println(r);
						System.out.println(c);
						//Need to swap r and c here. 
						
						if (result[r][c] == 0)
							result[r][c] = 1;
						else
							result[r][c] = 0;
							

						for (int row = 0; row < result.length; row = row + 1) {
							for (int col = 0; col < result[row].length; col = col + 1) {
								System.out.print(result[row][col]);
							}
							System.out.println();
						}
						result = Rule30.genRule30(result, r);
						update();
						
						return;
						
					}
				}
			}
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	
		
	};
	
	public Rule30GUI(int[] arr, int n) {
		
		panels = new JPanel[n][arr.length];
		
		
		this.setLayout(new GridLayout(n,arr.length,1,1));
		
		for (int r = 0; r <n; r++) {
			for (int c = 0; c < arr.length; c++) {
				//Construct Panel
				panels[r][c] = new JPanel();
				panels[r][c].setBackground(new Color(255,255,255));
				panels[r][c].addMouseListener(listen);
				
				this.add(panels[r][c]);
			}
		}
		this.pack();
		
		//Initialize pattern
		result = Rule30.genRule30(arr, n);
		

		for (int r = 0; r < n; r++) {
			for (int c = 0; c < arr.length; c++) {
				
				if (result[r][c] == 1) {
					panels[r][c].setBackground(Color.BLACK);
				}
			}
		}
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
		
	}
			
	public void update() {
		
		for (int r = 0; r < result.length; r++) {
			for (int c = 0; c < result[r].length; c++) {
				
				if (result[r][c] == 1) {
					panels[r][c].setBackground(Color.BLACK);
				}
				else {
					panels[r][c].setBackground(Color.WHITE);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] seed = new int[200];
		//seed[3*seed.length/4-1] = 1;
		//seed[seed.length/4-1] = 1;
		seed[seed.length/2-1] = 1;
		new Rule30GUI(seed,seed.length/2-1);
		
		
	}

}
