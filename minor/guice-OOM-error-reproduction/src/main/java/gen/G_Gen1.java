
  package gen;
  public class G_Gen1 {
  		@com.google.inject.Inject
  		public G_Gen1(G_Gen2 g_gen2){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen2 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  