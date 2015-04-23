
  package gen;
  public class A_Gen150 {
  		@com.google.inject.Inject
  		public A_Gen150(A_Gen151 a_gen151){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen151 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  