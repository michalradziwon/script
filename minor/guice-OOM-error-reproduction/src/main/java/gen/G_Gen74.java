
  package gen;
  public class G_Gen74 {
  		@com.google.inject.Inject
  		public G_Gen74(G_Gen75 g_gen75){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen75 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  