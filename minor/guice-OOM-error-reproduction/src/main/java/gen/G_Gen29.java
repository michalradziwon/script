
  package gen;
  public class G_Gen29 {
  		@com.google.inject.Inject
  		public G_Gen29(G_Gen30 g_gen30){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen30 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  