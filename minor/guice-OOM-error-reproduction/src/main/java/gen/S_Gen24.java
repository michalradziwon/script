
  package gen;
  public class S_Gen24 {
  		@com.google.inject.Inject
  		public S_Gen24(S_Gen25 s_gen25){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen25 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  