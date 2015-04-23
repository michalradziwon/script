
  package gen;
  public class G_Gen19 {
  		@com.google.inject.Inject
  		public G_Gen19(G_Gen20 g_gen20){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen20 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  