
  package gen;
  public class G_Gen18 {
  		@com.google.inject.Inject
  		public G_Gen18(G_Gen19 g_gen19){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen19 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  