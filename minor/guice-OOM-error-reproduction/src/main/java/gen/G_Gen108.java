
  package gen;
  public class G_Gen108 {
  		@com.google.inject.Inject
  		public G_Gen108(G_Gen109 g_gen109){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen109 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  