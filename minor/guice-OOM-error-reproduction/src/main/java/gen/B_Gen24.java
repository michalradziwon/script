
  package gen;
  public class B_Gen24 {
  		@com.google.inject.Inject
  		public B_Gen24(B_Gen25 b_gen25){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen25 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  