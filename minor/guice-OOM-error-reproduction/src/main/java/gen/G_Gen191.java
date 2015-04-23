
  package gen;
  public class G_Gen191 {
  		@com.google.inject.Inject
  		public G_Gen191(G_Gen192 g_gen192){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen192 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  