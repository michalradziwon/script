
  package gen;
  public class G_Gen141 {
  		@com.google.inject.Inject
  		public G_Gen141(G_Gen142 g_gen142){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen142 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  