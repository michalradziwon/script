
  package gen;
  public class G_Gen58 {
  		@com.google.inject.Inject
  		public G_Gen58(G_Gen59 g_gen59){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen59 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  