
  package gen;
  public class G_Gen178 {
  		@com.google.inject.Inject
  		public G_Gen178(G_Gen179 g_gen179){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen179 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  