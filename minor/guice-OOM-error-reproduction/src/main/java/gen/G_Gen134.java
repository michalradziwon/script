
  package gen;
  public class G_Gen134 {
  		@com.google.inject.Inject
  		public G_Gen134(G_Gen135 g_gen135){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen135 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  