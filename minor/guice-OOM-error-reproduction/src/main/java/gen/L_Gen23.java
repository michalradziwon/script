
  package gen;
  public class L_Gen23 {
  		@com.google.inject.Inject
  		public L_Gen23(L_Gen24 l_gen24){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen24 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  