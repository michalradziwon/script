
  package gen;
  public class A_Gen90 {
  		@com.google.inject.Inject
  		public A_Gen90(A_Gen91 a_gen91){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen91 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  