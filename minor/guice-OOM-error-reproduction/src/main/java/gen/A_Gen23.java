
  package gen;
  public class A_Gen23 {
  		@com.google.inject.Inject
  		public A_Gen23(A_Gen24 a_gen24){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen24 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  