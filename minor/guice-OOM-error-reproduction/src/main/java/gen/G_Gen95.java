
  package gen;
  public class G_Gen95 {
  		@com.google.inject.Inject
  		public G_Gen95(G_Gen96 g_gen96){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen96 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  