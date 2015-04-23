
  package gen;
  public class G_Gen64 {
  		@com.google.inject.Inject
  		public G_Gen64(G_Gen65 g_gen65){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen65 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  