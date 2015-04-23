
  package gen;
  public class H_Gen24 {
  		@com.google.inject.Inject
  		public H_Gen24(H_Gen25 h_gen25){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen25 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  