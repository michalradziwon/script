
  package gen;
  public class G_Gen133 {
  		@com.google.inject.Inject
  		public G_Gen133(G_Gen134 g_gen134){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen134 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  