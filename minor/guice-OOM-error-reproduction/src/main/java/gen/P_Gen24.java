
  package gen;
  public class P_Gen24 {
  		@com.google.inject.Inject
  		public P_Gen24(P_Gen25 p_gen25){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen25 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  