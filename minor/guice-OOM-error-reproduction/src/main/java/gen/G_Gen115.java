
  package gen;
  public class G_Gen115 {
  		@com.google.inject.Inject
  		public G_Gen115(G_Gen116 g_gen116){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen116 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  