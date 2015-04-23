
  package gen;
  public class G_Gen66 {
  		@com.google.inject.Inject
  		public G_Gen66(G_Gen67 g_gen67){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen67 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  