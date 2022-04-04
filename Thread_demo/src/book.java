import java.io.IOException;

public class book {
	enum STATUS{
		NEW, DAMAGED, RETURNED
	}
	public class Book {
		private String title;
		private float price;
		private STATUS status;
		
		public Book() {
			this.status = STATUS.NEW;
		}
		
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public float getPrice() {
			return price;
		}
		public void setPrice(float price) throws IOException{
			if(price<=0)
				throw new IOException("Price can't be 0.");
			this.price = price;
		}
		public STATUS getStatus() {
			return status;
		}
		public void setStatus(STATUS status) {
			this.status = status;
		}
	}

	public static void main(String[] args) {
	}

}
