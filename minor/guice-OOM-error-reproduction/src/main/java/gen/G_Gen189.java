
  package gen;
  public class G_Gen189 {
  		@com.google.inject.Inject
  		public G_Gen189(G_Gen190 g_gen190){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen190 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  