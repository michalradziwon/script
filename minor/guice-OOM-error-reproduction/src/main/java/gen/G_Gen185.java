
  package gen;
  public class G_Gen185 {
  		@com.google.inject.Inject
  		public G_Gen185(G_Gen186 g_gen186){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen186 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  