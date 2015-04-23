
  package gen;
  public class G_Gen40 {
  		@com.google.inject.Inject
  		public G_Gen40(G_Gen41 g_gen41){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen41 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  