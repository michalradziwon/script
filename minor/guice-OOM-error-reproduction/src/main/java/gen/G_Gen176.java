
  package gen;
  public class G_Gen176 {
  		@com.google.inject.Inject
  		public G_Gen176(G_Gen177 g_gen177){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen177 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  