
  package gen;
  public class G_Gen86 {
  		@com.google.inject.Inject
  		public G_Gen86(G_Gen87 g_gen87){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen87 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  