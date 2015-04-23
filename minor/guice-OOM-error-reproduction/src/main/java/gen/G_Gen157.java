
  package gen;
  public class G_Gen157 {
  		@com.google.inject.Inject
  		public G_Gen157(G_Gen158 g_gen158){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen158 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  