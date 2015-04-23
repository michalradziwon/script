
  package gen;
  public class G_Gen148 {
  		@com.google.inject.Inject
  		public G_Gen148(G_Gen149 g_gen149){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen149 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  