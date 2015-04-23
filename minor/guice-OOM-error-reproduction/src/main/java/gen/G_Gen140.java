
  package gen;
  public class G_Gen140 {
  		@com.google.inject.Inject
  		public G_Gen140(G_Gen141 g_gen141){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen141 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  