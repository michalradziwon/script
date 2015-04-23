
  package gen;
  public class G_Gen124 {
  		@com.google.inject.Inject
  		public G_Gen124(G_Gen125 g_gen125){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen125 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  