
  package gen;
  public class G_Gen109 {
  		@com.google.inject.Inject
  		public G_Gen109(G_Gen110 g_gen110){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen110 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  