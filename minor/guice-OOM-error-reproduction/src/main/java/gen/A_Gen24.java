
  package gen;
  public class A_Gen24 {
  		@com.google.inject.Inject
  		public A_Gen24(A_Gen25 a_gen25){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen25 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  