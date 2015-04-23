
  package gen;
  public class G_Gen106 {
  		@com.google.inject.Inject
  		public G_Gen106(G_Gen107 g_gen107){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen107 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  