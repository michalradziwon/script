
  package gen;
  public class G_Gen17 {
  		@com.google.inject.Inject
  		public G_Gen17(G_Gen18 g_gen18){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen18 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  