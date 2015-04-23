
  package gen;
  public class G_Gen155 {
  		@com.google.inject.Inject
  		public G_Gen155(G_Gen156 g_gen156){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen156 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  