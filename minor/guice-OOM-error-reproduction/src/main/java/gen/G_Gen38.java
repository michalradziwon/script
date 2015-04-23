
  package gen;
  public class G_Gen38 {
  		@com.google.inject.Inject
  		public G_Gen38(G_Gen39 g_gen39){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen39 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  