
  package gen;
  public class G_Gen167 {
  		@com.google.inject.Inject
  		public G_Gen167(G_Gen168 g_gen168){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen168 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  