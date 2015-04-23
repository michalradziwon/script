
  package gen;
  public class A_Gen60 {
  		@com.google.inject.Inject
  		public A_Gen60(A_Gen61 a_gen61){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen61 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  