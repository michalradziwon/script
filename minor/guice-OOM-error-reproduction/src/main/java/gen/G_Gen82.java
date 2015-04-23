
  package gen;
  public class G_Gen82 {
  		@com.google.inject.Inject
  		public G_Gen82(G_Gen83 g_gen83){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen83 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  