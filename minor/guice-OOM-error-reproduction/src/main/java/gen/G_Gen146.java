
  package gen;
  public class G_Gen146 {
  		@com.google.inject.Inject
  		public G_Gen146(G_Gen147 g_gen147){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen147 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  