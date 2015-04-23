
  package gen;
  public class G_Gen136 {
  		@com.google.inject.Inject
  		public G_Gen136(G_Gen137 g_gen137){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen137 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  