
  package gen;
  public class G_Gen174 {
  		@com.google.inject.Inject
  		public G_Gen174(G_Gen175 g_gen175){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen175 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  