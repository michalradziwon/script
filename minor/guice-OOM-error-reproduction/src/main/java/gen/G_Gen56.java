
  package gen;
  public class G_Gen56 {
  		@com.google.inject.Inject
  		public G_Gen56(G_Gen57 g_gen57){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen57 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  