
  package gen;
  public class G_Gen23 {
  		@com.google.inject.Inject
  		public G_Gen23(G_Gen24 g_gen24){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen24 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  