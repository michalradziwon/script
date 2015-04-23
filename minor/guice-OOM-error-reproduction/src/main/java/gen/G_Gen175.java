
  package gen;
  public class G_Gen175 {
  		@com.google.inject.Inject
  		public G_Gen175(G_Gen176 g_gen176){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen176 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  