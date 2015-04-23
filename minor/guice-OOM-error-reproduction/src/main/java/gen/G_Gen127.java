
  package gen;
  public class G_Gen127 {
  		@com.google.inject.Inject
  		public G_Gen127(G_Gen128 g_gen128){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen128 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  