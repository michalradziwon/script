
  package gen;
  public class G_Gen123 {
  		@com.google.inject.Inject
  		public G_Gen123(G_Gen124 g_gen124){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen124 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  