
  package gen;
  public class J_Gen24 {
  		@com.google.inject.Inject
  		public J_Gen24(J_Gen25 j_gen25){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen25 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  