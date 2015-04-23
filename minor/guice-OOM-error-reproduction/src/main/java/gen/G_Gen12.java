
  package gen;
  public class G_Gen12 {
  		@com.google.inject.Inject
  		public G_Gen12(G_Gen13 g_gen13){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen13 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  