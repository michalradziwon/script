
  package gen;
  public class A_Gen192 {
  		@com.google.inject.Inject
  		public A_Gen192(A_Gen193 a_gen193){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen193 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  