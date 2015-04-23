
  package gen;
  public class G_Gen198 {
  		@com.google.inject.Inject
  		public G_Gen198(G_Gen199 g_gen199){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen199 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  