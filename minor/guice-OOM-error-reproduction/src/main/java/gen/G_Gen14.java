
  package gen;
  public class G_Gen14 {
  		@com.google.inject.Inject
  		public G_Gen14(G_Gen15 g_gen15){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen15 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  