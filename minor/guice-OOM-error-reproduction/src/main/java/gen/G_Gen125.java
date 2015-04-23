
  package gen;
  public class G_Gen125 {
  		@com.google.inject.Inject
  		public G_Gen125(G_Gen126 g_gen126){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen126 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  