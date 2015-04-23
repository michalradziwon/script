
  package gen;
  public class G_Gen68 {
  		@com.google.inject.Inject
  		public G_Gen68(G_Gen69 g_gen69){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen69 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  