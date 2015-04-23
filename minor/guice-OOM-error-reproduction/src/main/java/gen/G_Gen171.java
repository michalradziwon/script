
  package gen;
  public class G_Gen171 {
  		@com.google.inject.Inject
  		public G_Gen171(G_Gen172 g_gen172){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen172 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  