
  package gen;
  public class G_Gen41 {
  		@com.google.inject.Inject
  		public G_Gen41(G_Gen42 g_gen42){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen42 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  