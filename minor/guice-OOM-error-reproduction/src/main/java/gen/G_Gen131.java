
  package gen;
  public class G_Gen131 {
  		@com.google.inject.Inject
  		public G_Gen131(G_Gen132 g_gen132){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen132 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  