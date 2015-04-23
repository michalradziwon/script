
  package gen;
  public class G_Gen48 {
  		@com.google.inject.Inject
  		public G_Gen48(G_Gen49 g_gen49){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen49 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  