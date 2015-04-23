
  package gen;
  public class G_Gen151 {
  		@com.google.inject.Inject
  		public G_Gen151(G_Gen152 g_gen152){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen152 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  