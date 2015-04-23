
  package gen;
  public class G_Gen39 {
  		@com.google.inject.Inject
  		public G_Gen39(G_Gen40 g_gen40){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen40 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  