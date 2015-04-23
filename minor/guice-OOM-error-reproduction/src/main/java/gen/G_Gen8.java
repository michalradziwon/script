
  package gen;
  public class G_Gen8 {
  		@com.google.inject.Inject
  		public G_Gen8(G_Gen9 g_gen9){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen9 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  