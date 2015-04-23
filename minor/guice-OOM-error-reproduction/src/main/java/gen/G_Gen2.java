
  package gen;
  public class G_Gen2 {
  		@com.google.inject.Inject
  		public G_Gen2(G_Gen3 g_gen3){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen3 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  