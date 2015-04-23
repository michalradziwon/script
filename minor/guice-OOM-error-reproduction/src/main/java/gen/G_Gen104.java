
  package gen;
  public class G_Gen104 {
  		@com.google.inject.Inject
  		public G_Gen104(G_Gen105 g_gen105){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen105 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  