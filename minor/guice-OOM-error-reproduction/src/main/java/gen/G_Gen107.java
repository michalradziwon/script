
  package gen;
  public class G_Gen107 {
  		@com.google.inject.Inject
  		public G_Gen107(G_Gen108 g_gen108){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen108 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  