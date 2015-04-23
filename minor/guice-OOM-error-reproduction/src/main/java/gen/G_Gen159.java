
  package gen;
  public class G_Gen159 {
  		@com.google.inject.Inject
  		public G_Gen159(G_Gen160 g_gen160){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen160 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  