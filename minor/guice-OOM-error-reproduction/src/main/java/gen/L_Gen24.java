
  package gen;
  public class L_Gen24 {
  		@com.google.inject.Inject
  		public L_Gen24(L_Gen25 l_gen25){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen25 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  