
  package gen;
  public class G_Gen46 {
  		@com.google.inject.Inject
  		public G_Gen46(G_Gen47 g_gen47){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen47 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  