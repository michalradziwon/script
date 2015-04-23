
  package gen;
  public class G_Gen52 {
  		@com.google.inject.Inject
  		public G_Gen52(G_Gen53 g_gen53){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen53 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  