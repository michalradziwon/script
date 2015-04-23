
  package gen;
  public class G_Gen24 {
  		@com.google.inject.Inject
  		public G_Gen24(G_Gen25 g_gen25){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen25 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  