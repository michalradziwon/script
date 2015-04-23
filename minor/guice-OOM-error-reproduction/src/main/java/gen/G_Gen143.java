
  package gen;
  public class G_Gen143 {
  		@com.google.inject.Inject
  		public G_Gen143(G_Gen144 g_gen144){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen144 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  