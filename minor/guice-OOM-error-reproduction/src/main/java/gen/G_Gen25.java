
  package gen;
  public class G_Gen25 {
  		@com.google.inject.Inject
  		public G_Gen25(G_Gen26 g_gen26){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen26 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  