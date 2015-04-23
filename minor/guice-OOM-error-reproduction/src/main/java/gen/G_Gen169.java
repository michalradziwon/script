
  package gen;
  public class G_Gen169 {
  		@com.google.inject.Inject
  		public G_Gen169(G_Gen170 g_gen170){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen170 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  