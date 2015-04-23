
  package gen;
  public class G_Gen22 {
  		@com.google.inject.Inject
  		public G_Gen22(G_Gen23 g_gen23){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen23 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  