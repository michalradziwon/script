
  package gen;
  public class G_Gen63 {
  		@com.google.inject.Inject
  		public G_Gen63(G_Gen64 g_gen64){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen64 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  