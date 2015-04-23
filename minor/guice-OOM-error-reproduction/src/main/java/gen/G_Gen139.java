
  package gen;
  public class G_Gen139 {
  		@com.google.inject.Inject
  		public G_Gen139(G_Gen140 g_gen140){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen140 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  