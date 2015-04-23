
  package gen;
  public class G_Gen10 {
  		@com.google.inject.Inject
  		public G_Gen10(G_Gen11 g_gen11){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen11 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  