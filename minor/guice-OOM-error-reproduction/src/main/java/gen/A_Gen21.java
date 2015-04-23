
  package gen;
  public class A_Gen21 {
  		@com.google.inject.Inject
  		public A_Gen21(A_Gen22 a_gen22){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen22 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  