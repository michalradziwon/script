
  package gen;
  public class G_Gen47 {
  		@com.google.inject.Inject
  		public G_Gen47(G_Gen48 g_gen48){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen48 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  