
  package gen;
  public class G_Gen135 {
  		@com.google.inject.Inject
  		public G_Gen135(G_Gen136 g_gen136){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen136 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  